package akka.http.scaladsl

import akka.NotUsed
import akka.http.javadsl.server.AuthorizationFailedRejection
import akka.http.scaladsl.model.FormData
import akka.http.scaladsl.model.headers.{`Content-Type`, ModeledCompanion}
import akka.http.scaladsl.server.directives.{
  FormFieldDirectives,
  HeaderMagnet,
  MethodDirectives,
  ParameterDirectives,
  RouteDirectives
}
import akka.http.scaladsl.server.util.{Tuple, Tupler}
import akka.http.scaladsl.server.{
  Directive,
  Directive0,
  Directive1,
  Directives,
  Route
}
import akka.http.scaladsl.testkit.ScalatestRouteTest
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

import scala.reflect.ClassTag

class RoutingAliasesSpec
    extends AnyFreeSpec
    with Matchers
    with ScalatestRouteTest {
  import Directives.{_string2NR, complete}

  "directives compose through the aliases" in {
    val int: FromStringUnmarshaller[Int] = implicitly
    val a: Directive1[Int] = ParameterDirectives.parameter("a".as(int))
    val b: Directive1[String] = ParameterDirectives.parameter("b")
    val both: Directive[(Int, String)] = a & b
    val route: Route = (MethodDirectives.get: Directive0) {
      both((a, b) => complete(s"$a$b"))
    }
    Get("/?a=1&b=x") ~> route ~> check {
      responseAs[String] shouldBe "1x"
    }
  }

  "form fields" in {
    Post("/", FormData("f" -> "v")) ~> FormFieldDirectives.formField("f")(complete(_)) ~> check {
      responseAs[String] shouldBe "v"
    }
  }

  "javadsl rejection" in {
    Get("/") ~> RouteDirectives.reject(AuthorizationFailedRejection.get) ~> check {
      rejection shouldBe AuthorizationFailedRejection.get
    }
  }

  "header helpers" in {
    ModeledCompanion.nameFromClass(classOf[`Content-Type`]) shouldBe "Content-Type"
    HeaderMagnet
      .fromClassTagNormalHeader(implicitly[ClassTag[`Content-Type`]])
      .headerName shouldBe "Content-Type"
  }

  "type classes resolve" in {
    implicitly[Tuple[(Int, String)]]
    implicitly[Tupler[Int]]
    (NotUsed: NotUsed) shouldBe NotUsed
  }
}

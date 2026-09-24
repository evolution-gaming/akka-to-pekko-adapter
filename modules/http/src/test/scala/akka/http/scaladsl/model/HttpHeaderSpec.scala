package akka.http.scaladsl.model

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class HttpHeaderSpec extends AnyFreeSpec with Matchers {

  "HttpHeader points at the pekko HttpHeader companion" in {
    val HttpHeader.ParsingResult.Ok(header, errors) =
      HttpHeader.parse("Host", "example.com"): @unchecked
    errors shouldBe empty
    (header match { case HttpHeader(name, value) => s"$name: $value" }) shouldBe
      "host: example.com" // unapply yields the lowercase name
  }
}

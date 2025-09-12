package akka.http.impl

import com.typesafe.config.Config
import org.apache.pekko.http.impl.privates

package object settings {

  object ClientConnectionSettingsImpl {
    def fromSubConfig(
        root: Config,
        inner: Config
    ): privates.ClientConnectionSettingsImpl =
      privates.ClientConnectionSettingsImpl.fromSubConfig(root, inner)
  }

  object ConnectionPoolSettingsImpl {
    def fromSubConfig(
        root: Config,
        inner: Config
    ): privates.ConnectionPoolSettingsImpl =
      privates.ConnectionPoolSettingsImpl.fromSubConfig(root, inner)
  }
}

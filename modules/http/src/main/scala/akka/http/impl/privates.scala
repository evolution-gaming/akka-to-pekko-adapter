package org.apache.pekko.http.impl

import com.typesafe.config.Config

package object privates {
  type ClientConnectionSettingsImpl =
    org.apache.pekko.http.impl.settings.ClientConnectionSettingsImpl
  object ClientConnectionSettingsImpl {
    def fromSubConfig(
        root: Config,
        inner: Config
    ): org.apache.pekko.http.impl.settings.ClientConnectionSettingsImpl =
      org.apache.pekko.http.impl.settings.ClientConnectionSettingsImpl
        .fromSubConfig(root, inner)
  }

  type ConnectionPoolSettingsImpl =
    org.apache.pekko.http.impl.settings.ConnectionPoolSettingsImpl
  object ConnectionPoolSettingsImpl {
    def fromSubConfig(
        root: Config,
        inner: Config
    ): org.apache.pekko.http.impl.settings.ConnectionPoolSettingsImpl =
      org.apache.pekko.http.impl.settings.ConnectionPoolSettingsImpl
        .fromSubConfig(root, inner)
  }
}

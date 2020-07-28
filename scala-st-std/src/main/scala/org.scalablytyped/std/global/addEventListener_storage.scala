package org.scalablytyped.std.global

import org.scalablytyped.std.stdStrings.storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_storage extends js.Object {
  def apply(`type`: storage, listener: js.Function1[/* ev */ org.scalablytyped.std.StorageEvent, _]): Unit = js.native
  def apply(
    `type`: storage,
    listener: js.Function1[/* ev */ org.scalablytyped.std.StorageEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
}


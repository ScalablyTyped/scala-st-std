package org.scalablytyped.std.global

import org.scalablytyped.std.stdStrings.beforeunload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_beforeunload extends js.Object {
  def apply(`type`: beforeunload, listener: js.Function1[/* ev */ org.scalablytyped.std.BeforeUnloadEvent, _]): Unit = js.native
  def apply(
    `type`: beforeunload,
    listener: js.Function1[/* ev */ org.scalablytyped.std.BeforeUnloadEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
}


package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.blocked
import org.scalablytyped.std.stdStrings.upgradeneeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBOpenDBRequest extends IDBRequest {
  @JSName("addEventListener")
  def addEventListener_blocked(`type`: blocked, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blocked(`type`: blocked, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_upgradeneeded(`type`: upgradeneeded, listener: js.Function1[/* ev */ IDBVersionChangeEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_upgradeneeded(
    `type`: upgradeneeded,
    listener: js.Function1[/* ev */ IDBVersionChangeEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def onblocked(ev: Event): js.Any = js.native
  def onupgradeneeded(ev: IDBVersionChangeEvent): js.Any = js.native
}


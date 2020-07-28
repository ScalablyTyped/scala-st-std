package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.pointercancel
import org.scalablytyped.std.stdStrings.pointerdown
import org.scalablytyped.std.stdStrings.pointerenter
import org.scalablytyped.std.stdStrings.pointerleave
import org.scalablytyped.std.stdStrings.pointermove
import org.scalablytyped.std.stdStrings.pointerout
import org.scalablytyped.std.stdStrings.pointerover
import org.scalablytyped.std.stdStrings.pointerup
import org.scalablytyped.std.stdStrings.wheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalEventHandlers extends js.Object {
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(`type`: pointercancel, listener: js.Function1[/* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(`type`: pointercancel, listener: js.Function1[/* ev */ PointerEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(`type`: pointerdown, listener: js.Function1[/* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(`type`: pointerdown, listener: js.Function1[/* ev */ PointerEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(`type`: pointerenter, listener: js.Function1[/* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(`type`: pointerenter, listener: js.Function1[/* ev */ PointerEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(`type`: pointerleave, listener: js.Function1[/* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(`type`: pointerleave, listener: js.Function1[/* ev */ PointerEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(`type`: pointermove, listener: js.Function1[/* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(`type`: pointermove, listener: js.Function1[/* ev */ PointerEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(`type`: pointerout, listener: js.Function1[/* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(`type`: pointerout, listener: js.Function1[/* ev */ PointerEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(`type`: pointerover, listener: js.Function1[/* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(`type`: pointerover, listener: js.Function1[/* ev */ PointerEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(`type`: pointerup, listener: js.Function1[/* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(`type`: pointerup, listener: js.Function1[/* ev */ PointerEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(`type`: wheel, listener: js.Function1[/* ev */ WheelEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(`type`: wheel, listener: js.Function1[/* ev */ WheelEvent, _], useCapture: scala.Boolean): Unit = js.native
  def onpointercancel(ev: PointerEvent): js.Any = js.native
  def onpointerdown(ev: PointerEvent): js.Any = js.native
  def onpointerenter(ev: PointerEvent): js.Any = js.native
  def onpointerleave(ev: PointerEvent): js.Any = js.native
  def onpointermove(ev: PointerEvent): js.Any = js.native
  def onpointerout(ev: PointerEvent): js.Any = js.native
  def onpointerover(ev: PointerEvent): js.Any = js.native
  def onpointerup(ev: PointerEvent): js.Any = js.native
  def onwheel(ev: WheelEvent): js.Any = js.native
}


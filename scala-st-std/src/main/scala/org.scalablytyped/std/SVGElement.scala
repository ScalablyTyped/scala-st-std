package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.click
import org.scalablytyped.std.stdStrings.dblclick
import org.scalablytyped.std.stdStrings.focusin
import org.scalablytyped.std.stdStrings.focusout
import org.scalablytyped.std.stdStrings.load
import org.scalablytyped.std.stdStrings.mousedown
import org.scalablytyped.std.stdStrings.mousemove
import org.scalablytyped.std.stdStrings.mouseout
import org.scalablytyped.std.stdStrings.mouseover
import org.scalablytyped.std.stdStrings.mouseup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGElement extends Element {
  var ownerSVGElement: SVGSVGElement = js.native
  var viewportElement: SVGElement = js.native
  var xmlbase: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_click(`type`: click, listener: js.Function1[/* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(`type`: click, listener: js.Function1[/* ev */ MouseEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(`type`: dblclick, listener: js.Function1[/* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(`type`: dblclick, listener: js.Function1[/* ev */ MouseEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(`type`: focusin, listener: js.Function1[/* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(`type`: focusin, listener: js.Function1[/* ev */ FocusEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(`type`: focusout, listener: js.Function1[/* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(`type`: focusout, listener: js.Function1[/* ev */ FocusEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(`type`: mousedown, listener: js.Function1[/* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(`type`: mousedown, listener: js.Function1[/* ev */ MouseEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(`type`: mousemove, listener: js.Function1[/* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(`type`: mousemove, listener: js.Function1[/* ev */ MouseEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(`type`: mouseout, listener: js.Function1[/* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(`type`: mouseout, listener: js.Function1[/* ev */ MouseEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(`type`: mouseover, listener: js.Function1[/* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(`type`: mouseover, listener: js.Function1[/* ev */ MouseEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(`type`: mouseup, listener: js.Function1[/* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(`type`: mouseup, listener: js.Function1[/* ev */ MouseEvent, _], useCapture: scala.Boolean): Unit = js.native
  def onclick(ev: MouseEvent): js.Any = js.native
  def ondblclick(ev: MouseEvent): js.Any = js.native
  def onfocusin(ev: FocusEvent): js.Any = js.native
  def onfocusout(ev: FocusEvent): js.Any = js.native
  def onload(ev: Event): js.Any = js.native
  def onmousedown(ev: MouseEvent): js.Any = js.native
  def onmousemove(ev: MouseEvent): js.Any = js.native
  def onmouseout(ev: MouseEvent): js.Any = js.native
  def onmouseover(ev: MouseEvent): js.Any = js.native
  def onmouseup(ev: MouseEvent): js.Any = js.native
}


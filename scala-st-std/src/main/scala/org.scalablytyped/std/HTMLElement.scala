package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.MSContentZoom
import org.scalablytyped.std.stdStrings.MSManipulationStateChanged
import org.scalablytyped.std.stdStrings.abort
import org.scalablytyped.std.stdStrings.activate
import org.scalablytyped.std.stdStrings.beforeactivate
import org.scalablytyped.std.stdStrings.beforecopy
import org.scalablytyped.std.stdStrings.beforecut
import org.scalablytyped.std.stdStrings.beforedeactivate
import org.scalablytyped.std.stdStrings.beforepaste
import org.scalablytyped.std.stdStrings.blur
import org.scalablytyped.std.stdStrings.canplay
import org.scalablytyped.std.stdStrings.canplaythrough
import org.scalablytyped.std.stdStrings.change
import org.scalablytyped.std.stdStrings.click
import org.scalablytyped.std.stdStrings.contextmenu
import org.scalablytyped.std.stdStrings.copy
import org.scalablytyped.std.stdStrings.cuechange
import org.scalablytyped.std.stdStrings.cut
import org.scalablytyped.std.stdStrings.dblclick
import org.scalablytyped.std.stdStrings.deactivate
import org.scalablytyped.std.stdStrings.drag
import org.scalablytyped.std.stdStrings.dragend
import org.scalablytyped.std.stdStrings.dragenter
import org.scalablytyped.std.stdStrings.dragleave
import org.scalablytyped.std.stdStrings.dragover
import org.scalablytyped.std.stdStrings.dragstart
import org.scalablytyped.std.stdStrings.drop
import org.scalablytyped.std.stdStrings.durationchange
import org.scalablytyped.std.stdStrings.emptied
import org.scalablytyped.std.stdStrings.ended
import org.scalablytyped.std.stdStrings.error
import org.scalablytyped.std.stdStrings.focus
import org.scalablytyped.std.stdStrings.input
import org.scalablytyped.std.stdStrings.keydown
import org.scalablytyped.std.stdStrings.keypress
import org.scalablytyped.std.stdStrings.keyup
import org.scalablytyped.std.stdStrings.load
import org.scalablytyped.std.stdStrings.loadeddata
import org.scalablytyped.std.stdStrings.loadedmetadata
import org.scalablytyped.std.stdStrings.loadstart
import org.scalablytyped.std.stdStrings.mousedown
import org.scalablytyped.std.stdStrings.mouseenter
import org.scalablytyped.std.stdStrings.mouseleave
import org.scalablytyped.std.stdStrings.mousemove
import org.scalablytyped.std.stdStrings.mouseout
import org.scalablytyped.std.stdStrings.mouseover
import org.scalablytyped.std.stdStrings.mouseup
import org.scalablytyped.std.stdStrings.mousewheel
import org.scalablytyped.std.stdStrings.paste
import org.scalablytyped.std.stdStrings.pause
import org.scalablytyped.std.stdStrings.play
import org.scalablytyped.std.stdStrings.playing
import org.scalablytyped.std.stdStrings.progress
import org.scalablytyped.std.stdStrings.ratechange
import org.scalablytyped.std.stdStrings.reset
import org.scalablytyped.std.stdStrings.scroll
import org.scalablytyped.std.stdStrings.seeked
import org.scalablytyped.std.stdStrings.seeking
import org.scalablytyped.std.stdStrings.select
import org.scalablytyped.std.stdStrings.selectstart
import org.scalablytyped.std.stdStrings.stalled
import org.scalablytyped.std.stdStrings.submit
import org.scalablytyped.std.stdStrings.suspend
import org.scalablytyped.std.stdStrings.timeupdate
import org.scalablytyped.std.stdStrings.volumechange
import org.scalablytyped.std.stdStrings.waiting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElement extends Element {
  var accessKey: java.lang.String = js.native
  var children: HTMLCollection = js.native
  var contentEditable: java.lang.String = js.native
  var dataset: DOMStringMap = js.native
  var dir: java.lang.String = js.native
  var draggable: scala.Boolean = js.native
  var hidden: scala.Boolean = js.native
  var hideFocus: scala.Boolean = js.native
  var innerText: java.lang.String = js.native
  var isContentEditable: scala.Boolean = js.native
  var lang: java.lang.String = js.native
  var offsetHeight: Double = js.native
  var offsetLeft: Double = js.native
  var offsetParent: Element = js.native
  var offsetTop: Double = js.native
  var offsetWidth: Double = js.native
  var outerHTML: java.lang.String = js.native
  var outerText: java.lang.String = js.native
  var spellcheck: scala.Boolean = js.native
  var style: CSSStyleDeclaration = js.native
  var tabIndex: Double = js.native
  var title: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_MSContentZoom(`type`: MSContentZoom, listener: js.Function1[/* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSContentZoom(`type`: MSContentZoom, listener: js.Function1[/* ev */ UIEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSManipulationStateChanged(`type`: MSManipulationStateChanged, listener: js.Function1[/* ev */ MSManipulationEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSManipulationStateChanged(
    `type`: MSManipulationStateChanged,
    listener: js.Function1[/* ev */ MSManipulationEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.Function1[/* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.Function1[/* ev */ UIEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_activate(`type`: activate, listener: js.Function1[/* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_activate(`type`: activate, listener: js.Function1[/* ev */ UIEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeactivate(`type`: beforeactivate, listener: js.Function1[/* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeactivate(`type`: beforeactivate, listener: js.Function1[/* ev */ UIEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforecopy(`type`: beforecopy, listener: js.Function1[/* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforecopy(`type`: beforecopy, listener: js.Function1[/* ev */ DragEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforecut(`type`: beforecut, listener: js.Function1[/* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforecut(`type`: beforecut, listener: js.Function1[/* ev */ DragEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforedeactivate(`type`: beforedeactivate, listener: js.Function1[/* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforedeactivate(`type`: beforedeactivate, listener: js.Function1[/* ev */ UIEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforepaste(`type`: beforepaste, listener: js.Function1[/* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforepaste(`type`: beforepaste, listener: js.Function1[/* ev */ DragEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(`type`: blur, listener: js.Function1[/* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(`type`: blur, listener: js.Function1[/* ev */ FocusEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(`type`: canplay, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(`type`: canplay, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(`type`: canplaythrough, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(`type`: canplaythrough, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(`type`: click, listener: js.Function1[/* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(`type`: click, listener: js.Function1[/* ev */ MouseEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(`type`: contextmenu, listener: js.Function1[/* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(`type`: contextmenu, listener: js.Function1[/* ev */ PointerEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(`type`: copy, listener: js.Function1[/* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(`type`: copy, listener: js.Function1[/* ev */ DragEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(`type`: cuechange, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(`type`: cuechange, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(`type`: cut, listener: js.Function1[/* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(`type`: cut, listener: js.Function1[/* ev */ DragEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(`type`: dblclick, listener: js.Function1[/* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(`type`: dblclick, listener: js.Function1[/* ev */ MouseEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deactivate(`type`: deactivate, listener: js.Function1[/* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deactivate(`type`: deactivate, listener: js.Function1[/* ev */ UIEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(`type`: drag, listener: js.Function1[/* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(`type`: drag, listener: js.Function1[/* ev */ DragEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(`type`: dragend, listener: js.Function1[/* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(`type`: dragend, listener: js.Function1[/* ev */ DragEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(`type`: dragenter, listener: js.Function1[/* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(`type`: dragenter, listener: js.Function1[/* ev */ DragEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(`type`: dragleave, listener: js.Function1[/* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(`type`: dragleave, listener: js.Function1[/* ev */ DragEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(`type`: dragover, listener: js.Function1[/* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(`type`: dragover, listener: js.Function1[/* ev */ DragEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(`type`: dragstart, listener: js.Function1[/* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(`type`: dragstart, listener: js.Function1[/* ev */ DragEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(`type`: drop, listener: js.Function1[/* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(`type`: drop, listener: js.Function1[/* ev */ DragEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(`type`: durationchange, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(`type`: durationchange, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(`type`: emptied, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(`type`: emptied, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(`type`: ended, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(`type`: ended, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(`type`: focus, listener: js.Function1[/* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(`type`: focus, listener: js.Function1[/* ev */ FocusEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(`type`: input, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(`type`: input, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(`type`: keydown, listener: js.Function1[/* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(`type`: keydown, listener: js.Function1[/* ev */ KeyboardEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(`type`: keypress, listener: js.Function1[/* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(`type`: keypress, listener: js.Function1[/* ev */ KeyboardEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(`type`: keyup, listener: js.Function1[/* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(`type`: keyup, listener: js.Function1[/* ev */ KeyboardEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(`type`: loadeddata, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(`type`: loadeddata, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(`type`: loadstart, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(`type`: loadstart, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(`type`: mousedown, listener: js.Function1[/* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(`type`: mousedown, listener: js.Function1[/* ev */ MouseEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(`type`: mouseenter, listener: js.Function1[/* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(`type`: mouseenter, listener: js.Function1[/* ev */ MouseEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(`type`: mouseleave, listener: js.Function1[/* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(`type`: mouseleave, listener: js.Function1[/* ev */ MouseEvent, _], useCapture: scala.Boolean): Unit = js.native
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
  @JSName("addEventListener")
  def addEventListener_mousewheel(`type`: mousewheel, listener: js.Function1[/* ev */ MouseWheelEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(`type`: mousewheel, listener: js.Function1[/* ev */ MouseWheelEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(`type`: paste, listener: js.Function1[/* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(`type`: paste, listener: js.Function1[/* ev */ DragEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(`type`: pause, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(`type`: pause, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(`type`: play, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(`type`: play, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(`type`: playing, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(`type`: playing, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(`type`: progress, listener: js.Function1[/* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(`type`: progress, listener: js.Function1[/* ev */ ProgressEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(`type`: ratechange, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(`type`: ratechange, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(`type`: reset, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(`type`: reset, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(`type`: scroll, listener: js.Function1[/* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(`type`: scroll, listener: js.Function1[/* ev */ UIEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(`type`: seeked, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(`type`: seeked, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(`type`: seeking, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(`type`: seeking, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(`type`: select, listener: js.Function1[/* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(`type`: select, listener: js.Function1[/* ev */ UIEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(`type`: selectstart, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(`type`: selectstart, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(`type`: stalled, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(`type`: stalled, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(`type`: submit, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(`type`: submit, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(`type`: suspend, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(`type`: suspend, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(`type`: timeupdate, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(`type`: timeupdate, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(`type`: volumechange, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(`type`: volumechange, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(`type`: waiting, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(`type`: waiting, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  def blur(): Unit = js.native
  def click(): Unit = js.native
  def dragDrop(): scala.Boolean = js.native
  def focus(): Unit = js.native
  def insertAdjacentElement(position: java.lang.String, insertedElement: Element): Element = js.native
  def insertAdjacentHTML(where: java.lang.String, html: java.lang.String): Unit = js.native
  def insertAdjacentText(where: java.lang.String, text: java.lang.String): Unit = js.native
  def msGetInputContext(): MSInputMethodContext = js.native
  def onabort(ev: Event): js.Any = js.native
  def onactivate(ev: UIEvent): js.Any = js.native
  def onbeforeactivate(ev: UIEvent): js.Any = js.native
  def onbeforecopy(ev: DragEvent): js.Any = js.native
  def onbeforecut(ev: DragEvent): js.Any = js.native
  def onbeforedeactivate(ev: UIEvent): js.Any = js.native
  def onbeforepaste(ev: DragEvent): js.Any = js.native
  def onblur(ev: FocusEvent): js.Any = js.native
  def oncanplay(ev: Event): js.Any = js.native
  def oncanplaythrough(ev: Event): js.Any = js.native
  def onchange(ev: Event): js.Any = js.native
  def onclick(ev: MouseEvent): js.Any = js.native
  def oncontextmenu(ev: PointerEvent): js.Any = js.native
  def oncopy(ev: DragEvent): js.Any = js.native
  def oncuechange(ev: Event): js.Any = js.native
  def oncut(ev: DragEvent): js.Any = js.native
  def ondblclick(ev: MouseEvent): js.Any = js.native
  def ondeactivate(ev: UIEvent): js.Any = js.native
  def ondrag(ev: DragEvent): js.Any = js.native
  def ondragend(ev: DragEvent): js.Any = js.native
  def ondragenter(ev: DragEvent): js.Any = js.native
  def ondragleave(ev: DragEvent): js.Any = js.native
  def ondragover(ev: DragEvent): js.Any = js.native
  def ondragstart(ev: DragEvent): js.Any = js.native
  def ondrop(ev: DragEvent): js.Any = js.native
  def ondurationchange(ev: Event): js.Any = js.native
  def onemptied(ev: Event): js.Any = js.native
  def onended(ev: Event): js.Any = js.native
  def onerror(ev: Event): js.Any = js.native
  def onfocus(ev: FocusEvent): js.Any = js.native
  def oninput(ev: Event): js.Any = js.native
  def onkeydown(ev: KeyboardEvent): js.Any = js.native
  def onkeypress(ev: KeyboardEvent): js.Any = js.native
  def onkeyup(ev: KeyboardEvent): js.Any = js.native
  def onload(ev: Event): js.Any = js.native
  def onloadeddata(ev: Event): js.Any = js.native
  def onloadedmetadata(ev: Event): js.Any = js.native
  def onloadstart(ev: Event): js.Any = js.native
  def onmousedown(ev: MouseEvent): js.Any = js.native
  def onmouseenter(ev: MouseEvent): js.Any = js.native
  def onmouseleave(ev: MouseEvent): js.Any = js.native
  def onmousemove(ev: MouseEvent): js.Any = js.native
  def onmouseout(ev: MouseEvent): js.Any = js.native
  def onmouseover(ev: MouseEvent): js.Any = js.native
  def onmouseup(ev: MouseEvent): js.Any = js.native
  def onmousewheel(ev: MouseWheelEvent): js.Any = js.native
  def onmscontentzoom(ev: UIEvent): js.Any = js.native
  def onmsmanipulationstatechanged(ev: MSManipulationEvent): js.Any = js.native
  def onpaste(ev: DragEvent): js.Any = js.native
  def onpause(ev: Event): js.Any = js.native
  def onplay(ev: Event): js.Any = js.native
  def onplaying(ev: Event): js.Any = js.native
  def onprogress(ev: ProgressEvent): js.Any = js.native
  def onratechange(ev: Event): js.Any = js.native
  def onreset(ev: Event): js.Any = js.native
  def onscroll(ev: UIEvent): js.Any = js.native
  def onseeked(ev: Event): js.Any = js.native
  def onseeking(ev: Event): js.Any = js.native
  def onselect(ev: UIEvent): js.Any = js.native
  def onselectstart(ev: Event): js.Any = js.native
  def onstalled(ev: Event): js.Any = js.native
  def onsubmit(ev: Event): js.Any = js.native
  def onsuspend(ev: Event): js.Any = js.native
  def ontimeupdate(ev: Event): js.Any = js.native
  def onvolumechange(ev: Event): js.Any = js.native
  def onwaiting(ev: Event): js.Any = js.native
  def scrollIntoView(): Unit = js.native
  def scrollIntoView(top: scala.Boolean): Unit = js.native
  def setActive(): Unit = js.native
}


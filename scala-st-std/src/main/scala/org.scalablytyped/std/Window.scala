package org.scalablytyped.std

import org.scalablytyped.std.anon.Instantiable
import org.scalablytyped.std.anon.InstantiableBlob
import org.scalablytyped.std.stdStrings.MSGestureChange
import org.scalablytyped.std.stdStrings.MSGestureDoubleTap
import org.scalablytyped.std.stdStrings.MSGestureEnd
import org.scalablytyped.std.stdStrings.MSGestureHold
import org.scalablytyped.std.stdStrings.MSGestureStart
import org.scalablytyped.std.stdStrings.MSGestureTap
import org.scalablytyped.std.stdStrings.MSInertiaStart
import org.scalablytyped.std.stdStrings.MSPointerCancel
import org.scalablytyped.std.stdStrings.MSPointerDown
import org.scalablytyped.std.stdStrings.MSPointerEnter
import org.scalablytyped.std.stdStrings.MSPointerLeave
import org.scalablytyped.std.stdStrings.MSPointerMove
import org.scalablytyped.std.stdStrings.MSPointerOut
import org.scalablytyped.std.stdStrings.MSPointerOver
import org.scalablytyped.std.stdStrings.MSPointerUp
import org.scalablytyped.std.stdStrings.abort
import org.scalablytyped.std.stdStrings.afterprint
import org.scalablytyped.std.stdStrings.beforeprint
import org.scalablytyped.std.stdStrings.beforeunload
import org.scalablytyped.std.stdStrings.blur
import org.scalablytyped.std.stdStrings.canplay
import org.scalablytyped.std.stdStrings.canplaythrough
import org.scalablytyped.std.stdStrings.change
import org.scalablytyped.std.stdStrings.click
import org.scalablytyped.std.stdStrings.compassneedscalibration
import org.scalablytyped.std.stdStrings.contextmenu
import org.scalablytyped.std.stdStrings.dblclick
import org.scalablytyped.std.stdStrings.devicelight
import org.scalablytyped.std.stdStrings.devicemotion
import org.scalablytyped.std.stdStrings.deviceorientation
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
import org.scalablytyped.std.stdStrings.focus
import org.scalablytyped.std.stdStrings.hashchange
import org.scalablytyped.std.stdStrings.input
import org.scalablytyped.std.stdStrings.invalid
import org.scalablytyped.std.stdStrings.keydown
import org.scalablytyped.std.stdStrings.keypress
import org.scalablytyped.std.stdStrings.keyup
import org.scalablytyped.std.stdStrings.load
import org.scalablytyped.std.stdStrings.loadeddata
import org.scalablytyped.std.stdStrings.loadedmetadata
import org.scalablytyped.std.stdStrings.loadstart
import org.scalablytyped.std.stdStrings.message
import org.scalablytyped.std.stdStrings.mousedown
import org.scalablytyped.std.stdStrings.mouseenter
import org.scalablytyped.std.stdStrings.mouseleave
import org.scalablytyped.std.stdStrings.mousemove
import org.scalablytyped.std.stdStrings.mouseout
import org.scalablytyped.std.stdStrings.mouseover
import org.scalablytyped.std.stdStrings.mouseup
import org.scalablytyped.std.stdStrings.mousewheel
import org.scalablytyped.std.stdStrings.offline
import org.scalablytyped.std.stdStrings.online
import org.scalablytyped.std.stdStrings.orientationchange
import org.scalablytyped.std.stdStrings.pagehide
import org.scalablytyped.std.stdStrings.pageshow
import org.scalablytyped.std.stdStrings.pause
import org.scalablytyped.std.stdStrings.play
import org.scalablytyped.std.stdStrings.playing
import org.scalablytyped.std.stdStrings.popstate
import org.scalablytyped.std.stdStrings.progress
import org.scalablytyped.std.stdStrings.ratechange
import org.scalablytyped.std.stdStrings.readystatechange
import org.scalablytyped.std.stdStrings.reset
import org.scalablytyped.std.stdStrings.resize
import org.scalablytyped.std.stdStrings.scroll
import org.scalablytyped.std.stdStrings.seeked
import org.scalablytyped.std.stdStrings.seeking
import org.scalablytyped.std.stdStrings.select
import org.scalablytyped.std.stdStrings.stalled
import org.scalablytyped.std.stdStrings.storage
import org.scalablytyped.std.stdStrings.submit
import org.scalablytyped.std.stdStrings.suspend
import org.scalablytyped.std.stdStrings.timeupdate
import org.scalablytyped.std.stdStrings.unload
import org.scalablytyped.std.stdStrings.volumechange
import org.scalablytyped.std.stdStrings.waiting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window
  extends WindowTimers
     with EventTarget
     with WindowSessionStorage
     with WindowLocalStorage
     with WindowConsole
     with GlobalEventHandlers
     with IDBEnvironment
     with WindowBase64 {
  var Blob: InstantiableBlob = js.native
  var URL: Instantiable = js.native
  val applicationCache: ApplicationCache = js.native
  val clientInformation: Navigator = js.native
  val closed: scala.Boolean = js.native
  val crypto: Crypto = js.native
  var defaultStatus: java.lang.String = js.native
  val devicePixelRatio: Double = js.native
  val doNotTrack: java.lang.String = js.native
  val document: Document = js.native
  var event: Event = js.native
  val external: External = js.native
  val frameElement: Element = js.native
  val frames: Window = js.native
  val history: History = js.native
  val innerHeight: Double = js.native
  val innerWidth: Double = js.native
  val length: Double = js.native
  val location: Location = js.native
  val locationbar: BarProp = js.native
  val menubar: BarProp = js.native
  val msCredentials: MSCredentials = js.native
  var name: java.lang.String = js.native
  val navigator: Navigator = js.native
  var offscreenBuffering: java.lang.String | scala.Boolean = js.native
  @JSName("onerror")
  var onerror_Original: ErrorEventHandler = js.native
  var opener: js.Any = js.native
  var orientation: java.lang.String | Double = js.native
  val outerHeight: Double = js.native
  val outerWidth: Double = js.native
  val pageXOffset: Double = js.native
  val pageYOffset: Double = js.native
  val parent: Window = js.native
  val performance: Performance = js.native
  val personalbar: BarProp = js.native
  val screen: Screen = js.native
  val screenLeft: Double = js.native
  val screenTop: Double = js.native
  val screenX: Double = js.native
  val screenY: Double = js.native
  val scrollX: Double = js.native
  val scrollY: Double = js.native
  val scrollbars: BarProp = js.native
  val self: Window = js.native
  var status: java.lang.String = js.native
  val statusbar: BarProp = js.native
  val styleMedia: StyleMedia = js.native
  val toolbar: BarProp = js.native
  val top: Window = js.native
  val window: Window = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSGestureEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSGestureEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSGestureEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSGestureEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(`type`: MSGestureEnd, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSGestureEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSGestureEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSGestureEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSGestureEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSGestureEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSGestureEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(`type`: MSGestureTap, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSGestureEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSGestureEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSGestureEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSGestureEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(`type`: MSPointerOut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(`type`: MSPointerUp, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(`type`: afterprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(`type`: beforeprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(`type`: blur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(`type`: canplay, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(`type`: contextmenu, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(`type`: dblclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(`type`: drag, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(`type`: dragend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(`type`: dragenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(`type`: dragleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(`type`: dragover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(`type`: dragstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(`type`: drop, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(`type`: durationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(`type`: emptied, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(`type`: focus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(`type`: hashchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(`type`: input, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(`type`: invalid, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(`type`: keydown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(`type`: keypress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(`type`: keyup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(`type`: loadeddata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(`type`: mousedown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(`type`: mouseenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(`type`: mouseleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(`type`: mousemove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(`type`: mouseout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(`type`: mouseover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(`type`: mouseup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(`type`: mousewheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(`type`: offline, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(`type`: online, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(`type`: orientationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(`type`: play, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(`type`: playing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(`type`: popstate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(`type`: ratechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(`type`: reset, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(`type`: scroll, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(`type`: seeked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(`type`: seeking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(`type`: stalled, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(`type`: storage, listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(`type`: suspend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(`type`: timeupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(`type`: unload, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(`type`: volumechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(`type`: waiting, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def alert(): Unit = js.native
  def alert(message: js.Any): Unit = js.native
  def blur(): Unit = js.native
  def cancelAnimationFrame(handle: Double): Unit = js.native
  def captureEvents(): Unit = js.native
  def close(): Unit = js.native
  def confirm(): scala.Boolean = js.native
  def confirm(message: java.lang.String): scala.Boolean = js.native
  def focus(): Unit = js.native
  def getComputedStyle(elt: Element): CSSStyleDeclaration = js.native
  def getComputedStyle(elt: Element, pseudoElt: java.lang.String): CSSStyleDeclaration = js.native
  def getMatchedCSSRules(elt: Element): CSSRuleList = js.native
  def getMatchedCSSRules(elt: Element, pseudoElt: java.lang.String): CSSRuleList = js.native
  def getSelection(): Selection = js.native
  def matchMedia(mediaQuery: java.lang.String): MediaQueryList = js.native
  def moveBy(): Unit = js.native
  def moveBy(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def moveBy(x: Double): Unit = js.native
  def moveBy(x: Double, y: Double): Unit = js.native
  def moveTo(): Unit = js.native
  def moveTo(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def moveTo(x: Double): Unit = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def msWriteProfilerMark(profilerMarkName: java.lang.String): Unit = js.native
  def onabort(ev: UIEvent): js.Any = js.native
  def onafterprint(ev: Event): js.Any = js.native
  def onbeforeprint(ev: Event): js.Any = js.native
  def onbeforeunload(ev: BeforeUnloadEvent): js.Any = js.native
  def onblur(ev: FocusEvent): js.Any = js.native
  def oncanplay(ev: Event): js.Any = js.native
  def oncanplaythrough(ev: Event): js.Any = js.native
  def onchange(ev: Event): js.Any = js.native
  def onclick(ev: MouseEvent): js.Any = js.native
  def oncompassneedscalibration(ev: Event): js.Any = js.native
  def oncontextmenu(ev: PointerEvent): js.Any = js.native
  def ondblclick(ev: MouseEvent): js.Any = js.native
  def ondevicelight(ev: DeviceLightEvent): js.Any = js.native
  def ondevicemotion(ev: DeviceMotionEvent): js.Any = js.native
  def ondeviceorientation(ev: DeviceOrientationEvent): js.Any = js.native
  def ondrag(ev: DragEvent): js.Any = js.native
  def ondragend(ev: DragEvent): js.Any = js.native
  def ondragenter(ev: DragEvent): js.Any = js.native
  def ondragleave(ev: DragEvent): js.Any = js.native
  def ondragover(ev: DragEvent): js.Any = js.native
  def ondragstart(ev: DragEvent): js.Any = js.native
  def ondrop(ev: DragEvent): js.Any = js.native
  def ondurationchange(ev: Event): js.Any = js.native
  def onemptied(ev: Event): js.Any = js.native
  def onended(ev: MediaStreamErrorEvent): js.Any = js.native
  def onerror(message: java.lang.String): Unit = js.native
  def onerror(
    message: java.lang.String,
    filename: js.UndefOr[scala.Nothing],
    lineno: js.UndefOr[scala.Nothing],
    colno: js.UndefOr[scala.Nothing],
    error: Error
  ): Unit = js.native
  def onerror(
    message: java.lang.String,
    filename: js.UndefOr[scala.Nothing],
    lineno: js.UndefOr[scala.Nothing],
    colno: Double
  ): Unit = js.native
  def onerror(
    message: java.lang.String,
    filename: js.UndefOr[scala.Nothing],
    lineno: js.UndefOr[scala.Nothing],
    colno: Double,
    error: Error
  ): Unit = js.native
  def onerror(message: java.lang.String, filename: js.UndefOr[scala.Nothing], lineno: Double): Unit = js.native
  def onerror(
    message: java.lang.String,
    filename: js.UndefOr[scala.Nothing],
    lineno: Double,
    colno: js.UndefOr[scala.Nothing],
    error: Error
  ): Unit = js.native
  def onerror(message: java.lang.String, filename: js.UndefOr[scala.Nothing], lineno: Double, colno: Double): Unit = js.native
  def onerror(
    message: java.lang.String,
    filename: js.UndefOr[scala.Nothing],
    lineno: Double,
    colno: Double,
    error: Error
  ): Unit = js.native
  def onerror(message: java.lang.String, filename: java.lang.String): Unit = js.native
  def onerror(
    message: java.lang.String,
    filename: java.lang.String,
    lineno: js.UndefOr[scala.Nothing],
    colno: js.UndefOr[scala.Nothing],
    error: Error
  ): Unit = js.native
  def onerror(
    message: java.lang.String,
    filename: java.lang.String,
    lineno: js.UndefOr[scala.Nothing],
    colno: Double
  ): Unit = js.native
  def onerror(
    message: java.lang.String,
    filename: java.lang.String,
    lineno: js.UndefOr[scala.Nothing],
    colno: Double,
    error: Error
  ): Unit = js.native
  def onerror(message: java.lang.String, filename: java.lang.String, lineno: Double): Unit = js.native
  def onerror(
    message: java.lang.String,
    filename: java.lang.String,
    lineno: Double,
    colno: js.UndefOr[scala.Nothing],
    error: Error
  ): Unit = js.native
  def onerror(message: java.lang.String, filename: java.lang.String, lineno: Double, colno: Double): Unit = js.native
  def onerror(message: java.lang.String, filename: java.lang.String, lineno: Double, colno: Double, error: Error): Unit = js.native
  def onfocus(ev: FocusEvent): js.Any = js.native
  def onhashchange(ev: HashChangeEvent): js.Any = js.native
  def oninput(ev: Event): js.Any = js.native
  def oninvalid(ev: Event): js.Any = js.native
  def onkeydown(ev: KeyboardEvent): js.Any = js.native
  def onkeypress(ev: KeyboardEvent): js.Any = js.native
  def onkeyup(ev: KeyboardEvent): js.Any = js.native
  def onload(ev: Event): js.Any = js.native
  def onloadeddata(ev: Event): js.Any = js.native
  def onloadedmetadata(ev: Event): js.Any = js.native
  def onloadstart(ev: Event): js.Any = js.native
  def onmessage(ev: MessageEvent): js.Any = js.native
  def onmousedown(ev: MouseEvent): js.Any = js.native
  def onmouseenter(ev: MouseEvent): js.Any = js.native
  def onmouseleave(ev: MouseEvent): js.Any = js.native
  def onmousemove(ev: MouseEvent): js.Any = js.native
  def onmouseout(ev: MouseEvent): js.Any = js.native
  def onmouseover(ev: MouseEvent): js.Any = js.native
  def onmouseup(ev: MouseEvent): js.Any = js.native
  def onmousewheel(ev: WheelEvent): js.Any = js.native
  def onmsgesturechange(ev: MSGestureEvent): js.Any = js.native
  def onmsgesturedoubletap(ev: MSGestureEvent): js.Any = js.native
  def onmsgestureend(ev: MSGestureEvent): js.Any = js.native
  def onmsgesturehold(ev: MSGestureEvent): js.Any = js.native
  def onmsgesturestart(ev: MSGestureEvent): js.Any = js.native
  def onmsgesturetap(ev: MSGestureEvent): js.Any = js.native
  def onmsinertiastart(ev: MSGestureEvent): js.Any = js.native
  def onmspointercancel(ev: MSPointerEvent): js.Any = js.native
  def onmspointerdown(ev: MSPointerEvent): js.Any = js.native
  def onmspointerenter(ev: MSPointerEvent): js.Any = js.native
  def onmspointerleave(ev: MSPointerEvent): js.Any = js.native
  def onmspointermove(ev: MSPointerEvent): js.Any = js.native
  def onmspointerout(ev: MSPointerEvent): js.Any = js.native
  def onmspointerover(ev: MSPointerEvent): js.Any = js.native
  def onmspointerup(ev: MSPointerEvent): js.Any = js.native
  def onoffline(ev: Event): js.Any = js.native
  def ononline(ev: Event): js.Any = js.native
  def onorientationchange(ev: Event): js.Any = js.native
  def onpagehide(ev: PageTransitionEvent): js.Any = js.native
  def onpageshow(ev: PageTransitionEvent): js.Any = js.native
  def onpause(ev: Event): js.Any = js.native
  def onplay(ev: Event): js.Any = js.native
  def onplaying(ev: Event): js.Any = js.native
  def onpopstate(ev: PopStateEvent): js.Any = js.native
  def onprogress(ev: ProgressEvent): js.Any = js.native
  def onratechange(ev: Event): js.Any = js.native
  def onreadystatechange(ev: ProgressEvent): js.Any = js.native
  def onreset(ev: Event): js.Any = js.native
  def onresize(ev: UIEvent): js.Any = js.native
  def onscroll(ev: UIEvent): js.Any = js.native
  def onseeked(ev: Event): js.Any = js.native
  def onseeking(ev: Event): js.Any = js.native
  def onselect(ev: UIEvent): js.Any = js.native
  def onstalled(ev: Event): js.Any = js.native
  def onstorage(ev: StorageEvent): js.Any = js.native
  def onsubmit(ev: Event): js.Any = js.native
  def onsuspend(ev: Event): js.Any = js.native
  def ontimeupdate(ev: Event): js.Any = js.native
  def ontouchcancel(ev: TouchEvent): js.Any = js.native
  def ontouchend(ev: TouchEvent): js.Any = js.native
  def ontouchmove(ev: TouchEvent): js.Any = js.native
  def ontouchstart(ev: TouchEvent): js.Any = js.native
  def onunload(ev: Event): js.Any = js.native
  def onvolumechange(ev: Event): js.Any = js.native
  def onwaiting(ev: Event): js.Any = js.native
  def open(): Window = js.native
  def open(
    url: js.UndefOr[scala.Nothing],
    target: js.UndefOr[scala.Nothing],
    features: js.UndefOr[scala.Nothing],
    replace: scala.Boolean
  ): Window = js.native
  def open(url: js.UndefOr[scala.Nothing], target: js.UndefOr[scala.Nothing], features: java.lang.String): Window = js.native
  def open(
    url: js.UndefOr[scala.Nothing],
    target: js.UndefOr[scala.Nothing],
    features: java.lang.String,
    replace: scala.Boolean
  ): Window = js.native
  def open(url: js.UndefOr[scala.Nothing], target: java.lang.String): Window = js.native
  def open(
    url: js.UndefOr[scala.Nothing],
    target: java.lang.String,
    features: js.UndefOr[scala.Nothing],
    replace: scala.Boolean
  ): Window = js.native
  def open(url: js.UndefOr[scala.Nothing], target: java.lang.String, features: java.lang.String): Window = js.native
  def open(
    url: js.UndefOr[scala.Nothing],
    target: java.lang.String,
    features: java.lang.String,
    replace: scala.Boolean
  ): Window = js.native
  def open(url: java.lang.String): Window = js.native
  def open(
    url: java.lang.String,
    target: js.UndefOr[scala.Nothing],
    features: js.UndefOr[scala.Nothing],
    replace: scala.Boolean
  ): Window = js.native
  def open(url: java.lang.String, target: js.UndefOr[scala.Nothing], features: java.lang.String): Window = js.native
  def open(
    url: java.lang.String,
    target: js.UndefOr[scala.Nothing],
    features: java.lang.String,
    replace: scala.Boolean
  ): Window = js.native
  def open(url: java.lang.String, target: java.lang.String): Window = js.native
  def open(
    url: java.lang.String,
    target: java.lang.String,
    features: js.UndefOr[scala.Nothing],
    replace: scala.Boolean
  ): Window = js.native
  def open(url: java.lang.String, target: java.lang.String, features: java.lang.String): Window = js.native
  def open(
    url: java.lang.String,
    target: java.lang.String,
    features: java.lang.String,
    replace: scala.Boolean
  ): Window = js.native
  def postMessage(message: js.Any, targetOrigin: java.lang.String): Unit = js.native
  def postMessage(message: js.Any, targetOrigin: java.lang.String, transfer: js.Array[_]): Unit = js.native
  def print(): Unit = js.native
  def prompt(): java.lang.String | Null = js.native
  def prompt(message: js.UndefOr[scala.Nothing], _default: java.lang.String): java.lang.String | Null = js.native
  def prompt(message: java.lang.String): java.lang.String | Null = js.native
  def prompt(message: java.lang.String, _default: java.lang.String): java.lang.String | Null = js.native
  def releaseEvents(): Unit = js.native
  def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  def resizeBy(): Unit = js.native
  def resizeBy(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def resizeBy(x: Double): Unit = js.native
  def resizeBy(x: Double, y: Double): Unit = js.native
  def resizeTo(): Unit = js.native
  def resizeTo(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def resizeTo(x: Double): Unit = js.native
  def resizeTo(x: Double, y: Double): Unit = js.native
  def scroll(): Unit = js.native
  def scroll(options: ScrollToOptions): Unit = js.native
  def scroll(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def scroll(x: Double): Unit = js.native
  def scroll(x: Double, y: Double): Unit = js.native
  def scrollBy(): Unit = js.native
  def scrollBy(options: ScrollToOptions): Unit = js.native
  def scrollBy(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def scrollBy(x: Double): Unit = js.native
  def scrollBy(x: Double, y: Double): Unit = js.native
  def scrollTo(): Unit = js.native
  def scrollTo(options: ScrollToOptions): Unit = js.native
  def scrollTo(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def scrollTo(x: Double): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  def webkitCancelAnimationFrame(handle: Double): Unit = js.native
  def webkitConvertPointFromNodeToPage(node: Node, pt: WebKitPoint): WebKitPoint = js.native
  def webkitConvertPointFromPageToNode(node: Node, pt: WebKitPoint): WebKitPoint = js.native
  def webkitRequestAnimationFrame(callback: FrameRequestCallback): Double = js.native
}


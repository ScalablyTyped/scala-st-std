package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.MSGestureChange
import org.scalablytyped.std.stdStrings.MSGestureDoubleTap
import org.scalablytyped.std.stdStrings.MSGestureEnd
import org.scalablytyped.std.stdStrings.MSGestureHold
import org.scalablytyped.std.stdStrings.MSGestureStart
import org.scalablytyped.std.stdStrings.MSGestureTap
import org.scalablytyped.std.stdStrings.MSGotPointerCapture
import org.scalablytyped.std.stdStrings.MSInertiaStart
import org.scalablytyped.std.stdStrings.MSLostPointerCapture
import org.scalablytyped.std.stdStrings.MSPointerCancel
import org.scalablytyped.std.stdStrings.MSPointerDown
import org.scalablytyped.std.stdStrings.MSPointerEnter
import org.scalablytyped.std.stdStrings.MSPointerLeave
import org.scalablytyped.std.stdStrings.MSPointerMove
import org.scalablytyped.std.stdStrings.MSPointerOut
import org.scalablytyped.std.stdStrings.MSPointerOver
import org.scalablytyped.std.stdStrings.MSPointerUp
import org.scalablytyped.std.stdStrings.ariarequest
import org.scalablytyped.std.stdStrings.command
import org.scalablytyped.std.stdStrings.gotpointercapture
import org.scalablytyped.std.stdStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import org.scalablytyped.std.stdStrings.httpColonSlashSlashwwwDotw3DotorgSlash2000Slashsvg
import org.scalablytyped.std.stdStrings.lostpointercapture
import org.scalablytyped.std.stdStrings.touchcancel
import org.scalablytyped.std.stdStrings.touchend
import org.scalablytyped.std.stdStrings.touchmove
import org.scalablytyped.std.stdStrings.touchstart
import org.scalablytyped.std.stdStrings.webkitfullscreenchange
import org.scalablytyped.std.stdStrings.webkitfullscreenerror
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element
  extends Node
     with GlobalEventHandlers
     with ElementTraversal
     with NodeSelector
     with ChildNode
     with ParentNode {
  val assignedSlot: HTMLSlotElement | Null = js.native
  /* InferMemberOverrides */
  override val childElementCount: Double = js.native
  val classList: DOMTokenList = js.native
  var className: java.lang.String = js.native
  val clientHeight: Double = js.native
  val clientLeft: Double = js.native
  val clientTop: Double = js.native
  val clientWidth: Double = js.native
  /* InferMemberOverrides */
  override val firstElementChild: Element | Null = js.native
  var id: java.lang.String = js.native
  var innerHTML: java.lang.String = js.native
  /* InferMemberOverrides */
  override val lastElementChild: Element | Null = js.native
  var msContentZoomFactor: Double = js.native
  val msRegionOverflow: java.lang.String = js.native
  var outerHTML: java.lang.String = js.native
  val prefix: java.lang.String | Null = js.native
  val scrollHeight: Double = js.native
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
  val scrollWidth: Double = js.native
  val shadowRoot: ShadowRoot | Null = js.native
  var slot: java.lang.String = js.native
  val tagName: java.lang.String = js.native
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
  def addEventListener_MSGotPointerCapture(
    `type`: MSGotPointerCapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGotPointerCapture(
    `type`: MSGotPointerCapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _],
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
  def addEventListener_MSLostPointerCapture(
    `type`: MSLostPointerCapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSLostPointerCapture(
    `type`: MSLostPointerCapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MSPointerEvent, _],
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
  def addEventListener_ariarequest(`type`: ariarequest, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ariarequest(
    `type`: ariarequest,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_command(`type`: command, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_command(
    `type`: command,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(`type`: touchcancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(`type`: touchend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(`type`: touchmove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(`type`: touchstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitfullscreenchange(
    `type`: webkitfullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitfullscreenchange(
    `type`: webkitfullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitfullscreenerror(`type`: webkitfullscreenerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_webkitfullscreenerror(
    `type`: webkitfullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def attachShadow(shadowRootInitDict: ShadowRootInit): ShadowRoot = js.native
  def closest(selector: java.lang.String): Element | Null = js.native
  def getAttribute(name: java.lang.String): java.lang.String | Null = js.native
  def getAttributeNS(namespaceURI: java.lang.String, localName: java.lang.String): java.lang.String = js.native
  def getAttributeNode(name: java.lang.String): Attr = js.native
  def getAttributeNodeNS(namespaceURI: java.lang.String, localName: java.lang.String): Attr = js.native
  def getBoundingClientRect(): ClientRect = js.native
  def getClientRects(): ClientRectList = js.native
  def getElementsByClassName(classNames: java.lang.String): NodeListOf[Element] = js.native
  def getElementsByTagName(name: java.lang.String): NodeListOf[Element] = js.native
  def getElementsByTagName[K /* <: /* keyof std.ElementListTagNameMap */ java.lang.String */](name: K): /* import warning: importer.ImportType#apply Failed type conversion: std.ElementListTagNameMap[K] */ js.Any = js.native
  def getElementsByTagNameNS(namespaceURI: java.lang.String, localName: java.lang.String): HTMLCollectionOf[Element] = js.native
  @JSName("getElementsByTagNameNS")
  def getElementsByTagNameNS_httpwwww3org1999xhtml(namespaceURI: httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, localName: java.lang.String): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagNameNS")
  def getElementsByTagNameNS_httpwwww3org2000svg(namespaceURI: httpColonSlashSlashwwwDotw3DotorgSlash2000Slashsvg, localName: java.lang.String): HTMLCollectionOf[SVGElement] = js.native
  def hasAttribute(name: java.lang.String): scala.Boolean = js.native
  def hasAttributeNS(namespaceURI: java.lang.String, localName: java.lang.String): scala.Boolean = js.native
  def insertAdjacentElement(position: InsertPosition, insertedElement: Element): Element | Null = js.native
  def insertAdjacentHTML(where: InsertPosition, html: java.lang.String): Unit = js.native
  def insertAdjacentText(where: InsertPosition, text: java.lang.String): Unit = js.native
  def matches(selector: java.lang.String): scala.Boolean = js.native
  def msGetRegionContent(): MSRangeCollection = js.native
  def msGetUntransformedBounds(): ClientRect = js.native
  def msMatchesSelector(selectors: java.lang.String): scala.Boolean = js.native
  def msReleasePointerCapture(pointerId: Double): Unit = js.native
  def msSetPointerCapture(pointerId: Double): Unit = js.native
  def msZoomTo(args: MsZoomToOptions): Unit = js.native
  def onariarequest(ev: Event): js.Any = js.native
  def oncommand(ev: Event): js.Any = js.native
  def ongotpointercapture(ev: PointerEvent): js.Any = js.native
  def onlostpointercapture(ev: PointerEvent): js.Any = js.native
  def onmsgesturechange(ev: MSGestureEvent): js.Any = js.native
  def onmsgesturedoubletap(ev: MSGestureEvent): js.Any = js.native
  def onmsgestureend(ev: MSGestureEvent): js.Any = js.native
  def onmsgesturehold(ev: MSGestureEvent): js.Any = js.native
  def onmsgesturestart(ev: MSGestureEvent): js.Any = js.native
  def onmsgesturetap(ev: MSGestureEvent): js.Any = js.native
  def onmsgotpointercapture(ev: MSPointerEvent): js.Any = js.native
  def onmsinertiastart(ev: MSGestureEvent): js.Any = js.native
  def onmslostpointercapture(ev: MSPointerEvent): js.Any = js.native
  def onmspointercancel(ev: MSPointerEvent): js.Any = js.native
  def onmspointerdown(ev: MSPointerEvent): js.Any = js.native
  def onmspointerenter(ev: MSPointerEvent): js.Any = js.native
  def onmspointerleave(ev: MSPointerEvent): js.Any = js.native
  def onmspointermove(ev: MSPointerEvent): js.Any = js.native
  def onmspointerout(ev: MSPointerEvent): js.Any = js.native
  def onmspointerover(ev: MSPointerEvent): js.Any = js.native
  def onmspointerup(ev: MSPointerEvent): js.Any = js.native
  def ontouchcancel(ev: TouchEvent): js.Any = js.native
  def ontouchend(ev: TouchEvent): js.Any = js.native
  def ontouchmove(ev: TouchEvent): js.Any = js.native
  def ontouchstart(ev: TouchEvent): js.Any = js.native
  def onwebkitfullscreenchange(ev: Event): js.Any = js.native
  def onwebkitfullscreenerror(ev: Event): js.Any = js.native
  def releasePointerCapture(pointerId: Double): Unit = js.native
  def removeAttribute(qualifiedName: java.lang.String): Unit = js.native
  def removeAttributeNS(namespaceURI: java.lang.String, localName: java.lang.String): Unit = js.native
  def removeAttributeNode(oldAttr: Attr): Attr = js.native
  def requestFullscreen(): Unit = js.native
  def requestPointerLock(): Unit = js.native
  def scroll(): Unit = js.native
  def scroll(options: ScrollToOptions): Unit = js.native
  def scroll(x: Double, y: Double): Unit = js.native
  def scrollBy(): Unit = js.native
  def scrollBy(options: ScrollToOptions): Unit = js.native
  def scrollBy(x: Double, y: Double): Unit = js.native
  def scrollIntoView(): Unit = js.native
  def scrollIntoView(arg: ScrollIntoViewOptions): Unit = js.native
  def scrollIntoView(arg: scala.Boolean): Unit = js.native
  def scrollTo(): Unit = js.native
  def scrollTo(options: ScrollToOptions): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  def setAttribute(name: java.lang.String, value: java.lang.String): Unit = js.native
  def setAttributeNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String, value: java.lang.String): Unit = js.native
  def setAttributeNode(newAttr: Attr): Attr = js.native
  def setAttributeNodeNS(newAttr: Attr): Attr = js.native
  def setPointerCapture(pointerId: Double): Unit = js.native
  def webkitMatchesSelector(selectors: java.lang.String): scala.Boolean = js.native
  def webkitRequestFullScreen(): Unit = js.native
  def webkitRequestFullscreen(): Unit = js.native
}


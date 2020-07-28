package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.SVGUnload
import org.scalablytyped.std.stdStrings.SVGZoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGSVGElement
  extends SVGGraphicsElement
     with DocumentEvent
     with SVGFitToViewBox
     with SVGZoomAndPan {
  /** @deprecated */
  var contentScriptType: java.lang.String = js.native
  /** @deprecated */
  var contentStyleType: java.lang.String = js.native
  var currentScale: Double = js.native
  val currentTranslate: SVGPoint = js.native
  val height: SVGAnimatedLength = js.native
  var onunload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onzoom: (js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _]) | Null = js.native
  /** @deprecated */
  val pixelUnitToMillimeterX: Double = js.native
  /** @deprecated */
  val pixelUnitToMillimeterY: Double = js.native
  /** @deprecated */
  val screenPixelToMillimeterX: Double = js.native
  /** @deprecated */
  val screenPixelToMillimeterY: Double = js.native
  /** @deprecated */
  val viewport: SVGRect = js.native
  val width: SVGAnimatedLength = js.native
  val x: SVGAnimatedLength = js.native
  val y: SVGAnimatedLength = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGUnload(`type`: SVGUnload, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGUnload(
    `type`: SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGUnload(
    `type`: SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGZoom(`type`: SVGZoom, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGZoom(
    `type`: SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGZoom(
    `type`: SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def checkEnclosure(element: SVGElement, rect: SVGRect): scala.Boolean = js.native
  def checkIntersection(element: SVGElement, rect: SVGRect): scala.Boolean = js.native
  def createSVGAngle(): SVGAngle = js.native
  def createSVGLength(): SVGLength = js.native
  def createSVGMatrix(): SVGMatrix = js.native
  def createSVGNumber(): SVGNumber = js.native
  def createSVGPoint(): SVGPoint = js.native
  def createSVGRect(): SVGRect = js.native
  def createSVGTransform(): SVGTransform = js.native
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = js.native
  def deselectAll(): Unit = js.native
  /** @deprecated */
  def forceRedraw(): Unit = js.native
  def getComputedStyle(elt: Element): CSSStyleDeclaration = js.native
  def getComputedStyle(elt: Element, pseudoElt: java.lang.String): CSSStyleDeclaration = js.native
  /** @deprecated */
  def getCurrentTime(): Double = js.native
  def getElementById(elementId: java.lang.String): Element = js.native
  def getEnclosureList(rect: SVGRect, referenceElement: SVGElement): NodeListOf[
    SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement
  ] = js.native
  def getIntersectionList(rect: SVGRect, referenceElement: SVGElement): NodeListOf[
    SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement
  ] = js.native
  /** @deprecated */
  def pauseAnimations(): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGUnload(`type`: SVGUnload, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGUnload(
    `type`: SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGUnload(
    `type`: SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGZoom(`type`: SVGZoom, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGZoom(
    `type`: SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGZoom(
    `type`: SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SVGZoomEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  /** @deprecated */
  def setCurrentTime(seconds: Double): Unit = js.native
  /** @deprecated */
  def suspendRedraw(maxWaitMilliseconds: Double): Double = js.native
  /** @deprecated */
  def unpauseAnimations(): Unit = js.native
  /** @deprecated */
  def unsuspendRedraw(suspendHandleID: Double): Unit = js.native
  /** @deprecated */
  def unsuspendRedrawAll(): Unit = js.native
}


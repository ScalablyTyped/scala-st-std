package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.SVGAbort
import org.scalablytyped.std.stdStrings.SVGError
import org.scalablytyped.std.stdStrings.SVGUnload
import org.scalablytyped.std.stdStrings.SVGZoom
import org.scalablytyped.std.stdStrings.resize
import org.scalablytyped.std.stdStrings.scroll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- `org.scalablytyped`.std.SVGStylable because var conflicts: className. Inlined style */ @js.native
trait SVGSVGElement
  extends SVGElement
     with DocumentEvent
     with SVGLocatable
     with SVGTests
     with SVGLangSpace
     with SVGExternalResourcesRequired
     with SVGFitToViewBox
     with SVGZoomAndPan {
  var contentScriptType: java.lang.String = js.native
  var contentStyleType: java.lang.String = js.native
  var currentScale: Double = js.native
  var currentTranslate: SVGPoint = js.native
  var height: SVGAnimatedLength = js.native
  var pixelUnitToMillimeterX: Double = js.native
  var pixelUnitToMillimeterY: Double = js.native
  var screenPixelToMillimeterX: Double = js.native
  var screenPixelToMillimeterY: Double = js.native
  var style: CSSStyleDeclaration = js.native
  var viewport: SVGRect = js.native
  var width: SVGAnimatedLength = js.native
  var x: SVGAnimatedLength = js.native
  var y: SVGAnimatedLength = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGAbort(`type`: SVGAbort, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGAbort(`type`: SVGAbort, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGError(`type`: SVGError, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGError(`type`: SVGError, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGUnload(`type`: SVGUnload, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGUnload(`type`: SVGUnload, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGZoom(`type`: SVGZoom, listener: js.Function1[/* ev */ SVGZoomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGZoom(`type`: SVGZoom, listener: js.Function1[/* ev */ SVGZoomEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(`type`: resize, listener: js.Function1[/* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(`type`: resize, listener: js.Function1[/* ev */ UIEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(`type`: scroll, listener: js.Function1[/* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(`type`: scroll, listener: js.Function1[/* ev */ UIEvent, _], useCapture: scala.Boolean): Unit = js.native
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
  def forceRedraw(): Unit = js.native
  def getComputedStyle(elt: Element): CSSStyleDeclaration = js.native
  def getComputedStyle(elt: Element, pseudoElt: java.lang.String): CSSStyleDeclaration = js.native
  def getCurrentTime(): Double = js.native
  def getElementById(elementId: java.lang.String): Element = js.native
  def getEnclosureList(rect: SVGRect, referenceElement: SVGElement): NodeList = js.native
  def getIntersectionList(rect: SVGRect, referenceElement: SVGElement): NodeList = js.native
  def onabort(ev: Event): js.Any = js.native
  def onerror(ev: Event): js.Any = js.native
  def onresize(ev: UIEvent): js.Any = js.native
  def onscroll(ev: UIEvent): js.Any = js.native
  def onunload(ev: Event): js.Any = js.native
  def onzoom(ev: SVGZoomEvent): js.Any = js.native
  def pauseAnimations(): Unit = js.native
  def setCurrentTime(seconds: Double): Unit = js.native
  def suspendRedraw(maxWaitMilliseconds: Double): Double = js.native
  def unpauseAnimations(): Unit = js.native
  def unsuspendRedraw(suspendHandleID: Double): Unit = js.native
  def unsuspendRedrawAll(): Unit = js.native
}


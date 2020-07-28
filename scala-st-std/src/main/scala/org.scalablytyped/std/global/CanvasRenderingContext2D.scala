package org.scalablytyped.std.global

import org.scalablytyped.std.CanvasDirection
import org.scalablytyped.std.CanvasImageSource
import org.scalablytyped.std.CanvasLineCap
import org.scalablytyped.std.CanvasLineJoin
import org.scalablytyped.std.CanvasTextAlign
import org.scalablytyped.std.CanvasTextBaseline
import org.scalablytyped.std.ImageSmoothingQuality
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CanvasRenderingContext2D")
@js.native
class CanvasRenderingContext2D ()
  extends org.scalablytyped.std.CanvasRenderingContext2D {
  /* CompleteClass */
  override var direction: CanvasDirection = js.native
  /* CompleteClass */
  override var fillStyle: java.lang.String | org.scalablytyped.std.CanvasGradient | org.scalablytyped.std.CanvasPattern = js.native
  /* CompleteClass */
  override var filter: java.lang.String = js.native
  /* CompleteClass */
  override var font: java.lang.String = js.native
  /* CompleteClass */
  override var globalAlpha: Double = js.native
  /* CompleteClass */
  override var globalCompositeOperation: java.lang.String = js.native
  /* CompleteClass */
  override var imageSmoothingEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override var imageSmoothingQuality: ImageSmoothingQuality = js.native
  /* CompleteClass */
  override var lineCap: CanvasLineCap = js.native
  /* CompleteClass */
  override var lineDashOffset: Double = js.native
  /* CompleteClass */
  override var lineJoin: CanvasLineJoin = js.native
  /* CompleteClass */
  override var lineWidth: Double = js.native
  /* CompleteClass */
  override var miterLimit: Double = js.native
  /* CompleteClass */
  override var shadowBlur: Double = js.native
  /* CompleteClass */
  override var shadowColor: java.lang.String = js.native
  /* CompleteClass */
  override var shadowOffsetX: Double = js.native
  /* CompleteClass */
  override var shadowOffsetY: Double = js.native
  /* CompleteClass */
  override var strokeStyle: java.lang.String | org.scalablytyped.std.CanvasGradient | org.scalablytyped.std.CanvasPattern = js.native
  /* CompleteClass */
  override var textAlign: CanvasTextAlign = js.native
  /* CompleteClass */
  override var textBaseline: CanvasTextBaseline = js.native
  /* CompleteClass */
  override def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  /* CompleteClass */
  override def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): org.scalablytyped.std.CanvasGradient = js.native
  /* CompleteClass */
  override def createPattern(image: CanvasImageSource, repetition: java.lang.String): org.scalablytyped.std.CanvasPattern | Null = js.native
  /* CompleteClass */
  override def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): org.scalablytyped.std.CanvasGradient = js.native
  /* CompleteClass */
  override def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  /* CompleteClass */
  override def getLineDash(): js.Array[Double] = js.native
  /* CompleteClass */
  override def restore(): Unit = js.native
  /* CompleteClass */
  override def save(): Unit = js.native
  /* CompleteClass */
  override def setLineDash(segments: js.Array[Double]): Unit = js.native
  /* CompleteClass */
  override def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
}

@JSGlobal("CanvasRenderingContext2D")
@js.native
object CanvasRenderingContext2D
  extends Instantiable0[org.scalablytyped.std.CanvasRenderingContext2D]


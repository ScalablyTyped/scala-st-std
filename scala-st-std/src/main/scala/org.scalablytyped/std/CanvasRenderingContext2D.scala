package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasRenderingContext2D
  extends Object
     with CanvasPathMethods {
  val canvas: HTMLCanvasElement = js.native
  var fillStyle: java.lang.String | CanvasGradient | CanvasPattern = js.native
  var font: java.lang.String = js.native
  var globalAlpha: Double = js.native
  var globalCompositeOperation: java.lang.String = js.native
  var imageSmoothingEnabled: scala.Boolean = js.native
  var lineCap: java.lang.String = js.native
  var lineDashOffset: Double = js.native
  var lineJoin: java.lang.String = js.native
  var lineWidth: Double = js.native
  var miterLimit: Double = js.native
  var mozImageSmoothingEnabled: scala.Boolean = js.native
  var msFillRule: CanvasFillRule = js.native
  var oImageSmoothingEnabled: scala.Boolean = js.native
  var shadowBlur: Double = js.native
  var shadowColor: java.lang.String = js.native
  var shadowOffsetX: Double = js.native
  var shadowOffsetY: Double = js.native
  var strokeStyle: java.lang.String | CanvasGradient | CanvasPattern = js.native
  var textAlign: java.lang.String = js.native
  var textBaseline: java.lang.String = js.native
  var webkitImageSmoothingEnabled: scala.Boolean = js.native
  def beginPath(): Unit = js.native
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def clip(): Unit = js.native
  def clip(fillRule: CanvasFillRule): Unit = js.native
  def createImageData(imageDataOrSw: ImageData): ImageData = js.native
  def createImageData(imageDataOrSw: ImageData, sh: Double): ImageData = js.native
  def createImageData(imageDataOrSw: Double): ImageData = js.native
  def createImageData(imageDataOrSw: Double, sh: Double): ImageData = js.native
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient = js.native
  def createPattern(image: HTMLCanvasElement, repetition: java.lang.String): CanvasPattern = js.native
  def createPattern(image: HTMLImageElement, repetition: java.lang.String): CanvasPattern = js.native
  def createPattern(image: HTMLVideoElement, repetition: java.lang.String): CanvasPattern = js.native
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): CanvasGradient = js.native
  def drawFocusIfNeeded(element: Element): Unit = js.native
  def drawImage(image: HTMLCanvasElement, dstX: Double, dstY: Double): Unit = js.native
  def drawImage(image: HTMLCanvasElement, dstX: Double, dstY: Double, dstW: Double, dstH: Double): Unit = js.native
  def drawImage(
    image: HTMLCanvasElement,
    srcX: Double,
    srcY: Double,
    srcW: Double,
    srcH: Double,
    dstX: Double,
    dstY: Double,
    dstW: Double,
    dstH: Double
  ): Unit = js.native
  def drawImage(image: HTMLImageElement, dstX: Double, dstY: Double): Unit = js.native
  def drawImage(image: HTMLImageElement, dstX: Double, dstY: Double, dstW: Double, dstH: Double): Unit = js.native
  def drawImage(
    image: HTMLImageElement,
    srcX: Double,
    srcY: Double,
    srcW: Double,
    srcH: Double,
    dstX: Double,
    dstY: Double,
    dstW: Double,
    dstH: Double
  ): Unit = js.native
  def drawImage(image: HTMLVideoElement, dstX: Double, dstY: Double): Unit = js.native
  def drawImage(image: HTMLVideoElement, dstX: Double, dstY: Double, dstW: Double, dstH: Double): Unit = js.native
  def drawImage(
    image: HTMLVideoElement,
    srcX: Double,
    srcY: Double,
    srcW: Double,
    srcH: Double,
    dstX: Double,
    dstY: Double,
    dstW: Double,
    dstH: Double
  ): Unit = js.native
  def drawImage(image: ImageBitmap, dstX: Double, dstY: Double): Unit = js.native
  def drawImage(image: ImageBitmap, dstX: Double, dstY: Double, dstW: Double, dstH: Double): Unit = js.native
  def drawImage(
    image: ImageBitmap,
    srcX: Double,
    srcY: Double,
    srcW: Double,
    srcH: Double,
    dstX: Double,
    dstY: Double,
    dstW: Double,
    dstH: Double
  ): Unit = js.native
  def fill(): Unit = js.native
  def fill(fillRule: CanvasFillRule): Unit = js.native
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def fillText(text: java.lang.String, x: Double, y: Double): Unit = js.native
  def fillText(text: java.lang.String, x: Double, y: Double, maxWidth: Double): Unit = js.native
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ImageData = js.native
  def getLineDash(): js.Array[Double] = js.native
  def isPointInPath(x: Double, y: Double): scala.Boolean = js.native
  def isPointInPath(x: Double, y: Double, fillRule: CanvasFillRule): scala.Boolean = js.native
  def measureText(text: java.lang.String): TextMetrics = js.native
  def putImageData(imagedata: ImageData, dx: Double, dy: Double): Unit = js.native
  def putImageData(
    imagedata: ImageData,
    dx: Double,
    dy: Double,
    dirtyX: js.UndefOr[scala.Nothing],
    dirtyY: js.UndefOr[scala.Nothing],
    dirtyWidth: js.UndefOr[scala.Nothing],
    dirtyHeight: Double
  ): Unit = js.native
  def putImageData(
    imagedata: ImageData,
    dx: Double,
    dy: Double,
    dirtyX: js.UndefOr[scala.Nothing],
    dirtyY: js.UndefOr[scala.Nothing],
    dirtyWidth: Double
  ): Unit = js.native
  def putImageData(
    imagedata: ImageData,
    dx: Double,
    dy: Double,
    dirtyX: js.UndefOr[scala.Nothing],
    dirtyY: js.UndefOr[scala.Nothing],
    dirtyWidth: Double,
    dirtyHeight: Double
  ): Unit = js.native
  def putImageData(imagedata: ImageData, dx: Double, dy: Double, dirtyX: js.UndefOr[scala.Nothing], dirtyY: Double): Unit = js.native
  def putImageData(
    imagedata: ImageData,
    dx: Double,
    dy: Double,
    dirtyX: js.UndefOr[scala.Nothing],
    dirtyY: Double,
    dirtyWidth: js.UndefOr[scala.Nothing],
    dirtyHeight: Double
  ): Unit = js.native
  def putImageData(
    imagedata: ImageData,
    dx: Double,
    dy: Double,
    dirtyX: js.UndefOr[scala.Nothing],
    dirtyY: Double,
    dirtyWidth: Double
  ): Unit = js.native
  def putImageData(
    imagedata: ImageData,
    dx: Double,
    dy: Double,
    dirtyX: js.UndefOr[scala.Nothing],
    dirtyY: Double,
    dirtyWidth: Double,
    dirtyHeight: Double
  ): Unit = js.native
  def putImageData(imagedata: ImageData, dx: Double, dy: Double, dirtyX: Double): Unit = js.native
  def putImageData(
    imagedata: ImageData,
    dx: Double,
    dy: Double,
    dirtyX: Double,
    dirtyY: js.UndefOr[scala.Nothing],
    dirtyWidth: js.UndefOr[scala.Nothing],
    dirtyHeight: Double
  ): Unit = js.native
  def putImageData(
    imagedata: ImageData,
    dx: Double,
    dy: Double,
    dirtyX: Double,
    dirtyY: js.UndefOr[scala.Nothing],
    dirtyWidth: Double
  ): Unit = js.native
  def putImageData(
    imagedata: ImageData,
    dx: Double,
    dy: Double,
    dirtyX: Double,
    dirtyY: js.UndefOr[scala.Nothing],
    dirtyWidth: Double,
    dirtyHeight: Double
  ): Unit = js.native
  def putImageData(imagedata: ImageData, dx: Double, dy: Double, dirtyX: Double, dirtyY: Double): Unit = js.native
  def putImageData(
    imagedata: ImageData,
    dx: Double,
    dy: Double,
    dirtyX: Double,
    dirtyY: Double,
    dirtyWidth: js.UndefOr[scala.Nothing],
    dirtyHeight: Double
  ): Unit = js.native
  def putImageData(imagedata: ImageData, dx: Double, dy: Double, dirtyX: Double, dirtyY: Double, dirtyWidth: Double): Unit = js.native
  def putImageData(
    imagedata: ImageData,
    dx: Double,
    dy: Double,
    dirtyX: Double,
    dirtyY: Double,
    dirtyWidth: Double,
    dirtyHeight: Double
  ): Unit = js.native
  def restore(): Unit = js.native
  def rotate(angle: Double): Unit = js.native
  def save(): Unit = js.native
  def scale(x: Double, y: Double): Unit = js.native
  def setLineDash(segments: js.Array[Double]): Unit = js.native
  def setTransform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native
  def stroke(): Unit = js.native
  def stroke(path: Path2D): Unit = js.native
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def strokeText(text: java.lang.String, x: Double, y: Double): Unit = js.native
  def strokeText(text: java.lang.String, x: Double, y: Double, maxWidth: Double): Unit = js.native
  def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit = js.native
  def translate(x: Double, y: Double): Unit = js.native
}


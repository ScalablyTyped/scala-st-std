package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Path2D interface of the Canvas 2D API is used to declare a path that can then be used on a CanvasRenderingContext2D object. The path methods of the CanvasRenderingContext2D interface are also present on this interface, which gives you the convenience of being able to retain and replay your path whenever desired. */
@js.native
trait Path2D extends CanvasPath {
  def addPath(path: Path2D): Unit = js.native
  def addPath(path: Path2D, transform: DOMMatrix2DInit): Unit = js.native
}


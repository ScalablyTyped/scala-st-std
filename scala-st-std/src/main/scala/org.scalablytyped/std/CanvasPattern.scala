package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasPattern extends js.Object {
  /**
    * Sets the transformation matrix that will be used when rendering the pattern during a fill or
    * stroke painting operation.
    */
  def setTransform(): Unit = js.native
  def setTransform(transform: DOMMatrix2DInit): Unit = js.native
}


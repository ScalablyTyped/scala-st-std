package org.scalablytyped.std.global

import org.scalablytyped.std.DOMMatrixInit
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebKitCSSMatrix")
@js.native
class WebKitCSSMatrix ()
  extends org.scalablytyped.std.DOMMatrix {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[Double]) = this()
}

@JSGlobal("WebKitCSSMatrix")
@js.native
object WebKitCSSMatrix
  extends Instantiable0[org.scalablytyped.std.DOMMatrix]
     with Instantiable1[
      (/* init */ js.Array[Double]) | (/* init */ java.lang.String), 
      org.scalablytyped.std.DOMMatrix
    ] {
  def fromFloat32Array(array32: org.scalablytyped.std.Float32Array): org.scalablytyped.std.DOMMatrix = js.native
  def fromFloat64Array(array64: org.scalablytyped.std.Float64Array): org.scalablytyped.std.DOMMatrix = js.native
  def fromMatrix(): org.scalablytyped.std.DOMMatrix = js.native
  def fromMatrix(other: DOMMatrixInit): org.scalablytyped.std.DOMMatrix = js.native
}


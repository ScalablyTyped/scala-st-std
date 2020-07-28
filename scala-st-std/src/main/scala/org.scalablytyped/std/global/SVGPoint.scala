package org.scalablytyped.std.global

import org.scalablytyped.std.DOMPointInit
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SVGPoint")
@js.native
class SVGPoint ()
  extends org.scalablytyped.std.DOMPoint {
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    z: js.UndefOr[scala.Nothing],
    w: Double
  ) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
}

@JSGlobal("SVGPoint")
@js.native
object SVGPoint
  extends Instantiable0[org.scalablytyped.std.DOMPoint]
     with Instantiable1[/* x */ Double, org.scalablytyped.std.DOMPoint]
     with Instantiable2[js.UndefOr[/* x */ Double], /* y */ Double, org.scalablytyped.std.DOMPoint]
     with Instantiable3[
      js.UndefOr[/* x */ Double], 
      js.UndefOr[/* y */ Double], 
      /* z */ Double, 
      org.scalablytyped.std.DOMPoint
    ]
     with Instantiable4[
      js.UndefOr[/* x */ Double], 
      js.UndefOr[/* y */ Double], 
      js.UndefOr[/* z */ Double], 
      /* w */ Double, 
      org.scalablytyped.std.DOMPoint
    ] {
  def fromPoint(): org.scalablytyped.std.DOMPoint = js.native
  def fromPoint(other: DOMPointInit): org.scalablytyped.std.DOMPoint = js.native
}


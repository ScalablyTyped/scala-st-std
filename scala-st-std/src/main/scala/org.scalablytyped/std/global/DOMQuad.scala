package org.scalablytyped.std.global

import org.scalablytyped.std.DOMPointInit
import org.scalablytyped.std.DOMQuadInit
import org.scalablytyped.std.DOMRectInit
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMQuad")
@js.native
class DOMQuad ()
  extends org.scalablytyped.std.DOMQuad {
  def this(p1: DOMPointInit) = this()
  def this(p1: js.UndefOr[scala.Nothing], p2: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit) = this()
  def this(p1: js.UndefOr[scala.Nothing], p2: js.UndefOr[scala.Nothing], p3: DOMPointInit) = this()
  def this(p1: js.UndefOr[scala.Nothing], p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: js.UndefOr[scala.Nothing], p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(
    p1: js.UndefOr[scala.Nothing],
    p2: js.UndefOr[scala.Nothing],
    p3: js.UndefOr[scala.Nothing],
    p4: DOMPointInit
  ) = this()
  def this(p1: js.UndefOr[scala.Nothing], p2: js.UndefOr[scala.Nothing], p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: js.UndefOr[scala.Nothing], p2: DOMPointInit, p3: js.UndefOr[scala.Nothing], p4: DOMPointInit) = this()
  def this(p1: js.UndefOr[scala.Nothing], p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: js.UndefOr[scala.Nothing], p3: js.UndefOr[scala.Nothing], p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: js.UndefOr[scala.Nothing], p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: js.UndefOr[scala.Nothing], p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  /* CompleteClass */
  override val p1: org.scalablytyped.std.DOMPoint = js.native
  /* CompleteClass */
  override val p2: org.scalablytyped.std.DOMPoint = js.native
  /* CompleteClass */
  override val p3: org.scalablytyped.std.DOMPoint = js.native
  /* CompleteClass */
  override val p4: org.scalablytyped.std.DOMPoint = js.native
  /* CompleteClass */
  override def getBounds(): org.scalablytyped.std.DOMRect = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("DOMQuad")
@js.native
object DOMQuad
  extends Instantiable0[org.scalablytyped.std.DOMQuad]
     with Instantiable1[/* p1 */ DOMPointInit, org.scalablytyped.std.DOMQuad]
     with Instantiable2[
      js.UndefOr[/* p1 */ DOMPointInit], 
      /* p2 */ DOMPointInit, 
      org.scalablytyped.std.DOMQuad
    ]
     with Instantiable3[
      js.UndefOr[/* p1 */ DOMPointInit], 
      js.UndefOr[/* p2 */ DOMPointInit], 
      /* p3 */ DOMPointInit, 
      org.scalablytyped.std.DOMQuad
    ]
     with Instantiable4[
      js.UndefOr[/* p1 */ DOMPointInit], 
      js.UndefOr[/* p2 */ DOMPointInit], 
      js.UndefOr[/* p3 */ DOMPointInit], 
      /* p4 */ DOMPointInit, 
      org.scalablytyped.std.DOMQuad
    ] {
  def fromQuad(): org.scalablytyped.std.DOMQuad = js.native
  def fromQuad(other: DOMQuadInit): org.scalablytyped.std.DOMQuad = js.native
  def fromRect(): org.scalablytyped.std.DOMQuad = js.native
  def fromRect(other: DOMRectInit): org.scalablytyped.std.DOMQuad = js.native
}


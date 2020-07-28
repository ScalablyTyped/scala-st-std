package org.scalablytyped.std.global

import org.scalablytyped.std.IntersectionObserverEntryInit
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IntersectionObserverEntry")
@js.native
class IntersectionObserverEntry protected ()
  extends org.scalablytyped.std.IntersectionObserverEntry {
  def this(intersectionObserverEntryInit: IntersectionObserverEntryInit) = this()
  /* CompleteClass */
  override val boundingClientRect: org.scalablytyped.std.ClientRect = js.native
  /* CompleteClass */
  override val intersectionRatio: Double = js.native
  /* CompleteClass */
  override val intersectionRect: org.scalablytyped.std.ClientRect = js.native
  /* CompleteClass */
  override val isIntersecting: scala.Boolean = js.native
  /* CompleteClass */
  override val rootBounds: org.scalablytyped.std.ClientRect = js.native
  /* CompleteClass */
  override val target: org.scalablytyped.std.Element = js.native
  /* CompleteClass */
  override val time: Double = js.native
}

@JSGlobal("IntersectionObserverEntry")
@js.native
object IntersectionObserverEntry
  extends Instantiable1[
      /* intersectionObserverEntryInit */ IntersectionObserverEntryInit, 
      org.scalablytyped.std.IntersectionObserverEntry
    ]


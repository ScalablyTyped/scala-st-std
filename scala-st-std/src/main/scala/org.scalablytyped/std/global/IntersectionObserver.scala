package org.scalablytyped.std.global

import org.scalablytyped.std.IntersectionObserverCallback
import org.scalablytyped.std.IntersectionObserverInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IntersectionObserver")
@js.native
class IntersectionObserver protected ()
  extends org.scalablytyped.std.IntersectionObserver {
  def this(callback: IntersectionObserverCallback) = this()
  def this(callback: IntersectionObserverCallback, options: IntersectionObserverInit) = this()
  /* CompleteClass */
  override val root: org.scalablytyped.std.Element | Null = js.native
  /* CompleteClass */
  override val rootMargin: java.lang.String = js.native
  /* CompleteClass */
  override val thresholds: js.Array[Double] = js.native
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  /* CompleteClass */
  override def observe(target: org.scalablytyped.std.Element): Unit = js.native
  /* CompleteClass */
  override def takeRecords(): js.Array[org.scalablytyped.std.IntersectionObserverEntry] = js.native
  /* CompleteClass */
  override def unobserve(target: org.scalablytyped.std.Element): Unit = js.native
}

@JSGlobal("IntersectionObserver")
@js.native
object IntersectionObserver
  extends Instantiable1[
      /* callback */ IntersectionObserverCallback, 
      org.scalablytyped.std.IntersectionObserver
    ]
     with Instantiable2[
      /* callback */ IntersectionObserverCallback, 
      /* options */ IntersectionObserverInit, 
      org.scalablytyped.std.IntersectionObserver
    ]


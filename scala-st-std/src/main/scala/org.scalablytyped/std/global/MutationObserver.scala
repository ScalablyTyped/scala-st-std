package org.scalablytyped.std.global

import org.scalablytyped.std.MutationCallback
import org.scalablytyped.std.MutationObserverInit
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MutationObserver")
@js.native
class MutationObserver protected ()
  extends org.scalablytyped.std.MutationObserver {
  def this(callback: MutationCallback) = this()
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  /* CompleteClass */
  override def observe(target: org.scalablytyped.std.Node, options: MutationObserverInit): Unit = js.native
  /* CompleteClass */
  override def takeRecords(): js.Array[org.scalablytyped.std.MutationRecord] = js.native
}

@JSGlobal("MutationObserver")
@js.native
object MutationObserver
  extends Instantiable1[/* callback */ MutationCallback, org.scalablytyped.std.MutationObserver]


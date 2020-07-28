package org.scalablytyped.std.global.WebAssembly

import org.scalablytyped.std.ArrayBuffer
import org.scalablytyped.std.WebAssembly.MemoryDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.Memory")
@js.native
class MemoryCls protected ()
  extends org.scalablytyped.std.WebAssembly.Memory {
  def this(descriptor: MemoryDescriptor) = this()
  /* CompleteClass */
  override val buffer: ArrayBuffer = js.native
  /* CompleteClass */
  override def grow(delta: Double): Double = js.native
}


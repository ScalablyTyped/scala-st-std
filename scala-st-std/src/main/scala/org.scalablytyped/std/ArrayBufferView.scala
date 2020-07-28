package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayBufferView extends js.Object {
  /**
    * The ArrayBuffer instance referenced by the array. 
    */
  var buffer: ArrayBuffer
  /**
    * The length in bytes of the array.
    */
  var byteLength: Double
  /**
    * The offset in bytes of the array.
    */
  var byteOffset: Double
}

object ArrayBufferView {
  @scala.inline
  def apply(buffer: ArrayBuffer, byteLength: Double, byteOffset: Double): ArrayBufferView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], byteOffset = byteOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayBufferView]
  }
  @scala.inline
  implicit class ArrayBufferViewOps[Self <: ArrayBufferView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuffer(value: ArrayBuffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setByteLength(value: Double): Self = this.set("byteLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setByteOffset(value: Double): Self = this.set("byteOffset", value.asInstanceOf[js.Any])
  }
  
}


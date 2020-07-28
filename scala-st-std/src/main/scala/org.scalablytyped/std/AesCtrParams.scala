package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesCtrParams extends Algorithm {
  var counter: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer | Null
  var length: Double
}

object AesCtrParams {
  @scala.inline
  def apply(length: Double, name: java.lang.String): AesCtrParams = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCtrParams]
  }
  @scala.inline
  implicit class AesCtrParamsOps[Self <: AesCtrParams] (val x: Self) extends AnyVal {
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setCounter(
      value: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
    ): Self = this.set("counter", value.asInstanceOf[js.Any])
    @scala.inline
    def setCounterNull: Self = this.set("counter", null)
  }
  
}


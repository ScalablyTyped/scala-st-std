package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesGcmParams extends Algorithm {
  var additionalData: js.UndefOr[
    Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer | Null
  ] = js.undefined
  var iv: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer | Null
  var tagLength: js.UndefOr[Double] = js.undefined
}

object AesGcmParams {
  @scala.inline
  def apply(name: java.lang.String): AesGcmParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesGcmParams]
  }
  @scala.inline
  implicit class AesGcmParamsOps[Self <: AesGcmParams] (val x: Self) extends AnyVal {
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
    def setAdditionalData(
      value: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
    ): Self = this.set("additionalData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalData: Self = this.set("additionalData", js.undefined)
    @scala.inline
    def setAdditionalDataNull: Self = this.set("additionalData", null)
    @scala.inline
    def setIv(
      value: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
    ): Self = this.set("iv", value.asInstanceOf[js.Any])
    @scala.inline
    def setIvNull: Self = this.set("iv", null)
    @scala.inline
    def setTagLength(value: Double): Self = this.set("tagLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagLength: Self = this.set("tagLength", js.undefined)
  }
  
}


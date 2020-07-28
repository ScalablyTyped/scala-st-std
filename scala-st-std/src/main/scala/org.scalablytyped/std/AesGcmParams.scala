package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesGcmParams extends Algorithm {
  var additionalData: js.UndefOr[BufferSource] = js.undefined
  var iv: BufferSource
  var tagLength: js.UndefOr[Double] = js.undefined
}

object AesGcmParams {
  @scala.inline
  def apply(iv: BufferSource, name: java.lang.String): AesGcmParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
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
    def setIv(value: BufferSource): Self = this.set("iv", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditionalData(value: BufferSource): Self = this.set("additionalData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalData: Self = this.set("additionalData", js.undefined)
    @scala.inline
    def setTagLength(value: Double): Self = this.set("tagLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagLength: Self = this.set("tagLength", js.undefined)
  }
  
}


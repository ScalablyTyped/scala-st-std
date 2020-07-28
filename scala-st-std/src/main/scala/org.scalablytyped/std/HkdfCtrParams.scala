package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HkdfCtrParams extends Algorithm {
  var context: BufferSource
  var hash: AlgorithmIdentifier
  var label: BufferSource
}

object HkdfCtrParams {
  @scala.inline
  def apply(context: BufferSource, hash: AlgorithmIdentifier, label: BufferSource, name: java.lang.String): HkdfCtrParams = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HkdfCtrParams]
  }
  @scala.inline
  implicit class HkdfCtrParamsOps[Self <: HkdfCtrParams] (val x: Self) extends AnyVal {
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
    def setContext(value: BufferSource): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: AlgorithmIdentifier): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: BufferSource): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}


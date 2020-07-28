package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EcdsaParams extends Algorithm {
  var hash: java.lang.String | Algorithm
}

object EcdsaParams {
  @scala.inline
  def apply(hash: java.lang.String | Algorithm, name: java.lang.String): EcdsaParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcdsaParams]
  }
  @scala.inline
  implicit class EcdsaParamsOps[Self <: EcdsaParams] (val x: Self) extends AnyVal {
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
    def setHash(value: java.lang.String | Algorithm): Self = this.set("hash", value.asInstanceOf[js.Any])
  }
  
}


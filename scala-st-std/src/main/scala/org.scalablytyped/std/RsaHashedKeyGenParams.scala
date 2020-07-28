package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaHashedKeyGenParams extends RsaKeyGenParams {
  var hash: java.lang.String | Algorithm
}

object RsaHashedKeyGenParams {
  @scala.inline
  def apply(
    hash: java.lang.String | Algorithm,
    modulusLength: Double,
    name: java.lang.String,
    publicExponent: Uint8Array
  ): RsaHashedKeyGenParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaHashedKeyGenParams]
  }
  @scala.inline
  implicit class RsaHashedKeyGenParamsOps[Self <: RsaHashedKeyGenParams] (val x: Self) extends AnyVal {
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


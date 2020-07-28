package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaHashedImportParams extends Algorithm {
  var hash: java.lang.String | Algorithm
}

object RsaHashedImportParams {
  @scala.inline
  def apply(hash: java.lang.String | Algorithm, name: java.lang.String): RsaHashedImportParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaHashedImportParams]
  }
  @scala.inline
  implicit class RsaHashedImportParamsOps[Self <: RsaHashedImportParams] (val x: Self) extends AnyVal {
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


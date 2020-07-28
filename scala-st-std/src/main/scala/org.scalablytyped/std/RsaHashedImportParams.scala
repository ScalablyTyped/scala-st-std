package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaHashedImportParams extends js.Object {
  var hash: AlgorithmIdentifier
}

object RsaHashedImportParams {
  @scala.inline
  def apply(hash: AlgorithmIdentifier): RsaHashedImportParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
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
    def setHash(value: AlgorithmIdentifier): Self = this.set("hash", value.asInstanceOf[js.Any])
  }
  
}


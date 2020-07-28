package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EcKeyAlgorithm extends KeyAlgorithm {
  var typedCurve: java.lang.String
}

object EcKeyAlgorithm {
  @scala.inline
  def apply(typedCurve: java.lang.String): EcKeyAlgorithm = {
    val __obj = js.Dynamic.literal(typedCurve = typedCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcKeyAlgorithm]
  }
  @scala.inline
  implicit class EcKeyAlgorithmOps[Self <: EcKeyAlgorithm] (val x: Self) extends AnyVal {
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
    def setTypedCurve(value: java.lang.String): Self = this.set("typedCurve", value.asInstanceOf[js.Any])
  }
  
}


package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EcKeyGenParams extends Algorithm {
  var namedCurve: NamedCurve
}

object EcKeyGenParams {
  @scala.inline
  def apply(name: java.lang.String, namedCurve: NamedCurve): EcKeyGenParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namedCurve = namedCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcKeyGenParams]
  }
  @scala.inline
  implicit class EcKeyGenParamsOps[Self <: EcKeyGenParams] (val x: Self) extends AnyVal {
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
    def setNamedCurve(value: NamedCurve): Self = this.set("namedCurve", value.asInstanceOf[js.Any])
  }
  
}


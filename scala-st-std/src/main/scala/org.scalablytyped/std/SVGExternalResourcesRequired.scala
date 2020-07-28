package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGExternalResourcesRequired extends js.Object {
  var externalResourcesRequired: SVGAnimatedBoolean
}

object SVGExternalResourcesRequired {
  @scala.inline
  def apply(externalResourcesRequired: SVGAnimatedBoolean): SVGExternalResourcesRequired = {
    val __obj = js.Dynamic.literal(externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGExternalResourcesRequired]
  }
  @scala.inline
  implicit class SVGExternalResourcesRequiredOps[Self <: SVGExternalResourcesRequired] (val x: Self) extends AnyVal {
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
    def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = this.set("externalResourcesRequired", value.asInstanceOf[js.Any])
  }
  
}


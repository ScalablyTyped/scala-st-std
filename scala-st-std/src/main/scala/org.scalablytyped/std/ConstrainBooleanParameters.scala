package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstrainBooleanParameters extends js.Object {
  var exact: js.UndefOr[scala.Boolean] = js.undefined
  var ideal: js.UndefOr[scala.Boolean] = js.undefined
}

object ConstrainBooleanParameters {
  @scala.inline
  def apply(): ConstrainBooleanParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainBooleanParameters]
  }
  @scala.inline
  implicit class ConstrainBooleanParametersOps[Self <: ConstrainBooleanParameters] (val x: Self) extends AnyVal {
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
    def setExact(value: scala.Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    @scala.inline
    def setIdeal(value: scala.Boolean): Self = this.set("ideal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdeal: Self = this.set("ideal", js.undefined)
  }
  
}


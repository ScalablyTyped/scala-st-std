package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBKeyRange extends js.Object {
  val lower: js.Any
  val lowerOpen: scala.Boolean
  val upper: js.Any
  val upperOpen: scala.Boolean
}

object IDBKeyRange {
  @scala.inline
  def apply(lower: js.Any, lowerOpen: scala.Boolean, upper: js.Any, upperOpen: scala.Boolean): IDBKeyRange = {
    val __obj = js.Dynamic.literal(lower = lower.asInstanceOf[js.Any], lowerOpen = lowerOpen.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any], upperOpen = upperOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBKeyRange]
  }
  @scala.inline
  implicit class IDBKeyRangeOps[Self <: IDBKeyRange] (val x: Self) extends AnyVal {
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
    def setLower(value: js.Any): Self = this.set("lower", value.asInstanceOf[js.Any])
    @scala.inline
    def setLowerOpen(value: scala.Boolean): Self = this.set("lowerOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpper(value: js.Any): Self = this.set("upper", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpperOpen(value: scala.Boolean): Self = this.set("upperOpen", value.asInstanceOf[js.Any])
  }
  
}


package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorConcurrentHardware extends js.Object {
  val hardwareConcurrency: Double
}

object NavigatorConcurrentHardware {
  @scala.inline
  def apply(hardwareConcurrency: Double): NavigatorConcurrentHardware = {
    val __obj = js.Dynamic.literal(hardwareConcurrency = hardwareConcurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorConcurrentHardware]
  }
  @scala.inline
  implicit class NavigatorConcurrentHardwareOps[Self <: NavigatorConcurrentHardware] (val x: Self) extends AnyVal {
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
    def setHardwareConcurrency(value: Double): Self = this.set("hardwareConcurrency", value.asInstanceOf[js.Any])
  }
  
}


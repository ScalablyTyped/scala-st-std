package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorGeolocation extends js.Object {
  val geolocation: Geolocation
}

object NavigatorGeolocation {
  @scala.inline
  def apply(geolocation: Geolocation): NavigatorGeolocation = {
    val __obj = js.Dynamic.literal(geolocation = geolocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorGeolocation]
  }
  @scala.inline
  implicit class NavigatorGeolocationOps[Self <: NavigatorGeolocation] (val x: Self) extends AnyVal {
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
    def setGeolocation(value: Geolocation): Self = this.set("geolocation", value.asInstanceOf[js.Any])
  }
  
}


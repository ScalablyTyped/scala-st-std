package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnimatedPathData extends js.Object {
  val pathSegList: SVGPathSegList
}

object SVGAnimatedPathData {
  @scala.inline
  def apply(pathSegList: SVGPathSegList): SVGAnimatedPathData = {
    val __obj = js.Dynamic.literal(pathSegList = pathSegList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedPathData]
  }
  @scala.inline
  implicit class SVGAnimatedPathDataOps[Self <: SVGAnimatedPathData] (val x: Self) extends AnyVal {
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
    def setPathSegList(value: SVGPathSegList): Self = this.set("pathSegList", value.asInstanceOf[js.Any])
  }
  
}


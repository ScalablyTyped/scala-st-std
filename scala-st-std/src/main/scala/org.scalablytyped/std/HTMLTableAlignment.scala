package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLTableAlignment extends js.Object {
  /**
    * Sets or retrieves a value that you can use to implement your own ch functionality for the object.
    */
  var ch: java.lang.String
  /**
    * Sets or retrieves a value that you can use to implement your own chOff functionality for the object.
    */
  var chOff: java.lang.String
  /**
    * Sets or retrieves how text and other content are vertically aligned within the object that contains them.
    */
  var vAlign: java.lang.String
}

object HTMLTableAlignment {
  @scala.inline
  def apply(ch: java.lang.String, chOff: java.lang.String, vAlign: java.lang.String): HTMLTableAlignment = {
    val __obj = js.Dynamic.literal(ch = ch.asInstanceOf[js.Any], chOff = chOff.asInstanceOf[js.Any], vAlign = vAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLTableAlignment]
  }
  @scala.inline
  implicit class HTMLTableAlignmentOps[Self <: HTMLTableAlignment] (val x: Self) extends AnyVal {
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
    def setCh(value: java.lang.String): Self = this.set("ch", value.asInstanceOf[js.Any])
    @scala.inline
    def setChOff(value: java.lang.String): Self = this.set("chOff", value.asInstanceOf[js.Any])
    @scala.inline
    def setVAlign(value: java.lang.String): Self = this.set("vAlign", value.asInstanceOf[js.Any])
  }
  
}


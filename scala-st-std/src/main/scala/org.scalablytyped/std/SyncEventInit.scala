package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncEventInit extends EventInit {
  var lastChance: js.UndefOr[scala.Boolean] = js.undefined
  var tag: java.lang.String
}

object SyncEventInit {
  @scala.inline
  def apply(tag: java.lang.String): SyncEventInit = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncEventInit]
  }
  @scala.inline
  implicit class SyncEventInitOps[Self <: SyncEventInit] (val x: Self) extends AnyVal {
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
    def setTag(value: java.lang.String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastChance(value: scala.Boolean): Self = this.set("lastChance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastChance: Self = this.set("lastChance", js.undefined)
  }
  
}


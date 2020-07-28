package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageEventInit extends EventInit {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var newValue: js.UndefOr[java.lang.String] = js.undefined
  var oldValue: js.UndefOr[java.lang.String] = js.undefined
  var storageArea: js.UndefOr[Storage] = js.undefined
  var url: java.lang.String
}

object StorageEventInit {
  @scala.inline
  def apply(url: java.lang.String): StorageEventInit = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageEventInit]
  }
  @scala.inline
  implicit class StorageEventInitOps[Self <: StorageEventInit] (val x: Self) extends AnyVal {
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
    def setUrl(value: java.lang.String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: java.lang.String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setNewValue(value: java.lang.String): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    @scala.inline
    def setOldValue(value: java.lang.String): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
    @scala.inline
    def setStorageArea(value: Storage): Self = this.set("storageArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageArea: Self = this.set("storageArea", js.undefined)
  }
  
}


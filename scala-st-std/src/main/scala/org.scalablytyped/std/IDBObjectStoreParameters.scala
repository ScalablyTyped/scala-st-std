package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBObjectStoreParameters extends js.Object {
  var autoIncrement: js.UndefOr[scala.Boolean] = js.undefined
  var keyPath: js.UndefOr[IDBKeyPath] = js.undefined
}

object IDBObjectStoreParameters {
  @scala.inline
  def apply(): IDBObjectStoreParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDBObjectStoreParameters]
  }
  @scala.inline
  implicit class IDBObjectStoreParametersOps[Self <: IDBObjectStoreParameters] (val x: Self) extends AnyVal {
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
    def setAutoIncrement(value: scala.Boolean): Self = this.set("autoIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoIncrement: Self = this.set("autoIncrement", js.undefined)
    @scala.inline
    def setKeyPath(value: IDBKeyPath): Self = this.set("keyPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPath: Self = this.set("keyPath", js.undefined)
  }
  
}


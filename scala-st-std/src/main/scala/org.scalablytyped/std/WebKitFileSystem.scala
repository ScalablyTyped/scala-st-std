package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebKitFileSystem extends js.Object {
  val name: java.lang.String
  val root: WebKitDirectoryEntry
}

object WebKitFileSystem {
  @scala.inline
  def apply(name: java.lang.String, root: WebKitDirectoryEntry): WebKitFileSystem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebKitFileSystem]
  }
  @scala.inline
  implicit class WebKitFileSystemOps[Self <: WebKitFileSystem] (val x: Self) extends AnyVal {
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
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: WebKitDirectoryEntry): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}


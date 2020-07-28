package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebKitEntry extends js.Object {
  val filesystem: WebKitFileSystem
  val fullPath: java.lang.String
  val isDirectory: scala.Boolean
  val isFile: scala.Boolean
  val name: java.lang.String
}

object WebKitEntry {
  @scala.inline
  def apply(
    filesystem: WebKitFileSystem,
    fullPath: java.lang.String,
    isDirectory: scala.Boolean,
    isFile: scala.Boolean,
    name: java.lang.String
  ): WebKitEntry = {
    val __obj = js.Dynamic.literal(filesystem = filesystem.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebKitEntry]
  }
  @scala.inline
  implicit class WebKitEntryOps[Self <: WebKitEntry] (val x: Self) extends AnyVal {
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
    def setFilesystem(value: WebKitFileSystem): Self = this.set("filesystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullPath(value: java.lang.String): Self = this.set("fullPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDirectory(value: scala.Boolean): Self = this.set("isDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFile(value: scala.Boolean): Self = this.set("isFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}


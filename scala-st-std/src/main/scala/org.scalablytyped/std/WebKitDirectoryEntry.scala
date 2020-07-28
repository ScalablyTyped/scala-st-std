package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebKitDirectoryEntry extends WebKitEntry {
  def createReader(): WebKitDirectoryReader
}

object WebKitDirectoryEntry {
  @scala.inline
  def apply(
    createReader: () => WebKitDirectoryReader,
    filesystem: WebKitFileSystem,
    fullPath: java.lang.String,
    isDirectory: scala.Boolean,
    isFile: scala.Boolean,
    name: java.lang.String
  ): WebKitDirectoryEntry = {
    val __obj = js.Dynamic.literal(createReader = js.Any.fromFunction0(createReader), filesystem = filesystem.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebKitDirectoryEntry]
  }
  @scala.inline
  implicit class WebKitDirectoryEntryOps[Self <: WebKitDirectoryEntry] (val x: Self) extends AnyVal {
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
    def setCreateReader(value: () => WebKitDirectoryReader): Self = this.set("createReader", js.Any.fromFunction0(value))
  }
  
}


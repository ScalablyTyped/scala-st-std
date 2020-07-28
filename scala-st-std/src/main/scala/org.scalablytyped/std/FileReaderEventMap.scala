package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileReaderEventMap extends js.Object {
  var abort: ProgressEvent
  var error: ProgressEvent
  var load: ProgressEvent
  var loadend: ProgressEvent
  var loadstart: ProgressEvent
  var progress: ProgressEvent
}

object FileReaderEventMap {
  @scala.inline
  def apply(
    abort: ProgressEvent,
    error: ProgressEvent,
    load: ProgressEvent,
    loadend: ProgressEvent,
    loadstart: ProgressEvent,
    progress: ProgressEvent
  ): FileReaderEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileReaderEventMap]
  }
  @scala.inline
  implicit class FileReaderEventMapOps[Self <: FileReaderEventMap] (val x: Self) extends AnyVal {
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
    def setAbort(value: ProgressEvent): Self = this.set("abort", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ProgressEvent): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad(value: ProgressEvent): Self = this.set("load", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadend(value: ProgressEvent): Self = this.set("loadend", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadstart(value: ProgressEvent): Self = this.set("loadstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgress(value: ProgressEvent): Self = this.set("progress", value.asInstanceOf[js.Any])
  }
  
}


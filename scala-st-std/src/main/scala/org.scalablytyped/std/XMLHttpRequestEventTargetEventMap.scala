package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLHttpRequestEventTargetEventMap extends js.Object {
  var abort: ProgressEvent[XMLHttpRequestEventTarget]
  var error: ProgressEvent[XMLHttpRequestEventTarget]
  var load: ProgressEvent[XMLHttpRequestEventTarget]
  var loadend: ProgressEvent[XMLHttpRequestEventTarget]
  var loadstart: ProgressEvent[XMLHttpRequestEventTarget]
  var progress: ProgressEvent[XMLHttpRequestEventTarget]
  var timeout: ProgressEvent[XMLHttpRequestEventTarget]
}

object XMLHttpRequestEventTargetEventMap {
  @scala.inline
  def apply(
    abort: ProgressEvent[XMLHttpRequestEventTarget],
    error: ProgressEvent[XMLHttpRequestEventTarget],
    load: ProgressEvent[XMLHttpRequestEventTarget],
    loadend: ProgressEvent[XMLHttpRequestEventTarget],
    loadstart: ProgressEvent[XMLHttpRequestEventTarget],
    progress: ProgressEvent[XMLHttpRequestEventTarget],
    timeout: ProgressEvent[XMLHttpRequestEventTarget]
  ): XMLHttpRequestEventTargetEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLHttpRequestEventTargetEventMap]
  }
  @scala.inline
  implicit class XMLHttpRequestEventTargetEventMapOps[Self <: XMLHttpRequestEventTargetEventMap] (val x: Self) extends AnyVal {
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
    def setAbort(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = this.set("abort", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = this.set("load", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadend(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = this.set("loadend", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadstart(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = this.set("loadstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgress(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: ProgressEvent[XMLHttpRequestEventTarget]): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
  
}


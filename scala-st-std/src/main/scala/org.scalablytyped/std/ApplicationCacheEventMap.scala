package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationCacheEventMap extends js.Object {
  var cached: Event
  var checking: Event
  var downloading: Event
  var error: Event
  var noupdate: Event
  var obsolete: Event
  var progress: ProgressEvent
  var updateready: Event
}

object ApplicationCacheEventMap {
  @scala.inline
  def apply(
    cached: Event,
    checking: Event,
    downloading: Event,
    error: Event,
    noupdate: Event,
    obsolete: Event,
    progress: ProgressEvent,
    updateready: Event
  ): ApplicationCacheEventMap = {
    val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], checking = checking.asInstanceOf[js.Any], downloading = downloading.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], noupdate = noupdate.asInstanceOf[js.Any], obsolete = obsolete.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], updateready = updateready.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCacheEventMap]
  }
  @scala.inline
  implicit class ApplicationCacheEventMapOps[Self <: ApplicationCacheEventMap] (val x: Self) extends AnyVal {
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
    def setCached(value: Event): Self = this.set("cached", value.asInstanceOf[js.Any])
    @scala.inline
    def setChecking(value: Event): Self = this.set("checking", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloading(value: Event): Self = this.set("downloading", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Event): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoupdate(value: Event): Self = this.set("noupdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setObsolete(value: Event): Self = this.set("obsolete", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgress(value: ProgressEvent): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateready(value: Event): Self = this.set("updateready", value.asInstanceOf[js.Any])
  }
  
}


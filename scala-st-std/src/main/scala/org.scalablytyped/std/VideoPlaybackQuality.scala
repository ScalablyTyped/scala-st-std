package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoPlaybackQuality extends js.Object {
  val corruptedVideoFrames: Double
  val creationTime: Double
  val droppedVideoFrames: Double
  val totalFrameDelay: Double
  val totalVideoFrames: Double
}

object VideoPlaybackQuality {
  @scala.inline
  def apply(
    corruptedVideoFrames: Double,
    creationTime: Double,
    droppedVideoFrames: Double,
    totalFrameDelay: Double,
    totalVideoFrames: Double
  ): VideoPlaybackQuality = {
    val __obj = js.Dynamic.literal(corruptedVideoFrames = corruptedVideoFrames.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], droppedVideoFrames = droppedVideoFrames.asInstanceOf[js.Any], totalFrameDelay = totalFrameDelay.asInstanceOf[js.Any], totalVideoFrames = totalVideoFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlaybackQuality]
  }
  @scala.inline
  implicit class VideoPlaybackQualityOps[Self <: VideoPlaybackQuality] (val x: Self) extends AnyVal {
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
    def setCorruptedVideoFrames(value: Double): Self = this.set("corruptedVideoFrames", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationTime(value: Double): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDroppedVideoFrames(value: Double): Self = this.set("droppedVideoFrames", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalFrameDelay(value: Double): Self = this.set("totalFrameDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalVideoFrames(value: Double): Self = this.set("totalVideoFrames", value.asInstanceOf[js.Any])
  }
  
}


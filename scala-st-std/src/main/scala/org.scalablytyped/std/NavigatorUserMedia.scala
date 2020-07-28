package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorUserMedia extends js.Object {
  val mediaDevices: MediaDevices
  def getUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: NavigatorUserMediaSuccessCallback,
    errorCallback: NavigatorUserMediaErrorCallback
  ): Unit
}

object NavigatorUserMedia {
  @scala.inline
  def apply(
    getUserMedia: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit,
    mediaDevices: MediaDevices
  ): NavigatorUserMedia = {
    val __obj = js.Dynamic.literal(getUserMedia = js.Any.fromFunction3(getUserMedia), mediaDevices = mediaDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorUserMedia]
  }
  @scala.inline
  implicit class NavigatorUserMediaOps[Self <: NavigatorUserMedia] (val x: Self) extends AnyVal {
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
    def setGetUserMedia(
      value: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit
    ): Self = this.set("getUserMedia", js.Any.fromFunction3(value))
    @scala.inline
    def setMediaDevices(value: MediaDevices): Self = this.set("mediaDevices", value.asInstanceOf[js.Any])
  }
  
}


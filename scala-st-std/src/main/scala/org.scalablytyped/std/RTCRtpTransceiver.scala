package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpTransceiver extends js.Object {
  val currentDirection: RTCRtpTransceiverDirection | Null
  var direction: RTCRtpTransceiverDirection
  val mid: java.lang.String | Null
  val receiver: RTCRtpReceiver
  val sender: RTCRtpSender
  val stopped: scala.Boolean
  def setCodecPreferences(codecs: js.Array[RTCRtpCodecCapability]): Unit
  def stop(): Unit
}

object RTCRtpTransceiver {
  @scala.inline
  def apply(
    direction: RTCRtpTransceiverDirection,
    receiver: RTCRtpReceiver,
    sender: RTCRtpSender,
    setCodecPreferences: js.Array[RTCRtpCodecCapability] => Unit,
    stop: () => Unit,
    stopped: scala.Boolean
  ): RTCRtpTransceiver = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], setCodecPreferences = js.Any.fromFunction1(setCodecPreferences), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpTransceiver]
  }
  @scala.inline
  implicit class RTCRtpTransceiverOps[Self <: RTCRtpTransceiver] (val x: Self) extends AnyVal {
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
    def setDirection(value: RTCRtpTransceiverDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceiver(value: RTCRtpReceiver): Self = this.set("receiver", value.asInstanceOf[js.Any])
    @scala.inline
    def setSender(value: RTCRtpSender): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetCodecPreferences(value: js.Array[RTCRtpCodecCapability] => Unit): Self = this.set("setCodecPreferences", js.Any.fromFunction1(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    @scala.inline
    def setStopped(value: scala.Boolean): Self = this.set("stopped", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentDirection(value: RTCRtpTransceiverDirection): Self = this.set("currentDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentDirectionNull: Self = this.set("currentDirection", null)
    @scala.inline
    def setMid(value: java.lang.String): Self = this.set("mid", value.asInstanceOf[js.Any])
    @scala.inline
    def setMidNull: Self = this.set("mid", null)
  }
  
}


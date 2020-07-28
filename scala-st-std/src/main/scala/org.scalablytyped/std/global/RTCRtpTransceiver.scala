package org.scalablytyped.std.global

import org.scalablytyped.std.RTCRtpCodecCapability
import org.scalablytyped.std.RTCRtpTransceiverDirection
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCRtpTransceiver")
@js.native
class RTCRtpTransceiver ()
  extends org.scalablytyped.std.RTCRtpTransceiver {
  /* CompleteClass */
  override val currentDirection: RTCRtpTransceiverDirection | Null = js.native
  /* CompleteClass */
  override var direction: RTCRtpTransceiverDirection = js.native
  /* CompleteClass */
  override val mid: java.lang.String | Null = js.native
  /* CompleteClass */
  override val receiver: org.scalablytyped.std.RTCRtpReceiver = js.native
  /* CompleteClass */
  override val sender: org.scalablytyped.std.RTCRtpSender = js.native
  /* CompleteClass */
  override val stopped: scala.Boolean = js.native
  /* CompleteClass */
  override def setCodecPreferences(codecs: js.Array[RTCRtpCodecCapability]): Unit = js.native
  /* CompleteClass */
  override def stop(): Unit = js.native
}

@JSGlobal("RTCRtpTransceiver")
@js.native
object RTCRtpTransceiver
  extends Instantiable0[org.scalablytyped.std.RTCRtpTransceiver]


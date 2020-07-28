package org.scalablytyped.std.global

import org.scalablytyped.std.RTCRtpCapabilities
import org.scalablytyped.std.RTCRtpContributingSource
import org.scalablytyped.std.RTCRtpReceiveParameters
import org.scalablytyped.std.RTCRtpSynchronizationSource
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCRtpReceiver")
@js.native
class RTCRtpReceiver ()
  extends org.scalablytyped.std.RTCRtpReceiver {
  /* CompleteClass */
  override val rtcpTransport: org.scalablytyped.std.RTCDtlsTransport | Null = js.native
  /* CompleteClass */
  override val track: org.scalablytyped.std.MediaStreamTrack = js.native
  /* CompleteClass */
  override val transport: org.scalablytyped.std.RTCDtlsTransport | Null = js.native
  /* CompleteClass */
  override def getContributingSources(): js.Array[RTCRtpContributingSource] = js.native
  /* CompleteClass */
  override def getParameters(): RTCRtpReceiveParameters = js.native
  /* CompleteClass */
  override def getStats(): js.Promise[org.scalablytyped.std.RTCStatsReport] = js.native
  /* CompleteClass */
  override def getSynchronizationSources(): js.Array[RTCRtpSynchronizationSource] = js.native
}

@JSGlobal("RTCRtpReceiver")
@js.native
object RTCRtpReceiver
  extends Instantiable0[org.scalablytyped.std.RTCRtpReceiver] {
  def getCapabilities(kind: java.lang.String): RTCRtpCapabilities | Null = js.native
}


package org.scalablytyped.std.global

import org.scalablytyped.std.RTCRtpCapabilities
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCRtpSender")
@js.native
class RTCRtpSender protected ()
  extends org.scalablytyped.std.RTCRtpSender {
  def this(track: org.scalablytyped.std.MediaStreamTrack, transport: org.scalablytyped.std.RTCDtlsTransport) = this()
  def this(
    track: org.scalablytyped.std.MediaStreamTrack,
    transport: org.scalablytyped.std.RTCSrtpSdesTransport
  ) = this()
  def this(
    track: org.scalablytyped.std.MediaStreamTrack,
    transport: org.scalablytyped.std.RTCDtlsTransport,
    rtcpTransport: org.scalablytyped.std.RTCDtlsTransport
  ) = this()
  def this(
    track: org.scalablytyped.std.MediaStreamTrack,
    transport: org.scalablytyped.std.RTCSrtpSdesTransport,
    rtcpTransport: org.scalablytyped.std.RTCDtlsTransport
  ) = this()
}

@JSGlobal("RTCRtpSender")
@js.native
object RTCRtpSender
  extends Instantiable2[
      /* track */ org.scalablytyped.std.MediaStreamTrack, 
      (/* transport */ org.scalablytyped.std.RTCDtlsTransport) | (/* transport */ org.scalablytyped.std.RTCSrtpSdesTransport), 
      org.scalablytyped.std.RTCRtpSender
    ]
     with Instantiable3[
      /* track */ org.scalablytyped.std.MediaStreamTrack, 
      (/* transport */ org.scalablytyped.std.RTCDtlsTransport) | (/* transport */ org.scalablytyped.std.RTCSrtpSdesTransport), 
      /* rtcpTransport */ org.scalablytyped.std.RTCDtlsTransport, 
      org.scalablytyped.std.RTCRtpSender
    ] {
  def getCapabilities(): RTCRtpCapabilities = js.native
  def getCapabilities(kind: java.lang.String): RTCRtpCapabilities = js.native
}


package org.scalablytyped.std.global

import org.scalablytyped.std.RTCRtpCapabilities
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCRtpReceiver")
@js.native
class RTCRtpReceiver protected ()
  extends org.scalablytyped.std.RTCRtpReceiver {
  def this(transport: org.scalablytyped.std.RTCDtlsTransport, kind: java.lang.String) = this()
  def this(transport: org.scalablytyped.std.RTCSrtpSdesTransport, kind: java.lang.String) = this()
  def this(
    transport: org.scalablytyped.std.RTCDtlsTransport,
    kind: java.lang.String,
    rtcpTransport: org.scalablytyped.std.RTCDtlsTransport
  ) = this()
  def this(
    transport: org.scalablytyped.std.RTCSrtpSdesTransport,
    kind: java.lang.String,
    rtcpTransport: org.scalablytyped.std.RTCDtlsTransport
  ) = this()
}

@JSGlobal("RTCRtpReceiver")
@js.native
object RTCRtpReceiver
  extends Instantiable2[
      (/* transport */ org.scalablytyped.std.RTCDtlsTransport) | (/* transport */ org.scalablytyped.std.RTCSrtpSdesTransport), 
      /* kind */ java.lang.String, 
      org.scalablytyped.std.RTCRtpReceiver
    ]
     with Instantiable3[
      (/* transport */ org.scalablytyped.std.RTCDtlsTransport) | (/* transport */ org.scalablytyped.std.RTCSrtpSdesTransport), 
      /* kind */ java.lang.String, 
      /* rtcpTransport */ org.scalablytyped.std.RTCDtlsTransport, 
      org.scalablytyped.std.RTCRtpReceiver
    ] {
  def getCapabilities(): RTCRtpCapabilities = js.native
  def getCapabilities(kind: java.lang.String): RTCRtpCapabilities = js.native
}


package org.scalablytyped.std.global

import org.scalablytyped.std.RTCSrtpSdesParameters
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCSrtpSdesTransport")
@js.native
class RTCSrtpSdesTransport protected ()
  extends org.scalablytyped.std.RTCSrtpSdesTransport {
  def this(
    transport: org.scalablytyped.std.RTCIceTransport,
    encryptParameters: RTCSrtpSdesParameters,
    decryptParameters: RTCSrtpSdesParameters
  ) = this()
}

@JSGlobal("RTCSrtpSdesTransport")
@js.native
object RTCSrtpSdesTransport
  extends Instantiable3[
      /* transport */ org.scalablytyped.std.RTCIceTransport, 
      /* encryptParameters */ RTCSrtpSdesParameters, 
      /* decryptParameters */ RTCSrtpSdesParameters, 
      org.scalablytyped.std.RTCSrtpSdesTransport
    ] {
  def getLocalParameters(): js.Array[RTCSrtpSdesParameters] = js.native
}


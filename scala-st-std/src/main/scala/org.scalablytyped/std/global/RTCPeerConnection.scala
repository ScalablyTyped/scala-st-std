package org.scalablytyped.std.global

import org.scalablytyped.std.AlgorithmIdentifier
import org.scalablytyped.std.RTCConfiguration
import org.scalablytyped.std.RTCIceServer
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCPeerConnection")
@js.native
class RTCPeerConnection ()
  extends org.scalablytyped.std.RTCPeerConnection {
  def this(configuration: RTCConfiguration) = this()
}

@JSGlobal("RTCPeerConnection")
@js.native
object RTCPeerConnection
  extends Instantiable0[org.scalablytyped.std.RTCPeerConnection]
     with Instantiable1[/* configuration */ RTCConfiguration, org.scalablytyped.std.RTCPeerConnection] {
  def generateCertificate(keygenAlgorithm: AlgorithmIdentifier): js.Promise[org.scalablytyped.std.RTCCertificate] = js.native
  def getDefaultIceServers(): js.Array[RTCIceServer] = js.native
}


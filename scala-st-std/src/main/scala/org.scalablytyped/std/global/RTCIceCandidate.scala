package org.scalablytyped.std.global

import org.scalablytyped.std.RTCIceCandidateInit
import org.scalablytyped.std.RTCIceCandidateType
import org.scalablytyped.std.RTCIceComponent
import org.scalablytyped.std.RTCIceProtocol
import org.scalablytyped.std.RTCIceTcpCandidateType
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCIceCandidate")
@js.native
class RTCIceCandidate ()
  extends org.scalablytyped.std.RTCIceCandidate {
  def this(candidateInitDict: RTCIceCandidateInit) = this()
  /* CompleteClass */
  override val candidate: java.lang.String = js.native
  /* CompleteClass */
  override val component: RTCIceComponent | Null = js.native
  /* CompleteClass */
  override val foundation: java.lang.String | Null = js.native
  /* CompleteClass */
  override val port: Double | Null = js.native
  /* CompleteClass */
  override val priority: Double | Null = js.native
  /* CompleteClass */
  override val protocol: RTCIceProtocol | Null = js.native
  /* CompleteClass */
  override val relatedAddress: java.lang.String | Null = js.native
  /* CompleteClass */
  override val relatedPort: Double | Null = js.native
  /* CompleteClass */
  override val sdpMLineIndex: Double | Null = js.native
  /* CompleteClass */
  override val sdpMid: java.lang.String | Null = js.native
  /* CompleteClass */
  override val tcpType: RTCIceTcpCandidateType | Null = js.native
  /* CompleteClass */
  override val `type`: RTCIceCandidateType | Null = js.native
  /* CompleteClass */
  override val usernameFragment: java.lang.String | Null = js.native
  /* CompleteClass */
  override def toJSON(): RTCIceCandidateInit = js.native
}

@JSGlobal("RTCIceCandidate")
@js.native
object RTCIceCandidate
  extends Instantiable0[org.scalablytyped.std.RTCIceCandidate]
     with Instantiable1[/* candidateInitDict */ RTCIceCandidateInit, org.scalablytyped.std.RTCIceCandidate]


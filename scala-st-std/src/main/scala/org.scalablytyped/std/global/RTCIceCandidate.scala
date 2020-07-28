package org.scalablytyped.std.global

import org.scalablytyped.std.RTCIceCandidateInit
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
  override var candidate: java.lang.String | Null = js.native
  /* CompleteClass */
  override var sdpMLineIndex: Double | Null = js.native
  /* CompleteClass */
  override var sdpMid: java.lang.String | Null = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("RTCIceCandidate")
@js.native
object RTCIceCandidate
  extends Instantiable0[org.scalablytyped.std.RTCIceCandidate]
     with Instantiable1[/* candidateInitDict */ RTCIceCandidateInit, org.scalablytyped.std.RTCIceCandidate]


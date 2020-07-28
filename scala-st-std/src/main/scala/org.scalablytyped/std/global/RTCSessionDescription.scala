package org.scalablytyped.std.global

import org.scalablytyped.std.RTCSdpType
import org.scalablytyped.std.RTCSessionDescriptionInit
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCSessionDescription")
@js.native
class RTCSessionDescription ()
  extends org.scalablytyped.std.RTCSessionDescription {
  def this(descriptionInitDict: RTCSessionDescriptionInit) = this()
  /* CompleteClass */
  override val sdp: java.lang.String = js.native
  /* CompleteClass */
  override val `type`: RTCSdpType = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("RTCSessionDescription")
@js.native
object RTCSessionDescription
  extends Instantiable0[org.scalablytyped.std.RTCSessionDescription]
     with Instantiable1[
      /* descriptionInitDict */ RTCSessionDescriptionInit, 
      org.scalablytyped.std.RTCSessionDescription
    ]


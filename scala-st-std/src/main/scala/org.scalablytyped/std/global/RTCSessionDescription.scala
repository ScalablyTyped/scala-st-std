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
  override var sdp: java.lang.String | Null = js.native
  /* CompleteClass */
  override var `type`: RTCSdpType | Null = js.native
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


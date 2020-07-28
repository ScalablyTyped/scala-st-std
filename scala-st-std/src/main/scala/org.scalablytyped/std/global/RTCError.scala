package org.scalablytyped.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCError")
@js.native
class RTCError ()
  extends org.scalablytyped.std.RTCError {
  def this(errorDetail: java.lang.String) = this()
  def this(errorDetail: js.UndefOr[scala.Nothing], message: java.lang.String) = this()
  def this(errorDetail: java.lang.String, message: java.lang.String) = this()
  /* CompleteClass */
  override var errorDetail: java.lang.String = js.native
  /* CompleteClass */
  override var httpRequestStatusCode: Double = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var receivedAlert: Double | Null = js.native
  /* CompleteClass */
  override var sctpCauseCode: Double = js.native
  /* CompleteClass */
  override var sdpLineNumber: Double = js.native
  /* CompleteClass */
  override var sentAlert: Double | Null = js.native
}

@JSGlobal("RTCError")
@js.native
object RTCError
  extends Instantiable0[org.scalablytyped.std.RTCError]
     with Instantiable1[/* errorDetail */ java.lang.String, org.scalablytyped.std.RTCError]
     with Instantiable2[
      js.UndefOr[/* errorDetail */ java.lang.String], 
      /* message */ java.lang.String, 
      org.scalablytyped.std.RTCError
    ]


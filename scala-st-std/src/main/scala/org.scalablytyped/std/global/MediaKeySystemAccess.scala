package org.scalablytyped.std.global

import org.scalablytyped.std.MediaKeySystemConfiguration
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaKeySystemAccess")
@js.native
class MediaKeySystemAccess ()
  extends org.scalablytyped.std.MediaKeySystemAccess {
  /* CompleteClass */
  override val keySystem: java.lang.String = js.native
  /* CompleteClass */
  override def createMediaKeys(): js.Promise[org.scalablytyped.std.MediaKeys] = js.native
  /* CompleteClass */
  override def getConfiguration(): MediaKeySystemConfiguration = js.native
}

@JSGlobal("MediaKeySystemAccess")
@js.native
object MediaKeySystemAccess
  extends Instantiable0[org.scalablytyped.std.MediaKeySystemAccess]


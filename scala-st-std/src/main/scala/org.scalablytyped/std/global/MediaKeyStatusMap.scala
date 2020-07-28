package org.scalablytyped.std.global

import org.scalablytyped.std.BufferSource
import org.scalablytyped.std.ForEachCallback
import org.scalablytyped.std.MediaKeyStatus
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaKeyStatusMap")
@js.native
class MediaKeyStatusMap ()
  extends org.scalablytyped.std.MediaKeyStatusMap {
  /* CompleteClass */
  override val size: Double = js.native
  /* CompleteClass */
  override def forEach(callback: ForEachCallback): Unit = js.native
  /* CompleteClass */
  override def get(keyId: BufferSource): MediaKeyStatus = js.native
  /* CompleteClass */
  override def has(keyId: BufferSource): scala.Boolean = js.native
}

@JSGlobal("MediaKeyStatusMap")
@js.native
object MediaKeyStatusMap
  extends Instantiable0[org.scalablytyped.std.MediaKeyStatusMap]


package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - `org.scalablytyped`.std.MSVideoRecvPayload
  - `org.scalablytyped`.std.MSAudioRecvPayload
*/
trait MSInboundPayload extends js.Object

object MSInboundPayload {
  @scala.inline
  def MSVideoRecvPayload(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): MSInboundPayload = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSInboundPayload]
  }
  @scala.inline
  def MSAudioRecvPayload(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): MSInboundPayload = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSInboundPayload]
  }
}


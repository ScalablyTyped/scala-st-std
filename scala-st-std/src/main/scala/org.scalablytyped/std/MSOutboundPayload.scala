package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - `org.scalablytyped`.std.MSVideoSendPayload
  - `org.scalablytyped`.std.MSAudioSendPayload
*/
trait MSOutboundPayload extends js.Object

object MSOutboundPayload {
  @scala.inline
  def MSVideoSendPayload(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): MSOutboundPayload = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSOutboundPayload]
  }
  @scala.inline
  def MSAudioSendPayload(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): MSOutboundPayload = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSOutboundPayload]
  }
}


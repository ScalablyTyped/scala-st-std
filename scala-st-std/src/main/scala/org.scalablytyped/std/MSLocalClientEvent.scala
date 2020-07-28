package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - `org.scalablytyped`.std.MSLocalClientEventBase
  - `org.scalablytyped`.std.MSAudioLocalClientEvent
*/
trait MSLocalClientEvent extends js.Object

object MSLocalClientEvent {
  @scala.inline
  def MSLocalClientEventBase(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): MSLocalClientEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSLocalClientEvent]
  }
  @scala.inline
  def MSAudioLocalClientEvent(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): MSLocalClientEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSLocalClientEvent]
  }
}


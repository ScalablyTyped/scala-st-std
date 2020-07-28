package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.error
import org.scalablytyped.std.stdStrings.localcandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIceGatherer extends RTCStatsProvider {
  val component: java.lang.String = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onlocalcandidate: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, _]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_localcandidate(
    `type`: localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_localcandidate(
    `type`: localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def createAssociatedGatherer(): RTCIceGatherer = js.native
  def getLocalCandidates(): js.Array[RTCIceCandidateDictionary] = js.native
  def getLocalParameters(): RTCIceParameters = js.native
}


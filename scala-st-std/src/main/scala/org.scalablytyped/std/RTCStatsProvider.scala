package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCStatsProvider extends EventTarget {
  def getStats(): js.Thenable[RTCStatsReport] = js.native
  def msGetStats(): js.Thenable[RTCStatsReport] = js.native
}


package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSource extends EventTarget {
  val CLOSED: Double = js.native
  val CONNECTING: Double = js.native
  val OPEN: Double = js.native
  val readyState: Double = js.native
  val url: java.lang.String = js.native
  val withCredentials: scala.Boolean = js.native
  def close(): Unit = js.native
  def onerror(evt: MessageEvent): js.Any = js.native
  def onmessage(evt: MessageEvent): js.Any = js.native
  def onopen(evt: MessageEvent): js.Any = js.native
}


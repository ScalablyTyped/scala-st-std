package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.complete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSAppAsyncOperation extends EventTarget {
  val COMPLETED: Double = js.native
  val ERROR: Double = js.native
  val STARTED: Double = js.native
  val error: DOMError = js.native
  val readyState: Double = js.native
  val result: js.Any = js.native
  @JSName("addEventListener")
  def addEventListener_complete(`type`: complete, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: org.scalablytyped.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: org.scalablytyped.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def oncomplete(ev: Event): js.Any = js.native
  def onerror(ev: ErrorEvent): js.Any = js.native
  def start(): Unit = js.native
}


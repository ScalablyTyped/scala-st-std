package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.complete
import org.scalablytyped.std.stdStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSAppAsyncOperation extends EventTarget {
  var COMPLETED: Double = js.native
  var ERROR: Double = js.native
  var STARTED: Double = js.native
  var error: DOMError = js.native
  var readyState: Double = js.native
  var result: js.Any = js.native
  @JSName("addEventListener")
  def addEventListener_complete(`type`: complete, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(`type`: complete, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent, _], useCapture: scala.Boolean): Unit = js.native
  def oncomplete(ev: Event): js.Any = js.native
  def onerror(ev: Event): js.Any = js.native
  def start(): Unit = js.native
}


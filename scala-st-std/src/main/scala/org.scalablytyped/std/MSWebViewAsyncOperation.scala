package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.complete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSWebViewAsyncOperation extends EventTarget {
  val COMPLETED: Double = js.native
  val ERROR: Double = js.native
  val STARTED: Double = js.native
  val TYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM: Double = js.native
  val TYPE_CREATE_DATA_PACKAGE_FROM_SELECTION: Double = js.native
  val TYPE_INVOKE_SCRIPT: Double = js.native
  val error: DOMError = js.native
  val readyState: Double = js.native
  val result: js.Any = js.native
  val target: MSHTMLWebViewElement = js.native
  val `type`: Double = js.native
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
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: org.scalablytyped.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def oncomplete(ev: Event): js.Any = js.native
  def onerror(ev: Event): js.Any = js.native
  def start(): Unit = js.native
}


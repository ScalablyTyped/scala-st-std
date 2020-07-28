package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.error
import org.scalablytyped.std.stdStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBRequest extends EventTarget {
  var error: DOMError = js.native
  var readyState: java.lang.String = js.native
  var result: js.Any = js.native
  var source: js.Any = js.native
  var transaction: IDBTransaction = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(`type`: success, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(`type`: success, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  def onerror(ev: Event): js.Any = js.native
  def onsuccess(ev: Event): js.Any = js.native
}


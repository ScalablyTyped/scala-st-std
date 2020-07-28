package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.abort
import org.scalablytyped.std.stdStrings.complete
import org.scalablytyped.std.stdStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBTransaction extends EventTarget {
  var READ_ONLY: java.lang.String = js.native
  var READ_WRITE: java.lang.String = js.native
  var VERSION_CHANGE: java.lang.String = js.native
  var db: IDBDatabase = js.native
  var error: DOMError = js.native
  var mode: java.lang.String = js.native
  def abort(): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(`type`: complete, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(`type`: complete, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent, _], useCapture: scala.Boolean): Unit = js.native
  def objectStore(name: java.lang.String): IDBObjectStore = js.native
  def onabort(ev: Event): js.Any = js.native
  def oncomplete(ev: Event): js.Any = js.native
  def onerror(ev: Event): js.Any = js.native
}


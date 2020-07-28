package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.abort
import org.scalablytyped.std.stdStrings.complete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBTransaction extends EventTarget {
  val READ_ONLY: java.lang.String = js.native
  val READ_WRITE: java.lang.String = js.native
  val VERSION_CHANGE: java.lang.String = js.native
  val db: IDBDatabase = js.native
  val error: DOMError = js.native
  val mode: java.lang.String = js.native
  def abort(): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
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
  def objectStore(name: java.lang.String): IDBObjectStore = js.native
  def onabort(ev: Event): js.Any = js.native
  def oncomplete(ev: Event): js.Any = js.native
  def onerror(ev: ErrorEvent): js.Any = js.native
}

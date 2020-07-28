package org.scalablytyped.std.global

import org.scalablytyped.std.Console
import org.scalablytyped.std.Window
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Window")
@js.native
class Window_ () extends Window {
  /* CompleteClass */
  override var console: Console = js.native
  /* CompleteClass */
  override var indexedDB: org.scalablytyped.std.IDBFactory = js.native
  /* CompleteClass */
  override var localStorage: org.scalablytyped.std.Storage = js.native
  /* CompleteClass */
  override var msIndexedDB: org.scalablytyped.std.IDBFactory = js.native
  /* CompleteClass */
  override var sessionStorage: org.scalablytyped.std.Storage = js.native
  /* CompleteClass */
  override def atob(encodedString: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def btoa(rawString: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def clearImmediate(handle: Double): Unit = js.native
  /* CompleteClass */
  override def msClearImmediate(handle: Double): Unit = js.native
  /* CompleteClass */
  override def msSetImmediate(expression: js.Any, args: js.Any*): Double = js.native
  /* CompleteClass */
  override def setImmediate(expression: js.Any, args: js.Any*): Double = js.native
}

@JSGlobal("Window")
@js.native
object Window_ extends Instantiable0[Window]


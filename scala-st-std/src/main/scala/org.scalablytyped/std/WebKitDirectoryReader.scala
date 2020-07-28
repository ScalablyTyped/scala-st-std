package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebKitDirectoryReader extends js.Object {
  def readEntries(successCallback: WebKitEntriesCallback): Unit = js.native
  def readEntries(successCallback: WebKitEntriesCallback, errorCallback: WebKitErrorCallback): Unit = js.native
}


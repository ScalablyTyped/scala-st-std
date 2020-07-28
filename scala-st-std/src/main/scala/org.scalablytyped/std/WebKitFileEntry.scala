package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebKitFileEntry extends WebKitEntry {
  def file(successCallback: WebKitFileCallback): Unit = js.native
  def file(successCallback: WebKitFileCallback, errorCallback: WebKitErrorCallback): Unit = js.native
}


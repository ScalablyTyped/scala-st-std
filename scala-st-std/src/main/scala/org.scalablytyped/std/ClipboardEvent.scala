package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ClipboardEvent interface represents events providing information related to modification of the clipboard, that is cut, copy, and paste events. */
@js.native
trait ClipboardEvent extends Event {
  val clipboardData: DataTransfer | Null = js.native
}


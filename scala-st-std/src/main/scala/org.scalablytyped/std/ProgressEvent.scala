package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ProgressEvent interface represents events measuring progress of an underlying process, like an HTTP request (for an XMLHttpRequest, or the loading of the underlying resource of an <img>, <audio>, <video>, <style> or <link>). */
@js.native
trait ProgressEvent extends Event {
  val lengthComputable: scala.Boolean = js.native
  val loaded: Double = js.native
  val total: Double = js.native
}


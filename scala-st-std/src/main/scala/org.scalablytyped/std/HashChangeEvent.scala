package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events that fire when the fragment identifier of the URL has changed. */
@js.native
trait HashChangeEvent extends Event {
  val newURL: java.lang.String = js.native
  val oldURL: java.lang.String = js.native
}


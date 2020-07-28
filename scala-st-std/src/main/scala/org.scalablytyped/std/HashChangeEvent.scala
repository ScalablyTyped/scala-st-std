package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HashChangeEvent event is fired when the fragment identifier of the URL has changed (the part of the URL that follows the # symbol, including the # symbol). */
@js.native
trait HashChangeEvent extends Event {
  val newURL: java.lang.String = js.native
  val oldURL: java.lang.String = js.native
}


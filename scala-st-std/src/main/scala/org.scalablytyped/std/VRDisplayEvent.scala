package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The VRDisplayEvent interface of the WebVR API represents represents the event object of WebVR-related events (see the list of WebVR window extensions). */
@js.native
trait VRDisplayEvent extends Event {
  val display: VRDisplay = js.native
  val reason: VRDisplayEventReason | Null = js.native
}


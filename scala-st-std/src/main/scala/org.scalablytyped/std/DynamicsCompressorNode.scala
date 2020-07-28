package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicsCompressorNode extends AudioNode {
  val attack: AudioParam = js.native
  val knee: AudioParam = js.native
  val ratio: AudioParam = js.native
  val reduction: AudioParam = js.native
  val release: AudioParam = js.native
  val threshold: AudioParam = js.native
}


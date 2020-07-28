package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicsCompressorNode extends AudioNode {
  var attack: AudioParam = js.native
  var knee: AudioParam = js.native
  var ratio: AudioParam = js.native
  var reduction: AudioParam = js.native
  var release: AudioParam = js.native
  var threshold: AudioParam = js.native
}


package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.devicechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaDevices extends EventTarget {
  @JSName("addEventListener")
  def addEventListener_devicechange(`type`: devicechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def enumerateDevices(): js.Any = js.native
  def getSupportedConstraints(): MediaTrackSupportedConstraints = js.native
  def getUserMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream] = js.native
  def ondevicechange(ev: Event): js.Any = js.native
}


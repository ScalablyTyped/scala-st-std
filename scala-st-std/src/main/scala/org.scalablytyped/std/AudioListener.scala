package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioListener extends js.Object {
  /** @deprecated */
  var dopplerFactor: Double
  /** @deprecated */
  var speedOfSound: Double
  /** @deprecated */
  def setOrientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double, zUp: Double): Unit
  /** @deprecated */
  def setPosition(x: Double, y: Double, z: Double): Unit
  /** @deprecated */
  def setVelocity(x: Double, y: Double, z: Double): Unit
}

object AudioListener {
  @scala.inline
  def apply(
    dopplerFactor: Double,
    setOrientation: (Double, Double, Double, Double, Double, Double) => Unit,
    setPosition: (Double, Double, Double) => Unit,
    setVelocity: (Double, Double, Double) => Unit,
    speedOfSound: Double
  ): AudioListener = {
    val __obj = js.Dynamic.literal(dopplerFactor = dopplerFactor.asInstanceOf[js.Any], setOrientation = js.Any.fromFunction6(setOrientation), setPosition = js.Any.fromFunction3(setPosition), setVelocity = js.Any.fromFunction3(setVelocity), speedOfSound = speedOfSound.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioListener]
  }
  @scala.inline
  implicit class AudioListenerOps[Self <: AudioListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDopplerFactor(value: Double): Self = this.set("dopplerFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetOrientation(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = this.set("setOrientation", js.Any.fromFunction6(value))
    @scala.inline
    def setSetPosition(value: (Double, Double, Double) => Unit): Self = this.set("setPosition", js.Any.fromFunction3(value))
    @scala.inline
    def setSetVelocity(value: (Double, Double, Double) => Unit): Self = this.set("setVelocity", js.Any.fromFunction3(value))
    @scala.inline
    def setSpeedOfSound(value: Double): Self = this.set("speedOfSound", value.asInstanceOf[js.Any])
  }
  
}


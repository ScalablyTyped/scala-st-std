package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gamepad extends js.Object {
  var axes: js.Array[Double]
  var buttons: js.Array[GamepadButton]
  var connected: scala.Boolean
  var id: java.lang.String
  var index: Double
  var mapping: java.lang.String
  var timestamp: Double
}

object Gamepad {
  @scala.inline
  def apply(
    axes: js.Array[Double],
    buttons: js.Array[GamepadButton],
    connected: scala.Boolean,
    id: java.lang.String,
    index: Double,
    mapping: java.lang.String,
    timestamp: Double
  ): Gamepad = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gamepad]
  }
  @scala.inline
  implicit class GamepadOps[Self <: Gamepad] (val x: Self) extends AnyVal {
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
    def setAxesVarargs(value: Double*): Self = this.set("axes", js.Array(value :_*))
    @scala.inline
    def setAxes(value: js.Array[Double]): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonsVarargs(value: GamepadButton*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[GamepadButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnected(value: scala.Boolean): Self = this.set("connected", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: java.lang.String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapping(value: java.lang.String): Self = this.set("mapping", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}


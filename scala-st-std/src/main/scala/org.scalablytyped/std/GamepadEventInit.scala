package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamepadEventInit extends EventInit {
  var gamepad: js.UndefOr[Gamepad | Null] = js.undefined
}

object GamepadEventInit {
  @scala.inline
  def apply(): GamepadEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GamepadEventInit]
  }
  @scala.inline
  implicit class GamepadEventInitOps[Self <: GamepadEventInit] (val x: Self) extends AnyVal {
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
    def setGamepad(value: Gamepad): Self = this.set("gamepad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGamepad: Self = this.set("gamepad", js.undefined)
    @scala.inline
    def setGamepadNull: Self = this.set("gamepad", null)
  }
  
}


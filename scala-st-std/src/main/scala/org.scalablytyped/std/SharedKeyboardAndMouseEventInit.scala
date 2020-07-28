package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedKeyboardAndMouseEventInit extends UIEventInit {
  var altKey: js.UndefOr[scala.Boolean] = js.undefined
  var ctrlKey: js.UndefOr[scala.Boolean] = js.undefined
  var keyModifierStateAltGraph: js.UndefOr[scala.Boolean] = js.undefined
  var keyModifierStateCapsLock: js.UndefOr[scala.Boolean] = js.undefined
  var keyModifierStateFn: js.UndefOr[scala.Boolean] = js.undefined
  var keyModifierStateFnLock: js.UndefOr[scala.Boolean] = js.undefined
  var keyModifierStateHyper: js.UndefOr[scala.Boolean] = js.undefined
  var keyModifierStateNumLock: js.UndefOr[scala.Boolean] = js.undefined
  var keyModifierStateOS: js.UndefOr[scala.Boolean] = js.undefined
  var keyModifierStateScrollLock: js.UndefOr[scala.Boolean] = js.undefined
  var keyModifierStateSuper: js.UndefOr[scala.Boolean] = js.undefined
  var keyModifierStateSymbol: js.UndefOr[scala.Boolean] = js.undefined
  var keyModifierStateSymbolLock: js.UndefOr[scala.Boolean] = js.undefined
  var metaKey: js.UndefOr[scala.Boolean] = js.undefined
  var shiftKey: js.UndefOr[scala.Boolean] = js.undefined
}

object SharedKeyboardAndMouseEventInit {
  @scala.inline
  def apply(): SharedKeyboardAndMouseEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedKeyboardAndMouseEventInit]
  }
  @scala.inline
  implicit class SharedKeyboardAndMouseEventInitOps[Self <: SharedKeyboardAndMouseEventInit] (val x: Self) extends AnyVal {
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
    def setAltKey(value: scala.Boolean): Self = this.set("altKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltKey: Self = this.set("altKey", js.undefined)
    @scala.inline
    def setCtrlKey(value: scala.Boolean): Self = this.set("ctrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtrlKey: Self = this.set("ctrlKey", js.undefined)
    @scala.inline
    def setKeyModifierStateAltGraph(value: scala.Boolean): Self = this.set("keyModifierStateAltGraph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyModifierStateAltGraph: Self = this.set("keyModifierStateAltGraph", js.undefined)
    @scala.inline
    def setKeyModifierStateCapsLock(value: scala.Boolean): Self = this.set("keyModifierStateCapsLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyModifierStateCapsLock: Self = this.set("keyModifierStateCapsLock", js.undefined)
    @scala.inline
    def setKeyModifierStateFn(value: scala.Boolean): Self = this.set("keyModifierStateFn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyModifierStateFn: Self = this.set("keyModifierStateFn", js.undefined)
    @scala.inline
    def setKeyModifierStateFnLock(value: scala.Boolean): Self = this.set("keyModifierStateFnLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyModifierStateFnLock: Self = this.set("keyModifierStateFnLock", js.undefined)
    @scala.inline
    def setKeyModifierStateHyper(value: scala.Boolean): Self = this.set("keyModifierStateHyper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyModifierStateHyper: Self = this.set("keyModifierStateHyper", js.undefined)
    @scala.inline
    def setKeyModifierStateNumLock(value: scala.Boolean): Self = this.set("keyModifierStateNumLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyModifierStateNumLock: Self = this.set("keyModifierStateNumLock", js.undefined)
    @scala.inline
    def setKeyModifierStateOS(value: scala.Boolean): Self = this.set("keyModifierStateOS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyModifierStateOS: Self = this.set("keyModifierStateOS", js.undefined)
    @scala.inline
    def setKeyModifierStateScrollLock(value: scala.Boolean): Self = this.set("keyModifierStateScrollLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyModifierStateScrollLock: Self = this.set("keyModifierStateScrollLock", js.undefined)
    @scala.inline
    def setKeyModifierStateSuper(value: scala.Boolean): Self = this.set("keyModifierStateSuper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyModifierStateSuper: Self = this.set("keyModifierStateSuper", js.undefined)
    @scala.inline
    def setKeyModifierStateSymbol(value: scala.Boolean): Self = this.set("keyModifierStateSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyModifierStateSymbol: Self = this.set("keyModifierStateSymbol", js.undefined)
    @scala.inline
    def setKeyModifierStateSymbolLock(value: scala.Boolean): Self = this.set("keyModifierStateSymbolLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyModifierStateSymbolLock: Self = this.set("keyModifierStateSymbolLock", js.undefined)
    @scala.inline
    def setMetaKey(value: scala.Boolean): Self = this.set("metaKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetaKey: Self = this.set("metaKey", js.undefined)
    @scala.inline
    def setShiftKey(value: scala.Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShiftKey: Self = this.set("shiftKey", js.undefined)
  }
  
}


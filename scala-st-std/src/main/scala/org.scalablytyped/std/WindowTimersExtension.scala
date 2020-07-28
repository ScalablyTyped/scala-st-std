package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowTimersExtension extends js.Object {
  def clearImmediate(handle: Double): Unit
  def msClearImmediate(handle: Double): Unit
  def msSetImmediate(expression: js.Any, args: js.Any*): Double
  def setImmediate(expression: js.Any, args: js.Any*): Double
}

object WindowTimersExtension {
  @scala.inline
  def apply(
    clearImmediate: Double => Unit,
    msClearImmediate: Double => Unit,
    msSetImmediate: (js.Any, /* repeated */ js.Any) => Double,
    setImmediate: (js.Any, /* repeated */ js.Any) => Double
  ): WindowTimersExtension = {
    val __obj = js.Dynamic.literal(clearImmediate = js.Any.fromFunction1(clearImmediate), msClearImmediate = js.Any.fromFunction1(msClearImmediate), msSetImmediate = js.Any.fromFunction2(msSetImmediate), setImmediate = js.Any.fromFunction2(setImmediate))
    __obj.asInstanceOf[WindowTimersExtension]
  }
  @scala.inline
  implicit class WindowTimersExtensionOps[Self <: WindowTimersExtension] (val x: Self) extends AnyVal {
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
    def setClearImmediate(value: Double => Unit): Self = this.set("clearImmediate", js.Any.fromFunction1(value))
    @scala.inline
    def setMsClearImmediate(value: Double => Unit): Self = this.set("msClearImmediate", js.Any.fromFunction1(value))
    @scala.inline
    def setMsSetImmediate(value: (js.Any, /* repeated */ js.Any) => Double): Self = this.set("msSetImmediate", js.Any.fromFunction2(value))
    @scala.inline
    def setSetImmediate(value: (js.Any, /* repeated */ js.Any) => Double): Self = this.set("setImmediate", js.Any.fromFunction2(value))
  }
  
}


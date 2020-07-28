package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueuingStrategy extends js.Object {
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[WritableStreamChunkCallback] = js.undefined
}

object QueuingStrategy {
  @scala.inline
  def apply(): QueuingStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueuingStrategy]
  }
  @scala.inline
  implicit class QueuingStrategyOps[Self <: QueuingStrategy] (val x: Self) extends AnyVal {
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
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighWaterMark: Self = this.set("highWaterMark", js.undefined)
    @scala.inline
    def setSize(value: (/* chunk */ js.Any, /* controller */ WritableStreamDefaultController) => Unit): Self = this.set("size", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}


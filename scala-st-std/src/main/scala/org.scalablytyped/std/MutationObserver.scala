package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationObserver extends js.Object {
  def disconnect(): Unit
  def observe(target: Node, options: MutationObserverInit): Unit
  def takeRecords(): js.Array[MutationRecord]
}

object MutationObserver {
  @scala.inline
  def apply(
    disconnect: () => Unit,
    observe: (Node, MutationObserverInit) => Unit,
    takeRecords: () => js.Array[MutationRecord]
  ): MutationObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction2(observe), takeRecords = js.Any.fromFunction0(takeRecords))
    __obj.asInstanceOf[MutationObserver]
  }
  @scala.inline
  implicit class MutationObserverOps[Self <: MutationObserver] (val x: Self) extends AnyVal {
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
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    @scala.inline
    def setObserve(value: (Node, MutationObserverInit) => Unit): Self = this.set("observe", js.Any.fromFunction2(value))
    @scala.inline
    def setTakeRecords(value: () => js.Array[MutationRecord]): Self = this.set("takeRecords", js.Any.fromFunction0(value))
  }
  
}


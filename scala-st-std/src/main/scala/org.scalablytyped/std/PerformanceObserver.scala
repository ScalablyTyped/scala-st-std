package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceObserver extends js.Object {
  def disconnect(): Unit
  def observe(options: PerformanceObserverInit): Unit
  def takeRecords(): PerformanceEntryList
}

object PerformanceObserver {
  @scala.inline
  def apply(
    disconnect: () => Unit,
    observe: PerformanceObserverInit => Unit,
    takeRecords: () => PerformanceEntryList
  ): PerformanceObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction1(observe), takeRecords = js.Any.fromFunction0(takeRecords))
    __obj.asInstanceOf[PerformanceObserver]
  }
  @scala.inline
  implicit class PerformanceObserverOps[Self <: PerformanceObserver] (val x: Self) extends AnyVal {
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
    def setObserve(value: PerformanceObserverInit => Unit): Self = this.set("observe", js.Any.fromFunction1(value))
    @scala.inline
    def setTakeRecords(value: () => PerformanceEntryList): Self = this.set("takeRecords", js.Any.fromFunction0(value))
  }
  
}


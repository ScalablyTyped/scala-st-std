package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceWorkerMessageEvent extends Event {
  val data: js.Any
  val lastEventId: java.lang.String
  val origin: java.lang.String
  val ports: js.Array[MessagePort] | Null
  val source: ServiceWorker | MessagePort | Null
}

object ServiceWorkerMessageEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    bubbles: scala.Boolean,
    cancelBubble: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: EventTarget,
    data: js.Any,
    deepPath: () => js.Array[EventTarget],
    defaultPrevented: scala.Boolean,
    eventPhase: Double,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => Unit,
    isTrusted: scala.Boolean,
    lastEventId: java.lang.String,
    origin: java.lang.String,
    preventDefault: () => Unit,
    returnValue: scala.Boolean,
    scoped: scala.Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: java.lang.String
  ): ServiceWorkerMessageEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deepPath = js.Any.fromFunction0(deepPath), defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], lastEventId = lastEventId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], scoped = scoped.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerMessageEvent]
  }
  @scala.inline
  implicit class ServiceWorkerMessageEventOps[Self <: ServiceWorkerMessageEvent] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastEventId(value: java.lang.String): Self = this.set("lastEventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: java.lang.String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortsVarargs(value: MessagePort*): Self = this.set("ports", js.Array(value :_*))
    @scala.inline
    def setPorts(value: js.Array[MessagePort]): Self = this.set("ports", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortsNull: Self = this.set("ports", null)
    @scala.inline
    def setSource(value: ServiceWorker | MessagePort): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
  }
  
}


package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationEvent extends Event {
  var ADDITION: Double
  var MODIFICATION: Double
  var REMOVAL: Double
  var attrChange: Double
  var attrName: java.lang.String
  var newValue: java.lang.String
  var prevValue: java.lang.String
  var relatedNode: Node
  def initMutationEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    relatedNodeArg: Node,
    prevValueArg: java.lang.String,
    newValueArg: java.lang.String,
    attrNameArg: java.lang.String,
    attrChangeArg: Double
  ): Unit
}

object MutationEvent {
  @scala.inline
  def apply(
    ADDITION: Double,
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    MODIFICATION: Double,
    REMOVAL: Double,
    attrChange: Double,
    attrName: java.lang.String,
    bubbles: scala.Boolean,
    cancelBubble: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: EventTarget,
    defaultPrevented: scala.Boolean,
    eventPhase: Double,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => Unit,
    initMutationEvent: (java.lang.String, scala.Boolean, scala.Boolean, Node, java.lang.String, java.lang.String, java.lang.String, Double) => Unit,
    isTrusted: scala.Boolean,
    newValue: java.lang.String,
    prevValue: java.lang.String,
    preventDefault: () => Unit,
    relatedNode: Node,
    returnValue: scala.Boolean,
    srcElement: Element,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: java.lang.String
  ): MutationEvent = {
    val __obj = js.Dynamic.literal(ADDITION = ADDITION.asInstanceOf[js.Any], AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], MODIFICATION = MODIFICATION.asInstanceOf[js.Any], REMOVAL = REMOVAL.asInstanceOf[js.Any], attrChange = attrChange.asInstanceOf[js.Any], attrName = attrName.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initMutationEvent = js.Any.fromFunction8(initMutationEvent), isTrusted = isTrusted.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], prevValue = prevValue.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), relatedNode = relatedNode.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationEvent]
  }
  @scala.inline
  implicit class MutationEventOps[Self <: MutationEvent] (val x: Self) extends AnyVal {
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
    def setADDITION(value: Double): Self = this.set("ADDITION", value.asInstanceOf[js.Any])
    @scala.inline
    def setMODIFICATION(value: Double): Self = this.set("MODIFICATION", value.asInstanceOf[js.Any])
    @scala.inline
    def setREMOVAL(value: Double): Self = this.set("REMOVAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttrChange(value: Double): Self = this.set("attrChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttrName(value: java.lang.String): Self = this.set("attrName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitMutationEvent(
      value: (java.lang.String, scala.Boolean, scala.Boolean, Node, java.lang.String, java.lang.String, java.lang.String, Double) => Unit
    ): Self = this.set("initMutationEvent", js.Any.fromFunction8(value))
    @scala.inline
    def setNewValue(value: java.lang.String): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevValue(value: java.lang.String): Self = this.set("prevValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelatedNode(value: Node): Self = this.set("relatedNode", value.asInstanceOf[js.Any])
  }
  
}


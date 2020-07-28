package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationRecord extends js.Object {
  var addedNodes: NodeList
  var attributeName: java.lang.String
  var attributeNamespace: java.lang.String
  var nextSibling: Node
  var oldValue: java.lang.String
  var previousSibling: Node
  var removedNodes: NodeList
  var target: Node
  var `type`: java.lang.String
}

object MutationRecord {
  @scala.inline
  def apply(
    addedNodes: NodeList,
    attributeName: java.lang.String,
    attributeNamespace: java.lang.String,
    nextSibling: Node,
    oldValue: java.lang.String,
    previousSibling: Node,
    removedNodes: NodeList,
    target: Node,
    `type`: java.lang.String
  ): MutationRecord = {
    val __obj = js.Dynamic.literal(addedNodes = addedNodes.asInstanceOf[js.Any], attributeName = attributeName.asInstanceOf[js.Any], attributeNamespace = attributeNamespace.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removedNodes = removedNodes.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationRecord]
  }
  @scala.inline
  implicit class MutationRecordOps[Self <: MutationRecord] (val x: Self) extends AnyVal {
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
    def setAddedNodes(value: NodeList): Self = this.set("addedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributeName(value: java.lang.String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributeNamespace(value: java.lang.String): Self = this.set("attributeNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextSibling(value: Node): Self = this.set("nextSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: java.lang.String): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousSibling(value: Node): Self = this.set("previousSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovedNodes(value: NodeList): Self = this.set("removedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Node): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


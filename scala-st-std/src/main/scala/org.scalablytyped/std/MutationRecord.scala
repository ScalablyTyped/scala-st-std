package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationRecord extends js.Object {
  val addedNodes: NodeList
  val attributeName: java.lang.String | Null
  val attributeNamespace: java.lang.String | Null
  val nextSibling: Node | Null
  val oldValue: java.lang.String | Null
  val previousSibling: Node | Null
  val removedNodes: NodeList
  val target: Node
  val `type`: MutationRecordType
}

object MutationRecord {
  @scala.inline
  def apply(addedNodes: NodeList, removedNodes: NodeList, target: Node, `type`: MutationRecordType): MutationRecord = {
    val __obj = js.Dynamic.literal(addedNodes = addedNodes.asInstanceOf[js.Any], removedNodes = removedNodes.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
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
    def setRemovedNodes(value: NodeList): Self = this.set("removedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Node): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MutationRecordType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributeName(value: java.lang.String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributeNameNull: Self = this.set("attributeName", null)
    @scala.inline
    def setAttributeNamespace(value: java.lang.String): Self = this.set("attributeNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributeNamespaceNull: Self = this.set("attributeNamespace", null)
    @scala.inline
    def setNextSibling(value: Node): Self = this.set("nextSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextSiblingNull: Self = this.set("nextSibling", null)
    @scala.inline
    def setOldValue(value: java.lang.String): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValueNull: Self = this.set("oldValue", null)
    @scala.inline
    def setPreviousSibling(value: Node): Self = this.set("previousSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousSiblingNull: Self = this.set("previousSibling", null)
  }
  
}


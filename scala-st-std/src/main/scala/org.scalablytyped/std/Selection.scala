package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selection extends js.Object {
  val anchorNode: Node
  val anchorOffset: Double
  val baseNode: Node
  val baseOffset: Double
  val extentNode: Node
  val extentOffset: Double
  val focusNode: Node
  val focusOffset: Double
  val isCollapsed: scala.Boolean
  val rangeCount: Double
  val `type`: java.lang.String
  def addRange(range: Range): Unit
  def collapse(parentNode: Node, offset: Double): Unit
  def collapseToEnd(): Unit
  def collapseToStart(): Unit
  def containsNode(node: Node, partlyContained: scala.Boolean): scala.Boolean
  def deleteFromDocument(): Unit
  def empty(): Unit
  def extend(newNode: Node, offset: Double): Unit
  def getRangeAt(index: Double): Range
  def removeAllRanges(): Unit
  def removeRange(range: Range): Unit
  def selectAllChildren(parentNode: Node): Unit
  def setBaseAndExtent(baseNode: Node, baseOffset: Double, extentNode: Node, extentOffset: Double): Unit
  def setPosition(parentNode: Node, offset: Double): Unit
}

object Selection {
  @scala.inline
  def apply(
    addRange: Range => Unit,
    anchorNode: Node,
    anchorOffset: Double,
    baseNode: Node,
    baseOffset: Double,
    collapse: (Node, Double) => Unit,
    collapseToEnd: () => Unit,
    collapseToStart: () => Unit,
    containsNode: (Node, scala.Boolean) => scala.Boolean,
    deleteFromDocument: () => Unit,
    empty: () => Unit,
    extend: (Node, Double) => Unit,
    extentNode: Node,
    extentOffset: Double,
    focusNode: Node,
    focusOffset: Double,
    getRangeAt: Double => Range,
    isCollapsed: scala.Boolean,
    rangeCount: Double,
    removeAllRanges: () => Unit,
    removeRange: Range => Unit,
    selectAllChildren: Node => Unit,
    setBaseAndExtent: (Node, Double, Node, Double) => Unit,
    setPosition: (Node, Double) => Unit,
    `type`: java.lang.String
  ): Selection = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), anchorNode = anchorNode.asInstanceOf[js.Any], anchorOffset = anchorOffset.asInstanceOf[js.Any], baseNode = baseNode.asInstanceOf[js.Any], baseOffset = baseOffset.asInstanceOf[js.Any], collapse = js.Any.fromFunction2(collapse), collapseToEnd = js.Any.fromFunction0(collapseToEnd), collapseToStart = js.Any.fromFunction0(collapseToStart), containsNode = js.Any.fromFunction2(containsNode), deleteFromDocument = js.Any.fromFunction0(deleteFromDocument), empty = js.Any.fromFunction0(empty), extend = js.Any.fromFunction2(extend), extentNode = extentNode.asInstanceOf[js.Any], extentOffset = extentOffset.asInstanceOf[js.Any], focusNode = focusNode.asInstanceOf[js.Any], focusOffset = focusOffset.asInstanceOf[js.Any], getRangeAt = js.Any.fromFunction1(getRangeAt), isCollapsed = isCollapsed.asInstanceOf[js.Any], rangeCount = rangeCount.asInstanceOf[js.Any], removeAllRanges = js.Any.fromFunction0(removeAllRanges), removeRange = js.Any.fromFunction1(removeRange), selectAllChildren = js.Any.fromFunction1(selectAllChildren), setBaseAndExtent = js.Any.fromFunction4(setBaseAndExtent), setPosition = js.Any.fromFunction2(setPosition))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  @scala.inline
  implicit class SelectionOps[Self <: Selection] (val x: Self) extends AnyVal {
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
    def setAddRange(value: Range => Unit): Self = this.set("addRange", js.Any.fromFunction1(value))
    @scala.inline
    def setAnchorNode(value: Node): Self = this.set("anchorNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnchorOffset(value: Double): Self = this.set("anchorOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseNode(value: Node): Self = this.set("baseNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseOffset(value: Double): Self = this.set("baseOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollapse(value: (Node, Double) => Unit): Self = this.set("collapse", js.Any.fromFunction2(value))
    @scala.inline
    def setCollapseToEnd(value: () => Unit): Self = this.set("collapseToEnd", js.Any.fromFunction0(value))
    @scala.inline
    def setCollapseToStart(value: () => Unit): Self = this.set("collapseToStart", js.Any.fromFunction0(value))
    @scala.inline
    def setContainsNode(value: (Node, scala.Boolean) => scala.Boolean): Self = this.set("containsNode", js.Any.fromFunction2(value))
    @scala.inline
    def setDeleteFromDocument(value: () => Unit): Self = this.set("deleteFromDocument", js.Any.fromFunction0(value))
    @scala.inline
    def setEmpty(value: () => Unit): Self = this.set("empty", js.Any.fromFunction0(value))
    @scala.inline
    def setExtend(value: (Node, Double) => Unit): Self = this.set("extend", js.Any.fromFunction2(value))
    @scala.inline
    def setExtentNode(value: Node): Self = this.set("extentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtentOffset(value: Double): Self = this.set("extentOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusNode(value: Node): Self = this.set("focusNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusOffset(value: Double): Self = this.set("focusOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRangeAt(value: Double => Range): Self = this.set("getRangeAt", js.Any.fromFunction1(value))
    @scala.inline
    def setIsCollapsed(value: scala.Boolean): Self = this.set("isCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangeCount(value: Double): Self = this.set("rangeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveAllRanges(value: () => Unit): Self = this.set("removeAllRanges", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveRange(value: Range => Unit): Self = this.set("removeRange", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectAllChildren(value: Node => Unit): Self = this.set("selectAllChildren", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBaseAndExtent(value: (Node, Double, Node, Double) => Unit): Self = this.set("setBaseAndExtent", js.Any.fromFunction4(value))
    @scala.inline
    def setSetPosition(value: (Node, Double) => Unit): Self = this.set("setPosition", js.Any.fromFunction2(value))
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


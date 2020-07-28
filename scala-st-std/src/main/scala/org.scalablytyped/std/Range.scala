package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  val END_TO_END: Double
  val END_TO_START: Double
  val START_TO_END: Double
  val START_TO_START: Double
  val collapsed: scala.Boolean
  val commonAncestorContainer: Node
  val endContainer: Node
  val endOffset: Double
  val startContainer: Node
  val startOffset: Double
  def cloneContents(): DocumentFragment
  def cloneRange(): Range
  def collapse(toStart: scala.Boolean): Unit
  def compareBoundaryPoints(how: Double, sourceRange: Range): Double
  def createContextualFragment(fragment: java.lang.String): DocumentFragment
  def deleteContents(): Unit
  def detach(): Unit
  def expand(Unit: java.lang.String): scala.Boolean
  def extractContents(): DocumentFragment
  def getBoundingClientRect(): ClientRect
  def getClientRects(): ClientRectList
  def insertNode(newNode: Node): Unit
  def selectNode(refNode: Node): Unit
  def selectNodeContents(refNode: Node): Unit
  def setEnd(refNode: Node, offset: Double): Unit
  def setEndAfter(refNode: Node): Unit
  def setEndBefore(refNode: Node): Unit
  def setStart(refNode: Node, offset: Double): Unit
  def setStartAfter(refNode: Node): Unit
  def setStartBefore(refNode: Node): Unit
  def surroundContents(newParent: Node): Unit
}

object Range {
  @scala.inline
  def apply(
    END_TO_END: Double,
    END_TO_START: Double,
    START_TO_END: Double,
    START_TO_START: Double,
    cloneContents: () => DocumentFragment,
    cloneRange: () => Range,
    collapse: scala.Boolean => Unit,
    collapsed: scala.Boolean,
    commonAncestorContainer: Node,
    compareBoundaryPoints: (Double, Range) => Double,
    createContextualFragment: java.lang.String => DocumentFragment,
    deleteContents: () => Unit,
    detach: () => Unit,
    endContainer: Node,
    endOffset: Double,
    expand: java.lang.String => scala.Boolean,
    extractContents: () => DocumentFragment,
    getBoundingClientRect: () => ClientRect,
    getClientRects: () => ClientRectList,
    insertNode: Node => Unit,
    selectNode: Node => Unit,
    selectNodeContents: Node => Unit,
    setEnd: (Node, Double) => Unit,
    setEndAfter: Node => Unit,
    setEndBefore: Node => Unit,
    setStart: (Node, Double) => Unit,
    setStartAfter: Node => Unit,
    setStartBefore: Node => Unit,
    startContainer: Node,
    startOffset: Double,
    surroundContents: Node => Unit
  ): Range = {
    val __obj = js.Dynamic.literal(END_TO_END = END_TO_END.asInstanceOf[js.Any], END_TO_START = END_TO_START.asInstanceOf[js.Any], START_TO_END = START_TO_END.asInstanceOf[js.Any], START_TO_START = START_TO_START.asInstanceOf[js.Any], cloneContents = js.Any.fromFunction0(cloneContents), cloneRange = js.Any.fromFunction0(cloneRange), collapse = js.Any.fromFunction1(collapse), collapsed = collapsed.asInstanceOf[js.Any], commonAncestorContainer = commonAncestorContainer.asInstanceOf[js.Any], compareBoundaryPoints = js.Any.fromFunction2(compareBoundaryPoints), createContextualFragment = js.Any.fromFunction1(createContextualFragment), deleteContents = js.Any.fromFunction0(deleteContents), detach = js.Any.fromFunction0(detach), endContainer = endContainer.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], expand = js.Any.fromFunction1(expand), extractContents = js.Any.fromFunction0(extractContents), getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect), getClientRects = js.Any.fromFunction0(getClientRects), insertNode = js.Any.fromFunction1(insertNode), selectNode = js.Any.fromFunction1(selectNode), selectNodeContents = js.Any.fromFunction1(selectNodeContents), setEnd = js.Any.fromFunction2(setEnd), setEndAfter = js.Any.fromFunction1(setEndAfter), setEndBefore = js.Any.fromFunction1(setEndBefore), setStart = js.Any.fromFunction2(setStart), setStartAfter = js.Any.fromFunction1(setStartAfter), setStartBefore = js.Any.fromFunction1(setStartBefore), startContainer = startContainer.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], surroundContents = js.Any.fromFunction1(surroundContents))
    __obj.asInstanceOf[Range]
  }
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
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
    def setEND_TO_END(value: Double): Self = this.set("END_TO_END", value.asInstanceOf[js.Any])
    @scala.inline
    def setEND_TO_START(value: Double): Self = this.set("END_TO_START", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTART_TO_END(value: Double): Self = this.set("START_TO_END", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTART_TO_START(value: Double): Self = this.set("START_TO_START", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloneContents(value: () => DocumentFragment): Self = this.set("cloneContents", js.Any.fromFunction0(value))
    @scala.inline
    def setCloneRange(value: () => Range): Self = this.set("cloneRange", js.Any.fromFunction0(value))
    @scala.inline
    def setCollapse(value: scala.Boolean => Unit): Self = this.set("collapse", js.Any.fromFunction1(value))
    @scala.inline
    def setCollapsed(value: scala.Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommonAncestorContainer(value: Node): Self = this.set("commonAncestorContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompareBoundaryPoints(value: (Double, Range) => Double): Self = this.set("compareBoundaryPoints", js.Any.fromFunction2(value))
    @scala.inline
    def setCreateContextualFragment(value: java.lang.String => DocumentFragment): Self = this.set("createContextualFragment", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteContents(value: () => Unit): Self = this.set("deleteContents", js.Any.fromFunction0(value))
    @scala.inline
    def setDetach(value: () => Unit): Self = this.set("detach", js.Any.fromFunction0(value))
    @scala.inline
    def setEndContainer(value: Node): Self = this.set("endContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndOffset(value: Double): Self = this.set("endOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpand(value: java.lang.String => scala.Boolean): Self = this.set("expand", js.Any.fromFunction1(value))
    @scala.inline
    def setExtractContents(value: () => DocumentFragment): Self = this.set("extractContents", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBoundingClientRect(value: () => ClientRect): Self = this.set("getBoundingClientRect", js.Any.fromFunction0(value))
    @scala.inline
    def setGetClientRects(value: () => ClientRectList): Self = this.set("getClientRects", js.Any.fromFunction0(value))
    @scala.inline
    def setInsertNode(value: Node => Unit): Self = this.set("insertNode", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectNode(value: Node => Unit): Self = this.set("selectNode", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectNodeContents(value: Node => Unit): Self = this.set("selectNodeContents", js.Any.fromFunction1(value))
    @scala.inline
    def setSetEnd(value: (Node, Double) => Unit): Self = this.set("setEnd", js.Any.fromFunction2(value))
    @scala.inline
    def setSetEndAfter(value: Node => Unit): Self = this.set("setEndAfter", js.Any.fromFunction1(value))
    @scala.inline
    def setSetEndBefore(value: Node => Unit): Self = this.set("setEndBefore", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStart(value: (Node, Double) => Unit): Self = this.set("setStart", js.Any.fromFunction2(value))
    @scala.inline
    def setSetStartAfter(value: Node => Unit): Self = this.set("setStartAfter", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStartBefore(value: Node => Unit): Self = this.set("setStartBefore", js.Any.fromFunction1(value))
    @scala.inline
    def setStartContainer(value: Node): Self = this.set("startContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartOffset(value: Double): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setSurroundContents(value: Node => Unit): Self = this.set("surroundContents", js.Any.fromFunction1(value))
  }
  
}


package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeWalker extends js.Object {
  var currentNode: Node
  /** @deprecated */
  val expandEntityReferences: scala.Boolean
  val filter: NodeFilter | Null
  val root: Node
  val whatToShow: Double
  def firstChild(): Node | Null
  def lastChild(): Node | Null
  def nextNode(): Node | Null
  def nextSibling(): Node | Null
  def parentNode(): Node | Null
  def previousNode(): Node | Null
  def previousSibling(): Node | Null
}

object TreeWalker {
  @scala.inline
  def apply(
    currentNode: Node,
    expandEntityReferences: scala.Boolean,
    firstChild: () => Node | Null,
    lastChild: () => Node | Null,
    nextNode: () => Node | Null,
    nextSibling: () => Node | Null,
    parentNode: () => Node | Null,
    previousNode: () => Node | Null,
    previousSibling: () => Node | Null,
    root: Node,
    whatToShow: Double
  ): TreeWalker = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], expandEntityReferences = expandEntityReferences.asInstanceOf[js.Any], firstChild = js.Any.fromFunction0(firstChild), lastChild = js.Any.fromFunction0(lastChild), nextNode = js.Any.fromFunction0(nextNode), nextSibling = js.Any.fromFunction0(nextSibling), parentNode = js.Any.fromFunction0(parentNode), previousNode = js.Any.fromFunction0(previousNode), previousSibling = js.Any.fromFunction0(previousSibling), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeWalker]
  }
  @scala.inline
  implicit class TreeWalkerOps[Self <: TreeWalker] (val x: Self) extends AnyVal {
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
    def setCurrentNode(value: Node): Self = this.set("currentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandEntityReferences(value: scala.Boolean): Self = this.set("expandEntityReferences", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstChild(value: () => Node | Null): Self = this.set("firstChild", js.Any.fromFunction0(value))
    @scala.inline
    def setLastChild(value: () => Node | Null): Self = this.set("lastChild", js.Any.fromFunction0(value))
    @scala.inline
    def setNextNode(value: () => Node | Null): Self = this.set("nextNode", js.Any.fromFunction0(value))
    @scala.inline
    def setNextSibling(value: () => Node | Null): Self = this.set("nextSibling", js.Any.fromFunction0(value))
    @scala.inline
    def setParentNode(value: () => Node | Null): Self = this.set("parentNode", js.Any.fromFunction0(value))
    @scala.inline
    def setPreviousNode(value: () => Node | Null): Self = this.set("previousNode", js.Any.fromFunction0(value))
    @scala.inline
    def setPreviousSibling(value: () => Node | Null): Self = this.set("previousSibling", js.Any.fromFunction0(value))
    @scala.inline
    def setRoot(value: Node): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhatToShow(value: Double): Self = this.set("whatToShow", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: NodeFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterNull: Self = this.set("filter", null)
  }
  
}


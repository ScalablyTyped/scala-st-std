package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeIterator extends js.Object {
  val filter: NodeFilter | Null
  val pointerBeforeReferenceNode: scala.Boolean
  val referenceNode: Node
  val root: Node
  val whatToShow: Double
  def detach(): Unit
  def nextNode(): Node | Null
  def previousNode(): Node | Null
}

object NodeIterator {
  @scala.inline
  def apply(
    detach: () => Unit,
    nextNode: () => Node | Null,
    pointerBeforeReferenceNode: scala.Boolean,
    previousNode: () => Node | Null,
    referenceNode: Node,
    root: Node,
    whatToShow: Double
  ): NodeIterator = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), nextNode = js.Any.fromFunction0(nextNode), pointerBeforeReferenceNode = pointerBeforeReferenceNode.asInstanceOf[js.Any], previousNode = js.Any.fromFunction0(previousNode), referenceNode = referenceNode.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeIterator]
  }
  @scala.inline
  implicit class NodeIteratorOps[Self <: NodeIterator] (val x: Self) extends AnyVal {
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
    def setDetach(value: () => Unit): Self = this.set("detach", js.Any.fromFunction0(value))
    @scala.inline
    def setNextNode(value: () => Node | Null): Self = this.set("nextNode", js.Any.fromFunction0(value))
    @scala.inline
    def setPointerBeforeReferenceNode(value: scala.Boolean): Self = this.set("pointerBeforeReferenceNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousNode(value: () => Node | Null): Self = this.set("previousNode", js.Any.fromFunction0(value))
    @scala.inline
    def setReferenceNode(value: Node): Self = this.set("referenceNode", value.asInstanceOf[js.Any])
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


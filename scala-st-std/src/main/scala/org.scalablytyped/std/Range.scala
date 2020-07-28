package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range extends js.Object {
  val END_TO_END: Double = js.native
  val END_TO_START: Double = js.native
  val START_TO_END: Double = js.native
  val START_TO_START: Double = js.native
  val collapsed: scala.Boolean = js.native
  val commonAncestorContainer: Node = js.native
  val endContainer: Node = js.native
  val endOffset: Double = js.native
  val startContainer: Node = js.native
  val startOffset: Double = js.native
  def cloneContents(): DocumentFragment = js.native
  def cloneRange(): Range = js.native
  def collapse(): Unit = js.native
  def collapse(toStart: scala.Boolean): Unit = js.native
  def compareBoundaryPoints(how: Double, sourceRange: Range): Double = js.native
  def createContextualFragment(fragment: java.lang.String): DocumentFragment = js.native
  def deleteContents(): Unit = js.native
  def detach(): Unit = js.native
  def expand(Unit: ExpandGranularity): scala.Boolean = js.native
  def extractContents(): DocumentFragment = js.native
  def getBoundingClientRect(): ClientRect | DOMRect = js.native
  def getClientRects(): ClientRectList | DOMRectList = js.native
  def insertNode(node: Node): Unit = js.native
  def isPointInRange(node: Node, offset: Double): scala.Boolean = js.native
  def selectNode(node: Node): Unit = js.native
  def selectNodeContents(node: Node): Unit = js.native
  def setEnd(node: Node, offset: Double): Unit = js.native
  def setEndAfter(node: Node): Unit = js.native
  def setEndBefore(node: Node): Unit = js.native
  def setStart(node: Node, offset: Double): Unit = js.native
  def setStartAfter(node: Node): Unit = js.native
  def setStartBefore(node: Node): Unit = js.native
  def surroundContents(newParent: Node): Unit = js.native
}


package org.scalablytyped.std.global

import org.scalablytyped.std.DOMRectList
import org.scalablytyped.std.ExpandGranularity
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Range")
@js.native
class Range ()
  extends org.scalablytyped.std.Range {
  /* CompleteClass */
  override val END_TO_END: Double = js.native
  /* CompleteClass */
  override val END_TO_START: Double = js.native
  /* CompleteClass */
  override val START_TO_END: Double = js.native
  /* CompleteClass */
  override val START_TO_START: Double = js.native
  /* CompleteClass */
  override val collapsed: scala.Boolean = js.native
  /* CompleteClass */
  override val commonAncestorContainer: org.scalablytyped.std.Node = js.native
  /* CompleteClass */
  override val endContainer: org.scalablytyped.std.Node = js.native
  /* CompleteClass */
  override val endOffset: Double = js.native
  /* CompleteClass */
  override val startContainer: org.scalablytyped.std.Node = js.native
  /* CompleteClass */
  override val startOffset: Double = js.native
  /* CompleteClass */
  override def cloneContents(): org.scalablytyped.std.DocumentFragment = js.native
  /* CompleteClass */
  override def cloneRange(): org.scalablytyped.std.Range = js.native
  /* CompleteClass */
  override def collapse(toStart: scala.Boolean): Unit = js.native
  /* CompleteClass */
  override def compareBoundaryPoints(how: Double, sourceRange: org.scalablytyped.std.Range): Double = js.native
  /* CompleteClass */
  override def createContextualFragment(fragment: java.lang.String): org.scalablytyped.std.DocumentFragment = js.native
  /* CompleteClass */
  override def deleteContents(): Unit = js.native
  /* CompleteClass */
  override def detach(): Unit = js.native
  /* CompleteClass */
  override def expand(Unit: ExpandGranularity): scala.Boolean = js.native
  /* CompleteClass */
  override def extractContents(): org.scalablytyped.std.DocumentFragment = js.native
  /* CompleteClass */
  override def getBoundingClientRect(): org.scalablytyped.std.ClientRect | org.scalablytyped.std.DOMRect = js.native
  /* CompleteClass */
  override def getClientRects(): org.scalablytyped.std.ClientRectList | DOMRectList = js.native
  /* CompleteClass */
  override def insertNode(newNode: org.scalablytyped.std.Node): Unit = js.native
  /* CompleteClass */
  override def selectNode(refNode: org.scalablytyped.std.Node): Unit = js.native
  /* CompleteClass */
  override def selectNodeContents(refNode: org.scalablytyped.std.Node): Unit = js.native
  /* CompleteClass */
  override def setEnd(refNode: org.scalablytyped.std.Node, offset: Double): Unit = js.native
  /* CompleteClass */
  override def setEndAfter(refNode: org.scalablytyped.std.Node): Unit = js.native
  /* CompleteClass */
  override def setEndBefore(refNode: org.scalablytyped.std.Node): Unit = js.native
  /* CompleteClass */
  override def setStart(refNode: org.scalablytyped.std.Node, offset: Double): Unit = js.native
  /* CompleteClass */
  override def setStartAfter(refNode: org.scalablytyped.std.Node): Unit = js.native
  /* CompleteClass */
  override def setStartBefore(refNode: org.scalablytyped.std.Node): Unit = js.native
  /* CompleteClass */
  override def surroundContents(newParent: org.scalablytyped.std.Node): Unit = js.native
}

@JSGlobal("Range")
@js.native
object Range
  extends Instantiable0[org.scalablytyped.std.Range] {
  val END_TO_END: Double = js.native
  val END_TO_START: Double = js.native
  val START_TO_END: Double = js.native
  val START_TO_START: Double = js.native
}


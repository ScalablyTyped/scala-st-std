package org.scalablytyped.std.global

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Selection")
@js.native
class Selection ()
  extends org.scalablytyped.std.Selection {
  /* CompleteClass */
  override val anchorNode: org.scalablytyped.std.Node = js.native
  /* CompleteClass */
  override val anchorOffset: Double = js.native
  /* CompleteClass */
  override val focusNode: org.scalablytyped.std.Node = js.native
  /* CompleteClass */
  override val focusOffset: Double = js.native
  /* CompleteClass */
  override val isCollapsed: scala.Boolean = js.native
  /* CompleteClass */
  override val rangeCount: Double = js.native
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /* CompleteClass */
  override def addRange(range: org.scalablytyped.std.Range): Unit = js.native
  /* CompleteClass */
  override def collapse(parentNode: org.scalablytyped.std.Node, offset: Double): Unit = js.native
  /* CompleteClass */
  override def collapseToEnd(): Unit = js.native
  /* CompleteClass */
  override def collapseToStart(): Unit = js.native
  /* CompleteClass */
  override def containsNode(node: org.scalablytyped.std.Node, partlyContained: scala.Boolean): scala.Boolean = js.native
  /* CompleteClass */
  override def deleteFromDocument(): Unit = js.native
  /* CompleteClass */
  override def empty(): Unit = js.native
  /* CompleteClass */
  override def extend(newNode: org.scalablytyped.std.Node, offset: Double): Unit = js.native
  /* CompleteClass */
  override def getRangeAt(index: Double): org.scalablytyped.std.Range = js.native
  /* CompleteClass */
  override def removeAllRanges(): Unit = js.native
  /* CompleteClass */
  override def removeRange(range: org.scalablytyped.std.Range): Unit = js.native
  /* CompleteClass */
  override def selectAllChildren(parentNode: org.scalablytyped.std.Node): Unit = js.native
  /* CompleteClass */
  override def setBaseAndExtent(
    baseNode: org.scalablytyped.std.Node,
    baseOffset: Double,
    extentNode: org.scalablytyped.std.Node,
    extentOffset: Double
  ): Unit = js.native
}

@JSGlobal("Selection")
@js.native
object Selection
  extends Instantiable0[org.scalablytyped.std.Selection]


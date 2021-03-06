package org.scalablytyped.std.global

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ShadowRoot")
@js.native
class ShadowRoot ()
  extends org.scalablytyped.std.ShadowRoot {
  /* CompleteClass */
  override val activeElement: org.scalablytyped.std.Element | Null = js.native
  /**
    * Returns document's fullscreen element.
    */
  /* CompleteClass */
  override val fullscreenElement: org.scalablytyped.std.Element | Null = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /* CompleteClass */
  override val pointerLockElement: org.scalablytyped.std.Element | Null = js.native
  /**
    * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
    */
  /* CompleteClass */
  override val styleSheets: org.scalablytyped.std.StyleSheetList = js.native
  /* CompleteClass */
  override def caretPositionFromPoint(x: Double, y: Double): org.scalablytyped.std.CaretPosition | Null = js.native
  /** @deprecated */
  /* CompleteClass */
  override def caretRangeFromPoint(x: Double, y: Double): org.scalablytyped.std.Range = js.native
  /* CompleteClass */
  override def elementFromPoint(x: Double, y: Double): org.scalablytyped.std.Element | Null = js.native
  /* CompleteClass */
  override def elementsFromPoint(x: Double, y: Double): js.Array[org.scalablytyped.std.Element] = js.native
  /**
    * Returns the first element within node's descendants whose ID is elementId.
    */
  /* CompleteClass */
  override def getElementById(elementId: java.lang.String): org.scalablytyped.std.Element | Null = js.native
  /* CompleteClass */
  override def getSelection(): org.scalablytyped.std.Selection | Null = js.native
}

@JSGlobal("ShadowRoot")
@js.native
object ShadowRoot
  extends Instantiable0[org.scalablytyped.std.ShadowRoot]


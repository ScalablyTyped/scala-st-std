package org.scalablytyped.std.global

import org.scalablytyped.std.stdStrings.drag
import org.scalablytyped.std.stdStrings.dragend
import org.scalablytyped.std.stdStrings.dragenter
import org.scalablytyped.std.stdStrings.dragexit
import org.scalablytyped.std.stdStrings.dragleave
import org.scalablytyped.std.stdStrings.dragover
import org.scalablytyped.std.stdStrings.dragstart
import org.scalablytyped.std.stdStrings.drop
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DragEvent")
@js.native
class DragEvent protected ()
  extends org.scalablytyped.std.DragEvent {
  def this(`type`: drag) = this()
  def this(`type`: dragend) = this()
  def this(`type`: dragenter) = this()
  def this(`type`: dragexit) = this()
  def this(`type`: dragleave) = this()
  def this(`type`: dragover) = this()
  def this(`type`: dragstart) = this()
  def this(`type`: drop) = this()
  def this(`type`: drag, dragEventInit: org.scalablytyped.std.anon.DataTransfer) = this()
  def this(`type`: dragend, dragEventInit: org.scalablytyped.std.anon.DataTransfer) = this()
  def this(`type`: dragenter, dragEventInit: org.scalablytyped.std.anon.DataTransfer) = this()
  def this(`type`: dragexit, dragEventInit: org.scalablytyped.std.anon.DataTransfer) = this()
  def this(`type`: dragleave, dragEventInit: org.scalablytyped.std.anon.DataTransfer) = this()
  def this(`type`: dragover, dragEventInit: org.scalablytyped.std.anon.DataTransfer) = this()
  def this(`type`: dragstart, dragEventInit: org.scalablytyped.std.anon.DataTransfer) = this()
  def this(`type`: drop, dragEventInit: org.scalablytyped.std.anon.DataTransfer) = this()
}

@JSGlobal("DragEvent")
@js.native
object DragEvent
  extends Instantiable1[
      drag | dragend | dragenter | dragexit | dragleave | dragover | dragstart | drop, 
      org.scalablytyped.std.DragEvent
    ]
     with Instantiable2[
      drag | dragend | dragenter | dragexit | dragleave | dragover | dragstart | drop, 
      /* dragEventInit */ org.scalablytyped.std.anon.DataTransfer, 
      org.scalablytyped.std.DragEvent
    ]


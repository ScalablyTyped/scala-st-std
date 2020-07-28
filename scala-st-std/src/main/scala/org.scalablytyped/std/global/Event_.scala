package org.scalablytyped.std.global

import org.scalablytyped.std.Event
import org.scalablytyped.std.EventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Event")
@js.native
class Event_ protected () extends Event {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: EventInit) = this()
}

@JSGlobal("Event")
@js.native
object Event_
  extends Instantiable1[/* typeArg */ java.lang.String, Event]
     with Instantiable2[/* typeArg */ java.lang.String, /* eventInitDict */ EventInit, Event] {
  val AT_TARGET: Double = js.native
  val BUBBLING_PHASE: Double = js.native
  val CAPTURING_PHASE: Double = js.native
  val NONE: Double = js.native
}


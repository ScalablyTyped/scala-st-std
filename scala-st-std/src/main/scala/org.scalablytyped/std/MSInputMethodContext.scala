package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.MSCandidateWindowHide
import org.scalablytyped.std.stdStrings.MSCandidateWindowShow
import org.scalablytyped.std.stdStrings.MSCandidateWindowUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSInputMethodContext extends EventTarget {
  val compositionEndOffset: Double = js.native
  val compositionStartOffset: Double = js.native
  val target: HTMLElement = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowHide(`type`: MSCandidateWindowHide, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowHide(
    `type`: MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowShow(`type`: MSCandidateWindowShow, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowShow(
    `type`: MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowUpdate(
    `type`: MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowUpdate(
    `type`: MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def getCandidateWindowClientRect(): ClientRect = js.native
  def getCompositionAlternatives(): js.Array[java.lang.String] = js.native
  def hasComposition(): scala.Boolean = js.native
  def isCandidateWindowVisible(): scala.Boolean = js.native
  def oncandidatewindowhide(ev: Event): js.Any = js.native
  def oncandidatewindowshow(ev: Event): js.Any = js.native
  def oncandidatewindowupdate(ev: Event): js.Any = js.native
}


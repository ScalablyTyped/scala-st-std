package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextRange extends js.Object {
  var boundingHeight: Double = js.native
  var boundingLeft: Double = js.native
  var boundingTop: Double = js.native
  var boundingWidth: Double = js.native
  var htmlText: java.lang.String = js.native
  var offsetLeft: Double = js.native
  var offsetTop: Double = js.native
  var text: java.lang.String = js.native
  def collapse(): Unit = js.native
  def collapse(start: scala.Boolean): Unit = js.native
  def compareEndPoints(how: java.lang.String, sourceRange: TextRange): Double = js.native
  def duplicate(): TextRange = js.native
  def execCommand(cmdID: java.lang.String): scala.Boolean = js.native
  def execCommand(cmdID: java.lang.String, showUI: js.UndefOr[scala.Nothing], value: js.Any): scala.Boolean = js.native
  def execCommand(cmdID: java.lang.String, showUI: scala.Boolean): scala.Boolean = js.native
  def execCommand(cmdID: java.lang.String, showUI: scala.Boolean, value: js.Any): scala.Boolean = js.native
  def execCommandShowHelp(cmdID: java.lang.String): scala.Boolean = js.native
  def expand(Unit: java.lang.String): scala.Boolean = js.native
  def findText(string: java.lang.String): scala.Boolean = js.native
  def findText(string: java.lang.String, count: js.UndefOr[scala.Nothing], flags: Double): scala.Boolean = js.native
  def findText(string: java.lang.String, count: Double): scala.Boolean = js.native
  def findText(string: java.lang.String, count: Double, flags: Double): scala.Boolean = js.native
  def getBookmark(): java.lang.String = js.native
  def getBoundingClientRect(): ClientRect = js.native
  def getClientRects(): ClientRectList = js.native
  def inRange(range: TextRange): scala.Boolean = js.native
  def isEqual(range: TextRange): scala.Boolean = js.native
  def move(unit: java.lang.String): Double = js.native
  def move(unit: java.lang.String, count: Double): Double = js.native
  def moveEnd(unit: java.lang.String): Double = js.native
  def moveEnd(unit: java.lang.String, count: Double): Double = js.native
  def moveStart(unit: java.lang.String): Double = js.native
  def moveStart(unit: java.lang.String, count: Double): Double = js.native
  def moveToBookmark(bookmark: java.lang.String): scala.Boolean = js.native
  def moveToElementText(element: Element): Unit = js.native
  def moveToPoint(x: Double, y: Double): Unit = js.native
  def parentElement(): Element = js.native
  def pasteHTML(html: java.lang.String): Unit = js.native
  def queryCommandEnabled(cmdID: java.lang.String): scala.Boolean = js.native
  def queryCommandIndeterm(cmdID: java.lang.String): scala.Boolean = js.native
  def queryCommandState(cmdID: java.lang.String): scala.Boolean = js.native
  def queryCommandSupported(cmdID: java.lang.String): scala.Boolean = js.native
  def queryCommandText(cmdID: java.lang.String): java.lang.String = js.native
  def queryCommandValue(cmdID: java.lang.String): js.Any = js.native
  def scrollIntoView(): Unit = js.native
  def scrollIntoView(fStart: scala.Boolean): Unit = js.native
  def select(): Unit = js.native
  def setEndPoint(how: java.lang.String, SourceRange: TextRange): Unit = js.native
}


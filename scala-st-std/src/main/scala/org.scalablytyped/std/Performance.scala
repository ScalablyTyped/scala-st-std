package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Performance extends js.Object {
  /** @deprecated */
  val navigation: PerformanceNavigation = js.native
  val timeOrigin: Double = js.native
  /** @deprecated */
  val timing: PerformanceTiming = js.native
  def clearMarks(): Unit = js.native
  def clearMarks(markName: java.lang.String): Unit = js.native
  def clearMeasures(): Unit = js.native
  def clearMeasures(measureName: java.lang.String): Unit = js.native
  def clearResourceTimings(): Unit = js.native
  def getEntries(): js.Any = js.native
  def getEntriesByName(name: java.lang.String): js.Any = js.native
  def getEntriesByName(name: java.lang.String, `type`: java.lang.String): js.Any = js.native
  def getEntriesByType(`type`: java.lang.String): js.Any = js.native
  /** @deprecated */
  def getMarks(): js.Any = js.native
  def getMarks(markName: java.lang.String): js.Any = js.native
  /** @deprecated */
  def getMeasures(): js.Any = js.native
  def getMeasures(measureName: java.lang.String): js.Any = js.native
  def mark(markName: java.lang.String): Unit = js.native
  def measure(measureName: java.lang.String): Unit = js.native
  def measure(
    measureName: java.lang.String,
    startMarkName: js.UndefOr[scala.Nothing],
    endMarkName: java.lang.String
  ): Unit = js.native
  def measure(measureName: java.lang.String, startMarkName: java.lang.String): Unit = js.native
  def measure(measureName: java.lang.String, startMarkName: java.lang.String, endMarkName: java.lang.String): Unit = js.native
  def now(): Double = js.native
  def setResourceTimingBufferSize(maxSize: Double): Unit = js.native
  def toJSON(): js.Any = js.native
}


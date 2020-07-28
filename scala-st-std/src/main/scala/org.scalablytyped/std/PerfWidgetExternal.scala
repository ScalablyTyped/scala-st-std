package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfWidgetExternal extends js.Object {
  var activeNetworkRequestCount: Double
  var averageFrameTime: Double
  var averagePaintTime: Double
  var extraInformationEnabled: scala.Boolean
  var independentRenderingEnabled: scala.Boolean
  var irDisablingContentString: java.lang.String
  var irStatusAvailable: scala.Boolean
  var maxCpuSpeed: Double
  var paintRequestsPerSecond: Double
  var performanceCounter: Double
  var performanceCounterFrequency: Double
  def addEventListener(eventType: java.lang.String, callback: js.Function): Unit
  def getMemoryUsage(): Double
  def getProcessCpuUsage(): Double
  def getRecentCpuUsage(last: Double): js.Any
  def getRecentFrames(last: Double): js.Any
  def getRecentMemoryUsage(last: Double): js.Any
  def getRecentPaintRequests(last: Double): js.Any
  def removeEventListener(eventType: java.lang.String, callback: js.Function): Unit
  def repositionWindow(x: Double, y: Double): Unit
  def resizeWindow(width: Double, height: Double): Unit
}

object PerfWidgetExternal {
  @scala.inline
  def apply(
    activeNetworkRequestCount: Double,
    addEventListener: (java.lang.String, js.Function) => Unit,
    averageFrameTime: Double,
    averagePaintTime: Double,
    extraInformationEnabled: scala.Boolean,
    getMemoryUsage: () => Double,
    getProcessCpuUsage: () => Double,
    getRecentCpuUsage: Double => js.Any,
    getRecentFrames: Double => js.Any,
    getRecentMemoryUsage: Double => js.Any,
    getRecentPaintRequests: Double => js.Any,
    independentRenderingEnabled: scala.Boolean,
    irDisablingContentString: java.lang.String,
    irStatusAvailable: scala.Boolean,
    maxCpuSpeed: Double,
    paintRequestsPerSecond: Double,
    performanceCounter: Double,
    performanceCounterFrequency: Double,
    removeEventListener: (java.lang.String, js.Function) => Unit,
    repositionWindow: (Double, Double) => Unit,
    resizeWindow: (Double, Double) => Unit
  ): PerfWidgetExternal = {
    val __obj = js.Dynamic.literal(activeNetworkRequestCount = activeNetworkRequestCount.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), averageFrameTime = averageFrameTime.asInstanceOf[js.Any], averagePaintTime = averagePaintTime.asInstanceOf[js.Any], extraInformationEnabled = extraInformationEnabled.asInstanceOf[js.Any], getMemoryUsage = js.Any.fromFunction0(getMemoryUsage), getProcessCpuUsage = js.Any.fromFunction0(getProcessCpuUsage), getRecentCpuUsage = js.Any.fromFunction1(getRecentCpuUsage), getRecentFrames = js.Any.fromFunction1(getRecentFrames), getRecentMemoryUsage = js.Any.fromFunction1(getRecentMemoryUsage), getRecentPaintRequests = js.Any.fromFunction1(getRecentPaintRequests), independentRenderingEnabled = independentRenderingEnabled.asInstanceOf[js.Any], irDisablingContentString = irDisablingContentString.asInstanceOf[js.Any], irStatusAvailable = irStatusAvailable.asInstanceOf[js.Any], maxCpuSpeed = maxCpuSpeed.asInstanceOf[js.Any], paintRequestsPerSecond = paintRequestsPerSecond.asInstanceOf[js.Any], performanceCounter = performanceCounter.asInstanceOf[js.Any], performanceCounterFrequency = performanceCounterFrequency.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), repositionWindow = js.Any.fromFunction2(repositionWindow), resizeWindow = js.Any.fromFunction2(resizeWindow))
    __obj.asInstanceOf[PerfWidgetExternal]
  }
  @scala.inline
  implicit class PerfWidgetExternalOps[Self <: PerfWidgetExternal] (val x: Self) extends AnyVal {
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
    def setActiveNetworkRequestCount(value: Double): Self = this.set("activeNetworkRequestCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddEventListener(value: (java.lang.String, js.Function) => Unit): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    @scala.inline
    def setAverageFrameTime(value: Double): Self = this.set("averageFrameTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setAveragePaintTime(value: Double): Self = this.set("averagePaintTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraInformationEnabled(value: scala.Boolean): Self = this.set("extraInformationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetMemoryUsage(value: () => Double): Self = this.set("getMemoryUsage", js.Any.fromFunction0(value))
    @scala.inline
    def setGetProcessCpuUsage(value: () => Double): Self = this.set("getProcessCpuUsage", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRecentCpuUsage(value: Double => js.Any): Self = this.set("getRecentCpuUsage", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRecentFrames(value: Double => js.Any): Self = this.set("getRecentFrames", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRecentMemoryUsage(value: Double => js.Any): Self = this.set("getRecentMemoryUsage", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRecentPaintRequests(value: Double => js.Any): Self = this.set("getRecentPaintRequests", js.Any.fromFunction1(value))
    @scala.inline
    def setIndependentRenderingEnabled(value: scala.Boolean): Self = this.set("independentRenderingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIrDisablingContentString(value: java.lang.String): Self = this.set("irDisablingContentString", value.asInstanceOf[js.Any])
    @scala.inline
    def setIrStatusAvailable(value: scala.Boolean): Self = this.set("irStatusAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxCpuSpeed(value: Double): Self = this.set("maxCpuSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaintRequestsPerSecond(value: Double): Self = this.set("paintRequestsPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerformanceCounter(value: Double): Self = this.set("performanceCounter", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerformanceCounterFrequency(value: Double): Self = this.set("performanceCounterFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveEventListener(value: (java.lang.String, js.Function) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
    @scala.inline
    def setRepositionWindow(value: (Double, Double) => Unit): Self = this.set("repositionWindow", js.Any.fromFunction2(value))
    @scala.inline
    def setResizeWindow(value: (Double, Double) => Unit): Self = this.set("resizeWindow", js.Any.fromFunction2(value))
  }
  
}


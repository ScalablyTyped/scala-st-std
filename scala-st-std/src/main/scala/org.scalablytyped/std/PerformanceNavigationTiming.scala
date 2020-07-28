package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceNavigationTiming extends PerformanceEntry {
  var connectEnd: Double
  var connectStart: Double
  var domComplete: Double
  var domContentLoadedEventEnd: Double
  var domContentLoadedEventStart: Double
  var domInteractive: Double
  var domLoading: Double
  var domainLookupEnd: Double
  var domainLookupStart: Double
  var fetchStart: Double
  var loadEventEnd: Double
  var loadEventStart: Double
  var navigationStart: Double
  var redirectCount: Double
  var redirectEnd: Double
  var redirectStart: Double
  var requestStart: Double
  var responseEnd: Double
  var responseStart: Double
  var `type`: java.lang.String
  var unloadEventEnd: Double
  var unloadEventStart: Double
}

object PerformanceNavigationTiming {
  @scala.inline
  def apply(
    connectEnd: Double,
    connectStart: Double,
    domComplete: Double,
    domContentLoadedEventEnd: Double,
    domContentLoadedEventStart: Double,
    domInteractive: Double,
    domLoading: Double,
    domainLookupEnd: Double,
    domainLookupStart: Double,
    duration: Double,
    entryType: java.lang.String,
    fetchStart: Double,
    loadEventEnd: Double,
    loadEventStart: Double,
    name: java.lang.String,
    navigationStart: Double,
    redirectCount: Double,
    redirectEnd: Double,
    redirectStart: Double,
    requestStart: Double,
    responseEnd: Double,
    responseStart: Double,
    startTime: Double,
    `type`: java.lang.String,
    unloadEventEnd: Double,
    unloadEventStart: Double
  ): PerformanceNavigationTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], domComplete = domComplete.asInstanceOf[js.Any], domContentLoadedEventEnd = domContentLoadedEventEnd.asInstanceOf[js.Any], domContentLoadedEventStart = domContentLoadedEventStart.asInstanceOf[js.Any], domInteractive = domInteractive.asInstanceOf[js.Any], domLoading = domLoading.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], loadEventEnd = loadEventEnd.asInstanceOf[js.Any], loadEventStart = loadEventStart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], navigationStart = navigationStart.asInstanceOf[js.Any], redirectCount = redirectCount.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], unloadEventEnd = unloadEventEnd.asInstanceOf[js.Any], unloadEventStart = unloadEventStart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceNavigationTiming]
  }
  @scala.inline
  implicit class PerformanceNavigationTimingOps[Self <: PerformanceNavigationTiming] (val x: Self) extends AnyVal {
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
    def setConnectEnd(value: Double): Self = this.set("connectEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectStart(value: Double): Self = this.set("connectStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomComplete(value: Double): Self = this.set("domComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomContentLoadedEventEnd(value: Double): Self = this.set("domContentLoadedEventEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomContentLoadedEventStart(value: Double): Self = this.set("domContentLoadedEventStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomInteractive(value: Double): Self = this.set("domInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomLoading(value: Double): Self = this.set("domLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainLookupEnd(value: Double): Self = this.set("domainLookupEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainLookupStart(value: Double): Self = this.set("domainLookupStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchStart(value: Double): Self = this.set("fetchStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadEventEnd(value: Double): Self = this.set("loadEventEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadEventStart(value: Double): Self = this.set("loadEventStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationStart(value: Double): Self = this.set("navigationStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectCount(value: Double): Self = this.set("redirectCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectEnd(value: Double): Self = this.set("redirectEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectStart(value: Double): Self = this.set("redirectStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestStart(value: Double): Self = this.set("requestStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseEnd(value: Double): Self = this.set("responseEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseStart(value: Double): Self = this.set("responseStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnloadEventEnd(value: Double): Self = this.set("unloadEventEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnloadEventStart(value: Double): Self = this.set("unloadEventStart", value.asInstanceOf[js.Any])
  }
  
}


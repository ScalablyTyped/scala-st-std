package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator
  extends Object
     with NavigatorID
     with NavigatorOnLine
     with NavigatorContentUtils
     with NavigatorStorageUtils
     with NavigatorGeolocation
     with MSNavigatorDoNotTrack
     with MSFileSaver {
  var appCodeName: java.lang.String = js.native
  var appMinorVersion: java.lang.String = js.native
  var browserLanguage: java.lang.String = js.native
  var connectionSpeed: Double = js.native
  var cookieEnabled: scala.Boolean = js.native
  var cpuClass: java.lang.String = js.native
  var language: java.lang.String = js.native
  var maxTouchPoints: Double = js.native
  var mimeTypes: MSMimeTypesCollection = js.native
  var msManipulationViewsEnabled: scala.Boolean = js.native
  var msMaxTouchPoints: Double = js.native
  var msPointerEnabled: scala.Boolean = js.native
  var plugins: MSPluginsCollection = js.native
  var pointerEnabled: scala.Boolean = js.native
  var systemLanguage: java.lang.String = js.native
  var userLanguage: java.lang.String = js.native
  var webdriver: scala.Boolean = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
  def getGamepads(): js.Array[Gamepad] = js.native
  def javaEnabled(): scala.Boolean = js.native
  def msLaunchUri(uri: java.lang.String): Unit = js.native
  def msLaunchUri(
    uri: java.lang.String,
    successCallback: js.UndefOr[scala.Nothing],
    noHandlerCallback: MSLaunchUriCallback
  ): Unit = js.native
  def msLaunchUri(uri: java.lang.String, successCallback: MSLaunchUriCallback): Unit = js.native
  def msLaunchUri(
    uri: java.lang.String,
    successCallback: MSLaunchUriCallback,
    noHandlerCallback: MSLaunchUriCallback
  ): Unit = js.native
  def vibrate(pattern: js.Array[Double]): scala.Boolean = js.native
  def vibrate(pattern: Double): scala.Boolean = js.native
}


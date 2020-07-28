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
     with MSFileSaver
     with NavigatorUserMedia {
  val appCodeName: java.lang.String = js.native
  val cookieEnabled: scala.Boolean = js.native
  val language: java.lang.String = js.native
  val maxTouchPoints: Double = js.native
  val mimeTypes: MimeTypeArray = js.native
  val msManipulationViewsEnabled: scala.Boolean = js.native
  val msMaxTouchPoints: Double = js.native
  val msPointerEnabled: scala.Boolean = js.native
  val plugins: PluginArray = js.native
  val pointerEnabled: scala.Boolean = js.native
  val webdriver: scala.Boolean = js.native
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
  def requestMediaKeySystemAccess(keySystem: java.lang.String, supportedConfigurations: js.Array[MediaKeySystemConfiguration]): js.Thenable[MediaKeySystemAccess] = js.native
  def vibrate(pattern: js.Array[Double]): scala.Boolean = js.native
  def vibrate(pattern: Double): scala.Boolean = js.native
}

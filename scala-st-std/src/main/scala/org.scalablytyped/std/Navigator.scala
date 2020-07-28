package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator
  extends NavigatorID
     with NavigatorOnLine
     with NavigatorContentUtils
     with NavigatorStorageUtils
     with MSNavigatorDoNotTrack
     with MSFileSaver
     with NavigatorBeacon
     with NavigatorConcurrentHardware
     with NavigatorUserMedia
     with NavigatorLanguage
     with NavigatorStorage {
  val activeVRDisplays: js.Array[VRDisplay] = js.native
  val authentication: WebAuthentication = js.native
  val cookieEnabled: scala.Boolean = js.native
  val doNotTrack: java.lang.String | Null = js.native
  var gamepadInputEmulation: GamepadInputEmulationType = js.native
  val geolocation: Geolocation = js.native
  val maxTouchPoints: Double = js.native
  val mimeTypes: MimeTypeArray = js.native
  val msManipulationViewsEnabled: scala.Boolean = js.native
  val msMaxTouchPoints: Double = js.native
  val msPointerEnabled: scala.Boolean = js.native
  val plugins: PluginArray = js.native
  val pointerEnabled: scala.Boolean = js.native
  val serviceWorker: ServiceWorkerContainer = js.native
  val webdriver: scala.Boolean = js.native
  def getGamepads(): js.Array[Gamepad | Null] = js.native
  def getVRDisplays(): js.Promise[js.Array[VRDisplay]] = js.native
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
  def requestMediaKeySystemAccess(keySystem: java.lang.String, supportedConfigurations: js.Array[MediaKeySystemConfiguration]): js.Promise[MediaKeySystemAccess] = js.native
  def vibrate(pattern: js.Array[Double]): scala.Boolean = js.native
  def vibrate(pattern: Double): scala.Boolean = js.native
}


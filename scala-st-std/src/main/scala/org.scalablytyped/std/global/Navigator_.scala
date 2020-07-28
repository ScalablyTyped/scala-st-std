package org.scalablytyped.std.global

import org.scalablytyped.std.ConfirmSiteSpecificExceptionsInformation
import org.scalablytyped.std.ExceptionInformation
import org.scalablytyped.std.MediaStreamConstraints
import org.scalablytyped.std.Navigator
import org.scalablytyped.std.NavigatorUserMediaErrorCallback
import org.scalablytyped.std.NavigatorUserMediaSuccessCallback
import org.scalablytyped.std.StoreExceptionsInformation
import org.scalablytyped.std.StoreSiteSpecificExceptionsInformation
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Navigator")
@js.native
class Navigator_ () extends Navigator {
  /* CompleteClass */
  override val appCodeName: java.lang.String = js.native
  /* CompleteClass */
  override val appName: java.lang.String = js.native
  /* CompleteClass */
  override val appVersion: java.lang.String = js.native
  /* CompleteClass */
  override val geolocation: org.scalablytyped.std.Geolocation = js.native
  /* CompleteClass */
  override val hardwareConcurrency: Double = js.native
  /* CompleteClass */
  override val mediaDevices: org.scalablytyped.std.MediaDevices = js.native
  /* CompleteClass */
  override val onLine: scala.Boolean = js.native
  /* CompleteClass */
  override val platform: java.lang.String = js.native
  /* CompleteClass */
  override val product: java.lang.String = js.native
  /* CompleteClass */
  override val productSub: java.lang.String = js.native
  /* CompleteClass */
  override val userAgent: java.lang.String = js.native
  /* CompleteClass */
  override val vendor: java.lang.String = js.native
  /* CompleteClass */
  override val vendorSub: java.lang.String = js.native
  /* CompleteClass */
  override def confirmSiteSpecificTrackingException(args: ConfirmSiteSpecificExceptionsInformation): scala.Boolean = js.native
  /* CompleteClass */
  override def confirmWebWideTrackingException(args: ExceptionInformation): scala.Boolean = js.native
  /* CompleteClass */
  override def getUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: NavigatorUserMediaSuccessCallback,
    errorCallback: NavigatorUserMediaErrorCallback
  ): Unit = js.native
  /* CompleteClass */
  override def removeSiteSpecificTrackingException(args: ExceptionInformation): Unit = js.native
  /* CompleteClass */
  override def removeWebWideTrackingException(args: ExceptionInformation): Unit = js.native
  /* CompleteClass */
  override def storeSiteSpecificTrackingException(args: StoreSiteSpecificExceptionsInformation): Unit = js.native
  /* CompleteClass */
  override def storeWebWideTrackingException(args: StoreExceptionsInformation): Unit = js.native
}

@JSGlobal("Navigator")
@js.native
object Navigator_ extends Instantiable0[Navigator]


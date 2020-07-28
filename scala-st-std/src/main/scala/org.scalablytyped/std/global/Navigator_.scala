package org.scalablytyped.std.global

import org.scalablytyped.std.ConfirmSiteSpecificExceptionsInformation
import org.scalablytyped.std.ExceptionInformation
import org.scalablytyped.std.Navigator
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
  override var appName: java.lang.String = js.native
  /* CompleteClass */
  override var appVersion: java.lang.String = js.native
  /* CompleteClass */
  override var geolocation: org.scalablytyped.std.Geolocation = js.native
  /* CompleteClass */
  override var onLine: scala.Boolean = js.native
  /* CompleteClass */
  override var platform: java.lang.String = js.native
  /* CompleteClass */
  override var product: java.lang.String = js.native
  /* CompleteClass */
  override var productSub: java.lang.String = js.native
  /* CompleteClass */
  override var userAgent: java.lang.String = js.native
  /* CompleteClass */
  override var vendor: java.lang.String = js.native
  /* CompleteClass */
  override var vendorSub: java.lang.String = js.native
  /* CompleteClass */
  override def confirmSiteSpecificTrackingException(args: ConfirmSiteSpecificExceptionsInformation): scala.Boolean = js.native
  /* CompleteClass */
  override def confirmWebWideTrackingException(args: ExceptionInformation): scala.Boolean = js.native
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


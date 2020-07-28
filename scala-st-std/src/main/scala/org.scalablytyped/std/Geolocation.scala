package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geolocation extends js.Object {
  def clearWatch(watchId: Double): Unit = js.native
  def getCurrentPosition(successCallback: PositionCallback): Unit = js.native
  def getCurrentPosition(
    successCallback: PositionCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    options: PositionOptions
  ): Unit = js.native
  def getCurrentPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback): Unit = js.native
  def getCurrentPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback, options: PositionOptions): Unit = js.native
  def watchPosition(successCallback: PositionCallback): Double = js.native
  def watchPosition(
    successCallback: PositionCallback,
    errorCallback: js.UndefOr[scala.Nothing],
    options: PositionOptions
  ): Double = js.native
  def watchPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback): Double = js.native
  def watchPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback, options: PositionOptions): Double = js.native
}


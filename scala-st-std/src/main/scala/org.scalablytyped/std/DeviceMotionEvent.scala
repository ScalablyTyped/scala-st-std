package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DeviceMotionEvent provides web developers with information about the speed of changes for the device's position and orientation. */
@js.native
trait DeviceMotionEvent extends Event {
  val acceleration: DeviceAcceleration | Null = js.native
  val accelerationIncludingGravity: DeviceAcceleration | Null = js.native
  val interval: Double | Null = js.native
  val rotationRate: DeviceRotationRate | Null = js.native
  def initDeviceMotionEvent(`type`: java.lang.String, bubbles: scala.Boolean, cancelable: scala.Boolean): Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: DeviceAccelerationDict
  ): Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: DeviceAccelerationDict,
    accelerationIncludingGravity: DeviceAccelerationDict
  ): Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: DeviceAccelerationDict,
    accelerationIncludingGravity: DeviceAccelerationDict,
    rotationRate: DeviceRotationRateDict
  ): Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: DeviceAccelerationDict,
    accelerationIncludingGravity: DeviceAccelerationDict,
    rotationRate: DeviceRotationRateDict,
    interval: Double
  ): Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: DeviceAccelerationDict,
    accelerationIncludingGravity: DeviceAccelerationDict,
    rotationRate: Null,
    interval: Double
  ): Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: DeviceAccelerationDict,
    accelerationIncludingGravity: Null,
    rotationRate: DeviceRotationRateDict
  ): Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: DeviceAccelerationDict,
    accelerationIncludingGravity: Null,
    rotationRate: DeviceRotationRateDict,
    interval: Double
  ): Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: DeviceAccelerationDict,
    accelerationIncludingGravity: Null,
    rotationRate: Null,
    interval: Double
  ): Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: Null,
    accelerationIncludingGravity: DeviceAccelerationDict
  ): Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: Null,
    accelerationIncludingGravity: DeviceAccelerationDict,
    rotationRate: DeviceRotationRateDict
  ): Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: Null,
    accelerationIncludingGravity: DeviceAccelerationDict,
    rotationRate: DeviceRotationRateDict,
    interval: Double
  ): Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: Null,
    accelerationIncludingGravity: DeviceAccelerationDict,
    rotationRate: Null,
    interval: Double
  ): Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: Null,
    accelerationIncludingGravity: Null,
    rotationRate: DeviceRotationRateDict
  ): Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: Null,
    accelerationIncludingGravity: Null,
    rotationRate: DeviceRotationRateDict,
    interval: Double
  ): Unit = js.native
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: Null,
    accelerationIncludingGravity: Null,
    rotationRate: Null,
    interval: Double
  ): Unit = js.native
}


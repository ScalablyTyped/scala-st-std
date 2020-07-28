package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioParam extends js.Object {
  val defaultValue: Double
  var value: Double
  def cancelScheduledValues(cancelTime: Double): AudioParam
  def exponentialRampToValueAtTime(value: Double, endTime: Double): AudioParam
  def linearRampToValueAtTime(value: Double, endTime: Double): AudioParam
  def setTargetAtTime(target: Double, startTime: Double, timeConstant: Double): AudioParam
  def setValueAtTime(value: Double, startTime: Double): AudioParam
  def setValueCurveAtTime(values: js.Array[Double], startTime: Double, duration: Double): AudioParam
}

object AudioParam {
  @scala.inline
  def apply(
    cancelScheduledValues: Double => AudioParam,
    defaultValue: Double,
    exponentialRampToValueAtTime: (Double, Double) => AudioParam,
    linearRampToValueAtTime: (Double, Double) => AudioParam,
    setTargetAtTime: (Double, Double, Double) => AudioParam,
    setValueAtTime: (Double, Double) => AudioParam,
    setValueCurveAtTime: (js.Array[Double], Double, Double) => AudioParam,
    value: Double
  ): AudioParam = {
    val __obj = js.Dynamic.literal(cancelScheduledValues = js.Any.fromFunction1(cancelScheduledValues), defaultValue = defaultValue.asInstanceOf[js.Any], exponentialRampToValueAtTime = js.Any.fromFunction2(exponentialRampToValueAtTime), linearRampToValueAtTime = js.Any.fromFunction2(linearRampToValueAtTime), setTargetAtTime = js.Any.fromFunction3(setTargetAtTime), setValueAtTime = js.Any.fromFunction2(setValueAtTime), setValueCurveAtTime = js.Any.fromFunction3(setValueCurveAtTime), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioParam]
  }
  @scala.inline
  implicit class AudioParamOps[Self <: AudioParam] (val x: Self) extends AnyVal {
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
    def setCancelScheduledValues(value: Double => AudioParam): Self = this.set("cancelScheduledValues", js.Any.fromFunction1(value))
    @scala.inline
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setExponentialRampToValueAtTime(value: (Double, Double) => AudioParam): Self = this.set("exponentialRampToValueAtTime", js.Any.fromFunction2(value))
    @scala.inline
    def setLinearRampToValueAtTime(value: (Double, Double) => AudioParam): Self = this.set("linearRampToValueAtTime", js.Any.fromFunction2(value))
    @scala.inline
    def setSetTargetAtTime(value: (Double, Double, Double) => AudioParam): Self = this.set("setTargetAtTime", js.Any.fromFunction3(value))
    @scala.inline
    def setSetValueAtTime(value: (Double, Double) => AudioParam): Self = this.set("setValueAtTime", js.Any.fromFunction2(value))
    @scala.inline
    def setSetValueCurveAtTime(value: (js.Array[Double], Double, Double) => AudioParam): Self = this.set("setValueCurveAtTime", js.Any.fromFunction3(value))
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}


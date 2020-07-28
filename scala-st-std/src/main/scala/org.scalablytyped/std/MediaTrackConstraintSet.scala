package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackConstraintSet extends js.Object {
  var aspectRatio: js.UndefOr[Double | ConstrainDoubleRange] = js.undefined
  var deviceId: js.UndefOr[java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters] = js.undefined
  var echoCancelation: js.UndefOr[scala.Boolean | ConstrainBooleanParameters] = js.undefined
  var facingMode: js.UndefOr[java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters] = js.undefined
  var frameRate: js.UndefOr[Double | ConstrainDoubleRange] = js.undefined
  var groupId: js.UndefOr[java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters] = js.undefined
  var height: js.UndefOr[Double | ConstrainLongRange] = js.undefined
  var sampleRate: js.UndefOr[Double | ConstrainLongRange] = js.undefined
  var sampleSize: js.UndefOr[Double | ConstrainLongRange] = js.undefined
  var volume: js.UndefOr[Double | ConstrainDoubleRange] = js.undefined
  var width: js.UndefOr[Double | ConstrainLongRange] = js.undefined
}

object MediaTrackConstraintSet {
  @scala.inline
  def apply(): MediaTrackConstraintSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackConstraintSet]
  }
  @scala.inline
  implicit class MediaTrackConstraintSetOps[Self <: MediaTrackConstraintSet] (val x: Self) extends AnyVal {
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
    def setAspectRatio(value: Double | ConstrainDoubleRange): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setDeviceIdVarargs(value: java.lang.String*): Self = this.set("deviceId", js.Array(value :_*))
    @scala.inline
    def setDeviceId(value: java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    @scala.inline
    def setEchoCancelation(value: scala.Boolean | ConstrainBooleanParameters): Self = this.set("echoCancelation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEchoCancelation: Self = this.set("echoCancelation", js.undefined)
    @scala.inline
    def setFacingModeVarargs(value: java.lang.String*): Self = this.set("facingMode", js.Array(value :_*))
    @scala.inline
    def setFacingMode(value: java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters): Self = this.set("facingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacingMode: Self = this.set("facingMode", js.undefined)
    @scala.inline
    def setFrameRate(value: Double | ConstrainDoubleRange): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    @scala.inline
    def setGroupIdVarargs(value: java.lang.String*): Self = this.set("groupId", js.Array(value :_*))
    @scala.inline
    def setGroupId(value: java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters): Self = this.set("groupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    @scala.inline
    def setHeight(value: Double | ConstrainLongRange): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setSampleRate(value: Double | ConstrainLongRange): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
    @scala.inline
    def setSampleSize(value: Double | ConstrainLongRange): Self = this.set("sampleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleSize: Self = this.set("sampleSize", js.undefined)
    @scala.inline
    def setVolume(value: Double | ConstrainDoubleRange): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
    @scala.inline
    def setWidth(value: Double | ConstrainLongRange): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


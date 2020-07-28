package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaKeySystemConfiguration extends js.Object {
  var audioCapabilities: js.UndefOr[js.Array[MediaKeySystemMediaCapability]] = js.undefined
  var distinctiveIdentifier: js.UndefOr[MediaKeysRequirement] = js.undefined
  var initDataTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var persistentState: js.UndefOr[MediaKeysRequirement] = js.undefined
  var videoCapabilities: js.UndefOr[js.Array[MediaKeySystemMediaCapability]] = js.undefined
}

object MediaKeySystemConfiguration {
  @scala.inline
  def apply(): MediaKeySystemConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaKeySystemConfiguration]
  }
  @scala.inline
  implicit class MediaKeySystemConfigurationOps[Self <: MediaKeySystemConfiguration] (val x: Self) extends AnyVal {
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
    def setAudioCapabilitiesVarargs(value: MediaKeySystemMediaCapability*): Self = this.set("audioCapabilities", js.Array(value :_*))
    @scala.inline
    def setAudioCapabilities(value: js.Array[MediaKeySystemMediaCapability]): Self = this.set("audioCapabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioCapabilities: Self = this.set("audioCapabilities", js.undefined)
    @scala.inline
    def setDistinctiveIdentifier(value: MediaKeysRequirement): Self = this.set("distinctiveIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistinctiveIdentifier: Self = this.set("distinctiveIdentifier", js.undefined)
    @scala.inline
    def setInitDataTypesVarargs(value: java.lang.String*): Self = this.set("initDataTypes", js.Array(value :_*))
    @scala.inline
    def setInitDataTypes(value: js.Array[java.lang.String]): Self = this.set("initDataTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitDataTypes: Self = this.set("initDataTypes", js.undefined)
    @scala.inline
    def setPersistentState(value: MediaKeysRequirement): Self = this.set("persistentState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistentState: Self = this.set("persistentState", js.undefined)
    @scala.inline
    def setVideoCapabilitiesVarargs(value: MediaKeySystemMediaCapability*): Self = this.set("videoCapabilities", js.Array(value :_*))
    @scala.inline
    def setVideoCapabilities(value: js.Array[MediaKeySystemMediaCapability]): Self = this.set("videoCapabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoCapabilities: Self = this.set("videoCapabilities", js.undefined)
  }
  
}


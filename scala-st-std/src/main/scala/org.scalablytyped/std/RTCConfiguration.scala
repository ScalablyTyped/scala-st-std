package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCConfiguration extends js.Object {
  var bundlePolicy: js.UndefOr[java.lang.String] = js.undefined
  var iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.undefined
  var iceTransportPolicy: js.UndefOr[java.lang.String] = js.undefined
  var peerIdentity: js.UndefOr[java.lang.String] = js.undefined
}

object RTCConfiguration {
  @scala.inline
  def apply(): RTCConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCConfiguration]
  }
  @scala.inline
  implicit class RTCConfigurationOps[Self <: RTCConfiguration] (val x: Self) extends AnyVal {
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
    def setBundlePolicy(value: java.lang.String): Self = this.set("bundlePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundlePolicy: Self = this.set("bundlePolicy", js.undefined)
    @scala.inline
    def setIceServersVarargs(value: RTCIceServer*): Self = this.set("iceServers", js.Array(value :_*))
    @scala.inline
    def setIceServers(value: js.Array[RTCIceServer]): Self = this.set("iceServers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIceServers: Self = this.set("iceServers", js.undefined)
    @scala.inline
    def setIceTransportPolicy(value: java.lang.String): Self = this.set("iceTransportPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIceTransportPolicy: Self = this.set("iceTransportPolicy", js.undefined)
    @scala.inline
    def setPeerIdentity(value: java.lang.String): Self = this.set("peerIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerIdentity: Self = this.set("peerIdentity", js.undefined)
  }
  
}


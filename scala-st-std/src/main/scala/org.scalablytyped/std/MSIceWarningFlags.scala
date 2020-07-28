package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSIceWarningFlags extends js.Object {
  var allocationMessageIntegrityFailed: js.UndefOr[scala.Boolean] = js.undefined
  var alternateServerReceived: js.UndefOr[scala.Boolean] = js.undefined
  var connCheckMessageIntegrityFailed: js.UndefOr[scala.Boolean] = js.undefined
  var connCheckOtherError: js.UndefOr[scala.Boolean] = js.undefined
  var fipsAllocationFailure: js.UndefOr[scala.Boolean] = js.undefined
  var multipleRelayServersAttempted: js.UndefOr[scala.Boolean] = js.undefined
  var noRelayServersConfigured: js.UndefOr[scala.Boolean] = js.undefined
  var portRangeExhausted: js.UndefOr[scala.Boolean] = js.undefined
  var pseudoTLSFailure: js.UndefOr[scala.Boolean] = js.undefined
  var tcpNatConnectivityFailed: js.UndefOr[scala.Boolean] = js.undefined
  var tcpRelayConnectivityFailed: js.UndefOr[scala.Boolean] = js.undefined
  var turnAuthUnknownUsernameError: js.UndefOr[scala.Boolean] = js.undefined
  var turnTcpAllocateFailed: js.UndefOr[scala.Boolean] = js.undefined
  var turnTcpSendFailed: js.UndefOr[scala.Boolean] = js.undefined
  var turnTcpTimedOut: js.UndefOr[scala.Boolean] = js.undefined
  var turnTurnTcpConnectivityFailed: js.UndefOr[scala.Boolean] = js.undefined
  var turnUdpAllocateFailed: js.UndefOr[scala.Boolean] = js.undefined
  var turnUdpSendFailed: js.UndefOr[scala.Boolean] = js.undefined
  var udpLocalConnectivityFailed: js.UndefOr[scala.Boolean] = js.undefined
  var udpNatConnectivityFailed: js.UndefOr[scala.Boolean] = js.undefined
  var udpRelayConnectivityFailed: js.UndefOr[scala.Boolean] = js.undefined
  var useCandidateChecksFailed: js.UndefOr[scala.Boolean] = js.undefined
}

object MSIceWarningFlags {
  @scala.inline
  def apply(): MSIceWarningFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSIceWarningFlags]
  }
  @scala.inline
  implicit class MSIceWarningFlagsOps[Self <: MSIceWarningFlags] (val x: Self) extends AnyVal {
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
    def setAllocationMessageIntegrityFailed(value: scala.Boolean): Self = this.set("allocationMessageIntegrityFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocationMessageIntegrityFailed: Self = this.set("allocationMessageIntegrityFailed", js.undefined)
    @scala.inline
    def setAlternateServerReceived(value: scala.Boolean): Self = this.set("alternateServerReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternateServerReceived: Self = this.set("alternateServerReceived", js.undefined)
    @scala.inline
    def setConnCheckMessageIntegrityFailed(value: scala.Boolean): Self = this.set("connCheckMessageIntegrityFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnCheckMessageIntegrityFailed: Self = this.set("connCheckMessageIntegrityFailed", js.undefined)
    @scala.inline
    def setConnCheckOtherError(value: scala.Boolean): Self = this.set("connCheckOtherError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnCheckOtherError: Self = this.set("connCheckOtherError", js.undefined)
    @scala.inline
    def setFipsAllocationFailure(value: scala.Boolean): Self = this.set("fipsAllocationFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFipsAllocationFailure: Self = this.set("fipsAllocationFailure", js.undefined)
    @scala.inline
    def setMultipleRelayServersAttempted(value: scala.Boolean): Self = this.set("multipleRelayServersAttempted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleRelayServersAttempted: Self = this.set("multipleRelayServersAttempted", js.undefined)
    @scala.inline
    def setNoRelayServersConfigured(value: scala.Boolean): Self = this.set("noRelayServersConfigured", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoRelayServersConfigured: Self = this.set("noRelayServersConfigured", js.undefined)
    @scala.inline
    def setPortRangeExhausted(value: scala.Boolean): Self = this.set("portRangeExhausted", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortRangeExhausted: Self = this.set("portRangeExhausted", js.undefined)
    @scala.inline
    def setPseudoTLSFailure(value: scala.Boolean): Self = this.set("pseudoTLSFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePseudoTLSFailure: Self = this.set("pseudoTLSFailure", js.undefined)
    @scala.inline
    def setTcpNatConnectivityFailed(value: scala.Boolean): Self = this.set("tcpNatConnectivityFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTcpNatConnectivityFailed: Self = this.set("tcpNatConnectivityFailed", js.undefined)
    @scala.inline
    def setTcpRelayConnectivityFailed(value: scala.Boolean): Self = this.set("tcpRelayConnectivityFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTcpRelayConnectivityFailed: Self = this.set("tcpRelayConnectivityFailed", js.undefined)
    @scala.inline
    def setTurnAuthUnknownUsernameError(value: scala.Boolean): Self = this.set("turnAuthUnknownUsernameError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTurnAuthUnknownUsernameError: Self = this.set("turnAuthUnknownUsernameError", js.undefined)
    @scala.inline
    def setTurnTcpAllocateFailed(value: scala.Boolean): Self = this.set("turnTcpAllocateFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTurnTcpAllocateFailed: Self = this.set("turnTcpAllocateFailed", js.undefined)
    @scala.inline
    def setTurnTcpSendFailed(value: scala.Boolean): Self = this.set("turnTcpSendFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTurnTcpSendFailed: Self = this.set("turnTcpSendFailed", js.undefined)
    @scala.inline
    def setTurnTcpTimedOut(value: scala.Boolean): Self = this.set("turnTcpTimedOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTurnTcpTimedOut: Self = this.set("turnTcpTimedOut", js.undefined)
    @scala.inline
    def setTurnTurnTcpConnectivityFailed(value: scala.Boolean): Self = this.set("turnTurnTcpConnectivityFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTurnTurnTcpConnectivityFailed: Self = this.set("turnTurnTcpConnectivityFailed", js.undefined)
    @scala.inline
    def setTurnUdpAllocateFailed(value: scala.Boolean): Self = this.set("turnUdpAllocateFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTurnUdpAllocateFailed: Self = this.set("turnUdpAllocateFailed", js.undefined)
    @scala.inline
    def setTurnUdpSendFailed(value: scala.Boolean): Self = this.set("turnUdpSendFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTurnUdpSendFailed: Self = this.set("turnUdpSendFailed", js.undefined)
    @scala.inline
    def setUdpLocalConnectivityFailed(value: scala.Boolean): Self = this.set("udpLocalConnectivityFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUdpLocalConnectivityFailed: Self = this.set("udpLocalConnectivityFailed", js.undefined)
    @scala.inline
    def setUdpNatConnectivityFailed(value: scala.Boolean): Self = this.set("udpNatConnectivityFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUdpNatConnectivityFailed: Self = this.set("udpNatConnectivityFailed", js.undefined)
    @scala.inline
    def setUdpRelayConnectivityFailed(value: scala.Boolean): Self = this.set("udpRelayConnectivityFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUdpRelayConnectivityFailed: Self = this.set("udpRelayConnectivityFailed", js.undefined)
    @scala.inline
    def setUseCandidateChecksFailed(value: scala.Boolean): Self = this.set("useCandidateChecksFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCandidateChecksFailed: Self = this.set("useCandidateChecksFailed", js.undefined)
  }
  
}


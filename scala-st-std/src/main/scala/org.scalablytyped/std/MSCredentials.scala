package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSCredentials extends js.Object {
  def getAssertion(challenge: java.lang.String): js.Thenable[MSAssertion] = js.native
  def getAssertion(challenge: java.lang.String, filter: js.UndefOr[scala.Nothing], params: MSSignatureParameters): js.Thenable[MSAssertion] = js.native
  def getAssertion(challenge: java.lang.String, filter: MSCredentialFilter): js.Thenable[MSAssertion] = js.native
  def getAssertion(challenge: java.lang.String, filter: MSCredentialFilter, params: MSSignatureParameters): js.Thenable[MSAssertion] = js.native
  def makeCredential(accountInfo: MSAccountInfo, params: js.Array[MSCredentialParameters]): js.Thenable[MSAssertion] = js.native
  def makeCredential(accountInfo: MSAccountInfo, params: js.Array[MSCredentialParameters], challenge: java.lang.String): js.Thenable[MSAssertion] = js.native
}


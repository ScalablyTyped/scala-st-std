package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAuthentication extends js.Object {
  def getAssertion(assertionChallenge: js.Any): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: js.Any, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.Any
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: js.Any,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
}


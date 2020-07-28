package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAuthentication extends js.Object {
  def getAssertion(assertionChallenge: BufferSource): js.Promise[WebAuthnAssertion] = js.native
  def getAssertion(assertionChallenge: BufferSource, options: AssertionOptions): js.Promise[WebAuthnAssertion] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: BufferSource
  ): js.Promise[ScopedCredentialInfo] = js.native
  def makeCredential(
    accountInformation: Account,
    cryptoParameters: js.Array[ScopedCredentialParameters],
    attestationChallenge: BufferSource,
    options: ScopedCredentialOptions
  ): js.Promise[ScopedCredentialInfo] = js.native
}


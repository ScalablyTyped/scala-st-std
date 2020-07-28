package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIdentityProvider extends js.Object {
  @JSName("generateAssertion")
  var generateAssertion_Original: GenerateAssertionCallback = js.native
  @JSName("validateAssertion")
  var validateAssertion_Original: ValidateAssertionCallback = js.native
  def generateAssertion(contents: java.lang.String, origin: java.lang.String, options: RTCIdentityProviderOptions): js.Promise[RTCIdentityAssertionResult] = js.native
  def validateAssertion(assertion: java.lang.String, origin: java.lang.String): js.Promise[RTCIdentityValidationResult] = js.native
}


package org.scalablytyped.std.global

import org.scalablytyped.std.AuthenticationExtensionsClientOutputs
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PublicKeyCredential")
@js.native
class PublicKeyCredential ()
  extends org.scalablytyped.std.PublicKeyCredential {
  /* CompleteClass */
  override val id: java.lang.String = js.native
  /* CompleteClass */
  override val rawId: org.scalablytyped.std.ArrayBuffer = js.native
  /* CompleteClass */
  override val response: org.scalablytyped.std.AuthenticatorResponse = js.native
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /* CompleteClass */
  override def getClientExtensionResults(): AuthenticationExtensionsClientOutputs = js.native
}

@JSGlobal("PublicKeyCredential")
@js.native
object PublicKeyCredential
  extends Instantiable0[org.scalablytyped.std.PublicKeyCredential] {
  def isUserVerifyingPlatformAuthenticatorAvailable(): js.Promise[scala.Boolean] = js.native
}


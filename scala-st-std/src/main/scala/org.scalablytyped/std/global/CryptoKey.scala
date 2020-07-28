package org.scalablytyped.std.global

import org.scalablytyped.std.KeyAlgorithm
import org.scalablytyped.std.KeyType
import org.scalablytyped.std.KeyUsage
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CryptoKey")
@js.native
class CryptoKey ()
  extends org.scalablytyped.std.CryptoKey {
  /* CompleteClass */
  override val algorithm: KeyAlgorithm = js.native
  /* CompleteClass */
  override val extractable: scala.Boolean = js.native
  /* CompleteClass */
  override val `type`: KeyType = js.native
  /* CompleteClass */
  override val usages: js.Array[KeyUsage] = js.native
}

@JSGlobal("CryptoKey")
@js.native
object CryptoKey
  extends Instantiable0[org.scalablytyped.std.CryptoKey]


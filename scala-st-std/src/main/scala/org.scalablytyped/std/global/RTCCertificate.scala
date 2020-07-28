package org.scalablytyped.std.global

import org.scalablytyped.std.AlgorithmIdentifier
import org.scalablytyped.std.RTCDtlsFingerprint
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCCertificate")
@js.native
class RTCCertificate ()
  extends org.scalablytyped.std.RTCCertificate {
  /* CompleteClass */
  override val expires: Double = js.native
  /* CompleteClass */
  override def getFingerprints(): js.Array[RTCDtlsFingerprint] = js.native
}

@JSGlobal("RTCCertificate")
@js.native
object RTCCertificate
  extends Instantiable0[org.scalablytyped.std.RTCCertificate] {
  def getSupportedAlgorithms(): js.Array[AlgorithmIdentifier] = js.native
}


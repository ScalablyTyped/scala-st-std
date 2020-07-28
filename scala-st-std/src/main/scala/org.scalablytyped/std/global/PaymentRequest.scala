package org.scalablytyped.std.global

import org.scalablytyped.std.PaymentDetails
import org.scalablytyped.std.PaymentMethodData
import org.scalablytyped.std.PaymentOptions
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PaymentRequest")
@js.native
class PaymentRequest protected ()
  extends org.scalablytyped.std.PaymentRequest {
  def this(methodData: js.Array[PaymentMethodData], details: PaymentDetails) = this()
  def this(methodData: js.Array[PaymentMethodData], details: PaymentDetails, options: PaymentOptions) = this()
}

@JSGlobal("PaymentRequest")
@js.native
object PaymentRequest
  extends Instantiable2[
      /* methodData */ js.Array[PaymentMethodData], 
      /* details */ PaymentDetails, 
      org.scalablytyped.std.PaymentRequest
    ]
     with Instantiable3[
      /* methodData */ js.Array[PaymentMethodData], 
      /* details */ PaymentDetails, 
      /* options */ PaymentOptions, 
      org.scalablytyped.std.PaymentRequest
    ]


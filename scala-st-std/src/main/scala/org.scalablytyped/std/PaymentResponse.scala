package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentResponse extends js.Object {
  val details: js.Any = js.native
  val methodName: java.lang.String = js.native
  val payerEmail: java.lang.String | Null = js.native
  val payerName: java.lang.String | Null = js.native
  val payerPhone: java.lang.String | Null = js.native
  val shippingAddress: PaymentAddress | Null = js.native
  val shippingOption: java.lang.String | Null = js.native
  def complete(): js.Promise[Unit] = js.native
  def complete(result: java.lang.String): js.Promise[Unit] = js.native
  def toJSON(): js.Any = js.native
}


package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.shippingaddresschange
import org.scalablytyped.std.stdStrings.shippingoptionchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentRequest extends EventTarget {
  val shippingAddress: PaymentAddress | Null = js.native
  val shippingOption: java.lang.String | Null = js.native
  val shippingType: java.lang.String | Null = js.native
  def abort(): js.Promise[Unit] = js.native
  @JSName("addEventListener")
  def addEventListener_shippingaddresschange(`type`: shippingaddresschange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingoptionchange(`type`: shippingoptionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def onshippingaddresschange(ev: Event): js.Any = js.native
  def onshippingoptionchange(ev: Event): js.Any = js.native
  def show(): js.Promise[PaymentResponse] = js.native
}


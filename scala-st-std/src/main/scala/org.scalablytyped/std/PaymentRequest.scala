package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.shippingaddresschange
import org.scalablytyped.std.stdStrings.shippingoptionchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentRequest extends EventTarget {
  val id: java.lang.String = js.native
  var onshippingaddresschange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onshippingoptionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  val shippingAddress: PaymentAddress | Null = js.native
  val shippingOption: java.lang.String | Null = js.native
  val shippingType: PaymentShippingType | Null = js.native
  def abort(): js.Promise[Unit] = js.native
  @JSName("addEventListener")
  def addEventListener_shippingaddresschange(`type`: shippingaddresschange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingoptionchange(`type`: shippingoptionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def canMakePayment(): js.Promise[scala.Boolean] = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingaddresschange(`type`: shippingaddresschange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingoptionchange(`type`: shippingoptionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def show(): js.Promise[PaymentResponse] = js.native
}


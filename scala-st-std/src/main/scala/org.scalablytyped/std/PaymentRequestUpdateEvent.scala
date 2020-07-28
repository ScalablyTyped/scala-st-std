package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentRequestUpdateEvent extends Event {
  def updateWith(detailsPromise: js.Promise[PaymentDetailsUpdate]): Unit = js.native
}


package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorBeacon extends js.Object {
  def sendBeacon(url: USVString): scala.Boolean = js.native
  def sendBeacon(url: USVString, data: BodyInit): scala.Boolean = js.native
}


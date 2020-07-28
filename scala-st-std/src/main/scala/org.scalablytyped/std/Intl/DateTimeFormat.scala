package org.scalablytyped.std.Intl

import org.scalablytyped.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeFormat extends js.Object {
  def format(): String = js.native
  def format(date: Date): String = js.native
  def format(date: Double): String = js.native
  def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
}


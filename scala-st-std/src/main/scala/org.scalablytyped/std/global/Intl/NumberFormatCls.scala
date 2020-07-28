package org.scalablytyped.std.global.Intl

import org.scalablytyped.std.Intl.NumberFormatOptions
import org.scalablytyped.std.Intl.ResolvedNumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.NumberFormat")
@js.native
class NumberFormatCls ()
  extends org.scalablytyped.std.Intl.NumberFormat {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions) = this()
  def this(locales: String, options: NumberFormatOptions) = this()
  def this(locales: js.Array[String], options: NumberFormatOptions) = this()
  /* CompleteClass */
  override def format(value: Double): String = js.native
  /* CompleteClass */
  override def resolvedOptions(): ResolvedNumberFormatOptions = js.native
}


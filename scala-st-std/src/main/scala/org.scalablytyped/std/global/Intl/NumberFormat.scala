package org.scalablytyped.std.global.Intl

import org.scalablytyped.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.NumberFormat")
@js.native
object NumberFormat
  extends Instantiable0[org.scalablytyped.std.Intl.NumberFormat]
     with Instantiable1[
      (/* locales */ js.Array[String]) | (/* locale */ String), 
      org.scalablytyped.std.Intl.NumberFormat
    ]
     with Instantiable2[
      js.UndefOr[(/* locales */ js.Array[String]) | (/* locale */ String)], 
      /* options */ NumberFormatOptions, 
      org.scalablytyped.std.Intl.NumberFormat
    ] {
  def apply(): org.scalablytyped.std.Intl.NumberFormat = js.native
  def apply(locale: String): org.scalablytyped.std.Intl.NumberFormat = js.native
  def apply(locale: String, options: NumberFormatOptions): org.scalablytyped.std.Intl.NumberFormat = js.native
  def apply(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions): org.scalablytyped.std.Intl.NumberFormat = js.native
  def apply(locales: js.Array[String]): org.scalablytyped.std.Intl.NumberFormat = js.native
  def apply(locales: js.Array[String], options: NumberFormatOptions): org.scalablytyped.std.Intl.NumberFormat = js.native
  def supportedLocalesOf(locale: String): js.Array[String] = js.native
  def supportedLocalesOf(locale: String, options: NumberFormatOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: NumberFormatOptions): js.Array[String] = js.native
}


package org.scalablytyped.std.global.Intl

import org.scalablytyped.std.Intl.DateTimeFormatOptions
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.DateTimeFormat")
@js.native
object DateTimeFormat
  extends Instantiable0[org.scalablytyped.std.Intl.DateTimeFormat]
     with Instantiable1[
      (/* locales */ js.Array[String]) | (/* locale */ String), 
      org.scalablytyped.std.Intl.DateTimeFormat
    ]
     with Instantiable2[
      js.UndefOr[(/* locales */ js.Array[String]) | (/* locale */ String)], 
      /* options */ DateTimeFormatOptions, 
      org.scalablytyped.std.Intl.DateTimeFormat
    ] {
  def apply(): org.scalablytyped.std.Intl.DateTimeFormat = js.native
  def apply(locale: String): org.scalablytyped.std.Intl.DateTimeFormat = js.native
  def apply(locale: String, options: DateTimeFormatOptions): org.scalablytyped.std.Intl.DateTimeFormat = js.native
  def apply(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): org.scalablytyped.std.Intl.DateTimeFormat = js.native
  def apply(locales: js.Array[String]): org.scalablytyped.std.Intl.DateTimeFormat = js.native
  def apply(locales: js.Array[String], options: DateTimeFormatOptions): org.scalablytyped.std.Intl.DateTimeFormat = js.native
  def supportedLocalesOf(locale: String): js.Array[String] = js.native
  def supportedLocalesOf(locale: String, options: DateTimeFormatOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: DateTimeFormatOptions): js.Array[String] = js.native
}


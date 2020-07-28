package org.scalablytyped.std.global.Intl

import org.scalablytyped.std.Intl.CollatorOptions
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.Collator")
@js.native
object Collator
  extends Instantiable0[org.scalablytyped.std.Intl.Collator]
     with Instantiable1[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      org.scalablytyped.std.Intl.Collator
    ]
     with Instantiable2[
      js.UndefOr[(/* locales */ js.Array[String]) | (/* locales */ String)], 
      /* options */ CollatorOptions, 
      org.scalablytyped.std.Intl.Collator
    ] {
  def apply(): org.scalablytyped.std.Intl.Collator = js.native
  def apply(locales: js.UndefOr[scala.Nothing], options: CollatorOptions): org.scalablytyped.std.Intl.Collator = js.native
  def apply(locales: String): org.scalablytyped.std.Intl.Collator = js.native
  def apply(locales: String, options: CollatorOptions): org.scalablytyped.std.Intl.Collator = js.native
  def apply(locales: js.Array[String]): org.scalablytyped.std.Intl.Collator = js.native
  def apply(locales: js.Array[String], options: CollatorOptions): org.scalablytyped.std.Intl.Collator = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: CollatorOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: CollatorOptions): js.Array[String] = js.native
}


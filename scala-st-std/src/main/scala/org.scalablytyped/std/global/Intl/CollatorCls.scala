package org.scalablytyped.std.global.Intl

import org.scalablytyped.std.Intl.CollatorOptions
import org.scalablytyped.std.Intl.ResolvedCollatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.Collator")
@js.native
class CollatorCls ()
  extends org.scalablytyped.std.Intl.Collator {
  def this(locale: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locale: String, options: CollatorOptions) = this()
  def this(locales: js.UndefOr[scala.Nothing], options: CollatorOptions) = this()
  def this(locales: js.Array[String], options: CollatorOptions) = this()
  /* CompleteClass */
  override def compare(x: String, y: String): Double = js.native
  /* CompleteClass */
  override def resolvedOptions(): ResolvedCollatorOptions = js.native
}


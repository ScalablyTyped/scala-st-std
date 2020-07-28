package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDecoder extends js.Object {
  val encoding: java.lang.String = js.native
  val fatal: scala.Boolean = js.native
  val ignoreBOM: scala.Boolean = js.native
  def decode(): java.lang.String = js.native
  def decode(input: js.UndefOr[scala.Nothing], options: TextDecodeOptions): java.lang.String = js.native
  def decode(input: ArrayBuffer): java.lang.String = js.native
  def decode(input: ArrayBuffer, options: TextDecodeOptions): java.lang.String = js.native
  def decode(input: DataView): java.lang.String = js.native
  def decode(input: DataView, options: TextDecodeOptions): java.lang.String = js.native
  def decode(input: Float32Array): java.lang.String = js.native
  def decode(input: Float32Array, options: TextDecodeOptions): java.lang.String = js.native
  def decode(input: Float64Array): java.lang.String = js.native
  def decode(input: Float64Array, options: TextDecodeOptions): java.lang.String = js.native
  def decode(input: Int16Array): java.lang.String = js.native
  def decode(input: Int16Array, options: TextDecodeOptions): java.lang.String = js.native
  def decode(input: Int32Array): java.lang.String = js.native
  def decode(input: Int32Array, options: TextDecodeOptions): java.lang.String = js.native
  def decode(input: Int8Array): java.lang.String = js.native
  def decode(input: Int8Array, options: TextDecodeOptions): java.lang.String = js.native
  def decode(input: Uint16Array): java.lang.String = js.native
  def decode(input: Uint16Array, options: TextDecodeOptions): java.lang.String = js.native
  def decode(input: Uint32Array): java.lang.String = js.native
  def decode(input: Uint32Array, options: TextDecodeOptions): java.lang.String = js.native
  def decode(input: Uint8Array): java.lang.String = js.native
  def decode(input: Uint8Array, options: TextDecodeOptions): java.lang.String = js.native
  def decode(input: Uint8ClampedArray): java.lang.String = js.native
  def decode(input: Uint8ClampedArray, options: TextDecodeOptions): java.lang.String = js.native
  def decode(input: Null, options: TextDecodeOptions): java.lang.String = js.native
}


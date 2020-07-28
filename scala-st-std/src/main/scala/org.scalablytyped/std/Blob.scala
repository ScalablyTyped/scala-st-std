package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Blob object represents a file-like object of immutable, raw data. Blobs represent data that isn't necessarily in a JavaScript-native format. The File interface is based on Blob, inheriting blob functionality and expanding it to support files on the user's system. */
@js.native
trait Blob
  extends ImageBitmapSource
     with _BlobPart
     with _BodyInit {
  val size: Double = js.native
  val `type`: java.lang.String = js.native
  def slice(): Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], contentType: java.lang.String): Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double, contentType: java.lang.String): Blob = js.native
  def slice(start: Double): Blob = js.native
  def slice(start: Double, end: js.UndefOr[scala.Nothing], contentType: java.lang.String): Blob = js.native
  def slice(start: Double, end: Double): Blob = js.native
  def slice(start: Double, end: Double, contentType: java.lang.String): Blob = js.native
}


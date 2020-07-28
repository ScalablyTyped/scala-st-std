package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blob extends js.Object {
  val size: Double = js.native
  val `type`: java.lang.String = js.native
  def msClose(): Unit = js.native
  def msDetachStream(): js.Any = js.native
  def slice(): Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], contentType: java.lang.String): Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double, contentType: java.lang.String): Blob = js.native
  def slice(start: Double): Blob = js.native
  def slice(start: Double, end: js.UndefOr[scala.Nothing], contentType: java.lang.String): Blob = js.native
  def slice(start: Double, end: Double): Blob = js.native
  def slice(start: Double, end: Double, contentType: java.lang.String): Blob = js.native
}


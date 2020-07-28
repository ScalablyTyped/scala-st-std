package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTransferItem extends js.Object {
  val kind: java.lang.String = js.native
  val `type`: java.lang.String = js.native
  def getAsFile(): File | Null = js.native
  def getAsString(): Unit = js.native
  def getAsString(_callback: FunctionStringCallback): Unit = js.native
}


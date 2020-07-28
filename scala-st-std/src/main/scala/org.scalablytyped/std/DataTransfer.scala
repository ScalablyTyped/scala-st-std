package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTransfer extends js.Object {
  var dropEffect: java.lang.String = js.native
  var effectAllowed: java.lang.String = js.native
  val files: FileList = js.native
  val items: DataTransferItemList = js.native
  val types: js.Array[java.lang.String] = js.native
  def clearData(): scala.Boolean = js.native
  def clearData(format: java.lang.String): scala.Boolean = js.native
  def getData(format: java.lang.String): java.lang.String = js.native
  def setData(format: java.lang.String, data: java.lang.String): scala.Boolean = js.native
}


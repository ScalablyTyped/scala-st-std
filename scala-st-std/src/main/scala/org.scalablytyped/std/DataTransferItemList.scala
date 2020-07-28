package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTransferItemList extends /* name */ NumberDictionary[DataTransferItem] {
  val length: Double = js.native
  def add(data: File): DataTransferItem | Null = js.native
  def add(data: java.lang.String, `type`: java.lang.String): DataTransferItem | Null = js.native
  def clear(): Unit = js.native
  def item(index: Double): DataTransferItem = js.native
  def remove(index: Double): Unit = js.native
}


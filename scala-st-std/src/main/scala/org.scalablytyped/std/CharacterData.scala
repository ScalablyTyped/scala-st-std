package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharacterData
  extends ChildNode
     with NonDocumentTypeChildNode {
  var data: java.lang.String = js.native
  val length: Double = js.native
  def appendData(data: java.lang.String): Unit = js.native
  def deleteData(offset: Double, count: Double): Unit = js.native
  def insertData(offset: Double, data: java.lang.String): Unit = js.native
  def replaceData(offset: Double, count: Double, data: java.lang.String): Unit = js.native
  def substringData(offset: Double, count: Double): java.lang.String = js.native
}


package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBFactory extends js.Object {
  def cmp(first: js.Any, second: js.Any): Double = js.native
  def deleteDatabase(name: java.lang.String): IDBOpenDBRequest = js.native
  def open(name: java.lang.String): IDBOpenDBRequest = js.native
  def open(name: java.lang.String, version: Double): IDBOpenDBRequest = js.native
}


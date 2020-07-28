package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History extends js.Object {
  val length: Double = js.native
  var scrollRestoration: ScrollRestoration = js.native
  val state: js.Any = js.native
  def back(): Unit = js.native
  def forward(): Unit = js.native
  def go(): Unit = js.native
  def go(delta: Double): Unit = js.native
  def pushState(data: js.Any, title: java.lang.String): Unit = js.native
  def pushState(data: js.Any, title: java.lang.String, url: java.lang.String): Unit = js.native
  def replaceState(data: js.Any, title: java.lang.String): Unit = js.native
  def replaceState(data: js.Any, title: java.lang.String, url: java.lang.String): Unit = js.native
}


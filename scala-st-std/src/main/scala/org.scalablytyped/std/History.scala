package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History extends js.Object {
  var length: Double = js.native
  var state: js.Any = js.native
  def back(): Unit = js.native
  def back(distance: js.Any): Unit = js.native
  def forward(): Unit = js.native
  def forward(distance: js.Any): Unit = js.native
  def go(): Unit = js.native
  def go(delta: js.Any): Unit = js.native
  def pushState(statedata: js.Any): Unit = js.native
  def pushState(statedata: js.Any, title: js.UndefOr[scala.Nothing], url: java.lang.String): Unit = js.native
  def pushState(statedata: js.Any, title: java.lang.String): Unit = js.native
  def pushState(statedata: js.Any, title: java.lang.String, url: java.lang.String): Unit = js.native
  def replaceState(statedata: js.Any): Unit = js.native
  def replaceState(statedata: js.Any, title: js.UndefOr[scala.Nothing], url: java.lang.String): Unit = js.native
  def replaceState(statedata: js.Any, title: java.lang.String): Unit = js.native
  def replaceState(statedata: js.Any, title: java.lang.String, url: java.lang.String): Unit = js.native
}


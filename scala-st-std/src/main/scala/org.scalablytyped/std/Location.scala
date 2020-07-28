package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  var hash: java.lang.String = js.native
  var host: java.lang.String = js.native
  var hostname: java.lang.String = js.native
  var href: java.lang.String = js.native
  var origin: java.lang.String = js.native
  var pathname: java.lang.String = js.native
  var port: java.lang.String = js.native
  var protocol: java.lang.String = js.native
  var search: java.lang.String = js.native
  def assign(url: java.lang.String): Unit = js.native
  def reload(): Unit = js.native
  def reload(forcedReload: scala.Boolean): Unit = js.native
  def replace(url: java.lang.String): Unit = js.native
}


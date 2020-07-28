package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomElementRegistry extends js.Object {
  def define(name: java.lang.String, constructor: js.Function): Unit = js.native
  def define(name: java.lang.String, constructor: js.Function, options: ElementDefinitionOptions): Unit = js.native
  def get(name: java.lang.String): js.Any = js.native
  def whenDefined(name: java.lang.String): js.Thenable[Unit] = js.native
}


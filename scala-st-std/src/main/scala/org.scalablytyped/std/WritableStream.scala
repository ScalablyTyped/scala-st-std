package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableStream[W] extends js.Object {
  val locked: scala.Boolean = js.native
  def abort(): js.Promise[Unit] = js.native
  def abort(reason: js.Any): js.Promise[Unit] = js.native
  def getWriter(): WritableStreamDefaultWriter[W] = js.native
}


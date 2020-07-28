package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableStreamDefaultWriter extends js.Object {
  val closed: js.Promise[Unit] = js.native
  val desiredSize: Double = js.native
  val ready: js.Promise[Unit] = js.native
  def abort(): js.Promise[Unit] = js.native
  def abort(reason: js.Any): js.Promise[Unit] = js.native
  def close(): js.Promise[Unit] = js.native
  def releaseLock(): Unit = js.native
  def write(): js.Promise[_] = js.native
  def write(chunk: js.Any): js.Promise[_] = js.native
}


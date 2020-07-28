package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowOrWorkerGlobalScope extends js.Object {
  val caches: CacheStorage = js.native
  val indexedDB: IDBFactory = js.native
  val performance: Performance = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
}


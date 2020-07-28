package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheStorage extends js.Object {
  def delete(cacheName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def has(cacheName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def keys(): js.Any = js.native
  def `match`(request: RequestInfo): js.Promise[_] = js.native
  def `match`(request: RequestInfo, options: CacheQueryOptions): js.Promise[_] = js.native
  def open(cacheName: java.lang.String): js.Promise[Cache] = js.native
}

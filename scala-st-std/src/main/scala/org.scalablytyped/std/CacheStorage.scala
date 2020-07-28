package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheStorage extends js.Object {
  def delete(cacheName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def has(cacheName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def keys(): js.Promise[js.Array[java.lang.String]] = js.native
  def `match`(request: Request): js.Promise[_] = js.native
  def `match`(request: Request, options: CacheQueryOptions): js.Promise[_] = js.native
  def `match`(request: java.lang.String): js.Promise[_] = js.native
  def `match`(request: java.lang.String, options: CacheQueryOptions): js.Promise[_] = js.native
  def open(cacheName: java.lang.String): js.Promise[Cache] = js.native
}


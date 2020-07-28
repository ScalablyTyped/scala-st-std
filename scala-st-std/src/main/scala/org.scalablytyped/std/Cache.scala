package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  def add(request: RequestInfo): js.Promise[Unit] = js.native
  def addAll(requests: js.Array[RequestInfo]): js.Promise[Unit] = js.native
  def delete(request: RequestInfo): js.Promise[scala.Boolean] = js.native
  def delete(request: RequestInfo, options: CacheQueryOptions): js.Promise[scala.Boolean] = js.native
  def keys(): js.Any = js.native
  def keys(request: js.UndefOr[RequestInfo], options: CacheQueryOptions): js.Any = js.native
  def keys(request: RequestInfo): js.Any = js.native
  def `match`(request: RequestInfo): js.Promise[Response] = js.native
  def `match`(request: RequestInfo, options: CacheQueryOptions): js.Promise[Response] = js.native
  def matchAll(): js.Any = js.native
  def matchAll(request: js.UndefOr[RequestInfo], options: CacheQueryOptions): js.Any = js.native
  def matchAll(request: RequestInfo): js.Any = js.native
  def put(request: RequestInfo, response: Response): js.Promise[Unit] = js.native
}


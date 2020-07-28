package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  def add(request: Request): js.Promise[Unit] = js.native
  def add(request: java.lang.String): js.Promise[Unit] = js.native
  def addAll(requests: js.Array[Request | java.lang.String]): js.Promise[Unit] = js.native
  def delete(request: Request): js.Promise[scala.Boolean] = js.native
  def delete(request: Request, options: CacheQueryOptions): js.Promise[scala.Boolean] = js.native
  def delete(request: java.lang.String): js.Promise[scala.Boolean] = js.native
  def delete(request: java.lang.String, options: CacheQueryOptions): js.Promise[scala.Boolean] = js.native
  def keys(): js.Promise[js.Array[Request]] = js.native
  def keys(request: js.UndefOr[scala.Nothing], options: CacheQueryOptions): js.Promise[js.Array[Request]] = js.native
  def keys(request: Request): js.Promise[js.Array[Request]] = js.native
  def keys(request: Request, options: CacheQueryOptions): js.Promise[js.Array[Request]] = js.native
  def keys(request: java.lang.String): js.Promise[js.Array[Request]] = js.native
  def keys(request: java.lang.String, options: CacheQueryOptions): js.Promise[js.Array[Request]] = js.native
  def `match`(request: Request): js.Promise[Response] = js.native
  def `match`(request: Request, options: CacheQueryOptions): js.Promise[Response] = js.native
  def `match`(request: java.lang.String): js.Promise[Response] = js.native
  def `match`(request: java.lang.String, options: CacheQueryOptions): js.Promise[Response] = js.native
  def matchAll(): js.Promise[js.Array[Response]] = js.native
  def matchAll(request: js.UndefOr[scala.Nothing], options: CacheQueryOptions): js.Promise[js.Array[Response]] = js.native
  def matchAll(request: Request): js.Promise[js.Array[Response]] = js.native
  def matchAll(request: Request, options: CacheQueryOptions): js.Promise[js.Array[Response]] = js.native
  def matchAll(request: java.lang.String): js.Promise[js.Array[Response]] = js.native
  def matchAll(request: java.lang.String, options: CacheQueryOptions): js.Promise[js.Array[Response]] = js.native
  def put(request: Request, response: Response): js.Promise[Unit] = js.native
  def put(request: java.lang.String, response: Response): js.Promise[Unit] = js.native
}


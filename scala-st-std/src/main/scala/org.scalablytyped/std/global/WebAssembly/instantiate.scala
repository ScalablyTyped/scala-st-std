package org.scalablytyped.std.global.WebAssembly

import org.scalablytyped.std.BufferSource
import org.scalablytyped.std.WebAssembly.WebAssemblyInstantiatedSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.instantiate")
@js.native
object instantiate extends js.Object {
  def apply(bytes: BufferSource): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def apply(bytes: BufferSource, importObject: js.Any): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def apply(moduleObject: org.scalablytyped.std.WebAssembly.Module): js.Promise[org.scalablytyped.std.WebAssembly.Instance] = js.native
  def apply(moduleObject: org.scalablytyped.std.WebAssembly.Module, importObject: js.Any): js.Promise[org.scalablytyped.std.WebAssembly.Instance] = js.native
}


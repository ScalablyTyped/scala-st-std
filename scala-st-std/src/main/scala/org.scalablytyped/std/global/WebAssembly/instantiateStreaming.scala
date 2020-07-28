package org.scalablytyped.std.global.WebAssembly

import org.scalablytyped.std.Response
import org.scalablytyped.std.WebAssembly.Imports
import org.scalablytyped.std.WebAssembly.WebAssemblyInstantiatedSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.instantiateStreaming")
@js.native
object instantiateStreaming extends js.Object {
  def apply(response: Response): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def apply(response: Response, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def apply(response: js.Thenable[Response]): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def apply(response: js.Thenable[Response], importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = js.native
}


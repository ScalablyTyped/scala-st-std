package org.scalablytyped.std.global.WebAssembly

import org.scalablytyped.std.ArrayBuffer
import org.scalablytyped.std.BufferSource
import org.scalablytyped.std.WebAssembly.ModuleExportDescriptor
import org.scalablytyped.std.WebAssembly.ModuleImportDescriptor
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.Module")
@js.native
object Module
  extends Instantiable1[/* bytes */ BufferSource, org.scalablytyped.std.WebAssembly.Module] {
  def customSections(moduleObject: org.scalablytyped.std.WebAssembly.Module, sectionName: String): js.Array[ArrayBuffer] = js.native
  def exports(moduleObject: org.scalablytyped.std.WebAssembly.Module): js.Array[ModuleExportDescriptor] = js.native
  def imports(moduleObject: org.scalablytyped.std.WebAssembly.Module): js.Array[ModuleImportDescriptor] = js.native
}


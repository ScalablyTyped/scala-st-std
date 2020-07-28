package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebAssembly {
  /* Rewritten from type alias, can be one of: 
    - js.Function
    - `org.scalablytyped`.std.WebAssembly.Global
    - `org.scalablytyped`.std.WebAssembly.Memory
    - `org.scalablytyped`.std.WebAssembly.Table
  */
  type ExportValue = org.scalablytyped.std.WebAssembly._ExportValue | js.Function
  type Exports = org.scalablytyped.std.Record[java.lang.String, org.scalablytyped.std.WebAssembly.ExportValue]
  type ImportValue = org.scalablytyped.std.WebAssembly.ExportValue | scala.Double
  type Imports = org.scalablytyped.std.Record[java.lang.String, org.scalablytyped.std.WebAssembly.ModuleImports]
  type ModuleImports = org.scalablytyped.std.Record[java.lang.String, org.scalablytyped.std.WebAssembly.ImportValue]
  type TableKind = org.scalablytyped.std.stdStrings.anyfunc
}

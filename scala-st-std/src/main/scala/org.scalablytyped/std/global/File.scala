package org.scalablytyped.std.global

import org.scalablytyped.std.ArrayBufferView
import org.scalablytyped.std.FilePropertyBag
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("File")
@js.native
class File protected ()
  extends org.scalablytyped.std.File {
  def this(
    parts: js.Array[
        org.scalablytyped.std.ArrayBuffer | ArrayBufferView | org.scalablytyped.std.Blob | java.lang.String
      ],
    filename: java.lang.String
  ) = this()
  def this(
    parts: js.Array[
        org.scalablytyped.std.ArrayBuffer | ArrayBufferView | org.scalablytyped.std.Blob | java.lang.String
      ],
    filename: java.lang.String,
    properties: FilePropertyBag
  ) = this()
}

@JSGlobal("File")
@js.native
object File
  extends Instantiable2[
      /* parts */ js.Array[
        org.scalablytyped.std.ArrayBuffer | ArrayBufferView | org.scalablytyped.std.Blob | java.lang.String
      ], 
      /* filename */ java.lang.String, 
      org.scalablytyped.std.File
    ]
     with Instantiable3[
      /* parts */ js.Array[
        org.scalablytyped.std.ArrayBuffer | ArrayBufferView | org.scalablytyped.std.Blob | java.lang.String
      ], 
      /* filename */ java.lang.String, 
      /* properties */ FilePropertyBag, 
      org.scalablytyped.std.File
    ]


package org.scalablytyped.std.global

import org.scalablytyped.std.BlobPart
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
  def this(fileBits: js.Array[BlobPart], fileName: java.lang.String) = this()
  def this(fileBits: js.Array[BlobPart], fileName: java.lang.String, options: FilePropertyBag) = this()
}

@JSGlobal("File")
@js.native
object File
  extends Instantiable2[
      /* fileBits */ js.Array[BlobPart], 
      /* fileName */ java.lang.String, 
      org.scalablytyped.std.File
    ]
     with Instantiable3[
      /* fileBits */ js.Array[BlobPart], 
      /* fileName */ java.lang.String, 
      /* options */ FilePropertyBag, 
      org.scalablytyped.std.File
    ]


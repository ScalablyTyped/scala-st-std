package org.scalablytyped.std.global

import org.scalablytyped.std.BlobPart
import org.scalablytyped.std.BlobPropertyBag
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Blob")
@js.native
class Blob ()
  extends org.scalablytyped.std.Blob {
  def this(blobParts: js.Array[BlobPart]) = this()
  def this(blobParts: js.UndefOr[scala.Nothing], options: BlobPropertyBag) = this()
  def this(blobParts: js.Array[BlobPart], options: BlobPropertyBag) = this()
}

@JSGlobal("Blob")
@js.native
object Blob
  extends Instantiable0[org.scalablytyped.std.Blob]
     with Instantiable1[/* blobParts */ js.Array[BlobPart], org.scalablytyped.std.Blob]
     with Instantiable2[
      js.UndefOr[/* blobParts */ js.Array[BlobPart]], 
      /* options */ BlobPropertyBag, 
      org.scalablytyped.std.Blob
    ]


package org.scalablytyped.std.global

import org.scalablytyped.std.QueuingStrategy
import org.scalablytyped.std.UnderlyingSink
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WritableStream")
@js.native
class WritableStream[W] ()
  extends org.scalablytyped.std.WritableStream[W] {
  def this(underlyingSink: UnderlyingSink[W]) = this()
  def this(underlyingSink: js.UndefOr[scala.Nothing], strategy: QueuingStrategy[W]) = this()
  def this(underlyingSink: UnderlyingSink[W], strategy: QueuingStrategy[W]) = this()
}

@JSGlobal("WritableStream")
@js.native
object WritableStream
  extends Instantiable0[org.scalablytyped.std.WritableStream[js.Object]]
     with Instantiable1[
      /* underlyingSink */ UnderlyingSink[js.Object], 
      org.scalablytyped.std.WritableStream[js.Object]
    ]
     with Instantiable2[
      js.UndefOr[/* underlyingSink */ UnderlyingSink[js.Object]], 
      /* strategy */ QueuingStrategy[js.Object], 
      org.scalablytyped.std.WritableStream[js.Object]
    ]


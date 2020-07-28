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
class WritableStream ()
  extends org.scalablytyped.std.WritableStream {
  def this(underlyingSink: UnderlyingSink) = this()
  def this(underlyingSink: js.UndefOr[scala.Nothing], strategy: QueuingStrategy) = this()
  def this(underlyingSink: UnderlyingSink, strategy: QueuingStrategy) = this()
}

@JSGlobal("WritableStream")
@js.native
object WritableStream
  extends Instantiable0[org.scalablytyped.std.WritableStream]
     with Instantiable1[/* underlyingSink */ UnderlyingSink, org.scalablytyped.std.WritableStream]
     with Instantiable2[
      js.UndefOr[/* underlyingSink */ UnderlyingSink], 
      /* strategy */ QueuingStrategy, 
      org.scalablytyped.std.WritableStream
    ]


package org.scalablytyped.std.global

import org.scalablytyped.std.QueuingStrategy
import org.scalablytyped.std.UnderlyingByteSource
import org.scalablytyped.std.UnderlyingSource
import org.scalablytyped.std.anon.Size
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ReadableStream")
@js.native
class ReadableStream[R] ()
  extends org.scalablytyped.std.ReadableStream[R] {
  def this(underlyingSource: UnderlyingSource[R]) = this()
  def this(underlyingSource: js.UndefOr[scala.Nothing], strategy: QueuingStrategy[R]) = this()
  def this(underlyingSource: UnderlyingSource[R], strategy: QueuingStrategy[R]) = this()
}

@JSGlobal("ReadableStream")
@js.native
object ReadableStream
  extends Instantiable0[org.scalablytyped.std.ReadableStream[js.Object]]
     with Instantiable1[
      (/* underlyingSource */ UnderlyingByteSource) | (/* underlyingSource */ UnderlyingSource[js.Object]), 
      org.scalablytyped.std.ReadableStream[js.Object | org.scalablytyped.std.Uint8Array]
    ]
     with Instantiable2[
      js.UndefOr[
        (/* underlyingSource */ UnderlyingByteSource) | (/* underlyingSource */ UnderlyingSource[js.Object])
      ], 
      (/* strategy */ QueuingStrategy[js.Object]) | (/* strategy */ Size), 
      org.scalablytyped.std.ReadableStream[js.Object | org.scalablytyped.std.Uint8Array]
    ]


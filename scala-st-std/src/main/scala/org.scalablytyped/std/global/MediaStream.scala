package org.scalablytyped.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaStream")
@js.native
class MediaStream ()
  extends org.scalablytyped.std.MediaStream {
  def this(streamOrTracks: org.scalablytyped.std.MediaStream) = this()
  def this(streamOrTracks: js.Array[org.scalablytyped.std.MediaStreamTrack]) = this()
}

@JSGlobal("MediaStream")
@js.native
object MediaStream
  extends Instantiable0[org.scalablytyped.std.MediaStream]
     with Instantiable1[
      (/* streamOrTracks */ js.Array[org.scalablytyped.std.MediaStreamTrack]) | (/* streamOrTracks */ org.scalablytyped.std.MediaStream), 
      org.scalablytyped.std.MediaStream
    ]


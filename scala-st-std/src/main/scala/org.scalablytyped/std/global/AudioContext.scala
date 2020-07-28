package org.scalablytyped.std.global

import org.scalablytyped.std.AudioContextOptions
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AudioContext")
@js.native
class AudioContext ()
  extends org.scalablytyped.std.AudioContext {
  def this(contextOptions: AudioContextOptions) = this()
}

@JSGlobal("AudioContext")
@js.native
object AudioContext
  extends Instantiable0[org.scalablytyped.std.AudioContext]
     with Instantiable1[/* contextOptions */ AudioContextOptions, org.scalablytyped.std.AudioContext]


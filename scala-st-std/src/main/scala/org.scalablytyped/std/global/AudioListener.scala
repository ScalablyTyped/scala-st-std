package org.scalablytyped.std.global

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AudioListener")
@js.native
class AudioListener ()
  extends org.scalablytyped.std.AudioListener {
  /* CompleteClass */
  override var dopplerFactor: Double = js.native
  /* CompleteClass */
  override var speedOfSound: Double = js.native
  /* CompleteClass */
  override def setOrientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double, zUp: Double): Unit = js.native
  /* CompleteClass */
  override def setPosition(x: Double, y: Double, z: Double): Unit = js.native
  /* CompleteClass */
  override def setVelocity(x: Double, y: Double, z: Double): Unit = js.native
}

@JSGlobal("AudioListener")
@js.native
object AudioListener
  extends Instantiable0[org.scalablytyped.std.AudioListener]


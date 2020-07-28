package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaSource extends EventTarget {
  val activeSourceBuffers: SourceBufferList = js.native
  var duration: Double = js.native
  val readyState: java.lang.String = js.native
  val sourceBuffers: SourceBufferList = js.native
  def addSourceBuffer(`type`: java.lang.String): SourceBuffer = js.native
  def endOfStream(): Unit = js.native
  def endOfStream(error: Double): Unit = js.native
  def removeSourceBuffer(sourceBuffer: SourceBuffer): Unit = js.native
}


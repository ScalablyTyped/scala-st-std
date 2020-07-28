package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceBuffer extends EventTarget {
  var appendWindowEnd: Double = js.native
  var appendWindowStart: Double = js.native
  val audioTracks: AudioTrackList = js.native
  val buffered: TimeRanges = js.native
  var mode: java.lang.String = js.native
  var timestampOffset: Double = js.native
  val updating: scala.Boolean = js.native
  val videoTracks: VideoTrackList = js.native
  def abort(): Unit = js.native
  def appendBuffer(data: ArrayBuffer): Unit = js.native
  def appendBuffer(data: ArrayBufferView): Unit = js.native
  def appendStream(stream: MSStream): Unit = js.native
  def appendStream(stream: MSStream, maxSize: Double): Unit = js.native
  def remove(start: Double, end: Double): Unit = js.native
}


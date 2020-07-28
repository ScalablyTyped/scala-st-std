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
  var mode: AppendMode = js.native
  var timestampOffset: Double = js.native
  val updating: scala.Boolean = js.native
  val videoTracks: VideoTrackList = js.native
  def abort(): Unit = js.native
  def appendBuffer(): Unit = js.native
  def appendBuffer(data: ArrayBuffer): Unit = js.native
  def appendBuffer(data: DataView): Unit = js.native
  def appendBuffer(data: Float32Array): Unit = js.native
  def appendBuffer(data: Float64Array): Unit = js.native
  def appendBuffer(data: Int16Array): Unit = js.native
  def appendBuffer(data: Int32Array): Unit = js.native
  def appendBuffer(data: Int8Array): Unit = js.native
  def appendBuffer(data: Uint16Array): Unit = js.native
  def appendBuffer(data: Uint32Array): Unit = js.native
  def appendBuffer(data: Uint8Array): Unit = js.native
  def appendBuffer(data: Uint8ClampedArray): Unit = js.native
  def appendStream(stream: MSStream): Unit = js.native
  def appendStream(stream: MSStream, maxSize: Double): Unit = js.native
  def remove(start: Double, end: Double): Unit = js.native
}


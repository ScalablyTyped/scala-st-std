package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.MSVideoFormatChanged
import org.scalablytyped.std.stdStrings.MSVideoFrameStepCompleted
import org.scalablytyped.std.stdStrings.MSVideoOptimalLayoutChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLVideoElement extends HTMLMediaElement {
  /**
    * Gets or sets the height of the video element.
    */
  var height: Double = js.native
  var msHorizontalMirror: scala.Boolean = js.native
  var msIsLayoutOptimalForPlayback: scala.Boolean = js.native
  var msIsStereo3D: scala.Boolean = js.native
  var msStereo3DPackingMode: java.lang.String = js.native
  var msStereo3DRenderMode: java.lang.String = js.native
  var msZoom: scala.Boolean = js.native
  /**
    * Gets or sets a URL of an image to display, for example, like a movie poster. This can be a still frame from the video, or another image if no video data is available.
    */
  var poster: java.lang.String = js.native
  /**
    * Gets the intrinsic height of a video in CSS pixels, or zero if the dimensions are not known.
    */
  var videoHeight: Double = js.native
  /**
    * Gets the intrinsic width of a video in CSS pixels, or zero if the dimensions are not known.
    */
  var videoWidth: Double = js.native
  var webkitDisplayingFullscreen: scala.Boolean = js.native
  var webkitSupportsFullscreen: scala.Boolean = js.native
  /**
    * Gets or sets the width of the video element.
    */
  var width: Double = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFormatChanged(`type`: MSVideoFormatChanged, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFormatChanged(`type`: MSVideoFormatChanged, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFrameStepCompleted(`type`: MSVideoFrameStepCompleted, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFrameStepCompleted(
    `type`: MSVideoFrameStepCompleted,
    listener: js.Function1[/* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoOptimalLayoutChanged(`type`: MSVideoOptimalLayoutChanged, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoOptimalLayoutChanged(
    `type`: MSVideoOptimalLayoutChanged,
    listener: js.Function1[/* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def getVideoPlaybackQuality(): VideoPlaybackQuality = js.native
  def msFrameStep(forward: scala.Boolean): Unit = js.native
  def msInsertVideoEffect(activatableClassId: java.lang.String, effectRequired: scala.Boolean): Unit = js.native
  def msInsertVideoEffect(activatableClassId: java.lang.String, effectRequired: scala.Boolean, config: js.Any): Unit = js.native
  def msSetVideoRectangle(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  def onMSVideoFormatChanged(ev: Event): js.Any = js.native
  def onMSVideoFrameStepCompleted(ev: Event): js.Any = js.native
  def onMSVideoOptimalLayoutChanged(ev: Event): js.Any = js.native
  def webkitEnterFullScreen(): Unit = js.native
  def webkitEnterFullscreen(): Unit = js.native
  def webkitExitFullScreen(): Unit = js.native
  def webkitExitFullscreen(): Unit = js.native
}


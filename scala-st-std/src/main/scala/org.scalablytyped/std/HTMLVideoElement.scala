package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties and methods for manipulating video objects. It also inherits properties and methods of HTMLMediaElement and HTMLElement. */
@js.native
trait HTMLVideoElement
  extends HTMLMediaElement
     with CanvasImageSource
     with TexImageSource {
  /**
    * Gets or sets the height of the video element.
    */
  var height: Double = js.native
  /**
    * Gets or sets a URL of an image to display, for example, like a movie poster. This can be a still frame from the video, or another image if no video data is available.
    */
  var poster: java.lang.String = js.native
  /**
    * Gets the intrinsic height of a video in CSS pixels, or zero if the dimensions are not known.
    */
  val videoHeight: Double = js.native
  /**
    * Gets the intrinsic width of a video in CSS pixels, or zero if the dimensions are not known.
    */
  val videoWidth: Double = js.native
  /**
    * Gets or sets the width of the video element.
    */
  var width: Double = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  def getVideoPlaybackQuality(): VideoPlaybackQuality = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
}


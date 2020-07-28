package org.scalablytyped.std.global

import org.scalablytyped.std.Keyframe
import org.scalablytyped.std.KeyframeEffectOptions
import org.scalablytyped.std.PropertyIndexedKeyframes
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("KeyframeEffect")
@js.native
class KeyframeEffect ()
  extends org.scalablytyped.std.KeyframeEffect {
  def this(source: org.scalablytyped.std.KeyframeEffect) = this()
  def this(target: org.scalablytyped.std.Element) = this()
  def this(target: org.scalablytyped.std.Element, keyframes: PropertyIndexedKeyframes) = this()
  def this(target: org.scalablytyped.std.Element, keyframes: js.Array[Keyframe]) = this()
  def this(target: Null, keyframes: PropertyIndexedKeyframes) = this()
  def this(target: Null, keyframes: js.Array[Keyframe]) = this()
  def this(
    target: org.scalablytyped.std.Element,
    keyframes: PropertyIndexedKeyframes,
    options: KeyframeEffectOptions
  ) = this()
  def this(target: org.scalablytyped.std.Element, keyframes: PropertyIndexedKeyframes, options: Double) = this()
  def this(
    target: org.scalablytyped.std.Element,
    keyframes: js.Array[Keyframe],
    options: KeyframeEffectOptions
  ) = this()
  def this(target: org.scalablytyped.std.Element, keyframes: js.Array[Keyframe], options: Double) = this()
  def this(target: org.scalablytyped.std.Element, keyframes: Null, options: KeyframeEffectOptions) = this()
  def this(target: org.scalablytyped.std.Element, keyframes: Null, options: Double) = this()
  def this(target: Null, keyframes: PropertyIndexedKeyframes, options: KeyframeEffectOptions) = this()
  def this(target: Null, keyframes: PropertyIndexedKeyframes, options: Double) = this()
  def this(target: Null, keyframes: js.Array[Keyframe], options: KeyframeEffectOptions) = this()
  def this(target: Null, keyframes: js.Array[Keyframe], options: Double) = this()
  def this(target: Null, keyframes: Null, options: KeyframeEffectOptions) = this()
  def this(target: Null, keyframes: Null, options: Double) = this()
}

@JSGlobal("KeyframeEffect")
@js.native
object KeyframeEffect
  extends Instantiable0[org.scalablytyped.std.KeyframeEffect]
     with Instantiable1[
      (/* target */ org.scalablytyped.std.Element) | (/* source */ org.scalablytyped.std.KeyframeEffect), 
      org.scalablytyped.std.KeyframeEffect
    ]
     with Instantiable2[
      (/* target */ org.scalablytyped.std.Element) | (/* target */ Null), 
      (/* keyframes */ js.Array[Keyframe]) | (/* keyframes */ PropertyIndexedKeyframes), 
      org.scalablytyped.std.KeyframeEffect
    ]
     with Instantiable3[
      (/* target */ org.scalablytyped.std.Element) | (/* target */ Null), 
      (/* keyframes */ js.Array[Keyframe]) | (/* keyframes */ Null) | (/* keyframes */ PropertyIndexedKeyframes), 
      (/* options */ Double) | (/* options */ KeyframeEffectOptions), 
      org.scalablytyped.std.KeyframeEffect
    ]


package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSCSSMatrix extends js.Object {
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var e: Double = js.native
  var f: Double = js.native
  var m11: Double = js.native
  var m12: Double = js.native
  var m13: Double = js.native
  var m14: Double = js.native
  var m21: Double = js.native
  var m22: Double = js.native
  var m23: Double = js.native
  var m24: Double = js.native
  var m31: Double = js.native
  var m32: Double = js.native
  var m33: Double = js.native
  var m34: Double = js.native
  var m41: Double = js.native
  var m42: Double = js.native
  var m43: Double = js.native
  var m44: Double = js.native
  def inverse(): MSCSSMatrix = js.native
  def multiply(secondMatrix: MSCSSMatrix): MSCSSMatrix = js.native
  def rotate(angleX: Double): MSCSSMatrix = js.native
  def rotate(angleX: Double, angleY: js.UndefOr[scala.Nothing], angleZ: Double): MSCSSMatrix = js.native
  def rotate(angleX: Double, angleY: Double): MSCSSMatrix = js.native
  def rotate(angleX: Double, angleY: Double, angleZ: Double): MSCSSMatrix = js.native
  def rotateAxisAngle(x: Double, y: Double, z: Double, angle: Double): MSCSSMatrix = js.native
  def scale(scaleX: Double): MSCSSMatrix = js.native
  def scale(scaleX: Double, scaleY: js.UndefOr[scala.Nothing], scaleZ: Double): MSCSSMatrix = js.native
  def scale(scaleX: Double, scaleY: Double): MSCSSMatrix = js.native
  def scale(scaleX: Double, scaleY: Double, scaleZ: Double): MSCSSMatrix = js.native
  def setMatrixValue(value: java.lang.String): Unit = js.native
  def skewX(angle: Double): MSCSSMatrix = js.native
  def skewY(angle: Double): MSCSSMatrix = js.native
  def translate(x: Double, y: Double): MSCSSMatrix = js.native
  def translate(x: Double, y: Double, z: Double): MSCSSMatrix = js.native
}


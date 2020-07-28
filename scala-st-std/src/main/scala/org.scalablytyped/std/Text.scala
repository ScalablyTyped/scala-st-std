package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text extends CharacterData {
  var wholeText: java.lang.String = js.native
  def replaceWholeText(content: java.lang.String): Text = js.native
  def splitText(offset: Double): Text = js.native
}


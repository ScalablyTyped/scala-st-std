package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSGroupingRule extends CSSRule {
  var cssRules: CSSRuleList = js.native
  def deleteRule(): Unit = js.native
  def deleteRule(index: Double): Unit = js.native
  def insertRule(rule: java.lang.String): Double = js.native
  def insertRule(rule: java.lang.String, index: Double): Double = js.native
}


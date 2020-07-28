package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSStyleSheet extends StyleSheet {
  val cssRules: CSSRuleList = js.native
  var cssText: java.lang.String = js.native
  val id: java.lang.String = js.native
  val imports: StyleSheetList = js.native
  val isAlternate: scala.Boolean = js.native
  val isPrefAlternate: scala.Boolean = js.native
  val ownerRule: CSSRule = js.native
  val owningElement: Element = js.native
  val pages: StyleSheetPageList = js.native
  val readOnly: scala.Boolean = js.native
  val rules: CSSRuleList = js.native
  def addImport(bstrURL: java.lang.String): Double = js.native
  def addImport(bstrURL: java.lang.String, lIndex: Double): Double = js.native
  def addPageRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String): Double = js.native
  def addPageRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String, lIndex: Double): Double = js.native
  def addRule(bstrSelector: java.lang.String): Double = js.native
  def addRule(bstrSelector: java.lang.String, bstrStyle: js.UndefOr[scala.Nothing], lIndex: Double): Double = js.native
  def addRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String): Double = js.native
  def addRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String, lIndex: Double): Double = js.native
  def deleteRule(): Unit = js.native
  def deleteRule(index: Double): Unit = js.native
  def insertRule(rule: java.lang.String): Double = js.native
  def insertRule(rule: java.lang.String, index: Double): Double = js.native
  def removeImport(lIndex: Double): Unit = js.native
  def removeRule(lIndex: Double): Unit = js.native
}


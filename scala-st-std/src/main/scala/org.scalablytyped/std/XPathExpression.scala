package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An XPathExpression is a compiled XPath query returned from document.createExpression(). It has a method evaluate() which can be used to execute the compiled XPath. */
@js.native
trait XPathExpression extends js.Object {
  def evaluate(contextNode: Node, `type`: Double): XPathResult = js.native
  def evaluate(contextNode: Node, `type`: Double, result: XPathResult): XPathResult = js.native
}


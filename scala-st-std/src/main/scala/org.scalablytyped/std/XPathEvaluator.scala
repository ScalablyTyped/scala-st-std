package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XPathEvaluator extends js.Object {
  def createExpression(expression: java.lang.String, resolver: XPathNSResolver): XPathExpression = js.native
  def createNSResolver(): XPathNSResolver = js.native
  def createNSResolver(nodeResolver: Node): XPathNSResolver = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: XPathNSResolver, `type`: Double): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: XPathNSResolver,
    `type`: Double,
    result: XPathResult
  ): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: js.Function1[/* prefix */ java.lang.String, java.lang.String | Null],
    `type`: Double
  ): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: js.Function1[/* prefix */ java.lang.String, java.lang.String | Null],
    `type`: Double,
    result: XPathResult
  ): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: Null, `type`: Double): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: Null,
    `type`: Double,
    result: XPathResult
  ): XPathResult = js.native
}


package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XPathExpression extends js.Object {
  def evaluate(contextNode: Node, `type`: Double, result: XPathResult): XPathExpression
}

object XPathExpression {
  @scala.inline
  def apply(evaluate: (Node, Double, XPathResult) => XPathExpression): XPathExpression = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction3(evaluate))
    __obj.asInstanceOf[XPathExpression]
  }
  @scala.inline
  implicit class XPathExpressionOps[Self <: XPathExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvaluate(value: (Node, Double, XPathResult) => XPathExpression): Self = this.set("evaluate", js.Any.fromFunction3(value))
  }
  
}


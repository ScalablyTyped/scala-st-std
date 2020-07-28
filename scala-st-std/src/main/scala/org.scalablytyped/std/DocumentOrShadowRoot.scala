package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentOrShadowRoot extends js.Object {
  val activeElement: Element | Null
  val styleSheets: StyleSheetList
  def elementFromPoint(x: Double, y: Double): Element | Null
  def elementsFromPoint(x: Double, y: Double): js.Array[Element]
  def getSelection(): Selection | Null
}

object DocumentOrShadowRoot {
  @scala.inline
  def apply(
    elementFromPoint: (Double, Double) => Element | Null,
    elementsFromPoint: (Double, Double) => js.Array[Element],
    getSelection: () => Selection | Null,
    styleSheets: StyleSheetList
  ): DocumentOrShadowRoot = {
    val __obj = js.Dynamic.literal(elementFromPoint = js.Any.fromFunction2(elementFromPoint), elementsFromPoint = js.Any.fromFunction2(elementsFromPoint), getSelection = js.Any.fromFunction0(getSelection), styleSheets = styleSheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOrShadowRoot]
  }
  @scala.inline
  implicit class DocumentOrShadowRootOps[Self <: DocumentOrShadowRoot] (val x: Self) extends AnyVal {
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
    def setElementFromPoint(value: (Double, Double) => Element | Null): Self = this.set("elementFromPoint", js.Any.fromFunction2(value))
    @scala.inline
    def setElementsFromPoint(value: (Double, Double) => js.Array[Element]): Self = this.set("elementsFromPoint", js.Any.fromFunction2(value))
    @scala.inline
    def setGetSelection(value: () => Selection | Null): Self = this.set("getSelection", js.Any.fromFunction0(value))
    @scala.inline
    def setStyleSheets(value: StyleSheetList): Self = this.set("styleSheets", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveElement(value: Element): Self = this.set("activeElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveElementNull: Self = this.set("activeElement", null)
  }
  
}


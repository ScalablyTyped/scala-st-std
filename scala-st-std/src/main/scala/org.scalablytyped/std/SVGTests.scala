package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGTests extends js.Object {
  val requiredExtensions: SVGStringList
  /** @deprecated */
  val requiredFeatures: SVGStringList
  val systemLanguage: SVGStringList
  /** @deprecated */
  def hasExtension(extension: java.lang.String): scala.Boolean
}

object SVGTests {
  @scala.inline
  def apply(
    hasExtension: java.lang.String => scala.Boolean,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    systemLanguage: SVGStringList
  ): SVGTests = {
    val __obj = js.Dynamic.literal(hasExtension = js.Any.fromFunction1(hasExtension), requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTests]
  }
  @scala.inline
  implicit class SVGTestsOps[Self <: SVGTests] (val x: Self) extends AnyVal {
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
    def setHasExtension(value: java.lang.String => scala.Boolean): Self = this.set("hasExtension", js.Any.fromFunction1(value))
    @scala.inline
    def setRequiredExtensions(value: SVGStringList): Self = this.set("requiredExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredFeatures(value: SVGStringList): Self = this.set("requiredFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemLanguage(value: SVGStringList): Self = this.set("systemLanguage", value.asInstanceOf[js.Any])
  }
  
}


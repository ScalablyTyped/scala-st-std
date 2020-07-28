package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XPathNSResolver extends js.Object {
  def lookupNamespaceURI(prefix: java.lang.String): java.lang.String
}

object XPathNSResolver {
  @scala.inline
  def apply(lookupNamespaceURI: java.lang.String => java.lang.String): XPathNSResolver = {
    val __obj = js.Dynamic.literal(lookupNamespaceURI = js.Any.fromFunction1(lookupNamespaceURI))
    __obj.asInstanceOf[XPathNSResolver]
  }
  @scala.inline
  implicit class XPathNSResolverOps[Self <: XPathNSResolver] (val x: Self) extends AnyVal {
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
    def setLookupNamespaceURI(value: java.lang.String => java.lang.String): Self = this.set("lookupNamespaceURI", js.Any.fromFunction1(value))
  }
  
}


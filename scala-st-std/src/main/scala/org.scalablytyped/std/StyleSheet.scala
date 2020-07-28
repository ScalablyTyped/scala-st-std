package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheet extends js.Object {
  var disabled: scala.Boolean
  val href: java.lang.String | Null
  val media: MediaList
  val ownerNode: Node
  val parentStyleSheet: StyleSheet | Null
  val title: java.lang.String | Null
  val `type`: java.lang.String
}

object StyleSheet {
  @scala.inline
  def apply(disabled: scala.Boolean, media: MediaList, ownerNode: Node, `type`: java.lang.String): StyleSheet = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], ownerNode = ownerNode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheet]
  }
  @scala.inline
  implicit class StyleSheetOps[Self <: StyleSheet] (val x: Self) extends AnyVal {
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
    def setDisabled(value: scala.Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedia(value: MediaList): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerNode(value: Node): Self = this.set("ownerNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setHref(value: java.lang.String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setHrefNull: Self = this.set("href", null)
    @scala.inline
    def setParentStyleSheet(value: StyleSheet): Self = this.set("parentStyleSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentStyleSheetNull: Self = this.set("parentStyleSheet", null)
    @scala.inline
    def setTitle(value: java.lang.String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
  }
  
}


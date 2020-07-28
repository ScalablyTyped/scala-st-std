package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends /* index */ NumberDictionary[MimeType] {
  val description: java.lang.String
  val filename: java.lang.String
  val length: Double
  val name: java.lang.String
  val version: java.lang.String
  def item(index: Double): MimeType
  def namedItem(`type`: java.lang.String): MimeType
}

object Plugin {
  @scala.inline
  def apply(
    description: java.lang.String,
    filename: java.lang.String,
    item: Double => MimeType,
    length: Double,
    name: java.lang.String,
    namedItem: java.lang.String => MimeType,
    version: java.lang.String
  ): Plugin = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namedItem = js.Any.fromFunction1(namedItem), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
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
    def setDescription(value: java.lang.String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: java.lang.String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => MimeType): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamedItem(value: java.lang.String => MimeType): Self = this.set("namedItem", js.Any.fromFunction1(value))
    @scala.inline
    def setVersion(value: java.lang.String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}


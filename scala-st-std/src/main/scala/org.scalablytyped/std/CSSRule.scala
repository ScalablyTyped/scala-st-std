package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single CSS rule. There are several types of rules, listed in the Type constants section below. */
trait CSSRule extends js.Object {
  val CHARSET_RULE: Double
  val FONT_FACE_RULE: Double
  val IMPORT_RULE: Double
  val KEYFRAMES_RULE: Double
  val KEYFRAME_RULE: Double
  val MEDIA_RULE: Double
  val NAMESPACE_RULE: Double
  val PAGE_RULE: Double
  val STYLE_RULE: Double
  val SUPPORTS_RULE: Double
  val UNKNOWN_RULE: Double
  val VIEWPORT_RULE: Double
  var cssText: java.lang.String
  val parentRule: CSSRule | Null
  val parentStyleSheet: CSSStyleSheet | Null
  val `type`: Double
}

object CSSRule {
  @scala.inline
  def apply(
    CHARSET_RULE: Double,
    FONT_FACE_RULE: Double,
    IMPORT_RULE: Double,
    KEYFRAMES_RULE: Double,
    KEYFRAME_RULE: Double,
    MEDIA_RULE: Double,
    NAMESPACE_RULE: Double,
    PAGE_RULE: Double,
    STYLE_RULE: Double,
    SUPPORTS_RULE: Double,
    UNKNOWN_RULE: Double,
    VIEWPORT_RULE: Double,
    cssText: java.lang.String,
    `type`: Double
  ): CSSRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = CHARSET_RULE.asInstanceOf[js.Any], FONT_FACE_RULE = FONT_FACE_RULE.asInstanceOf[js.Any], IMPORT_RULE = IMPORT_RULE.asInstanceOf[js.Any], KEYFRAMES_RULE = KEYFRAMES_RULE.asInstanceOf[js.Any], KEYFRAME_RULE = KEYFRAME_RULE.asInstanceOf[js.Any], MEDIA_RULE = MEDIA_RULE.asInstanceOf[js.Any], NAMESPACE_RULE = NAMESPACE_RULE.asInstanceOf[js.Any], PAGE_RULE = PAGE_RULE.asInstanceOf[js.Any], STYLE_RULE = STYLE_RULE.asInstanceOf[js.Any], SUPPORTS_RULE = SUPPORTS_RULE.asInstanceOf[js.Any], UNKNOWN_RULE = UNKNOWN_RULE.asInstanceOf[js.Any], VIEWPORT_RULE = VIEWPORT_RULE.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSRule]
  }
  @scala.inline
  implicit class CSSRuleOps[Self <: CSSRule] (val x: Self) extends AnyVal {
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
    def setCHARSET_RULE(value: Double): Self = this.set("CHARSET_RULE", value.asInstanceOf[js.Any])
    @scala.inline
    def setFONT_FACE_RULE(value: Double): Self = this.set("FONT_FACE_RULE", value.asInstanceOf[js.Any])
    @scala.inline
    def setIMPORT_RULE(value: Double): Self = this.set("IMPORT_RULE", value.asInstanceOf[js.Any])
    @scala.inline
    def setKEYFRAMES_RULE(value: Double): Self = this.set("KEYFRAMES_RULE", value.asInstanceOf[js.Any])
    @scala.inline
    def setKEYFRAME_RULE(value: Double): Self = this.set("KEYFRAME_RULE", value.asInstanceOf[js.Any])
    @scala.inline
    def setMEDIA_RULE(value: Double): Self = this.set("MEDIA_RULE", value.asInstanceOf[js.Any])
    @scala.inline
    def setNAMESPACE_RULE(value: Double): Self = this.set("NAMESPACE_RULE", value.asInstanceOf[js.Any])
    @scala.inline
    def setPAGE_RULE(value: Double): Self = this.set("PAGE_RULE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTYLE_RULE(value: Double): Self = this.set("STYLE_RULE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSUPPORTS_RULE(value: Double): Self = this.set("SUPPORTS_RULE", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNKNOWN_RULE(value: Double): Self = this.set("UNKNOWN_RULE", value.asInstanceOf[js.Any])
    @scala.inline
    def setVIEWPORT_RULE(value: Double): Self = this.set("VIEWPORT_RULE", value.asInstanceOf[js.Any])
    @scala.inline
    def setCssText(value: java.lang.String): Self = this.set("cssText", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentRule(value: CSSRule): Self = this.set("parentRule", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentRuleNull: Self = this.set("parentRule", null)
    @scala.inline
    def setParentStyleSheet(value: CSSStyleSheet): Self = this.set("parentStyleSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentStyleSheetNull: Self = this.set("parentStyleSheet", null)
  }
  
}


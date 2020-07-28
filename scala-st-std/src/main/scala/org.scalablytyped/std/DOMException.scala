package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMException extends js.Object {
  val ABORT_ERR: Double
  val DATA_CLONE_ERR: Double
  val DOMSTRING_SIZE_ERR: Double
  val HIERARCHY_REQUEST_ERR: Double
  val INDEX_SIZE_ERR: Double
  val INUSE_ATTRIBUTE_ERR: Double
  val INVALID_ACCESS_ERR: Double
  val INVALID_CHARACTER_ERR: Double
  val INVALID_MODIFICATION_ERR: Double
  val INVALID_NODE_TYPE_ERR: Double
  val INVALID_STATE_ERR: Double
  val NAMESPACE_ERR: Double
  val NETWORK_ERR: Double
  val NOT_FOUND_ERR: Double
  val NOT_SUPPORTED_ERR: Double
  val NO_DATA_ALLOWED_ERR: Double
  val NO_MODIFICATION_ALLOWED_ERR: Double
  val PARSE_ERR: Double
  val QUOTA_EXCEEDED_ERR: Double
  val SECURITY_ERR: Double
  val SERIALIZE_ERR: Double
  val SYNTAX_ERR: Double
  val TIMEOUT_ERR: Double
  val TYPE_MISMATCH_ERR: Double
  val URL_MISMATCH_ERR: Double
  val VALIDATION_ERR: Double
  val WRONG_DOCUMENT_ERR: Double
  val code: Double
  val message: java.lang.String
  val name: java.lang.String
}

object DOMException {
  @scala.inline
  def apply(
    ABORT_ERR: Double,
    DATA_CLONE_ERR: Double,
    DOMSTRING_SIZE_ERR: Double,
    HIERARCHY_REQUEST_ERR: Double,
    INDEX_SIZE_ERR: Double,
    INUSE_ATTRIBUTE_ERR: Double,
    INVALID_ACCESS_ERR: Double,
    INVALID_CHARACTER_ERR: Double,
    INVALID_MODIFICATION_ERR: Double,
    INVALID_NODE_TYPE_ERR: Double,
    INVALID_STATE_ERR: Double,
    NAMESPACE_ERR: Double,
    NETWORK_ERR: Double,
    NOT_FOUND_ERR: Double,
    NOT_SUPPORTED_ERR: Double,
    NO_DATA_ALLOWED_ERR: Double,
    NO_MODIFICATION_ALLOWED_ERR: Double,
    PARSE_ERR: Double,
    QUOTA_EXCEEDED_ERR: Double,
    SECURITY_ERR: Double,
    SERIALIZE_ERR: Double,
    SYNTAX_ERR: Double,
    TIMEOUT_ERR: Double,
    TYPE_MISMATCH_ERR: Double,
    URL_MISMATCH_ERR: Double,
    VALIDATION_ERR: Double,
    WRONG_DOCUMENT_ERR: Double,
    code: Double,
    message: java.lang.String,
    name: java.lang.String
  ): DOMException = {
    val __obj = js.Dynamic.literal(ABORT_ERR = ABORT_ERR.asInstanceOf[js.Any], DATA_CLONE_ERR = DATA_CLONE_ERR.asInstanceOf[js.Any], DOMSTRING_SIZE_ERR = DOMSTRING_SIZE_ERR.asInstanceOf[js.Any], HIERARCHY_REQUEST_ERR = HIERARCHY_REQUEST_ERR.asInstanceOf[js.Any], INDEX_SIZE_ERR = INDEX_SIZE_ERR.asInstanceOf[js.Any], INUSE_ATTRIBUTE_ERR = INUSE_ATTRIBUTE_ERR.asInstanceOf[js.Any], INVALID_ACCESS_ERR = INVALID_ACCESS_ERR.asInstanceOf[js.Any], INVALID_CHARACTER_ERR = INVALID_CHARACTER_ERR.asInstanceOf[js.Any], INVALID_MODIFICATION_ERR = INVALID_MODIFICATION_ERR.asInstanceOf[js.Any], INVALID_NODE_TYPE_ERR = INVALID_NODE_TYPE_ERR.asInstanceOf[js.Any], INVALID_STATE_ERR = INVALID_STATE_ERR.asInstanceOf[js.Any], NAMESPACE_ERR = NAMESPACE_ERR.asInstanceOf[js.Any], NETWORK_ERR = NETWORK_ERR.asInstanceOf[js.Any], NOT_FOUND_ERR = NOT_FOUND_ERR.asInstanceOf[js.Any], NOT_SUPPORTED_ERR = NOT_SUPPORTED_ERR.asInstanceOf[js.Any], NO_DATA_ALLOWED_ERR = NO_DATA_ALLOWED_ERR.asInstanceOf[js.Any], NO_MODIFICATION_ALLOWED_ERR = NO_MODIFICATION_ALLOWED_ERR.asInstanceOf[js.Any], PARSE_ERR = PARSE_ERR.asInstanceOf[js.Any], QUOTA_EXCEEDED_ERR = QUOTA_EXCEEDED_ERR.asInstanceOf[js.Any], SECURITY_ERR = SECURITY_ERR.asInstanceOf[js.Any], SERIALIZE_ERR = SERIALIZE_ERR.asInstanceOf[js.Any], SYNTAX_ERR = SYNTAX_ERR.asInstanceOf[js.Any], TIMEOUT_ERR = TIMEOUT_ERR.asInstanceOf[js.Any], TYPE_MISMATCH_ERR = TYPE_MISMATCH_ERR.asInstanceOf[js.Any], URL_MISMATCH_ERR = URL_MISMATCH_ERR.asInstanceOf[js.Any], VALIDATION_ERR = VALIDATION_ERR.asInstanceOf[js.Any], WRONG_DOCUMENT_ERR = WRONG_DOCUMENT_ERR.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMException]
  }
  @scala.inline
  implicit class DOMExceptionOps[Self <: DOMException] (val x: Self) extends AnyVal {
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
    def setABORT_ERR(value: Double): Self = this.set("ABORT_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setDATA_CLONE_ERR(value: Double): Self = this.set("DATA_CLONE_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMSTRING_SIZE_ERR(value: Double): Self = this.set("DOMSTRING_SIZE_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setHIERARCHY_REQUEST_ERR(value: Double): Self = this.set("HIERARCHY_REQUEST_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setINDEX_SIZE_ERR(value: Double): Self = this.set("INDEX_SIZE_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setINUSE_ATTRIBUTE_ERR(value: Double): Self = this.set("INUSE_ATTRIBUTE_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setINVALID_ACCESS_ERR(value: Double): Self = this.set("INVALID_ACCESS_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setINVALID_CHARACTER_ERR(value: Double): Self = this.set("INVALID_CHARACTER_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setINVALID_MODIFICATION_ERR(value: Double): Self = this.set("INVALID_MODIFICATION_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setINVALID_NODE_TYPE_ERR(value: Double): Self = this.set("INVALID_NODE_TYPE_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setINVALID_STATE_ERR(value: Double): Self = this.set("INVALID_STATE_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setNAMESPACE_ERR(value: Double): Self = this.set("NAMESPACE_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setNETWORK_ERR(value: Double): Self = this.set("NETWORK_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOT_FOUND_ERR(value: Double): Self = this.set("NOT_FOUND_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOT_SUPPORTED_ERR(value: Double): Self = this.set("NOT_SUPPORTED_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setNO_DATA_ALLOWED_ERR(value: Double): Self = this.set("NO_DATA_ALLOWED_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setNO_MODIFICATION_ALLOWED_ERR(value: Double): Self = this.set("NO_MODIFICATION_ALLOWED_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setPARSE_ERR(value: Double): Self = this.set("PARSE_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setQUOTA_EXCEEDED_ERR(value: Double): Self = this.set("QUOTA_EXCEEDED_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setSECURITY_ERR(value: Double): Self = this.set("SECURITY_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setSERIALIZE_ERR(value: Double): Self = this.set("SERIALIZE_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setSYNTAX_ERR(value: Double): Self = this.set("SYNTAX_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setTIMEOUT_ERR(value: Double): Self = this.set("TIMEOUT_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setTYPE_MISMATCH_ERR(value: Double): Self = this.set("TYPE_MISMATCH_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setURL_MISMATCH_ERR(value: Double): Self = this.set("URL_MISMATCH_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setVALIDATION_ERR(value: Double): Self = this.set("VALIDATION_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setWRONG_DOCUMENT_ERR(value: Double): Self = this.set("WRONG_DOCUMENT_ERR", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: java.lang.String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}


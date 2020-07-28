package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSCredentialFilter extends js.Object {
  var accept: js.UndefOr[js.Array[MSCredentialSpec]] = js.undefined
}

object MSCredentialFilter {
  @scala.inline
  def apply(): MSCredentialFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSCredentialFilter]
  }
  @scala.inline
  implicit class MSCredentialFilterOps[Self <: MSCredentialFilter] (val x: Self) extends AnyVal {
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
    def setAcceptVarargs(value: MSCredentialSpec*): Self = this.set("accept", js.Array(value :_*))
    @scala.inline
    def setAccept(value: js.Array[MSCredentialSpec]): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
  }
  
}


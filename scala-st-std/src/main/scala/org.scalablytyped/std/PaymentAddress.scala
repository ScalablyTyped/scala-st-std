package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentAddress extends js.Object {
  val addressLine: js.Array[java.lang.String]
  val city: java.lang.String
  val country: java.lang.String
  val dependentLocality: java.lang.String
  val languageCode: java.lang.String
  val organization: java.lang.String
  val phone: java.lang.String
  val postalCode: java.lang.String
  val recipient: java.lang.String
  val region: java.lang.String
  val sortingCode: java.lang.String
  def toJSON(): js.Any
}

object PaymentAddress {
  @scala.inline
  def apply(
    addressLine: js.Array[java.lang.String],
    city: java.lang.String,
    country: java.lang.String,
    dependentLocality: java.lang.String,
    languageCode: java.lang.String,
    organization: java.lang.String,
    phone: java.lang.String,
    postalCode: java.lang.String,
    recipient: java.lang.String,
    region: java.lang.String,
    sortingCode: java.lang.String,
    toJSON: () => js.Any
  ): PaymentAddress = {
    val __obj = js.Dynamic.literal(addressLine = addressLine.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], dependentLocality = dependentLocality.asInstanceOf[js.Any], languageCode = languageCode.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], sortingCode = sortingCode.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[PaymentAddress]
  }
  @scala.inline
  implicit class PaymentAddressOps[Self <: PaymentAddress] (val x: Self) extends AnyVal {
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
    def setAddressLineVarargs(value: java.lang.String*): Self = this.set("addressLine", js.Array(value :_*))
    @scala.inline
    def setAddressLine(value: js.Array[java.lang.String]): Self = this.set("addressLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setCity(value: java.lang.String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: java.lang.String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependentLocality(value: java.lang.String): Self = this.set("dependentLocality", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguageCode(value: java.lang.String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganization(value: java.lang.String): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhone(value: java.lang.String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostalCode(value: java.lang.String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipient(value: java.lang.String): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: java.lang.String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortingCode(value: java.lang.String): Self = this.set("sortingCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}


package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DhKeyAlgorithm extends KeyAlgorithm {
  var generator: Uint8Array
  var prime: Uint8Array
}

object DhKeyAlgorithm {
  @scala.inline
  def apply(generator: Uint8Array, prime: Uint8Array): DhKeyAlgorithm = {
    val __obj = js.Dynamic.literal(generator = generator.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DhKeyAlgorithm]
  }
  @scala.inline
  implicit class DhKeyAlgorithmOps[Self <: DhKeyAlgorithm] (val x: Self) extends AnyVal {
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
    def setGenerator(value: Uint8Array): Self = this.set("generator", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrime(value: Uint8Array): Self = this.set("prime", value.asInstanceOf[js.Any])
  }
  
}


package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pbkdf2Params extends Algorithm {
  var hash: AlgorithmIdentifier
  var iterations: Double
  var salt: BufferSource
}

object Pbkdf2Params {
  @scala.inline
  def apply(hash: AlgorithmIdentifier, iterations: Double, name: java.lang.String, salt: BufferSource): Pbkdf2Params = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pbkdf2Params]
  }
  @scala.inline
  implicit class Pbkdf2ParamsOps[Self <: Pbkdf2Params] (val x: Self) extends AnyVal {
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
    def setHash(value: AlgorithmIdentifier): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def setSalt(value: BufferSource): Self = this.set("salt", value.asInstanceOf[js.Any])
  }
  
}


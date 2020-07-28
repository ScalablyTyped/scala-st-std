package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubtleCrypto extends js.Object {
  def decrypt(algorithm: Algorithm, key: CryptoKey, data: ArrayBufferView): js.Any = js.native
  def decrypt(algorithm: java.lang.String, key: CryptoKey, data: ArrayBufferView): js.Any = js.native
  def deriveBits(algorithm: Algorithm, baseKey: CryptoKey, length: Double): js.Any = js.native
  def deriveBits(algorithm: java.lang.String, baseKey: CryptoKey, length: Double): js.Any = js.native
  def deriveKey(
    algorithm: Algorithm,
    baseKey: CryptoKey,
    derivedKeyType: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Any = js.native
  def deriveKey(
    algorithm: Algorithm,
    baseKey: CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Any = js.native
  def deriveKey(
    algorithm: java.lang.String,
    baseKey: CryptoKey,
    derivedKeyType: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Any = js.native
  def deriveKey(
    algorithm: java.lang.String,
    baseKey: CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Any = js.native
  def digest(algorithm: Algorithm, data: ArrayBufferView): js.Any = js.native
  def digest(algorithm: java.lang.String, data: ArrayBufferView): js.Any = js.native
  def encrypt(algorithm: Algorithm, key: CryptoKey, data: ArrayBufferView): js.Any = js.native
  def encrypt(algorithm: java.lang.String, key: CryptoKey, data: ArrayBufferView): js.Any = js.native
  def exportKey(format: java.lang.String, key: CryptoKey): js.Any = js.native
  def generateKey(algorithm: Algorithm, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): js.Any = js.native
  def generateKey(algorithm: java.lang.String, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): js.Any = js.native
  def importKey(
    format: java.lang.String,
    keyData: ArrayBufferView,
    algorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Any = js.native
  def importKey(
    format: java.lang.String,
    keyData: ArrayBufferView,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Any = js.native
  def sign(algorithm: Algorithm, key: CryptoKey, data: ArrayBufferView): js.Any = js.native
  def sign(algorithm: java.lang.String, key: CryptoKey, data: ArrayBufferView): js.Any = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: ArrayBufferView,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Any = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: ArrayBufferView,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Any = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: ArrayBufferView,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Any = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: ArrayBufferView,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Any = js.native
  def verify(algorithm: Algorithm, key: CryptoKey, signature: ArrayBufferView, data: ArrayBufferView): js.Any = js.native
  def verify(algorithm: java.lang.String, key: CryptoKey, signature: ArrayBufferView, data: ArrayBufferView): js.Any = js.native
  def wrapKey(format: java.lang.String, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: Algorithm): js.Any = js.native
  def wrapKey(format: java.lang.String, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: java.lang.String): js.Any = js.native
}


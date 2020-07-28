package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.jwk
import org.scalablytyped.std.stdStrings.pkcs8
import org.scalablytyped.std.stdStrings.raw
import org.scalablytyped.std.stdStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubtleCrypto extends js.Object {
  def decrypt(algorithm: AesCbcParams, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def decrypt(algorithm: AesCfbParams, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def decrypt(algorithm: AesCmacParams, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def decrypt(algorithm: AesCtrParams, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def decrypt(algorithm: AesGcmParams, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def decrypt(algorithm: RsaOaepParams, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def decrypt(algorithm: java.lang.String, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def deriveBits(algorithm: ConcatParams, baseKey: CryptoKey, length: Double): js.Thenable[ArrayBuffer] = js.native
  def deriveBits(algorithm: DhKeyDeriveParams, baseKey: CryptoKey, length: Double): js.Thenable[ArrayBuffer] = js.native
  def deriveBits(algorithm: EcdhKeyDeriveParams, baseKey: CryptoKey, length: Double): js.Thenable[ArrayBuffer] = js.native
  def deriveBits(algorithm: HkdfCtrParams, baseKey: CryptoKey, length: Double): js.Thenable[ArrayBuffer] = js.native
  def deriveBits(algorithm: Pbkdf2Params, baseKey: CryptoKey, length: Double): js.Thenable[ArrayBuffer] = js.native
  def deriveBits(algorithm: java.lang.String, baseKey: CryptoKey, length: Double): js.Thenable[ArrayBuffer] = js.native
  def deriveKey(
    algorithm: ConcatParams,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: ConcatParams,
    baseKey: CryptoKey,
    derivedKeyType: ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: ConcatParams,
    baseKey: CryptoKey,
    derivedKeyType: HkdfCtrParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: ConcatParams,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: ConcatParams,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: ConcatParams,
    baseKey: CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: DhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: DhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: DhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: HkdfCtrParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: DhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: DhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: DhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: HkdfCtrParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfCtrParams,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfCtrParams,
    baseKey: CryptoKey,
    derivedKeyType: ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfCtrParams,
    baseKey: CryptoKey,
    derivedKeyType: HkdfCtrParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfCtrParams,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfCtrParams,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfCtrParams,
    baseKey: CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: HkdfCtrParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: java.lang.String,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: java.lang.String,
    baseKey: CryptoKey,
    derivedKeyType: ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: java.lang.String,
    baseKey: CryptoKey,
    derivedKeyType: HkdfCtrParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: java.lang.String,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: java.lang.String,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def deriveKey(
    algorithm: java.lang.String,
    baseKey: CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def encrypt(algorithm: AesCbcParams, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def encrypt(algorithm: AesCfbParams, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def encrypt(algorithm: AesCmacParams, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def encrypt(algorithm: AesCtrParams, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def encrypt(algorithm: AesGcmParams, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def encrypt(algorithm: RsaOaepParams, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def encrypt(algorithm: java.lang.String, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def exportKey(format: java.lang.String, key: CryptoKey): js.Thenable[JsonWebKey | ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_jwk(format: jwk, key: CryptoKey): js.Thenable[JsonWebKey] = js.native
  @JSName("exportKey")
  def exportKey_pkcs8(format: pkcs8, key: CryptoKey): js.Thenable[ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_raw(format: raw, key: CryptoKey): js.Thenable[ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_spki(format: spki, key: CryptoKey): js.Thenable[ArrayBuffer] = js.native
  def generateKey(algorithm: AesKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): js.Thenable[CryptoKey] = js.native
  def generateKey(algorithm: DhKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): js.Thenable[CryptoKeyPair] = js.native
  def generateKey(algorithm: EcKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): js.Thenable[CryptoKeyPair] = js.native
  def generateKey(algorithm: HmacKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): js.Thenable[CryptoKey] = js.native
  def generateKey(algorithm: Pbkdf2Params, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): js.Thenable[CryptoKey] = js.native
  def generateKey(
    algorithm: RsaHashedKeyGenParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKeyPair] = js.native
  def generateKey(algorithm: java.lang.String, extractable: scala.Boolean, keyUsages: js.Array[java.lang.String]): js.Thenable[CryptoKeyPair | CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: BufferSource,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: BufferSource,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: BufferSource,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: BufferSource,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: BufferSource,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: BufferSource,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: BufferSource,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: BufferSource,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: BufferSource,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: BufferSource,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: BufferSource,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: BufferSource,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: BufferSource,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: BufferSource,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: BufferSource,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: BufferSource,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: BufferSource,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: BufferSource,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: BufferSource,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: BufferSource,
    algorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: java.lang.String, key: CryptoKey, data: BufferSource): js.Thenable[ArrayBuffer] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier,
    unwrappedKeyAlgorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def verify(algorithm: AesCmacParams, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Thenable[scala.Boolean] = js.native
  def verify(algorithm: EcdsaParams, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Thenable[scala.Boolean] = js.native
  def verify(algorithm: RsaPssParams, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Thenable[scala.Boolean] = js.native
  def verify(algorithm: java.lang.String, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Thenable[scala.Boolean] = js.native
  def wrapKey(
    format: java.lang.String,
    key: CryptoKey,
    wrappingKey: CryptoKey,
    wrapAlgorithm: AlgorithmIdentifier
  ): js.Thenable[ArrayBuffer] = js.native
}


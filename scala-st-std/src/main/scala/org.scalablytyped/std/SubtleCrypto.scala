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
  def decrypt(
    algorithm: java.lang.String | RsaOaepParams | AesCtrParams | AesCbcParams | AesCmacParams | AesGcmParams | AesCfbParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
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
  def digest(algorithm: Algorithm, data: ArrayBuffer): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: Algorithm, data: DataView): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: Algorithm, data: Float32Array): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: Algorithm, data: Float64Array): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: Algorithm, data: Int16Array): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: Algorithm, data: Int32Array): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: Algorithm, data: Int8Array): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: Algorithm, data: Uint16Array): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: Algorithm, data: Uint32Array): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: Algorithm, data: Uint8Array): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: Algorithm, data: Uint8ClampedArray): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: java.lang.String, data: ArrayBuffer): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: java.lang.String, data: DataView): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: java.lang.String, data: Float32Array): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: java.lang.String, data: Float64Array): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: java.lang.String, data: Int16Array): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: java.lang.String, data: Int32Array): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: java.lang.String, data: Int8Array): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: java.lang.String, data: Uint16Array): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: java.lang.String, data: Uint32Array): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: java.lang.String, data: Uint8Array): js.Thenable[ArrayBuffer] = js.native
  def digest(algorithm: java.lang.String, data: Uint8ClampedArray): js.Thenable[ArrayBuffer] = js.native
  def encrypt(
    algorithm: java.lang.String | RsaOaepParams | AesCtrParams | AesCbcParams | AesCmacParams | AesGcmParams | AesCfbParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[ArrayBuffer] = js.native
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
    format: raw | pkcs8 | spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: java.lang.String | RsaHashedImportParams | EcKeyImportParams | HmacImportParams | DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: java.lang.String | RsaHashedImportParams | EcKeyImportParams | HmacImportParams | DhImportKeyParams,
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
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: ArrayBuffer): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: DataView): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Float32Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Float64Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Int16Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Int32Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Int8Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Uint16Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Uint32Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Uint8Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Uint8ClampedArray): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: ArrayBuffer): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: DataView): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Float32Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Float64Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Int16Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Int32Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Int8Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Uint16Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Uint32Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Uint8Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Uint8ClampedArray): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: ArrayBuffer): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: DataView): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Float32Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Float64Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Int16Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Int32Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Int8Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Uint16Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Uint32Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Uint8Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Uint8ClampedArray): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: java.lang.String, key: CryptoKey, data: ArrayBuffer): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: java.lang.String, key: CryptoKey, data: DataView): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: java.lang.String, key: CryptoKey, data: Float32Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: java.lang.String, key: CryptoKey, data: Float64Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: java.lang.String, key: CryptoKey, data: Int16Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: java.lang.String, key: CryptoKey, data: Int32Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: java.lang.String, key: CryptoKey, data: Int8Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: java.lang.String, key: CryptoKey, data: Uint16Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: java.lang.String, key: CryptoKey, data: Uint32Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: java.lang.String, key: CryptoKey, data: Uint8Array): js.Thenable[ArrayBuffer] = js.native
  def sign(algorithm: java.lang.String, key: CryptoKey, data: Uint8ClampedArray): js.Thenable[ArrayBuffer] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: ArrayBuffer,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: ArrayBuffer,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: ArrayBuffer,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: ArrayBuffer,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: DataView,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: DataView,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: DataView,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: DataView,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Float32Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Float32Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Float32Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Float32Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Float64Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Float64Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Float64Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Float64Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int16Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int16Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int16Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int16Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int32Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int32Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int32Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int32Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int8Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int8Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int8Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Int8Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Uint16Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Uint16Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Uint16Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Uint16Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Uint32Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Uint32Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Uint32Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Uint32Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Uint8Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Uint8Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Uint8Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Uint8Array,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Uint8ClampedArray,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Uint8ClampedArray,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: Algorithm,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Uint8ClampedArray,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: Algorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def unwrapKey(
    format: java.lang.String,
    wrappedKey: Uint8ClampedArray,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: java.lang.String,
    unwrappedKeyAlgorithm: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[java.lang.String]
  ): js.Thenable[CryptoKey] = js.native
  def verify(
    algorithm: java.lang.String | RsaPssParams | EcdsaParams | AesCmacParams,
    key: CryptoKey,
    signature: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Thenable[scala.Boolean] = js.native
  def wrapKey(format: java.lang.String, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: Algorithm): js.Thenable[ArrayBuffer] = js.native
  def wrapKey(format: java.lang.String, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: java.lang.String): js.Thenable[ArrayBuffer] = js.native
}


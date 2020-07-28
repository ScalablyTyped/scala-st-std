package org.scalablytyped

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object std {
  type AAGUID = java.lang.String
  type AlgorithmIdentifier = java.lang.String | org.scalablytyped.std.Algorithm
  type ArrayBufferLike = org.scalablytyped.std.ArrayBuffer
  type BodyInit = js.Any
  type ByteString = java.lang.String
  type CDATASection = org.scalablytyped.std.Text
  type CSSSupportsRule = org.scalablytyped.std.CSSConditionRule
  type ChannelMergerNode = org.scalablytyped.std.AudioNode
  type ChannelSplitterNode = org.scalablytyped.std.AudioNode
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | scala.Unit]
  type ConstrainBoolean = scala.Boolean | org.scalablytyped.std.ConstrainBooleanParameters
  type ConstrainDOMString = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.std.ConstrainDOMStringParameters
  type ConstrainDouble = scala.Double | org.scalablytyped.std.ConstrainDoubleRange
  type ConstrainLong = scala.Double | org.scalablytyped.std.ConstrainLongRange
  type CryptoOperationData = org.scalablytyped.std.ArrayBufferView
  type DOMStringMap = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  type DecodeErrorCallback = js.Function1[/* error */ org.scalablytyped.std.DOMException, scala.Unit]
  type DecodeSuccessCallback = js.Function1[/* decodedData */ org.scalablytyped.std.AudioBuffer, scala.Unit]
  type ErrorEventHandler = js.Function5[
    /* event */ org.scalablytyped.std.Event | java.lang.String, 
    /* source */ js.UndefOr[java.lang.String], 
    /* fileno */ js.UndefOr[scala.Double], 
    /* columnNumber */ js.UndefOr[scala.Double], 
    /* error */ js.UndefOr[org.scalablytyped.std.Error], 
    scala.Unit
  ]
  type EvalError = org.scalablytyped.std.Error
  type EventHandlerNonNull = js.Function1[/* event */ org.scalablytyped.std.Event, js.Any]
  type EventListener = js.Function1[/* evt */ org.scalablytyped.std.Event, scala.Unit]
  type EventListenerOrEventListenerObject = org.scalablytyped.std.EventListener | org.scalablytyped.std.EventListenerObject
  /**
    * Exclude from T those types that are assignable to U
    */
  type Exclude[T, U] = T
  type ExtendableEventInit = org.scalablytyped.std.EventInit
  /**
    * Extract from T those types that are assignable to U
    */
  type Extract[T, U] = T
  type ForEachCallback = js.Function2[
    /* keyId */ org.scalablytyped.std.Int8Array | org.scalablytyped.std.Int16Array | org.scalablytyped.std.Int32Array | org.scalablytyped.std.Uint8Array | org.scalablytyped.std.Uint16Array | org.scalablytyped.std.Uint32Array | org.scalablytyped.std.Uint8ClampedArray | org.scalablytyped.std.Float32Array | org.scalablytyped.std.Float64Array | org.scalablytyped.std.DataView | org.scalablytyped.std.ArrayBuffer | scala.Null, 
    /* status */ org.scalablytyped.std.MediaKeyStatus, 
    scala.Unit
  ]
  type FormDataEntryValue = java.lang.String | org.scalablytyped.std.File
  type FrameRequestCallback = js.Function1[/* time */ scala.Double, scala.Unit]
  type FunctionStringCallback = js.Function1[/* data */ java.lang.String, scala.Unit]
  type GLbitfield = scala.Double
  type GLboolean = scala.Boolean
  type GLbyte = scala.Double
  type GLclampf = scala.Double
  type GLenum = scala.Double
  type GLfloat = scala.Double
  type GLint = scala.Double
  type GLintptr = scala.Double
  type GLshort = scala.Double
  type GLsizei = scala.Double
  type GLsizeiptr = scala.Double
  type GLubyte = scala.Double
  type GLuint = scala.Double
  type GLushort = scala.Double
  type GamepadHapticActuatorType = org.scalablytyped.std.stdStrings.vibration
  type Generator = org.scalablytyped.std.Iterator[js.Any]
  type HTMLAreasCollection = org.scalablytyped.std.HTMLCollectionBase
  type HeadersInit = org.scalablytyped.std.Headers | js.Array[js.Array[java.lang.String]] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type IDBKeyPath = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - `org.scalablytyped`.std.Date
    - `org.scalablytyped`.std.IDBArrayKey
  */
  type IDBValidKey = org.scalablytyped.std._IDBValidKey | scala.Double | java.lang.String
  /**
    * Obtain the return type of a constructor function type
    */
  type InstanceType[T /* <: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any] */] = js.Any
  type IntersectionObserverCallback = js.Function2[
    /* entries */ js.Array[org.scalablytyped.std.IntersectionObserverEntry], 
    /* observer */ org.scalablytyped.std.IntersectionObserver, 
    scala.Unit
  ]
  type MSCredentialType = org.scalablytyped.std.stdStrings.FIDO_2_0
  type MSLaunchUriCallback = js.Function0[scala.Unit]
  type MediaElementAudioSourceNode = org.scalablytyped.std.AudioNode
  type MediaQueryListListener = js.Function1[/* mql */ org.scalablytyped.std.MediaQueryList, scala.Unit]
  type MediaStreamAudioSourceNode = org.scalablytyped.std.AudioNode
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ org.scalablytyped.std.TypedPropertyDescriptor[js.Any], 
    org.scalablytyped.std.TypedPropertyDescriptor[js.Any] | scala.Unit
  ]
  type MouseWheelEvent = org.scalablytyped.std.WheelEvent
  type MutationCallback = js.Function2[
    /* mutations */ js.Array[org.scalablytyped.std.MutationRecord], 
    /* observer */ org.scalablytyped.std.MutationObserver, 
    scala.Unit
  ]
  type NavigatorUserMediaErrorCallback = js.Function1[/* error */ org.scalablytyped.std.MediaStreamError, scala.Unit]
  type NavigatorUserMediaSuccessCallback = js.Function1[/* stream */ org.scalablytyped.std.MediaStream, scala.Unit]
  /**
    * Exclude null and undefined from T
    */
  type NonNullable[T] = T
  type NotificationPermissionCallback = js.Function1[/* permission */ org.scalablytyped.std.NotificationPermission, scala.Unit]
  type ParameterDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* parameterIndex */ scala.Double, 
    scala.Unit
  ]
  /**
    * Make all properties in T optional
    */
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ org.scalablytyped.std.stdStrings.Partial with org.scalablytyped.runtime.TopLevel[T]
  type Path2D = org.scalablytyped.std.CanvasPathMethods
  type PaymentRequestUpdateEventInit = org.scalablytyped.std.EventInit
  type PerformanceMark = org.scalablytyped.std.PerformanceEntry
  type PerformanceMeasure = org.scalablytyped.std.PerformanceEntry
  /**
    * From T pick a set of properties K
    */
  type Pick[T, K /* <: /* keyof T */ java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    */ org.scalablytyped.std.stdStrings.Pick with org.scalablytyped.runtime.TopLevel[T]
  type PositionCallback = js.Function1[/* position */ org.scalablytyped.std.Position, scala.Unit]
  type PositionErrorCallback = js.Function1[/* error */ org.scalablytyped.std.PositionError, scala.Unit]
  type PromiseConstructorLike = org.scalablytyped.runtime.Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | js.Thenable[js.Object]], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ], 
    js.Thenable[js.Object]
  ]
  type PropertyDecorator = js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit]
  type PropertyDescriptorMap = org.scalablytyped.runtime.StringDictionary[org.scalablytyped.std.PropertyDescriptor]
  type PropertyKey = java.lang.String | scala.Double | js.Symbol
  type RTCPeerConnectionErrorCallback = js.Function1[/* error */ org.scalablytyped.std.DOMError, scala.Unit]
  type RTCSessionDescriptionCallback = js.Function1[/* sdp */ org.scalablytyped.std.RTCSessionDescription, scala.Unit]
  type RTCStatsCallback = js.Function1[/* report */ org.scalablytyped.std.RTCStatsReport, scala.Unit]
  type RangeError = org.scalablytyped.std.Error
  /**
    * Make all properties in T readonly
    */
  type Readonly[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: T[P]}
    */ org.scalablytyped.std.stdStrings.Readonly with org.scalablytyped.runtime.TopLevel[T]
  /**
    * Construct a type with a set of properties K of type T
    */
  type Record[K /* <: java.lang.String */, T] = org.scalablytyped.runtime.StringDictionary[T]
  type ReferenceError = org.scalablytyped.std.Error
  type RequestInfo = org.scalablytyped.std.Request | java.lang.String
  /**
    * Make all properties in T required
    */
  type Required[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? T[P]}
    */ org.scalablytyped.std.stdStrings.Required with org.scalablytyped.runtime.TopLevel[T]
  /**
    * Obtain the return type of a function type
    */
  type ReturnType[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type SVGPathSegClosePath = org.scalablytyped.std.SVGPathSeg
  type ScopedCredentialType = org.scalablytyped.std.stdStrings.ScopedCred
  type SyntaxError = org.scalablytyped.std.Error
  type TypeError = org.scalablytyped.std.Error
  type URIError = org.scalablytyped.std.Error
  type USVString = java.lang.String
  type VoidFunction = js.Function0[scala.Unit]
  type WebGLBuffer = org.scalablytyped.std.WebGLObject
  type WebGLFramebuffer = org.scalablytyped.std.WebGLObject
  type WebGLProgram = org.scalablytyped.std.WebGLObject
  type WebGLRenderbuffer = org.scalablytyped.std.WebGLObject
  type WebGLShader = org.scalablytyped.std.WebGLObject
  type WebGLTexture = org.scalablytyped.std.WebGLObject
  type WebKitEntriesCallback = (js.Function1[/* entries */ js.Array[org.scalablytyped.std.WebKitEntry], scala.Unit]) | org.scalablytyped.std.anon.HandleEvent
  type WebKitErrorCallback = (js.Function1[/* err */ org.scalablytyped.std.DOMError, scala.Unit]) | org.scalablytyped.std.anon.`0`
  type WebKitFileCallback = (js.Function1[/* file */ org.scalablytyped.std.File, scala.Unit]) | org.scalablytyped.std.anon.`1`
  type WritableStreamChunkCallback = js.Function2[
    /* chunk */ js.Any, 
    /* controller */ org.scalablytyped.std.WritableStreamDefaultController, 
    scala.Unit
  ]
  type WritableStreamDefaultControllerCallback = js.Function1[/* controller */ org.scalablytyped.std.WritableStreamDefaultController, scala.Unit]
  type WritableStreamErrorCallback = js.Function1[/* reason */ java.lang.String, scala.Unit]
  type payloadtype = scala.Double
}

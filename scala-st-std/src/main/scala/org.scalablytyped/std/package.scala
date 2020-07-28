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
  type ElementListTagNameMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in 'abbr' | 'acronym' | 'address' | 'article' | 'aside' | 'b' | 'bdo' | 'big' | 'center' | 'circle' | 'cite' | 'clippath' | 'code' | 'dd' | 'defs' | 'desc' | 'dfn' | 'dt' | 'ellipse' | 'em' | 'feblend' | 'fecolormatrix' | 'fecomponenttransfer' | 'fecomposite' | 'feconvolvematrix' | 'fediffuselighting' | 'fedisplacementmap' | 'fedistantlight' | 'feflood' | 'fefunca' | 'fefuncb' | 'fefuncg' | 'fefuncr' | 'fegaussianblur' | 'feimage' | 'femerge' | 'femergenode' | 'femorphology' | 'feoffset' | 'fepointlight' | 'fespecularlighting' | 'fespotlight' | 'fetile' | 'feturbulence' | 'figcaption' | 'figure' | 'filter' | 'footer' | 'foreignobject' | 'g' | 'header' | 'hgroup' | 'i' | 'image' | 'kbd' | 'keygen' | 'line' | 'lineargradient' | 'mark' | 'marker' | 'mask' | 'metadata' | 'nav' | 'nobr' | 'noframes' | 'noscript' | 'path' | 'pattern' | 'plaintext' | 'polygon' | 'polyline' | 'radialgradient' | 'rect' | 'rt' | 'ruby' | 's' | 'samp' | 'section' | 'small' | 'stop' | 'strike' | 'strong' | 'sub' | 'sup' | 'svg' | 'switch' | 'symbol' | 'text' | 'textpath' | 'tspan' | 'tt' | 'u' | 'use' | 'var' | 'view' | 'wbr' ]: std.NodeListOf<std.ElementTagNameMap[key]>}
    */ org.scalablytyped.std.stdStrings.ElementListTagNameMap with org.scalablytyped.runtime.TopLevel[org.scalablytyped.std.ElementTagNameMap]
  type ErrorEventHandler = js.Function5[
    /* message */ java.lang.String, 
    /* filename */ js.UndefOr[java.lang.String], 
    /* lineno */ js.UndefOr[scala.Double], 
    /* colno */ js.UndefOr[scala.Double], 
    /* error */ js.UndefOr[org.scalablytyped.std.Error], 
    scala.Unit
  ]
  type EvalError = org.scalablytyped.std.Error
  type EventListener = js.Function1[/* evt */ org.scalablytyped.std.Event, scala.Unit]
  type EventListenerOrEventListenerObject = org.scalablytyped.std.EventListener | org.scalablytyped.std.EventListenerObject
  type ForEachCallback = js.Function2[/* keyId */ js.Any, /* status */ org.scalablytyped.std.MediaKeyStatus, scala.Unit]
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
  type Generator = org.scalablytyped.std.Iterator[js.Any]
  type HTMLAreasCollection = org.scalablytyped.std.HTMLCollectionBase
  type HTMLMainElement = org.scalablytyped.std.HTMLElement
  type HTMLSummaryElement = org.scalablytyped.std.HTMLElement
  type HeadersInit = org.scalablytyped.std.Headers | js.Array[js.Array[java.lang.String]]
  type IDBKeyPath = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - `org.scalablytyped`.std.Date
    - `org.scalablytyped`.std.IDBArrayKey
  */
  type IDBValidKey = org.scalablytyped.std._IDBValidKey | scala.Double | java.lang.String
  type IntersectionObserverCallback = js.Function2[
    /* entries */ js.Array[org.scalablytyped.std.IntersectionObserverEntry], 
    /* observer */ org.scalablytyped.std.IntersectionObserver, 
    scala.Unit
  ]
  type KeyFormat = java.lang.String
  type KeyType = java.lang.String
  type KeyUsage = java.lang.String
  type MSCredentialType = org.scalablytyped.std.stdStrings.FIDO_2_0
  type MSExecAtPriorityFunctionCallback = js.Function1[/* repeated */ js.Any, js.Any]
  type MSLaunchUriCallback = js.Function0[scala.Unit]
  type MSUnsafeFunctionCallback = js.Function0[js.Any]
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
  type NotificationPermissionCallback = js.Function1[/* permission */ org.scalablytyped.std.NotificationPermission, scala.Unit]
  type PanningModelType = org.scalablytyped.std.stdStrings.equalpower
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
  type WebKitEntriesCallback = js.Function1[/* evt */ org.scalablytyped.std.Event, scala.Unit]
  type WebKitErrorCallback = js.Function1[/* evt */ org.scalablytyped.std.Event, scala.Unit]
  type WebKitFileCallback = js.Function1[/* evt */ org.scalablytyped.std.Event, scala.Unit]
  type payloadtype = scala.Double
}

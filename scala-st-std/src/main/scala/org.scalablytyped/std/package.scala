package org.scalablytyped

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object std {
  type AAGUID = java.lang.String
  type AlgorithmIdentifier = java.lang.String | org.scalablytyped.std.Algorithm
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
  type DOMStringMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type DecodeErrorCallback = js.Function1[/* error */ org.scalablytyped.std.DOMException, scala.Unit]
  type DecodeSuccessCallback = js.Function1[/* decodedData */ org.scalablytyped.std.AudioBuffer, scala.Unit]
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
  type ForEachCallback = js.Function2[/* keyId */ js.Any, /* status */ java.lang.String, scala.Unit]
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
  type HTMLAudioElement = org.scalablytyped.std.HTMLMediaElement
  type HTMLDocument = org.scalablytyped.std.Document
  type HTMLPictureElement = org.scalablytyped.std.HTMLElement
  type HTMLSpanElement = org.scalablytyped.std.HTMLElement
  type HTMLTableDataCellElement = org.scalablytyped.std.HTMLTableCellElement
  type HTMLUnknownElement = org.scalablytyped.std.HTMLElement
  type IDBKeyPath = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - `org.scalablytyped`.std.Date
    - `org.scalablytyped`.std.IDBArrayKey
  */
  type IDBValidKey = org.scalablytyped.std._IDBValidKey | scala.Double | java.lang.String
  type KeyFormat = java.lang.String
  type KeyType = java.lang.String
  type KeyUsage = java.lang.String
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
  type ParameterDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* parameterIndex */ scala.Double, 
    scala.Unit
  ]
  type PerformanceMark = org.scalablytyped.std.PerformanceEntry
  type PerformanceMeasure = org.scalablytyped.std.PerformanceEntry
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
  type RangeError = org.scalablytyped.std.Error
  type ReferenceError = org.scalablytyped.std.Error
  type SVGFEFuncAElement = org.scalablytyped.std.SVGComponentTransferFunctionElement
  type SVGFEFuncBElement = org.scalablytyped.std.SVGComponentTransferFunctionElement
  type SVGFEFuncGElement = org.scalablytyped.std.SVGComponentTransferFunctionElement
  type SVGFEFuncRElement = org.scalablytyped.std.SVGComponentTransferFunctionElement
  type SVGMetadataElement = org.scalablytyped.std.SVGElement
  type SVGPathSegClosePath = org.scalablytyped.std.SVGPathSeg
  type SVGTSpanElement = org.scalablytyped.std.SVGTextPositioningElement
  type SyntaxError = org.scalablytyped.std.Error
  type TypeError = org.scalablytyped.std.Error
  type URIError = org.scalablytyped.std.Error
  type WebGLBuffer = org.scalablytyped.std.WebGLObject
  type WebGLFramebuffer = org.scalablytyped.std.WebGLObject
  type WebGLProgram = org.scalablytyped.std.WebGLObject
  type WebGLRenderbuffer = org.scalablytyped.std.WebGLObject
  type WebGLShader = org.scalablytyped.std.WebGLObject
  type WebGLTexture = org.scalablytyped.std.WebGLObject
  type XMLDocument = org.scalablytyped.std.Document
  type payloadtype = scala.Double
}

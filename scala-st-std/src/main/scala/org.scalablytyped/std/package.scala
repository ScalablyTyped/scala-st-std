package org.scalablytyped

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object std {
  type CDATASection = org.scalablytyped.std.Text
  type CSSSupportsRule = org.scalablytyped.std.CSSConditionRule
  type ChannelMergerNode = org.scalablytyped.std.AudioNode
  type ChannelSplitterNode = org.scalablytyped.std.AudioNode
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | scala.Unit]
  type DOMStringMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type DecodeErrorCallback = js.Function0[scala.Unit]
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
  type FrameRequestCallback = js.Function1[/* time */ scala.Double, scala.Unit]
  type FunctionStringCallback = js.Function1[/* data */ java.lang.String, scala.Unit]
  type HTMLAudioElement = org.scalablytyped.std.HTMLMediaElement
  type HTMLDocument = org.scalablytyped.std.Document
  type HTMLPictureElement = org.scalablytyped.std.HTMLElement
  type HTMLSpanElement = org.scalablytyped.std.HTMLElement
  type HTMLTableDataCellElement = org.scalablytyped.std.HTMLTableCellElement
  type HTMLUnknownElement = org.scalablytyped.std.HTMLElement
  type MSExecAtPriorityFunctionCallback = js.Function1[/* repeated */ js.Any, js.Any]
  type MSLaunchUriCallback = js.Function0[scala.Unit]
  type MSUnsafeFunctionCallback = js.Function0[js.Any]
  type MediaElementAudioSourceNode = org.scalablytyped.std.AudioNode
  type MediaQueryListListener = js.Function1[/* mql */ org.scalablytyped.std.MediaQueryList, scala.Unit]
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ org.scalablytyped.std.TypedPropertyDescriptor[js.Any], 
    org.scalablytyped.std.TypedPropertyDescriptor[js.Any] | scala.Unit
  ]
  type MutationCallback = js.Function2[
    /* mutations */ js.Array[org.scalablytyped.std.MutationRecord], 
    /* observer */ org.scalablytyped.std.MutationObserver, 
    scala.Unit
  ]
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
}

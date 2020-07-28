package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.readystatechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLHttpRequest
  extends EventTarget
     with XMLHttpRequestEventTarget {
  var DONE: Double = js.native
  var HEADERS_RECEIVED: Double = js.native
  var LOADING: Double = js.native
  var OPENED: Double = js.native
  var UNSENT: Double = js.native
  var msCaching: java.lang.String = js.native
  var readyState: Double = js.native
  var response: js.Any = js.native
  var responseBody: js.Any = js.native
  var responseText: java.lang.String = js.native
  var responseType: java.lang.String = js.native
  var responseXML: js.Any = js.native
  var status: Double = js.native
  var statusText: java.lang.String = js.native
  var timeout: Double = js.native
  var upload: XMLHttpRequestUpload = js.native
  var withCredentials: scala.Boolean = js.native
  def abort(): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(`type`: readystatechange, listener: js.Function1[/* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.Function1[/* ev */ ProgressEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def getAllResponseHeaders(): java.lang.String = js.native
  def getResponseHeader(header: java.lang.String): java.lang.String = js.native
  def msCachingEnabled(): scala.Boolean = js.native
  def onreadystatechange(ev: ProgressEvent): js.Any = js.native
  def open(method: java.lang.String, url: java.lang.String): Unit = js.native
  def open(
    method: java.lang.String,
    url: java.lang.String,
    async: js.UndefOr[scala.Nothing],
    user: js.UndefOr[scala.Nothing],
    password: java.lang.String
  ): Unit = js.native
  def open(
    method: java.lang.String,
    url: java.lang.String,
    async: js.UndefOr[scala.Nothing],
    user: java.lang.String
  ): Unit = js.native
  def open(
    method: java.lang.String,
    url: java.lang.String,
    async: js.UndefOr[scala.Nothing],
    user: java.lang.String,
    password: java.lang.String
  ): Unit = js.native
  def open(method: java.lang.String, url: java.lang.String, async: scala.Boolean): Unit = js.native
  def open(
    method: java.lang.String,
    url: java.lang.String,
    async: scala.Boolean,
    user: js.UndefOr[scala.Nothing],
    password: java.lang.String
  ): Unit = js.native
  def open(method: java.lang.String, url: java.lang.String, async: scala.Boolean, user: java.lang.String): Unit = js.native
  def open(
    method: java.lang.String,
    url: java.lang.String,
    async: scala.Boolean,
    user: java.lang.String,
    password: java.lang.String
  ): Unit = js.native
  def overrideMimeType(mime: java.lang.String): Unit = js.native
  def send(): Unit = js.native
  def send(data: Document): Unit = js.native
  def send(data: java.lang.String): Unit = js.native
  def send(data: js.Any): Unit = js.native
  def setRequestHeader(header: java.lang.String, value: java.lang.String): Unit = js.native
}


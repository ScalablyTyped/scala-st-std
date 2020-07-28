package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSHTMLWebViewElement extends HTMLElement {
  val canGoBack: scala.Boolean = js.native
  val canGoForward: scala.Boolean = js.native
  val containsFullScreenElement: scala.Boolean = js.native
  val documentTitle: java.lang.String = js.native
  var height: Double = js.native
  val settings: MSWebViewSettings = js.native
  var src: java.lang.String = js.native
  var width: Double = js.native
  def addWebAllowedObject(name: java.lang.String, applicationObject: js.Any): Unit = js.native
  def buildLocalStreamUri(contentIdentifier: java.lang.String, relativePath: java.lang.String): java.lang.String = js.native
  def capturePreviewToBlobAsync(): MSWebViewAsyncOperation = js.native
  def captureSelectedContentToDataPackageAsync(): MSWebViewAsyncOperation = js.native
  def getDeferredPermissionRequestById(id: Double): DeferredPermissionRequest = js.native
  def getDeferredPermissionRequests(): js.Array[DeferredPermissionRequest] = js.native
  def goBack(): Unit = js.native
  def goForward(): Unit = js.native
  def invokeScriptAsync(scriptName: java.lang.String, args: js.Any*): MSWebViewAsyncOperation = js.native
  def navigate(uri: java.lang.String): Unit = js.native
  def navigateToLocalStreamUri(source: java.lang.String, streamResolver: js.Any): Unit = js.native
  def navigateToString(contents: java.lang.String): Unit = js.native
  def navigateWithHttpRequestMessage(requestMessage: js.Any): Unit = js.native
  def refresh(): Unit = js.native
  def stop(): Unit = js.native
}


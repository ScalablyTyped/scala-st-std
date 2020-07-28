package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionScriptApis extends js.Object {
  def extensionIdToShortId(extensionId: java.lang.String): Double = js.native
  def fireExtensionApiTelemetry(functionName: java.lang.String, isSucceeded: scala.Boolean, isSupported: scala.Boolean): Unit = js.native
  def genericFunction(routerAddress: js.Any): Unit = js.native
  def genericFunction(routerAddress: js.Any, parameters: js.UndefOr[scala.Nothing], callbackId: Double): Unit = js.native
  def genericFunction(routerAddress: js.Any, parameters: java.lang.String): Unit = js.native
  def genericFunction(routerAddress: js.Any, parameters: java.lang.String, callbackId: Double): Unit = js.native
  def genericSynchronousFunction(functionId: Double): java.lang.String = js.native
  def genericSynchronousFunction(functionId: Double, parameters: java.lang.String): java.lang.String = js.native
  def getExtensionId(): java.lang.String = js.native
  def registerGenericFunctionCallbackHandler(callbackHandler: js.Any): Unit = js.native
  def registerGenericPersistentCallbackHandler(callbackHandler: js.Any): Unit = js.native
}


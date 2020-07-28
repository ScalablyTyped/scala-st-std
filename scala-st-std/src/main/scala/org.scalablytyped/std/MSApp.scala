package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSApp extends js.Object {
  val CURRENT: java.lang.String
  val HIGH: java.lang.String
  val IDLE: java.lang.String
  val NORMAL: java.lang.String
  def clearTemporaryWebDataAsync(): MSAppAsyncOperation
  def createBlobFromRandomAccessStream(`type`: java.lang.String, seeker: js.Any): Blob
  def createDataPackage(`object`: js.Any): js.Any
  def createDataPackageFromSelection(): js.Any
  def createFileFromStorageFile(storageFile: js.Any): File
  def createStreamFromInputStream(`type`: java.lang.String, inputStream: js.Any): MSStream
  def execAsyncAtPriority(asynchronousCallback: MSExecAtPriorityFunctionCallback, priority: java.lang.String, args: js.Any*): Unit
  def execAtPriority(synchronousCallback: MSExecAtPriorityFunctionCallback, priority: java.lang.String, args: js.Any*): js.Any
  def getCurrentPriority(): java.lang.String
  def getHtmlPrintDocumentSourceAsync(htmlDoc: js.Any): js.Promise[_]
  def getViewId(view: js.Any): js.Any
  def isTaskScheduledAtPriorityOrHigher(priority: java.lang.String): scala.Boolean
  def pageHandlesAllApplicationActivations(enabled: scala.Boolean): Unit
  def suppressSubdownloadCredentialPrompts(suppress: scala.Boolean): Unit
  def terminateApp(exceptionObject: js.Any): Unit
}

object MSApp {
  @scala.inline
  def apply(
    CURRENT: java.lang.String,
    HIGH: java.lang.String,
    IDLE: java.lang.String,
    NORMAL: java.lang.String,
    clearTemporaryWebDataAsync: () => MSAppAsyncOperation,
    createBlobFromRandomAccessStream: (java.lang.String, js.Any) => Blob,
    createDataPackage: js.Any => js.Any,
    createDataPackageFromSelection: () => js.Any,
    createFileFromStorageFile: js.Any => File,
    createStreamFromInputStream: (java.lang.String, js.Any) => MSStream,
    execAsyncAtPriority: (MSExecAtPriorityFunctionCallback, java.lang.String, /* repeated */ js.Any) => Unit,
    execAtPriority: (MSExecAtPriorityFunctionCallback, java.lang.String, /* repeated */ js.Any) => js.Any,
    getCurrentPriority: () => java.lang.String,
    getHtmlPrintDocumentSourceAsync: js.Any => js.Promise[_],
    getViewId: js.Any => js.Any,
    isTaskScheduledAtPriorityOrHigher: java.lang.String => scala.Boolean,
    pageHandlesAllApplicationActivations: scala.Boolean => Unit,
    suppressSubdownloadCredentialPrompts: scala.Boolean => Unit,
    terminateApp: js.Any => Unit
  ): MSApp = {
    val __obj = js.Dynamic.literal(CURRENT = CURRENT.asInstanceOf[js.Any], HIGH = HIGH.asInstanceOf[js.Any], IDLE = IDLE.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], clearTemporaryWebDataAsync = js.Any.fromFunction0(clearTemporaryWebDataAsync), createBlobFromRandomAccessStream = js.Any.fromFunction2(createBlobFromRandomAccessStream), createDataPackage = js.Any.fromFunction1(createDataPackage), createDataPackageFromSelection = js.Any.fromFunction0(createDataPackageFromSelection), createFileFromStorageFile = js.Any.fromFunction1(createFileFromStorageFile), createStreamFromInputStream = js.Any.fromFunction2(createStreamFromInputStream), execAsyncAtPriority = js.Any.fromFunction3(execAsyncAtPriority), execAtPriority = js.Any.fromFunction3(execAtPriority), getCurrentPriority = js.Any.fromFunction0(getCurrentPriority), getHtmlPrintDocumentSourceAsync = js.Any.fromFunction1(getHtmlPrintDocumentSourceAsync), getViewId = js.Any.fromFunction1(getViewId), isTaskScheduledAtPriorityOrHigher = js.Any.fromFunction1(isTaskScheduledAtPriorityOrHigher), pageHandlesAllApplicationActivations = js.Any.fromFunction1(pageHandlesAllApplicationActivations), suppressSubdownloadCredentialPrompts = js.Any.fromFunction1(suppressSubdownloadCredentialPrompts), terminateApp = js.Any.fromFunction1(terminateApp))
    __obj.asInstanceOf[MSApp]
  }
  @scala.inline
  implicit class MSAppOps[Self <: MSApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCURRENT(value: java.lang.String): Self = this.set("CURRENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setHIGH(value: java.lang.String): Self = this.set("HIGH", value.asInstanceOf[js.Any])
    @scala.inline
    def setIDLE(value: java.lang.String): Self = this.set("IDLE", value.asInstanceOf[js.Any])
    @scala.inline
    def setNORMAL(value: java.lang.String): Self = this.set("NORMAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearTemporaryWebDataAsync(value: () => MSAppAsyncOperation): Self = this.set("clearTemporaryWebDataAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateBlobFromRandomAccessStream(value: (java.lang.String, js.Any) => Blob): Self = this.set("createBlobFromRandomAccessStream", js.Any.fromFunction2(value))
    @scala.inline
    def setCreateDataPackage(value: js.Any => js.Any): Self = this.set("createDataPackage", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateDataPackageFromSelection(value: () => js.Any): Self = this.set("createDataPackageFromSelection", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateFileFromStorageFile(value: js.Any => File): Self = this.set("createFileFromStorageFile", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateStreamFromInputStream(value: (java.lang.String, js.Any) => MSStream): Self = this.set("createStreamFromInputStream", js.Any.fromFunction2(value))
    @scala.inline
    def setExecAsyncAtPriority(value: (MSExecAtPriorityFunctionCallback, java.lang.String, /* repeated */ js.Any) => Unit): Self = this.set("execAsyncAtPriority", js.Any.fromFunction3(value))
    @scala.inline
    def setExecAtPriority(value: (MSExecAtPriorityFunctionCallback, java.lang.String, /* repeated */ js.Any) => js.Any): Self = this.set("execAtPriority", js.Any.fromFunction3(value))
    @scala.inline
    def setGetCurrentPriority(value: () => java.lang.String): Self = this.set("getCurrentPriority", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHtmlPrintDocumentSourceAsync(value: js.Any => js.Promise[_]): Self = this.set("getHtmlPrintDocumentSourceAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setGetViewId(value: js.Any => js.Any): Self = this.set("getViewId", js.Any.fromFunction1(value))
    @scala.inline
    def setIsTaskScheduledAtPriorityOrHigher(value: java.lang.String => scala.Boolean): Self = this.set("isTaskScheduledAtPriorityOrHigher", js.Any.fromFunction1(value))
    @scala.inline
    def setPageHandlesAllApplicationActivations(value: scala.Boolean => Unit): Self = this.set("pageHandlesAllApplicationActivations", js.Any.fromFunction1(value))
    @scala.inline
    def setSuppressSubdownloadCredentialPrompts(value: scala.Boolean => Unit): Self = this.set("suppressSubdownloadCredentialPrompts", js.Any.fromFunction1(value))
    @scala.inline
    def setTerminateApp(value: js.Any => Unit): Self = this.set("terminateApp", js.Any.fromFunction1(value))
  }
  
}


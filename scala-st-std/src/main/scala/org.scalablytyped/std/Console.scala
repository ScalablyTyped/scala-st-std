package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Console extends js.Object {
  def assert(test: js.UndefOr[scala.Nothing], message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  def assert(test: js.UndefOr[scala.Nothing], message: java.lang.String, optionalParams: js.Any*): Unit = js.native
  def assert(test: scala.Boolean, message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  def assert(test: scala.Boolean, message: java.lang.String, optionalParams: js.Any*): Unit = js.native
  def clear(): Unit = js.native
  def count(): Unit = js.native
  def count(countTitle: java.lang.String): Unit = js.native
  def debug(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  def debug(message: java.lang.String, optionalParams: js.Any*): Unit = js.native
  def dir(value: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  def dir(value: js.Any, optionalParams: js.Any*): Unit = js.native
  def dirxml(value: js.Any): Unit = js.native
  def error(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def exception(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  def exception(message: java.lang.String, optionalParams: js.Any*): Unit = js.native
  def group(): Unit = js.native
  def group(groupTitle: java.lang.String): Unit = js.native
  def groupCollapsed(): Unit = js.native
  def groupCollapsed(groupTitle: java.lang.String): Unit = js.native
  def groupEnd(): Unit = js.native
  def info(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  def info(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def log(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def msIsIndependentlyComposed(element: Element): scala.Boolean = js.native
  def profile(): Unit = js.native
  def profile(reportName: java.lang.String): Unit = js.native
  def profileEnd(): Unit = js.native
  def select(element: Element): Unit = js.native
  def table(data: js.Any*): Unit = js.native
  def time(): Unit = js.native
  def time(timerName: java.lang.String): Unit = js.native
  def timeEnd(): Unit = js.native
  def timeEnd(timerName: java.lang.String): Unit = js.native
  def trace(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  def trace(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def warn(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
}

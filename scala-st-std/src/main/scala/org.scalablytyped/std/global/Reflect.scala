package org.scalablytyped.std.global

import org.scalablytyped.std.ArrayLike
import org.scalablytyped.std.IterableIterator
import org.scalablytyped.std.PropertyDescriptor
import org.scalablytyped.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Reflect")
@js.native
object Reflect extends js.Object {
  @JSName("apply")
  def apply(target: js.Function, thisArgument: js.Any, argumentsList: ArrayLike[_]): js.Any = js.native
  def construct(target: js.Function, argumentsList: ArrayLike[_]): js.Any = js.native
  def construct(target: js.Function, argumentsList: ArrayLike[_], newTarget: js.Any): js.Any = js.native
  def defineProperty(target: js.Any, propertyKey: PropertyKey, attributes: PropertyDescriptor): scala.Boolean = js.native
  def deleteProperty(target: js.Any, propertyKey: PropertyKey): scala.Boolean = js.native
  def enumerate(target: js.Any): IterableIterator[_] = js.native
  def get(target: js.Any, propertyKey: PropertyKey): js.Any = js.native
  def get(target: js.Any, propertyKey: PropertyKey, receiver: js.Any): js.Any = js.native
  def getOwnPropertyDescriptor(target: js.Any, propertyKey: PropertyKey): PropertyDescriptor = js.native
  def getPrototypeOf(target: js.Any): js.Any = js.native
  def has(target: js.Any, propertyKey: java.lang.String): scala.Boolean = js.native
  def has(target: js.Any, propertyKey: js.Symbol): scala.Boolean = js.native
  def isExtensible(target: js.Any): scala.Boolean = js.native
  def ownKeys(target: js.Any): js.Array[PropertyKey] = js.native
  def preventExtensions(target: js.Any): scala.Boolean = js.native
  def set(target: js.Any, propertyKey: PropertyKey, value: js.Any): scala.Boolean = js.native
  def set(target: js.Any, propertyKey: PropertyKey, value: js.Any, receiver: js.Any): scala.Boolean = js.native
  def setPrototypeOf(target: js.Any, proto: js.Any): scala.Boolean = js.native
}


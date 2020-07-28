package org.scalablytyped.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("URLSearchParams")
@js.native
/**
  * Constructor returning a URLSearchParams object.
  */
class URLSearchParams ()
  extends org.scalablytyped.std.URLSearchParams {
  def this(init: org.scalablytyped.std.URLSearchParams) = this()
  def this(init: java.lang.String) = this()
  /**
    * Appends a specified key/value pair as a new search parameter.
    */
  /* CompleteClass */
  override def append(name: java.lang.String, value: java.lang.String): Unit = js.native
  /**
    * Deletes the given search parameter, and its associated value, from the list of all search parameters.
    */
  /* CompleteClass */
  override def delete(name: java.lang.String): Unit = js.native
  /**
    * Returns the first value associated to the given search parameter.
    */
  /* CompleteClass */
  override def get(name: java.lang.String): java.lang.String | Null = js.native
  /**
    * Returns all the values association with a given search parameter.
    */
  /* CompleteClass */
  override def getAll(name: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * Returns a Boolean indicating if such a search parameter exists.
    */
  /* CompleteClass */
  override def has(name: java.lang.String): scala.Boolean = js.native
  /**
    * Sets the value associated to a given search parameter to the given value. If there were several values, delete the others.
    */
  /* CompleteClass */
  override def set(name: java.lang.String, value: java.lang.String): Unit = js.native
}

@JSGlobal("URLSearchParams")
@js.native
object URLSearchParams
  extends /**
  * Constructor returning a URLSearchParams object.
  */
Instantiable0[org.scalablytyped.std.URLSearchParams]
     with Instantiable1[
      (/* init */ java.lang.String) | (/* init */ org.scalablytyped.std.URLSearchParams), 
      org.scalablytyped.std.URLSearchParams
    ]


package org.scalablytyped.std.global

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Storage")
@js.native
class Storage ()
  extends org.scalablytyped.std.Storage {
  /**
    * Returns the number of key/value pairs currently present in the list associated with the
    * object.
    */
  /* CompleteClass */
  override val length: Double = js.native
  /**
    * Empties the list associated with the object of all key/value pairs, if there are any.
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /**
    * value = storage[key]
    */
  /* CompleteClass */
  override def getItem(key: java.lang.String): java.lang.String | Null = js.native
  /**
    * Returns the name of the nth key in the list, or null if n is greater
    * than or equal to the number of key/value pairs in the object.
    */
  /* CompleteClass */
  override def key(index: Double): java.lang.String | Null = js.native
  /**
    * delete storage[key]
    */
  /* CompleteClass */
  override def removeItem(key: java.lang.String): Unit = js.native
  /**
    * storage[key] = value
    */
  /* CompleteClass */
  override def setItem(key: java.lang.String, value: java.lang.String): Unit = js.native
}

@JSGlobal("Storage")
@js.native
object Storage
  extends Instantiable0[org.scalablytyped.std.Storage]


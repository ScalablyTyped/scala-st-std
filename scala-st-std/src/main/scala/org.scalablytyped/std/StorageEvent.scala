package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageEvent extends Event {
  /**
    * Returns the key of the storage item being changed.
    */
  val key: java.lang.String | Null = js.native
  /**
    * Returns the new value of the key of the storage item whose value is being changed.
    */
  val newValue: java.lang.String | Null = js.native
  /**
    * Returns the old value of the key of the storage item whose value is being changed.
    */
  val oldValue: java.lang.String | Null = js.native
  /**
    * Returns the Storage object that was affected.
    */
  val storageArea: Storage | Null = js.native
  /**
    * Returns the URL of the document whose storage item changed.
    */
  val url: java.lang.String = js.native
}


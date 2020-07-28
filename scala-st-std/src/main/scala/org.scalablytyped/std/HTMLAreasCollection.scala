package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLAreasCollection extends HTMLCollection {
  /**
    * Adds an element to the areas, controlRange, or options collection.
    */
  def add(element: HTMLElement): Unit = js.native
  def add(element: HTMLElement, before: HTMLElement): Unit = js.native
  def add(element: HTMLElement, before: Double): Unit = js.native
  /**
    * Removes an element from the collection.
    */
  def remove(): Unit = js.native
  def remove(index: Double): Unit = js.native
}


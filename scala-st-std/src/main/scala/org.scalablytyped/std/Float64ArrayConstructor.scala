package org.scalablytyped.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Float64ArrayConstructor
  extends Instantiable1[
      (/* buffer */ ArrayBuffer) | (/* array */ ArrayLike[Double]) | (/* length */ Double) | (/* elements */ Iterable[Double]), 
      Float64Array
    ]
     with Instantiable2[/* buffer */ ArrayBuffer, /* byteOffset */ Double, Float64Array]
     with Instantiable3[
      /* buffer */ ArrayBuffer, 
      js.UndefOr[/* byteOffset */ Double], 
      /* length */ Double, 
      Float64Array
    ] {
  /**
    * The size in bytes of each element in the array.
    */
  val BYTES_PER_ELEMENT: Double = js.native
  def from(arrayLike: ArrayLike[Double]): Float64Array = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like or iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  def from(
    arrayLike: ArrayLike[Double],
    mapfn: js.ThisFunction2[/* this */ js.UndefOr[scala.Nothing], /* v */ Double, /* k */ Double, Double]
  ): Float64Array = js.native
  def from(
    arrayLike: ArrayLike[Double],
    mapfn: js.ThisFunction2[/* this */ js.UndefOr[scala.Nothing], /* v */ Double, /* k */ Double, Double],
    thisArg: js.UndefOr[scala.Nothing]
  ): Float64Array = js.native
  def from(arrayLike: Iterable[Double]): Float64Array = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like or iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  def from(
    arrayLike: Iterable[Double],
    mapfn: js.ThisFunction2[/* this */ js.UndefOr[scala.Nothing], /* v */ Double, /* k */ Double, Double]
  ): Float64Array = js.native
  def from(
    arrayLike: Iterable[Double],
    mapfn: js.ThisFunction2[/* this */ js.UndefOr[scala.Nothing], /* v */ Double, /* k */ Double, Double],
    thisArg: js.UndefOr[scala.Nothing]
  ): Float64Array = js.native
  def from[Z](
    arrayLike: ArrayLike[Double],
    mapfn: js.ThisFunction2[/* this */ Z, /* v */ Double, /* k */ Double, Double],
    thisArg: Z
  ): Float64Array = js.native
  def from[Z](
    arrayLike: Iterable[Double],
    mapfn: js.ThisFunction2[/* this */ Z, /* v */ Double, /* k */ Double, Double],
    thisArg: Z
  ): Float64Array = js.native
  /**
    * Returns a new array from a set of elements.
    * @param items A set of elements to include in the new array object.
    */
  def of(items: Double*): Float64Array = js.native
}


package org.scalablytyped.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Uint8ClampedArrayConstructor
  extends Instantiable1[
      (/* buffer */ ArrayBuffer) | (/* array */ ArrayLike[Double]) | (/* length */ Double) | (/* elements */ Iterable[Double]), 
      Uint8ClampedArray
    ]
     with Instantiable2[/* buffer */ ArrayBuffer, /* byteOffset */ Double, Uint8ClampedArray]
     with Instantiable3[
      /* buffer */ ArrayBuffer, 
      js.UndefOr[/* byteOffset */ Double], 
      /* length */ Double, 
      Uint8ClampedArray
    ] {
  /**
    * The size in bytes of each element in the array.
    */
  val BYTES_PER_ELEMENT: Double = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like or iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  def from(arrayLike: ArrayLike[Double]): Uint8ClampedArray = js.native
  def from(arrayLike: ArrayLike[Double], mapfn: js.UndefOr[scala.Nothing], thisArg: js.Any): Uint8ClampedArray = js.native
  def from(arrayLike: ArrayLike[Double], mapfn: js.Function2[/* v */ Double, /* k */ Double, Double]): Uint8ClampedArray = js.native
  def from(
    arrayLike: ArrayLike[Double],
    mapfn: js.Function2[/* v */ Double, /* k */ Double, Double],
    thisArg: js.Any
  ): Uint8ClampedArray = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like or iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  def from(arrayLike: Iterable[Double]): Uint8ClampedArray = js.native
  def from(arrayLike: Iterable[Double], mapfn: js.UndefOr[scala.Nothing], thisArg: js.Any): Uint8ClampedArray = js.native
  def from(arrayLike: Iterable[Double], mapfn: js.Function2[/* v */ Double, /* k */ Double, Double]): Uint8ClampedArray = js.native
  def from(
    arrayLike: Iterable[Double],
    mapfn: js.Function2[/* v */ Double, /* k */ Double, Double],
    thisArg: js.Any
  ): Uint8ClampedArray = js.native
  /**
    * Returns a new array from a set of elements.
    * @param items A set of elements to include in the new array object.
    */
  def of(items: Double*): Uint8ClampedArray = js.native
}

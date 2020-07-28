package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseLike[T] extends js.Object {
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  def `then`(): js.Thenable[T] = js.native
  def `then`(
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]
  ): js.Thenable[T] = js.native
  def `then`(onfulfilled: js.Function1[/* value */ T, T | js.Thenable[T]]): js.Thenable[T] = js.native
  def `then`(
    onfulfilled: js.Function1[/* value */ T, T | js.Thenable[T]],
    onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]
  ): js.Thenable[T] = js.native
  def `then`(onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]): js.Thenable[T] = js.native
  @JSName("then")
  def then_TResult[TResult](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]
  ): js.Thenable[T | TResult] = js.native
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  @JSName("then")
  def then_TResult[TResult](onfulfilled: js.Function1[/* value */ T, TResult | js.Thenable[TResult]]): js.Thenable[TResult] = js.native
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  @JSName("then")
  def then_TResult[TResult](
    onfulfilled: js.Function1[/* value */ T, T | TResult | (js.Thenable[T | TResult])],
    onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]
  ): js.Thenable[T | TResult] = js.native
  @JSName("then")
  def then_TResult[TResult](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Thenable[T | TResult] = js.native
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  @JSName("then")
  def then_TResult1TResult2[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Thenable[TResult1 | TResult2] = js.native
}


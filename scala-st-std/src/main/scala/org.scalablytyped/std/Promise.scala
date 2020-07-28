package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the completion of an asynchronous operation
  */
@js.native
trait Promise[T] extends js.Object {
  @JSName(js.Symbol.toStringTag)
  val toStringTag: org.scalablytyped.std.stdStrings.Promise = js.native
  /**
    * Attaches a callback for only the rejection of the Promise.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of the callback.
    */
  def `catch`(onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]): js.Promise[T] = js.native
  /**
    * Attaches a callback for only the rejection of the Promise.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of the callback.
    */
  @JSName("catch")
  def catch_TResult[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[T | TResult] = js.native
  /**
    * Creates a new Promise with the same internal state of this Promise.
    * @returns A Promise.
    */
  def `then`(): js.Promise[T] = js.native
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  def `then`[TResult](onfulfilled: js.Function1[/* value */ T, TResult | js.Thenable[TResult]]): js.Promise[TResult] = js.native
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  def `then`[TResult](
    onfulfilled: js.Function1[/* value */ T, TResult | js.Thenable[TResult]],
    onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]
  ): js.Promise[TResult] = js.native
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
  ): js.Promise[TResult1 | TResult2] = js.native
}


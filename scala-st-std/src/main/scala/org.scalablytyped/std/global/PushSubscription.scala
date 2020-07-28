package org.scalablytyped.std.global

import org.scalablytyped.std.PushEncryptionKeyName
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PushSubscription")
@js.native
class PushSubscription ()
  extends org.scalablytyped.std.PushSubscription {
  /* CompleteClass */
  override val endpoint: java.lang.String = js.native
  /* CompleteClass */
  override val expirationTime: Double | Null = js.native
  /* CompleteClass */
  override val options: org.scalablytyped.std.PushSubscriptionOptions = js.native
  /* CompleteClass */
  override def getKey(name: PushEncryptionKeyName): org.scalablytyped.std.ArrayBuffer | Null = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def unsubscribe(): js.Promise[scala.Boolean] = js.native
}

@JSGlobal("PushSubscription")
@js.native
object PushSubscription
  extends Instantiable0[org.scalablytyped.std.PushSubscription]


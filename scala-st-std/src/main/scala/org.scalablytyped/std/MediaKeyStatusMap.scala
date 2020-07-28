package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaKeyStatusMap extends js.Object {
  val size: Double
  def forEach(callback: ForEachCallback): Unit
  def get(keyId: js.Any): MediaKeyStatus
  def has(keyId: js.Any): scala.Boolean
}

object MediaKeyStatusMap {
  @scala.inline
  def apply(
    forEach: ForEachCallback => Unit,
    get: js.Any => MediaKeyStatus,
    has: js.Any => scala.Boolean,
    size: Double
  ): MediaKeyStatusMap = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaKeyStatusMap]
  }
  @scala.inline
  implicit class MediaKeyStatusMapOps[Self <: MediaKeyStatusMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForEach(value: ForEachCallback => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: js.Any => MediaKeyStatus): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: js.Any => scala.Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}


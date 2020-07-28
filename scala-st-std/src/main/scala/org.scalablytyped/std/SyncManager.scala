package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncManager extends js.Object {
  def getTags(): js.Any
  def register(tag: java.lang.String): js.Promise[Unit]
}

object SyncManager {
  @scala.inline
  def apply(getTags: () => js.Any, register: java.lang.String => js.Promise[Unit]): SyncManager = {
    val __obj = js.Dynamic.literal(getTags = js.Any.fromFunction0(getTags), register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[SyncManager]
  }
  @scala.inline
  implicit class SyncManagerOps[Self <: SyncManager] (val x: Self) extends AnyVal {
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
    def setGetTags(value: () => js.Any): Self = this.set("getTags", js.Any.fromFunction0(value))
    @scala.inline
    def setRegister(value: java.lang.String => js.Promise[Unit]): Self = this.set("register", js.Any.fromFunction1(value))
  }
  
}


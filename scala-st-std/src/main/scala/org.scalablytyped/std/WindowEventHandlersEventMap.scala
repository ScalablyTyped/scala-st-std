package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowEventHandlersEventMap extends js.Object {
  var afterprint: Event
  var beforeprint: Event
  var beforeunload: BeforeUnloadEvent
  var hashchange: HashChangeEvent
  var message: MessageEvent
  var offline: Event
  var online: Event
  var pagehide: PageTransitionEvent
  var pageshow: PageTransitionEvent
  var popstate: PopStateEvent
  var storage: StorageEvent
  var unload: Event
}

object WindowEventHandlersEventMap {
  @scala.inline
  def apply(
    afterprint: Event,
    beforeprint: Event,
    beforeunload: BeforeUnloadEvent,
    hashchange: HashChangeEvent,
    message: MessageEvent,
    offline: Event,
    online: Event,
    pagehide: PageTransitionEvent,
    pageshow: PageTransitionEvent,
    popstate: PopStateEvent,
    storage: StorageEvent,
    unload: Event
  ): WindowEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(afterprint = afterprint.asInstanceOf[js.Any], beforeprint = beforeprint.asInstanceOf[js.Any], beforeunload = beforeunload.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventHandlersEventMap]
  }
  @scala.inline
  implicit class WindowEventHandlersEventMapOps[Self <: WindowEventHandlersEventMap] (val x: Self) extends AnyVal {
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
    def setAfterprint(value: Event): Self = this.set("afterprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeprint(value: Event): Self = this.set("beforeprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeunload(value: BeforeUnloadEvent): Self = this.set("beforeunload", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashchange(value: HashChangeEvent): Self = this.set("hashchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: MessageEvent): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffline(value: Event): Self = this.set("offline", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnline(value: Event): Self = this.set("online", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagehide(value: PageTransitionEvent): Self = this.set("pagehide", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageshow(value: PageTransitionEvent): Self = this.set("pageshow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopstate(value: PopStateEvent): Self = this.set("popstate", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorage(value: StorageEvent): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnload(value: Event): Self = this.set("unload", value.asInstanceOf[js.Any])
  }
  
}


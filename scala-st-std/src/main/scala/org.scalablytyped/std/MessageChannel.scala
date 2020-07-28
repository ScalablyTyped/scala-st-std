package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Channel Messaging API interface allows us to create a new message channel and send data through it via its two MessagePort properties. */
trait MessageChannel extends js.Object {
  /**
    * Returns the first MessagePort object.
    */
  val port1: MessagePort
  /**
    * Returns the second MessagePort object.
    */
  val port2: MessagePort
}

object MessageChannel {
  @scala.inline
  def apply(port1: MessagePort, port2: MessagePort): MessageChannel = {
    val __obj = js.Dynamic.literal(port1 = port1.asInstanceOf[js.Any], port2 = port2.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageChannel]
  }
  @scala.inline
  implicit class MessageChannelOps[Self <: MessageChannel] (val x: Self) extends AnyVal {
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
    def setPort1(value: MessagePort): Self = this.set("port1", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort2(value: MessagePort): Self = this.set("port2", value.asInstanceOf[js.Any])
  }
  
}


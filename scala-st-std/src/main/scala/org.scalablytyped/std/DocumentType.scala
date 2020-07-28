package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentType
  extends Node
     with ChildNode {
  val entities: NamedNodeMap = js.native
  val internalSubset: java.lang.String | Null = js.native
  val name: java.lang.String = js.native
  val notations: NamedNodeMap = js.native
  val publicId: java.lang.String = js.native
  val systemId: java.lang.String = js.native
}


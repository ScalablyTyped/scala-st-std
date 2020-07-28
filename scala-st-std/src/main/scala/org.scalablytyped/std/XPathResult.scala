package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XPathResult extends js.Object {
  val ANY_TYPE: Double
  val ANY_UNORDERED_NODE_TYPE: Double
  val BOOLEAN_TYPE: Double
  val FIRST_ORDERED_NODE_TYPE: Double
  val NUMBER_TYPE: Double
  val ORDERED_NODE_ITERATOR_TYPE: Double
  val ORDERED_NODE_SNAPSHOT_TYPE: Double
  val STRING_TYPE: Double
  val UNORDERED_NODE_ITERATOR_TYPE: Double
  val UNORDERED_NODE_SNAPSHOT_TYPE: Double
  val booleanValue: scala.Boolean
  val invalidIteratorState: scala.Boolean
  val numberValue: Double
  val resultType: Double
  val singleNodeValue: Node
  val snapshotLength: Double
  val stringValue: java.lang.String
  def iterateNext(): Node
  def snapshotItem(index: Double): Node
}

object XPathResult {
  @scala.inline
  def apply(
    ANY_TYPE: Double,
    ANY_UNORDERED_NODE_TYPE: Double,
    BOOLEAN_TYPE: Double,
    FIRST_ORDERED_NODE_TYPE: Double,
    NUMBER_TYPE: Double,
    ORDERED_NODE_ITERATOR_TYPE: Double,
    ORDERED_NODE_SNAPSHOT_TYPE: Double,
    STRING_TYPE: Double,
    UNORDERED_NODE_ITERATOR_TYPE: Double,
    UNORDERED_NODE_SNAPSHOT_TYPE: Double,
    booleanValue: scala.Boolean,
    invalidIteratorState: scala.Boolean,
    iterateNext: () => Node,
    numberValue: Double,
    resultType: Double,
    singleNodeValue: Node,
    snapshotItem: Double => Node,
    snapshotLength: Double,
    stringValue: java.lang.String
  ): XPathResult = {
    val __obj = js.Dynamic.literal(ANY_TYPE = ANY_TYPE.asInstanceOf[js.Any], ANY_UNORDERED_NODE_TYPE = ANY_UNORDERED_NODE_TYPE.asInstanceOf[js.Any], BOOLEAN_TYPE = BOOLEAN_TYPE.asInstanceOf[js.Any], FIRST_ORDERED_NODE_TYPE = FIRST_ORDERED_NODE_TYPE.asInstanceOf[js.Any], NUMBER_TYPE = NUMBER_TYPE.asInstanceOf[js.Any], ORDERED_NODE_ITERATOR_TYPE = ORDERED_NODE_ITERATOR_TYPE.asInstanceOf[js.Any], ORDERED_NODE_SNAPSHOT_TYPE = ORDERED_NODE_SNAPSHOT_TYPE.asInstanceOf[js.Any], STRING_TYPE = STRING_TYPE.asInstanceOf[js.Any], UNORDERED_NODE_ITERATOR_TYPE = UNORDERED_NODE_ITERATOR_TYPE.asInstanceOf[js.Any], UNORDERED_NODE_SNAPSHOT_TYPE = UNORDERED_NODE_SNAPSHOT_TYPE.asInstanceOf[js.Any], booleanValue = booleanValue.asInstanceOf[js.Any], invalidIteratorState = invalidIteratorState.asInstanceOf[js.Any], iterateNext = js.Any.fromFunction0(iterateNext), numberValue = numberValue.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any], singleNodeValue = singleNodeValue.asInstanceOf[js.Any], snapshotItem = js.Any.fromFunction1(snapshotItem), snapshotLength = snapshotLength.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[XPathResult]
  }
  @scala.inline
  implicit class XPathResultOps[Self <: XPathResult] (val x: Self) extends AnyVal {
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
    def setANY_TYPE(value: Double): Self = this.set("ANY_TYPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setANY_UNORDERED_NODE_TYPE(value: Double): Self = this.set("ANY_UNORDERED_NODE_TYPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setBOOLEAN_TYPE(value: Double): Self = this.set("BOOLEAN_TYPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setFIRST_ORDERED_NODE_TYPE(value: Double): Self = this.set("FIRST_ORDERED_NODE_TYPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMBER_TYPE(value: Double): Self = this.set("NUMBER_TYPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setORDERED_NODE_ITERATOR_TYPE(value: Double): Self = this.set("ORDERED_NODE_ITERATOR_TYPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setORDERED_NODE_SNAPSHOT_TYPE(value: Double): Self = this.set("ORDERED_NODE_SNAPSHOT_TYPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTRING_TYPE(value: Double): Self = this.set("STRING_TYPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNORDERED_NODE_ITERATOR_TYPE(value: Double): Self = this.set("UNORDERED_NODE_ITERATOR_TYPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNORDERED_NODE_SNAPSHOT_TYPE(value: Double): Self = this.set("UNORDERED_NODE_SNAPSHOT_TYPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setBooleanValue(value: scala.Boolean): Self = this.set("booleanValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidIteratorState(value: scala.Boolean): Self = this.set("invalidIteratorState", value.asInstanceOf[js.Any])
    @scala.inline
    def setIterateNext(value: () => Node): Self = this.set("iterateNext", js.Any.fromFunction0(value))
    @scala.inline
    def setNumberValue(value: Double): Self = this.set("numberValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultType(value: Double): Self = this.set("resultType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingleNodeValue(value: Node): Self = this.set("singleNodeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshotItem(value: Double => Node): Self = this.set("snapshotItem", js.Any.fromFunction1(value))
    @scala.inline
    def setSnapshotLength(value: Double): Self = this.set("snapshotLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringValue(value: java.lang.String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
  }
  
}

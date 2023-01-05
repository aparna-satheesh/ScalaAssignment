package com.aparna.scala
import org.scalatest.funsuite.AnyFunSuite

class ElemRepeatTest extends AnyFunSuite {
  test("ElemRepeatTest.e1") {
    assert(ElemRepeat.elemRepeat(List(1,2),3) ===List(1,1,1,2,2,2))
    assert(ElemRepeat.elemRepeat(List(1,2,4),2) ===List(1,1,2,2,4,4))
  }
}

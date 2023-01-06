package com.aparna.scala
import org.scalatest.funsuite.AnyFunSuite

class AbsValueTest extends AnyFunSuite {
  test("AbsValueTest.a1") {
    assert(AbsVal.absValue(List(-12,-11))===0)
    assert(AbsVal.absValue(List(-12,-11,10,1,9,-11))===3)
  }
}

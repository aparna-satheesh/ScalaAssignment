package com.aparna.scala
import org.scalatest.funsuite.AnyFunSuite
class GreatestElemTest extends AnyFunSuite:
  test("GreatestElemTest.g1") {
    assert(GreatestElement.greatestElement(Array(9,21,11,8,7,14)) === Array(21,14,14,14,14,-1))
    assert(GreatestElement.greatestElement(Array(0)) === Array(-1))
}

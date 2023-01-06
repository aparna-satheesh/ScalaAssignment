package com.aparna.scala
import org.scalatest.funsuite.AnyFunSuite
class DiffElementTest extends AnyFunSuite:
    test("DiffELementTest.d1") {
      assert(DiffElement.diffElem(Array(2, 3, 5, 7, -7, -5)) === 5)
}

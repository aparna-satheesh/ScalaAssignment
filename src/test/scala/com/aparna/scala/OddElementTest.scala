package com.aparna.scala
import org.scalatest.funsuite.AnyFunSuite

class OddElementTest extends AnyFunSuite {
  test("OddElementTest.t1") {
  assert(OddElement.oddElement(List(1,2,3,4))===List(2,4))
}
}

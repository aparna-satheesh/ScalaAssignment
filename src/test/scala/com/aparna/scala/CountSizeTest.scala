package com.aparna.scala
import org.scalatest.funsuite.AnyFunSuite
class CountSizeTest extends AnyFunSuite {
  test("CountSizeTest.t1") {
    assert(CountSize.countSize(Array(1,1,1,1,1,1,1,1,1,1)) === 10 )
    assert(CountSize.countSize(Array()) === 0 )
  }
}

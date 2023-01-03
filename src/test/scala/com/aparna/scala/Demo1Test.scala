package com.aparna.scala
import org.scalatest.funsuite.AnyFunSuite

class Demo1Test extends AnyFunSuite:
  test("Demo1Test.d1") {
  assert(Demo1.Close100(110,3) === 110)
  assert(Demo1.Close100(110,110)===0)
  }


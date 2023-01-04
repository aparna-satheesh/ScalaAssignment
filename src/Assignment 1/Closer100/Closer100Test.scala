package com.aparna.scala
import org.scalatest.funsuite.AnyFunSuite

class Closer100Test extends AnyFunSuite:
  test("Demo1Test.d1") {
  assert(Closer100.Close100(110,3) === 110)
  assert(Closer100.Close100(110,110)===0)
  }


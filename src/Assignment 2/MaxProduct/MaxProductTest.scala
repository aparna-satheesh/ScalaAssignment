package com.aparna.scala
import org.scalatest.funsuite.AnyFunSuite

class MaxProductTest extends AnyFunSuite:
  test("MaxProductTest.m1") {
    assert(MaxProduct.maxProduct(Array(2,3,5,7,-7,-5)) === 35)
    assert(MaxProduct.maxProduct(Array(0,-7)) === 0)
  }
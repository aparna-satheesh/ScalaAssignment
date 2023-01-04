package com.aparna.scala
import org.scalatest.funsuite.AnyFunSuite

class HappyCharTest extends AnyFunSuite {
  test("HappyCharTest.h1") {
    assert(HappyChar.happyChar("Google",'o') === true)
    assert(HappyChar.happyChar("Google", 'g') === false)

}
}

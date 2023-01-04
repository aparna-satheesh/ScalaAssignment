package com.aparna.scala
import org.scalatest.funsuite.AnyFunSuite
class AddCharTest extends AnyFunSuite {
  test("AddCharTest.t1") {
    assert(AddChar.addCharacter("Buy", "b" )=== "bBuyb")
  }
}

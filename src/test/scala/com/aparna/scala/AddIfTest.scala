package com.aparna.scala
import org.scalatest.funsuite.AnyFunSuite
class AddIfTest extends AnyFunSuite {
  test("AddIf.a1") {
    assert(AddIf.addIf("test") === "Iftest")
    assert(AddIf.addIf("Ifelse") === "Ifelse")
  }
}


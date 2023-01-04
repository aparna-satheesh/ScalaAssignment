package com.aparna.scala
import org.scalatest.funsuite.AnyFunSuite
class AddIfTest extends AnyFunSuite {
  test("AddIf.ad .1") {
    assert(AddIf.addIf("test") === "Iftest")
    assert(AddIf.addIf("Ifelse") === "Ifelse")
  }
}


package com.aparna.scala
import org.scalatest.funsuite.AnyFunSuite

class CheckVarTest extends AnyFunSuite {
  test("CheckVar.c1") {
    assert(CheckVar.variableCheck(25,50) === false)
    assert(CheckVar.variableCheck(5,15) === true)
  }
}

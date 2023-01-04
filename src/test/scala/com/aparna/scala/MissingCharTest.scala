package com.aparna.scala
import org.scalatest.funsuite.AnyFunSuite

class MissingCharTest extends AnyFunSuite {
    test("MissingCharTest.m1") {
      assert(MissingChar.MissingCharacter("Scala",1)=== "Sala")
    }
}

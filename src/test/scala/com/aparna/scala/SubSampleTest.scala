package com.aparna.scala
import org.scalatest.funsuite.AnyFunSuite

class SubSampleTest extends AnyFunSuite:
  test("SubSampleTest.s1") {
    assert(SubSample.SubSampleString("India",3)==="InInIn")
}

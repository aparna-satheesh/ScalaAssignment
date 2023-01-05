package com.aparna.scala

object AbsVal {
  def absValue(abslist:List[Int]):Unit={
    for (i <- abslist) {
      println((i).abs)
    }
  }
  def main(args:Array[String]):Unit={
    val abslist: List[Int] = List[Int](-12,23,45,87,-100)
    println("Original array:")
    for (x <- abslist) {
      print(s"${x} ")
    }
    println()
    println("Absolute List: ")
    absValue(abslist)
  }

}

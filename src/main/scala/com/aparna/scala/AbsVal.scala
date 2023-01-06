package com.aparna.scala

object AbsVal {
  def absValue(abslist:List[Int]):Int={
    var count: Int = 0
    for (i <- abslist) {
      println((i).abs)
      if(i>0)
        count+=1 //maintaining count variable for testing
    }
    return count
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

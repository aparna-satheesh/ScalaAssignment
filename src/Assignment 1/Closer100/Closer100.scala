package com.aparna.scala
object Closer100 {
 def Close100(a: Int, b: Int): Int = {
    val diff_a: Int = (100 - a).abs
    val diff_b: Int = (100 - b).abs
    //print("Diffb"+diff_b)
    //print("Diffa"+diff_a)
    if (diff_a < diff_b) { //println("In if loop1")
      return a
    }
    else if (diff_b == diff_a) {
      return 0
    }
    else { //println("In else loop")
      return b
    }
  }
def main(args: Array[String]): Unit = {
  println("In Main func")
  println("Enter 2 numbers: ")
  var val1 = scala.io.StdIn.readInt()
  var val2 = scala.io.StdIn.readInt()
  println("Number closer to 100 is :" + Closer100.Close100(val1, val2))
  }
}

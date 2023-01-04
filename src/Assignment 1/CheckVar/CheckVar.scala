package com.aparna.scala

object CheckVar {
  def variableCheck(x: Int, y: Int): Boolean = {
    if ((x <= 20 && y <= 50) || (y <= 20 && x <= 50))
      return true
    else
      return false
  }

  def main(args:Array[String]):Unit={
    println("In Main func")
    println("Enter x value ")
    var x = scala.io.StdIn.readInt()
    println("Enter y value ")
    var y = scala.io.StdIn.readInt()
    if(variableCheck(x,y))  println("Condition satisfied")
    else  println("Condition not satisfied")
  }
}

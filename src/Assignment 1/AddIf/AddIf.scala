package com.aparna.scala

object AddIf {
  def addIf(str3: String): String = {
    if ((str3.substring(0, 2) == "If") || (str3.substring(0, 2) == "if")) {
      return str3
    }
    else {
      val str31 = "If" + str3
      return str31
    }
  }
  def main(args:Array[String]):Unit ={
    println("In Main")
    //Reading input values from user
    println("Input Sample String: ")
    var str3 = scala.io.StdIn.readLine()
    println("Output: "+addIf(str3) )
  }
}

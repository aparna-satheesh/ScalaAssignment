package com.aparna.scala

object SubSample {
  def SubSampleString(str:String, n: Int):String= {
    //The func extracts 2 chars from the string and displays it n number of times
    val str1 = str.substring(0, 2)
    val str2 = str1 * n
    return str2
  }

  def main(args: Array[String]): Unit = {
    println("In Main")
    //The string input is India, thus "In" is repeated for 4 times as mentioned in the function call
    val str3= "India"
    println("Input: "+ str3)
    println("Output: "+ SubSample.SubSampleString(str3,4))
  }
}

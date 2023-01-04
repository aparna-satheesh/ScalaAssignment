package com.aparna.scala

object AddChar {
  def addCharacter(str2: String, add_char: String): String = {
    val strnew1 = add_char + str2 + add_char
    return strnew1
  }

  def main(args: Array[String]): Unit = {
    println("In main")
    println("Input String: ")
    var str3 = scala.io.StdIn.readLine()
    println("Input char value ")
    var cval = scala.io.StdIn.readLine()
    println("Output: "+addCharacter(str3,cval))
  }
}

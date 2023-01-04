package com.aparna.scala

object MissingChar {
  def MissingCharacter(l:String, n:Int):String={
    val str_1=l.take(n)+l.drop(n+1)
    return str_1
  }

  def main(args:Array[String]): Unit={
    println("In main")
    println("Input String: ")
    var str3 = scala.io.StdIn.readLine()
    println("Input n value: ")
    var nval = scala.io.StdIn.readInt()
    println(MissingCharacter(str3,nval))
  }
}

package com.aparna.scala

object HappyChar {
  def happyChar(str: String, spc: Char): Boolean = {
    var l = str.length();
    var char_happy = true;
    for (i <- 0 to l - 1) {
      if (str.charAt(i) == spc) {
        if (i > 0 && str.charAt(i - 1) == spc)
          char_happy = true;
        else if (i < l - 1 && str.charAt(i + 1) == spc)
          char_happy = true;
        else
          char_happy = false;
      }
    }
    char_happy;
  }
  def main(args:Array[String]):Unit={
    println("In Main func")
    println("Enter the string: ")
    var str = scala.io.StdIn.readLine()
    println("Enter the character: ")
    var cval= scala.io.StdIn.readChar()
    if(happyChar(str,cval)) println(cval+" is happy")
    else println(cval+" is not happy")
  }
}

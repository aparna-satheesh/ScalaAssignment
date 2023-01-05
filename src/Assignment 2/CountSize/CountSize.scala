package com.aparna.scala

object CountSize {

  def countSize(nums:Array[Int]):Int={
    var j :Int =0
    for (x <- nums) {
     // print(s"${x}, ")
      j += 1
    }
    return j
  }
  def main(args:Array[String]):Unit={
    val nums = Array(2, 3, 5, 7, -7, -5,-5,-5,-5);
    println("Original array:")
    for (x <- nums) {
      print(s"${x} ")}
    println()
    println("Size of the Array: "+countSize(nums))
    }
}

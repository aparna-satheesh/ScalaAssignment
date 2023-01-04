package com.aparna.scala

object OddElement{
    def main(args: Array[String]): Unit = {
      val nums = List(1, 3, 5, 7, 9, 11, 14, 12)
      println("Original list:")
      println(nums)
      //As scala List is immutable, so we can’t delete elements from it, but
      //filter out element(s) as per requirement.
      //println("Filter out 3 from the above list:")
      val nums1 = nums.filter(_ != 3)
      println(nums1)
    }
}

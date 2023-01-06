package com.aparna.scala

object DiffElement {
  def diffElem(nums1: Array[Int]): Int = {
      var max_diff = Integer.MIN_VALUE;
      for (i <- 0 to nums1.length - 1) {
        for (j <- i + 1 to nums1.length - 1) {
          max_diff = Integer.max(max_diff, nums1(j) - nums1(i));
        }
      }
      return max_diff
    }

  def main(args: Array[String]): Unit = {
    val nums = Array(2, 3, 5, 7, -7, -5);
    println("Original array:")
    for (x <- nums) {
      print(s"${x}, ")
    }
    val result = diffElem(nums)
    println("\nMaximum Difference between elements:"+result)
  }
}

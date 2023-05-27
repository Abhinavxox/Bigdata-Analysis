import scala.io.StdIn

object BinarySearch {
  
  def binarySearch(arr: Array[Int], target: Int): Option[Int] = {
    var left = 0
    var right = arr.length - 1
    
    while (left <= right) {
      val mid = left + (right - left) / 2
      
      if (arr(mid) == target)
        return Some(mid)
      
      if (arr(mid) < target)
        left = mid + 1
      else
        right = mid - 1
    }
    
    None
  }
  
  def main(args: Array[String]): Unit = {
    println("Enter the number of elements:")
    val n = StdIn.readInt()
    
    println("Enter the elements in sorted order:")
    val arr = new Array[Int](n)
    for (i <- 0 until n) {
      arr(i) = StdIn.readInt()
    }
    
    println("Enter the target element:")
    val target = StdIn.readInt()
    
    val result = binarySearch(arr, target)
    result match {
      case Some(index) => println(s"Element $target found at index $index.")
      case None => println(s"Element $target not found in the array.")
    }
  }
}

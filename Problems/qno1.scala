object qo1 {
  def doubleList(num_list: List[Int]): List[Int] = {
    return num_list.map(_ * 2)
  }

  def main(args: Array[String]): Unit = {
    println("Enter the number of elements: ")
    val count = scala.io.StdIn.readInt()
    var num_list = List[Int]()
    for (i <- 0 until count) {
      print(s"Enter element ${i + 1}: ")
      num_list = num_list :+ scala.io.StdIn.readInt()
    }
    println("Double List: " + doubleList(num_list))
  }
}

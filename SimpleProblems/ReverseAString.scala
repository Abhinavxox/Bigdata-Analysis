import scala.io.StdIn

object ReverseString {
  def main(args: Array[String]): Unit = {
    println("Enter a string:")
    val input = StdIn.readLine()

    val reversed = input.reverse
    println("Reversed string: " + reversed)
  }
}


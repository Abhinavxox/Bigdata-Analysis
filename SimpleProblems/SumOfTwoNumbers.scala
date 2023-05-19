import scala.io.StdIn

object SumOfTwoNumbers {
  def main(args: Array[String]): Unit = {
    println("Enter the first number:")
    val num1 = StdIn.readInt()

    println("Enter the second number:")
    val num2 = StdIn.readInt()

    val sum = num1 + num2
    println("Sum: " + sum)
  }
}

import scala.io.StdIn

object MaximumOfThreeNumbers {
  def main(args: Array[String]): Unit = {
    println("Enter the first number:")
    val num1 = StdIn.readInt()

    println("Enter the second number:")
    val num2 = StdIn.readInt()

    println("Enter the third number:")
    val num3 = StdIn.readInt()

    val max = findMaximum(num1, num2, num3)
    println("Maximum: " + max)
  }

  def findMaximum(a: Int, b: Int, c: Int): Int = {
    Math.max(a, Math.max(b, c))
  }
}

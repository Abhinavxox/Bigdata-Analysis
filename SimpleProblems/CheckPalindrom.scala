import scala.io.StdIn

object PalindromeCheck {
  def main(args: Array[String]): Unit = {
    println("Enter a string:")
    val input = StdIn.readLine()

    val isPalindrome = checkPalindrome(input)
    if (isPalindrome)
      println("Palindrome")
    else
      println("Not a palindrome")
  }

  def checkPalindrome(str: String): Boolean = {
    str == str.reverse
  }
}

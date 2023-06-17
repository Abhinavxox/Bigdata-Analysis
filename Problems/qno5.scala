object q05{
def capitalizeStrings(str_list: List[String]): List[String] = {
return str_list.map(_.capitalize)
}
def main(args: Array[String]): Unit = {
println("Enter the number of elements: ")
val count = scala.io.StdIn.readInt()
var str_list = List[String]()
for (i <- 0 until count) {
print(s"Enter element ${i + 1}: ")
str_list = str_list :+ scala.io.StdIn.readLine()
}
println("Capitalized Strings: "+capitalizeStrings(str_list))
}
}
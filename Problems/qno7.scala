object q07{
def flattenOption[A](list: List[Option[A]]): List[A] = {
return list.flatMap(_.toList)
}
def main(args: Array[String]): Unit = {
println("Enter the number of elements: ")
val count = scala.io.StdIn.readInt()
var num_list = List[Option[Int]]()
for (i <- 0 until count) {
print(s"Enter element ${i + 1}: ")
num_list = num_list :+ Option(scala.io.StdIn.readInt())
}
println("Flattened List: "+flattenOption(num_list))
}
}
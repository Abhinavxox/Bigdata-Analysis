object q09 {
def flattenList(listOfLists: List[List[Int]]): List[Int] = {
return listOfLists.flatMap(list => list)
}
def main(args: Array[String]): Unit = {
println("Enter the number of lists: ")
val count = scala.io.StdIn.readInt()
var listOfLists = List[List[Int]]()
for (i <- 0 until count) {
print(s"Enter list ${i + 1} elements separated by spaces: ")
val inputList = scala.io.StdIn.readLine().split("").map(_.toInt).toList
listOfLists = listOfLists :+ inputList
}
val flattenedList = flattenList(listOfLists)
println("Flattened List: " + flattenedList.mkString(", "))
}
}
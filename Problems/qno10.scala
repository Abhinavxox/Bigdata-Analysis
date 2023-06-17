object q10 {
def countOccurrences(stringList: List[String]): Map[String, Int] = {
return stringList.foldLeft(Map.empty[String, Int]) {
(countMap, str) => countMap + (str -> (countMap.getOrElse(str, 0) +
1))
}
}
def main(args: Array[String]): Unit = {
println("Enter the number of strings: ")
val count = scala.io.StdIn.readInt()
var stringList = List[String]()
for (i <- 0 until count) {
print(s"Enter string ${i + 1}: ")
stringList = stringList :+ scala.io.StdIn.readLine()
}
val occurrencesMap = countOccurrences(stringList)
println("Occurrences Map: " + occurrencesMap)
}
}
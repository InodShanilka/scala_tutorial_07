object q2 {

  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(num => num * num)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5)
    val squares = calculateSquare(inputList)

    println(s"Input: $inputList")
    println(s"Output: $squares")
  }
}

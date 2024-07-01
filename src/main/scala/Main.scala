object ScalaFunctions{

  def reverse(str:String):String = {
    if (str.isEmpty) ""
    else reverse(str.tail)+str.head
  }

  def filterStrings(strings:List[String]):List[String] = {
    strings.filter(_.length > 5)
  }

  def average(num1: Int, num2: Float): Double = {
  val mean = (num1+num2)/2.0
  math.round(mean*100.0)/100.0
  }

def sumEvenNumbers(numbers: List[Int]): Int = {
  val evenNumbers = numbers.filter(_ %2 == 0)
  var sum = 0
  for (num <- evenNumbers) {
    sum += num
  }
  sum
}

  def main(args: Array[String]): Unit = {
    val string = "hello"
    println(s"Reverse of $string is ${reverse(string)}")

    val string2 = List("Pehan","harithya","udeepa","john","navod")
    println(s"Strings longer than 5 characters - ${filterStrings(string2)}")

    val num1 = 1
    val num2 = 2.5434f
    println(s"Average = ${average(num1, num2)}")

    val numbers = List(1,2,3,4,5,6)
    println(s"Sum = ${sumEvenNumbers(numbers)}")
  }
}

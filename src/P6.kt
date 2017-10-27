/**
 * Created by jyotirani on 05/10/17.
 */

fun main(args: Array<String>) {
print("Enter decimal number: ")
  val NUMBER = readLine()!!.toInt()

  val binary = convertDecimalToBinary(NUMBER)
  println("$NUMBER in decimal = $binary in Binary")


}

fun convertDecimalToBinary(number: Int): Long {
  var remainder: Int
  var quotient = number/2
  var binaryNumber: Long = 0
  var i = 1
  var step = 1

  while (number != 0) {
    remainder = number % 2
    println("Step $step: $number/2, Remainder = $remainder, Quotient = $quotient")
    step = i + 1
    binaryNumber += (remainder * i).toLong()
    i *= 10
  }
  return binaryNumber
}
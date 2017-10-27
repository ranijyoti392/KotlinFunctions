/**
 * Created by jyotirani on 06/10/17.
 */

fun main(args: Array<String>) {
  print("Enter Number: ")
  val NUMBER = readLine()!!.toInt()

  prime(NUMBER)

}

fun prime(number: Int) {
  for (index in 2..number-1) {
    if (index % 2 == 0) {
      println("The number $number is not a prime number")
    } else {
      println("The number $number is a prime number")
    }
  }
}
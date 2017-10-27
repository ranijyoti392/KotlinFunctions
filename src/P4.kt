/**
 * Created by jyotirani on 05/10/17.
 */

fun main(args: Array<String>) {
  print("Enter Number: ")
  val NUMBER = readLine()!!.toInt()

  evenCheck(NUMBER)
}

fun evenCheck(NUMBER: Int) {
  if (NUMBER % 2 == 0) {
    println("Entered Number $NUMBER is an Even number: ")
  } else {
    println("Entered Number $NUMBER is an Odd number: ")
  }
}
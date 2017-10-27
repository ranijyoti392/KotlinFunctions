/**
 * Created by jyotirani on 05/10/17.
 */

fun main(args: Array<String>) {
  print("Enter Number: ")
  val NUMBER = readLine()!!.toInt()
  print(square(NUMBER))
}

fun square(number: Int): Int {
   return number * number
}
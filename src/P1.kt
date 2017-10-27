/**
 * Created by jyotirani on 05/10/17.
 */

fun main(args: Array<String>) {
  print("Enter 2 numbers: ")
  val INTEGER_1 = readLine()!!.toInt()
  val INTEGER_2 = readLine()!!.toInt()
  // showSum(INTEGER_1, INTEGER_2)
  print(getSum(INTEGER_1, INTEGER_2))
}

fun showSum(first: Int, second: Int) {
  println("The Sum of ($first, $second) is : ${first + second} ")
}

fun getSum(first: Int, second: Int): Int {
  return first + second
}


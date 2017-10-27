import org.jetbrains.annotations.Mutable

/**
 * Created by jyotirani on 06/10/17.
 */

fun main(args: Array<String>) {
print("Input the number of elements to be stored in the array : ")
  var arraySize = readLine()!!.toInt()
  var arrayList = mutableListOf<Int>()

  for (index in 0..arraySize - 1) {
    print("elements - $index : ")
    var element = readLine()!!.toInt()
    arrayList.add(index, element)
    println()
  }

  println("Largest Number is ${largestNumber(arrayList)}")

}

fun largestNumber(arrayList: MutableList<Int>): Int {
  var max = 0
  for (element in arrayList) {
    if (element > max) {
      max = element
    }
  }
  return max
}
/**
 * Created by jyotirani on 05/10/17.
 */

fun main(args: Array<String>) {
  var a = 6
  var b = 10

//  swap(a,b)

//  swap(2, 8)

}

fun swap(x: Int, y: Int) {
  var a = x
  var b = y
  println("Before Swapping : \n a = $a\n b = $b")
  a = a + b // a = 16, b=10
  b = a - b // a = 16, b = 6
  a = a - b // a = 10, b = 6
  println("After Swapping : \n a = $a\n b = $b")
}
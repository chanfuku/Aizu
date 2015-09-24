package ITP1_9_A

import scala.util.control.Breaks.{ break, breakable }

object Main {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val lines = scala.collection.mutable.MutableList.empty[String]
    val word = sc.next().toUpperCase()

    breakable {
      while (true) {
        val input = sc.next()
        if (input == "END_OF_TEXT") {
          println(lines.count(_ == word))
          break
        } else lines += input.toUpperCase()
      }
    }
  }
}

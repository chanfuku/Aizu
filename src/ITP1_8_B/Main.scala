package ITP1_8_B

import scala.util.control.Breaks.{ break, breakable }

object Main {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val nums = scala.collection.mutable.MutableList.empty[List[Int]]

    breakable {
      while (true) {
        val num = sc.next().split("").toList.map(_.toInt)
        if (num(0) == 0) break
        nums += num
      }
    }

    nums.foreach { num =>
      println(num.foldLeft(0)((a, b) => a + b))
    }
  }
}

package ITP1_9_B

import scala.util.control.Breaks.{ break, breakable }

object Main {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val mList = collection.mutable.MutableList.empty[(String, List[Int])]

    breakable {
      while (true) {
        val word = sc.next()
        if (word == "-") break
        val n = sc.nextInt()
        val numbers = List.fill(n)(sc.nextInt)
        mList += (word -> numbers)
      }
    }

    for {
      (word, numbers) <- mList
    } yield {
      val target = numbers.foldLeft(word)((w, n) => w.drop(n) + w.take(n))
      println(target)
    }
  }
}

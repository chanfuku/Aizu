package ITP1_8_C

import scala.util.control.Breaks.{ break, breakable }
import scala.io.Source

object Main {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val lines = scala.collection.mutable.MutableList.empty[String]

    // 未入力でEnter押下された場合どうしたらよいのか調査中
    breakable {
      while (sc.hasNext()) {
        val str = sc.next().map(_.toLower)
        lines += str
        if (str.contains(".")) break
      }
    }

    'a' to 'z' foreach { c =>
      println(s"${c} : " + lines.mkString.count(_ == c))
    }
  }
}

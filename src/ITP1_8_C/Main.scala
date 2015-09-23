package ITP1_8_C

import scala.io.Source

object Main {
  def main(args: Array[String]) {
    val lines = scala.collection.mutable.MutableList.empty[String]

    for (line <- Source.stdin.getLines) {
      lines += line.map(_.toLower)
      if (line.length() == 0 || line.contains(".")) {
        'a' to 'z' foreach { c =>
          println(s"${c} : " + lines.mkString.count(_ == c))
        }
      }
    }
  }
}

package ITP1_8_A

object Main {

  def main(args: Array[String]) = {
    val str = scala.io.StdIn.readLine().map { x =>
      if (x.isLower) x.toUpper
      else x.toLower
    }

    println(str)
  }
}

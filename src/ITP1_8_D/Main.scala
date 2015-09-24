package ITP1_8_D

object Main {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val s = sc.next()
    val p = sc.next()

    println(if ((s * 2).contains(p)) "Yes" else "No")
  }
}

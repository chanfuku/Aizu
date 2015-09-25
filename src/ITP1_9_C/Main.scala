package ITP1_9_C

object Main {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val pair = List.fill(n)(sc.next(), sc.next())

    val score = pair.foldLeft((0, 0)) {
      case (score, (input1, input2)) =>
        val seq = Seq(input1, input2)
        if (input1 == input2) (score._1 + 1, score._2 + 1)
        else if (seq.sorted == seq) (score._1, score._2 + 3)
        else (score._1 + 3, score._2)
    }

    println(s"${score._1} ${score._2}")
  }
}

package addressbook.util

import scala.io.Source
import scala.util.Try

object ReadFileAsLines {

  def apply(filename: String): Try[Seq[String]] = Try {
    Source.fromFile(filename).getLines().toVector
  }

}

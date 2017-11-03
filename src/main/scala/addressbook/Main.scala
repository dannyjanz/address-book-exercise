package addressbook

import addressbook.extractor.ExtractPerson
import addressbook.util.ReadFileAsLines
import addressbook.util.TryUtil._

import scala.util.{Failure, Success}

object Main extends App {

  args match {
    case Array() => run("AddressBook")
    case Array(filename) => run(filename)
    case _ => println("Number of arguments not supported!")
  }

  def run(filename: String): Unit = {
    ReadFileAsLines(filename)
      .flatMap { lines => lines.map(ExtractPerson).flattenToTry }
      .flatMap { persons => AnswerTheQuestions(persons) } match {
      case Success(answers) => answers foreach println
      case Failure(error) => println(s"The questions could not be answered due to the following error: ${error.getMessage}")

    }
  }

}




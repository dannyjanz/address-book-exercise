package addressbook

import addressbook.person.{AgeDifferenceInDays, CountMales, Find, Person}

import scala.util.Try

object AnswerTheQuestions {

  def apply(persons: Seq[Person]): Try[Seq[(String)]] = {

    val ageDifferenceBillAndPaul = for {
      bill <- Find.byFirstName(persons, "Bill")
      paul <- Find.byFirstName(persons, "Paul")
    } yield AgeDifferenceInDays(bill, paul)

    for {
      daysBetweenBillAndPaul <- ageDifferenceBillAndPaul
      numberOfMales <- Try(CountMales(persons))
      oldestPerson <- Try(Find.oldestPerson(persons))
    } yield {
      Seq(
        s"1. There are $numberOfMales males in the address book.",
        s"2. The oldest Person is $oldestPerson.",
        s"3. Bill is $daysBetweenBillAndPaul days older than Paul"
      )
    }
  }

}

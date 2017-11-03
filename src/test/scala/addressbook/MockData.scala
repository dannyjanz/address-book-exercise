package addressbook

import java.time.LocalDate

import addressbook.person.{Female, Male, Person}

object MockData {

  val WesJackson = Person("Wes", "Jackson", Male, LocalDate.of(1974, 8, 14))
  val BillMcKnight = Person("Bill", "McKnight", Male, LocalDate.of(1977, 3, 16))
  val PaulRobinson = Person("Paul", "Robinson", Male, LocalDate.of(1985, 1, 15))

  val persons = Seq(
    BillMcKnight,
    PaulRobinson,
    Person("Gemma", "Lane", Female, LocalDate.of(1991, 11, 20)),
    Person("Sarah", "Stone", Female, LocalDate.of(1980, 9, 20)),
    WesJackson
  )

}

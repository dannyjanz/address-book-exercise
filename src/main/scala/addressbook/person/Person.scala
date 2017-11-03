package addressbook.person

import java.time.LocalDate

case class Person(firstName: String, lastName: String, gender: Gender, birthday: LocalDate)

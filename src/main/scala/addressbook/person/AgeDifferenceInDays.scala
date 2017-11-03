package addressbook.person

import java.time.temporal.ChronoUnit.DAYS

object AgeDifferenceInDays {

  def apply(person_1: Person, person_2: Person): Long =
    Math.abs(DAYS.between(person_1.birthday, person_2.birthday))

}

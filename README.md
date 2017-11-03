# Address Book Exercise

> Your application needs to read the attached AddressBook file and answer the following questions:
> 1. How many males are in the address book?
> 2. Who is the oldest person in the address book?
> 3. How many days older is Bill than Paul?


- `sbt` based `Scala` project with the default `sbt` layout
- No dependencies beside `Scala` 2.12 and `ScalaTest` 3.0
- run application with `sbt runMain addressbook.Main`, provided that `sbt` is installed
    - application takes 1 optional parameter, the address book filename
    - if no filename is provided the default filename 'AddressBook' is used

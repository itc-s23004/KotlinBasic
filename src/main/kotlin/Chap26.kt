package org.example.chap26

import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {
val book = Book(
    100,
    "やさしい　Kotlin 入門",
    "野崎英一",
    LocalDate.of(2018, 5, 10)
)
}

class BookInfo(
    val id: Long,
    val title: String,
    val author: String,
    val isRental: Boolean,
)

class Book(
    val id: Long,
    val title: String,
    val author: String,
    val rentalDate: LocalDate,
)


class Rental(
    val bookId: Long,
    val userName: String,
    val rentalDateTime: LocalDateTime,
    val rentalDateline: LocalDateTime,
)

class BookWithRental(
    val book: Book,
    val rental: Rental?,
){
val isRental: Boolean
get() = rental != null
}
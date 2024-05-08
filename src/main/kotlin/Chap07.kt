package org.example

fun main(args: Array<String>) {
  //  val delicious = true
  //  val chep = false
  //  println("このレストランは美味しい : $delicious")
  // println("このレストランは安い : $chep")

    val delicious2 = true
    val cheap2 = true
    val lestEat2 = (delicious2 && cheap2)
    println("食事する？ : $lestEat2")
    val delicious3 = true
    val cheap3 = false
    val lestEat3 = delicious3 && cheap3
    println("食事する？ : $lestEat3")
    val delicious4 = false
    val cheap4 = true
    val lestEat4 = delicious4 && cheap4
    println("食事する？ : $lestEat4")
    val delicious5 = false
    val cheap5 = false
    val lestEat5 = delicious5 && cheap5
    println("食事する？ : $lestEat5")
    val delicious6 = true
    val cheap6 = true
    val lestEat6 = delicious6 || cheap6
    println("食事する？ : $lestEat6")
    val delicious7 = true
    val cheap7 = false
    val lestEat7 = delicious7 || cheap7
    println("食事する？ : $lestEat7")
    val delicious8 = false
    val cheap8 = true
    val lestEat8 = delicious8 || cheap8
    println("食事する？ : $lestEat8")
    val delicious9 = false
    val cheap9 = false
    val lestEat9 = delicious9 || cheap9
    println("食事する？ : $lestEat9")
    println("----7.8----")
    val x10 = 75
    val a10 = (x10 >= 50 && x10 <= 100)
    val b10 = (x10 < 50 || x10 > 100)
    println("変数 x10 が50から100の範囲内にある : $a10")
    println("変数 x10 が50から100の範囲内にある : $b10")
    println("----7.12----")
    val a12 = true
    val b12 = !a12
    val c12 = !b12
    println("a12 の値は $a12 です。")
    println("b12 の値は $b12 です。")
    println("c12 の値は $c12 です。")
}
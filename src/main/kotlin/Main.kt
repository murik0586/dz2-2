package ru.netology


fun main() {
    val countLikes = 1111;
    val likes = countLikes % 10;
    val likes1 = countLikes % 100;

    if (likes == 1 && likes1 != 11) {
  println("понравилось: $countLikes человеку")
    } else {println("понравилось: $countLikes людям")}

}
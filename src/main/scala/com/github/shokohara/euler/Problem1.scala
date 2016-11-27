package com.github.shokohara.euler

object Problem1 {

  def resolve = listMultiple(1 to 999).sum

  def listMultiple(list: Range): Seq[Int] = {
    list.filter { v =>
      v % 3 == 0 || v % 5 == 0
    }
  }
}

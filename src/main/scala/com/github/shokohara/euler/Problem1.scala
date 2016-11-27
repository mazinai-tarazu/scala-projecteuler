package com.github.shokohara.euler

object Problem1 {

  def f(v: List[Int]) = v.sum

  def resolve(i: Int) = {
    f(Range(1, 2))
    i * 2
  }
}

package com.github.shokohara.euler

object Problem2 {

  def resolve = fib.takeWhile(_ < 4000000).filter(_ % 2 == 0).sum

  def fib(a: Int, b: Int): Stream[Int] = a #:: fib(b, a + b)
  def fib: Stream[Int] = fib(1, 2)
}

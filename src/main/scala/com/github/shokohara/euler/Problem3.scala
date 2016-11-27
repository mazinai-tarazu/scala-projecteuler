package com.github.shokohara.euler

object Problem3 {

  def resolve = primeFactorization(600851475143L).max

  def primeFactorization(number: Long) = {
    def f(howMany: Long, primes: List[Int]): List[Int] = {
      if(howMany == 1) primes else {
        val prime = Stream.from(2).filter(howMany % _ == 0).head
        f(howMany / prime, primes :+ prime)
      }
    }
    f(number, Nil)
  }
}

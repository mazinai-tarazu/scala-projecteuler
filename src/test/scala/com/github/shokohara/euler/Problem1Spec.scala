package com.github.shokohara.euler

import org.scalatest._

class Problem1Spec extends FlatSpec with Matchers {
  getClass.getSimpleName should "resolve" in {
    Problem1.resolve shouldBe 233168
  }
}

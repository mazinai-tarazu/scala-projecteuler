package com.github.shokohara.euler

import org.scalatest._

class Problem1Spec extends FlatSpec with Matchers {
  "Problem1" should "resolve" in {
    Problem1.resolve(2) shouldBe 4
//    an[NotImplementedError] should be thrownBy Problem1.resolve
  }
}

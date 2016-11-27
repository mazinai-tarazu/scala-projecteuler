package com.github.shokohara.euler

import org.scalatest._

class Problem2Spec extends FlatSpec with Matchers {
  getClass.getSimpleName should "resolve" in {
    Problem2.resolve shouldBe 4613732
  }
}

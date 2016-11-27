package com.github.shokohara.euler

import org.scalatest._

class Problem3Spec extends FlatSpec with Matchers {
  getClass.getSimpleName should "resolve" in {
    Problem3.resolve shouldBe 6857
  }
}

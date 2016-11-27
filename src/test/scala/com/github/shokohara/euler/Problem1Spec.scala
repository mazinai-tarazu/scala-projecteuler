package com.github.shokohara.euler

import org.scalatest._

class Problem1Spec extends FlatSpec with Matchers {
  getClass.getSimpleName should "resolve" in {
    an[NotImplementedError] should be thrownBy Problem1.resolve
  }
}

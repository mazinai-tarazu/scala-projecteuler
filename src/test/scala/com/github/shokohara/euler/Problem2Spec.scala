package com.github.shokohara.euler

import org.scalatest._

class Problem2Spec extends FlatSpec with Matchers {
  getClass.getSimpleName should "resolve" in {
    an[NotImplementedError] should be thrownBy Problem2.resolve
  }
}

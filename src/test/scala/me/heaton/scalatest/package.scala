package me.heaton

import org.scalatest._
import matchers._

package object scalatest {

  trait Specification extends wordspec.AnyWordSpec with should.Matchers

}

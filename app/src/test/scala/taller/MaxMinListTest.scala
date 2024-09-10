package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MaxMinListTest extends AnyFunSuite {
    val objMaxMinList = new MaxMinList()

    test("Maximo de List(99, 8, 25, 30, 90, 101, 110) es 110") {
        assert(objMaxMinList.maxList(List(99, 8, 25, 30, 90, 101, 110)) == 110)
    }

    test("Minimo de List(99, 8, 25, 30, 90, 101, 110) es 8") {
        assert(objMaxMinList.minList(List(99, 8, 25, 30, 90, 101, 110)) == 8)
    }

}
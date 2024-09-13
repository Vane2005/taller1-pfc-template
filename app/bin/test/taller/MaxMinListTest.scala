package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MaxMinListTest extends AnyFunSuite {
    

    test("Maximo de List(99, 8, 25, 30, 90, 101, 110) es 110") {
        val objMaxMinList = new MaxMinList()
        assert(objMaxMinList.maxIt(List(99, 8, 25, 30, 90, 101, 110)) == 110)
    }

        test("Maximo de List(4,0,1,5,6) es 6") {
        val objMaxMinList = new MaxMinList()
        assert(objMaxMinList.maxLin(List(4,0,1,5,6)) == 6)
    }
}
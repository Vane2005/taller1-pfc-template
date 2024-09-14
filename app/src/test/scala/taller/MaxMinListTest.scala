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

    test("Maximo de List(-10, -20, -30, -40, -5, -15, -25) con maxIt es -5") {
        val objMaxMinList = new MaxMinList()
        assert(objMaxMinList.maxIt(List(-10, -20, -30, -40, -5, -15, -25)) == -5)
    }

    test("Maximo de List(3, 7, 1, 9, 4, 6, 5, 8, 2) con maxIt es 9") {
        val objMaxMinList = new MaxMinList()
        assert(objMaxMinList.maxIt(List(3, 7, 1, 9, 4, 6, 5, 8, 2)) == 9)
    }

    test("Maximo de List(19, 22, 15, 18, 10, 25, 17, 12, 14, 20) con maxIt es 25") {
        val objMaxMinList = new MaxMinList()
        assert(objMaxMinList.maxIt(List(19, 22, 15, 18, 10, 25, 17, 12, 14, 20)) == 25)
    }

    test("Maximo de List(99, 88, 77, 66, 55, 44, 33, 22, 11) con maxIt es 99") {
        val objMaxMinList = new MaxMinList()
        assert(objMaxMinList.maxIt(List(99, 88, 77, 66, 55, 44, 33, 22, 11)) == 99)
    }

    test("Maximo de List(4,0,1,5,6) es 6") {
        val objMaxMinList = new MaxMinList()
        assert(objMaxMinList.maxLin(List(4,0,1,5,6)) == 6)
    }

    test("Maximo de List(-7, -3, -9, -2, -5) con maxLin es -2") {
        val objMaxMinList = new MaxMinList()
        assert(objMaxMinList.maxLin(List(-7, -3, -9, -2, -5)) == -2)
    }

    test("Maximo de List(15, -2, 3, -7, 9, 4, 5, 6, 7, 8) con maxLin es 15") {
        val objMaxMinList = new MaxMinList()
        assert(objMaxMinList.maxLin(List(15, -2, 3, -7, 9, 4, 5, 6, 7, 8)) == 15)
    }

    test("Maximo de List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) con maxLin es 10") {
        val objMaxMinList = new MaxMinList()
        assert(objMaxMinList.maxLin(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) == 10)
    }

    test("Maximo de List(999, 888, 777, 666, 555, 444, 333, 222, 111) con maxLin es 999") {
        val objMaxMinList = new MaxMinList()
        assert(objMaxMinList.maxLin(List(999, 888, 777, 666, 555, 444, 333, 222, 111)) == 999)
    }

}
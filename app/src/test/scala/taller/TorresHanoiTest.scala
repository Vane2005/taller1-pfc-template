package  taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class  TorresHanoiTest extends  AnyFunSuite {
    val torresHanoi = new TorresHanoi()

    // Tests para la funcion movsTorresHanoi:
    // Test 1: caso base n=1
    test("movsTorresHanoi deberia retornar 1 cuando n=1"){
        assert(torresHanoi.movsTorresHanoi(1) == 1)
    }

    // Test 2: Caso n=3
    test("movsTorresHanoi deberia retornar 7 cuando n=3"){
        assert(torresHanoi.movsTorresHanoi(3) == 7)
    }

    // Test 3: Caso n=5
    test("movsTorresHanoi deberia retornar 31 cuando n=5"){
        assert(torresHanoi.movsTorresHanoi(5) == 31)
    }

    // Tests para la funcion TorresHanoi

}
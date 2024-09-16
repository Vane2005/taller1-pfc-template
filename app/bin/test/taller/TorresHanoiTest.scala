package  taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class  TorresHanoiTest extends  AnyFunSuite {
    val torresHanoi = new TorresHanoi()

    // Tests para la funcion movsTorresHanoi:

    // Test 1: Caso n=3
    test("movsTorresHanoi deberia retornar 7 cuando n=3"){
        assert(torresHanoi.movsTorresHanoi(3) == 7)
    }

    // Test 2: Caso n=5
    test("movsTorresHanoi deberia retornar 31 cuando n=5"){
        assert(torresHanoi.movsTorresHanoi(5) == 31)
    }

    // Test 3: caso base n=7
    test("movsTorresHanoi deberia retornar 127 cuando n=7"){
        assert(torresHanoi.movsTorresHanoi(7) == 127)
    }

    // Test 4: Caso n=10
    test("movsTorresHanoi deberia retornar 1023 cuando n=10") {
        assert(torresHanoi.movsTorresHanoi(10) == 1023)
    }

    // Test 5: Caso n=20
    test("movsTorresHanoi deberia retornar 1048575 cuando n=20") {
        assert(torresHanoi.movsTorresHanoi(20) == 1048575)
    }

    // Tests para la funcion TorresHanoi:

    // Test 1: Caso n=3
    test("torresHanoi deberia retornar los movimientos correctos cuando n=3") {
        assert(torresHanoi.torresHanoi(3, 1, 2, 3) == List(
            (1,3), (1,2), (3,2), 
            (1,3), (2,1), (2,3), 
            (1,3)))
    }

    // Test 2: Caso n=4
    test("torresHanoi deberia retornar los movimientos correctos cuando n=4") {
        assert(torresHanoi.torresHanoi(4, 1, 2, 3) == List(
            (1,2), (1,3), (2,3),
            (1,2), (3,1), (3,2), 
            (1,2), (1,3), (2,3), 
            (2,1), (3,1), (2,3), 
            (1,2), (1,3), (2,3)))
    }

    // Test 3: Caso n=5
    test("torresHanoi deberia retornar los movimientos correctos cuando n=5") {
        assert(torresHanoi.torresHanoi(5, 1, 2, 3) == List(
            (1,3), (1,2), (3,2),
            (1,3), (2,1), (2,3), 
            (1,3), (1,2), (3,2), 
            (3,1), (2,1), (3,2), 
            (1,3), (1,2), (3,2),
            (1,3), (2,1), (2,3), 
            (1,3), (2,1), (3,2), 
            (3,1), (2,1), (2,3), 
            (1,3), (1,2), (3,2),
            (1,3), (2,1), (2,3), 
            (1,3)))
    }

    // Test 4: Caso n=6
    test("torresHanoi deberia retornar los movimientos correctos cuando n=6") {
        assert(torresHanoi.torresHanoi(6, 1, 2, 3) == List(
            (1,2), (1,3), (2,3), 
            (1,2), (3,1), (3,2), 
            (1,2), (1,3), (2,3), 
            (2,1), (3,1), (2,3), 
            (1,2), (1,3), (2,3), 
            (1,2), (3,1), (3,2), 
            (1,2), (3,1), (2,3), 
            (2,1), (3,1), (3,2), 
            (1,2), (1,3), (2,3), 
            (1,2), (3,1), (3,2), 
            (1,2), (1,3), (2,3), 
            (2,1), (3,1), (2,3), 
            (1,2), (1,3), (2,3), 
            (2,1), (3,1), (3,2), 
            (1,2), (3,1), (2,3), 
            (2,1), (3,1), (2,3), 
            (1,2), (1,3), (2,3), 
            (1,2), (3,1), (3,2), 
            (1,2), (1,3), (2,3), 
            (2,1), (3,1), (2,3), 
            (1,2), (1,3), (2,3)))
    }

    // Test 4: Caso n=7
    test("torresHanoi deberia retornar los movimientos correctos cuando n=7") {
        assert(torresHanoi.torresHanoi(7, 1, 2, 3) == List(
            (1,3), (1,2), (3,2), 
            (1,3), (2,1), (2,3), 
            (1,3), (1,2), (3,2), 
            (3,1), (2,1), (3,2), 
            (1,3), (1,2), (3,2), 
            (1,3), (2,1), (2,3), 
            (1,3), (2,1), (3,2), 
            (3,1), (2,1), (2,3), 
            (1,3), (1,2), (3,2), 
            (1,3), (2,1), (2,3), 
            (1,3), (1,2), (3,2), 
            (3,1), (2,1), (3,2), 
            (1,3), (1,2), (3,2), 
            (3,1), (2,1), (2,3), 
            (1,3), (2,1), (3,2), 
            (3,1), (2,1), (3,2), 
            (1,3), (1,2), (3,2), 
            (1,3), (2,1), (2,3), 
            (1,3), (1,2), (3,2), 
            (3,1), (2,1), (3,2), 
            (1,3), (1,2), (3,2), 
            (1,3), (2,1), (2,3), 
            (1,3), (2,1), (3,2), 
            (3,1), (2,1), (2,3), 
            (1,3), (1,2), (3,2), 
            (1,3), (2,1), (2,3), 
            (1,3), (2,1), (3,2), 
            (3,1), (2,1), (3,2), 
            (1,3), (1,2), (3,2), 
            (3,1), (2,1), (2,3), 
            (1,3), (2,1), (3,2), 
            (3,1), (2,1), (2,3), 
            (1,3), (1,2), (3,2), 
            (1,3), (2,1), (2,3), 
            (1,3), (1,2), (3,2), 
            (3,1), (2,1), (3,2), 
            (1,3), (1,2), (3,2), 
            (1,3), (2,1), (2,3), 
            (1,3), (2,1), (3,2), 
            (3,1), (2,1), (2,3), 
            (1,3), (1,2), (3,2), 
            (1,3), (2,1), (2,3), 
            (1,3)))
    }

}
package taller

class TorresHanoi(){
    
    def movsTorresHanoi(n: Int) : BigInt = {
        if (n == 1) 1
        else 2 * movsTorresHanoi(n-1) + 1
    }
    
    def torresHanoi(n: Int , t1: Int , t2: Int , t3: Int): List [(Int , Int)] = {
    // Pasar n discos de la torre t1 a la torre t3 usando t2 como intermediaria
    // Devuelve la lista de movimientos de parejas (a, b) indicando mover un disco de la torre a hacia la torre b
        List()
    }
}
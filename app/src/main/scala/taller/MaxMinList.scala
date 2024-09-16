package taller

import scala.annotation.tailrec

class MaxMinList() {

    
    def maxIt( l : List [ Int ]) : Int = {
        @tailrec
        def maxItAux(l : List [Int] , max : Int): Int = {
            if (l.isEmpty) max
            else if (l.head > max) maxItAux(l.tail, l.head)
            else maxItAux(l.tail, max)
        }

        if (l.isEmpty) throw new NoSuchElementException("La lista está vacía")
        else maxItAux(l, Int.MinValue)
        
    }
    
    //recursion lineal
    def maxLin( l : List [ Int ]) : Int = {
        l match {
            case Nil => throw new NoSuchElementException("La lista está vacía")  
            case head :: Nil => head 
            case head :: tail =>
                val maxTail = maxLin(tail)  
                if (head > maxTail) head else maxTail  
        }
    }
}
package taller

class MaxMinList() {

    //@ tailrec
    def maxList( l : List [ Int ]) : Int = {

        def maxListAux(l : List [Int] , max : Int): Int = {
            if (l.isEmpty) max
            else if (l.head > max) maxListAux(l.tail, l.head)
            else maxListAux(l.tail, max)
        }

        if (l.isEmpty) 0
        else maxListAux(l, Int.MinValue)
        
    }
    
    //@ tailrec
    def minList( l : List [ Int ]) : Int = {

        def minListAux( l : List [ Int ] , min: Int): Int = {
            if (l.isEmpty) min
            else if (l.head < min) minListAux(l.tail, l.head)
            else minListAux(l.tail, min)
        }
        if (l.isEmpty) 0
        else minListAux(l, Int.MaxValue)
    }
}
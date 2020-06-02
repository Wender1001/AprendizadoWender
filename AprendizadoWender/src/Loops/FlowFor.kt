package Loops

fun main() {


 val str  = "wender augusto"

    for (c in str) {
        print("$c ")
    }

//conta de dois em dois

    for (i in 1..10 step 2){

        if ( i != 7) {
            print("$i ")
        }
    }

 //ordem decrescente

    for (i in 10 downTo  0) {
        print("$i ")
    }

}
package com.example.kotlin.proyectopractica

fun main() {
    //Comentario Simple


    /*
    * Comentario en bloque
    * */

    val i: Int = 2 //Un val no se puede modificar
    var j = 3.0f //Un var se puede modificar (mutable)

    println(10%2)
    println(2.times(2))
    println(i.times(i))

    val hola = "Hola"
    val mundo = "Mundo"
    println("$hola $mundo ${i.times(j)}")

    when (10){
        0 -> println("Nada")
        in 1..39 ->{
            println("Algo")
            println("Algo adicional")
        }
        else -> println("Final del numero")
    }

    val pets = arrayOf("dog","cat","canary")
    for(element in pets){
        println(element)
    }
    for((index, element) in pets.withIndex()){
        println("$index tiene $element")
    }

    for(i in 5 downTo 1) println(i)

    for(i in 'd'..'g')println(i)

    repeat(2){
        print("Hello!")
    }

    val instruments = mutableListOf<String>("trumpet", "piano", "violin")
    println(instruments)
    instruments.remove("trumpet")
    println(instruments)

    val numeroEntero:Int? = null
    lateinit var hola1: String

    if(numeroEntero != null){
        print(numeroEntero)
    }
    println(numeroEntero?.times(2) ?: "No es un numero")
    //println(numeroEntero!!.times(2))


    //print(hola1)  //Truena

    val isUnit = println("This is an expression")
    println(isUnit)

    printHello()
    printWolrd()
    println(printBool())
    prinPalabra("algo")
}

fun printHello(){
    print("Hello ")
}
fun printWolrd () = println("Wolrd")

fun printBool():Boolean = true
fun prinPalabra(nombre: String?) = println("$nombre")


/*
* Object -> View -> Layout : RelativeLayout, LinearLayout, ConstrainLayout, TablelLayout(No usar de preferencia), FrameLayout, CoordinatorLayout, RecyclerLayout
*                -> Components : Button, TextView, EditText, ImageView, NestedScrollView (Scroll)
*
*                -> id
*                -> height
*                -> width
*                    match-parent
*                    wrap-parent
*                    dp { fixed size }
*
* Relative Layout: Todo es relativo a algo, suelen estar pegados a una esquina, se puede centrar en vertical u horizontal.
*                   Desventaja, cuando se tiene un input se puede tapar el cuadro de texto, para solucionar esto se necesita implrementar un scroll(NestedScrollView)
*                   Srive mas para elementos centrados
*
* Linear Layout: Este coloca los elementos linealmente, tiene dos formas/orientation (vertical y horizontal), inicia hasta arriba o hasta la izquierda
*
*  Frarme Layout: Los agrega todos del lado superior izquierda, el orden importa, suele se por pixeles. casi no se usa para colocar cosas, es mas para framgentos
*
* Coordinator layout: Es parecido a FrameLayout pero se usar para colocar componentes como banners retractiles.
*                     Tiene comportamientos interesantes (animadas) que se pueden usar en una aplciacion. (De preferencia no hacer animaciones en aplicaciones de celular)
*
* Constrain Layout: Es de los ultimos que se hicieron, usar IA para colocar los elementos, de recomendacion no usar codigo, se usa el drag and drop.
* <~ [] ~> La idea es que todo quede en el mimsmo layout al mismo nivel
*
*
*
* En el celular en modo desarrollador hay un apartado que se llama mostrar limites de disenio,
* Lo que hace esta opcion habilita todos los contrains de la pantalla y como se alinean y como se esta ajustando
*
*tip,  dejar los estilos lo mas nativo posible a XML
*      Con los layouts nativos deberian de ser capaz de generar cualquier interfaz
* */

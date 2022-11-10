package com.ista.democollection

fun main(){
    // liste immutable et non générique pas type
    val langages= listOf("C","C++","JAVA")
    val notes = setOf<Int>(12,10,9,15,4,8,12,10,18)
    val etudiants= mapOf<Int,String>(1 to "Ahmed",2 to "RAchid")
    val villes= mutableListOf<String>("Agadir","Tanger","RAbat","Fes")
    val tab= arrayOf("Zagora","Rachidia")
    villes.add("Marrakech")
    villes.addAll(tab)
   /* for (x in villes)
    {
        println(x)
    }*/
    /*val listeSud=villes.filter({s->s.toString().startsWith("R") })
    print(listeSud)*/
    val numbers = listOf(null, 1, "two", 3.0, 4,"four")
    println("All String elements in upper case:")
    /*numbers.filterIsInstance<Int>().forEach {
        println(it)
    }*/

   /* numbers.filterNotNull().forEach {
        println(it)
    }*/

    val numbers2 = listOf("one", "two", "three", "four")
    val (match, rest) = numbers2.partition { it.length > 3 }
   /* println(match)
    println(rest)*/
val nombres= listOf<Int>(15,4,3,18,13,9,6)
val (paires,impaire)=nombres.partition { it%2==0 }
    println(paires)
    println(impaire)

    //affichage
  /* for (x in langages)
    {
        println(x)
    }*/

   /* for(x in 0..langages.size-1)
    {
        println(langages[x])
    }*/

     /*for (x in notes)
    {
        println(x)
    }*/

    /*for (x in etudiants.keys)
    {
        println(etudiants.getValue(x))
    }*/
  /*  val mySet: Set<Any> = setOf(2,6,4,29,4,29,29,29,5,"java","python")
    val remainList= mySet.drop(3)
    println(remainList)*/




}
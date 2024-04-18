class Animal( 
    val especie: String, 
    val filo: String, 
    val classe: String, 
    val ordem: String, 
    val familia: String, 
    val genero: String, 
    val apelido: String, 
    val origem: String, 
    val dieta: String, 
    val tipoGaiola: String, 
    val localizacao: String 
) { 
    fun exibirInfo() { 
        println("Animal: $apelido") 
        println("Espécie: $especie $filo $classe $ordem $familia $genero") 
        println("Origem: $origem") 
        println("Dieta: $dieta") 
        println("Tipo de Gaiola: $tipoGaiola") 
        println("Localização na Sela: $localizacao") 
    } 
} 
 
class Zoo { 
    private val animais = mutableListOf<Animal>() 
 
    fun cadastrarAnimal(animal: Animal) { 
        animais.add(animal) 
    } 
 
    fun listarAnimais() { 
        for (animal in animais) { 
            animal.exibirInfo() 
            println() 
        } 
    } 
} 
 

fun main() { 
    val zoo = Zoo() 
 
    val leao = Animal("Panthera leo", "Chordata", "Mammalia", "Carnivora", "Felidae", "Panthera", "Leão", "África", "Carnívoro", "Savana", "Sela 1") 
    val golfinho = Animal("Tursiops truncatus", "Chordata", "Mammalia", "Cetacea", "Delphinidae", "Tursiops", "Golfinho", "Oceano Pacífico", "Piscívoro", "Aquário", "Sela 2") 
    val zebra = Animal("Equus zebra", "Chordata", "Mammalia", "Perissodactyla", "Equidae", "Equus", "Zebra", "África", "Herbívoro", "Savana", "Sela 3") 
 
    zoo.cadastrarAnimal(leao) 
    zoo.cadastrarAnimal(golfinho) 
    zoo.cadastrarAnimal(zebra) 
 
    zoo.listarAnimais()
}
open class Persona(var numDNI : String, var nombre: String, var apellido: String, var fNac: String, var direc: String, var cNacimiento: String) {

    fun datosPersona(){
        println("Ingrse su numero de identificacio: ")
        numDNI = readln().toString()
        println("Ingrese su nombre: ")
        nombre = readln().toString()
        println("Ingrese su apellido: ")
        apellido = readln().toString()
        println("Ingrese su ciudad de nacimiento: ")
        cNacimiento = readln().toString()
        println("Ingrese su Fecha de nacimiento dd/mm/aaaa: ")
        fNac = readln().toString()
        println("Ingrese su direccion: ")
        direc = readln().toString()
    }


}
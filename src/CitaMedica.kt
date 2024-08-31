class CitaMedica (var especialidadMed : String, var fecha : String, var hora : String) {

    fun datosCita(){
        println("¿Para que especialidad desea solicitar su cita?: ")
        especialidadMed = readln().toString()
        println("Ingrese la fecha en que desea asiatir a su cita: ")
        fecha = readln().toString()
        println("En que hora le queda mas comodo: ")
        hora = readln().toString()
    }

    fun crearCita(){
        var nuevaCita = datosCita()
        println("Cita medica creada con exito!!")
    }
}
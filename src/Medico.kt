import kotlin.random.Random
class Medico (var especialidad: String, var servicio: String, var nConsultorio: Int,
              numDNI: String, nombre: String, apellido: String, fNac: String, direc: String, cNacimiento: String): Persona (numDNI,nombre,apellido,fNac,direc,cNacimiento){

    fun datosMedico(){
        println("Ingrese su nombre: ")
        nombre = readln().toString()
        println("Ingrese su apellido: ")
        apellido = readln().toString()
        println("Ingrse su numero de identificacio: ")
        numDNI = readln().toString()
        println("Ingrese su ciudad de nacimiento: ")
        cNacimiento = readln().toString()
        println("Ingrese su Fecha de nacimiento dd/mm/aaaa: ")
        fNac = readln().toString()
        println("Ingrese su direccion: ")
        direc = readln().toString()
        println("Ingrese su especialidad: ")
        especialidad = readln().toString()
        println("Servicio que ofrece: ")
        servicio = readln().toString()
        nConsultorio = Random.nextInt(1,100)
        println("Consultorio asignado $nConsultorio")
    }

    fun crearMedico(){
        var medicoCreado = datosMedico()
        println("Medico registrado con exito!!!")
    }


}
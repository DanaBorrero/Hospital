import kotlin.random.Random

class Paciente (var hClinica: Int, var sexo: String, var gSanguineo: String, var algMedicamentos: String,
                numDNI: String, nombre: String, apellido: String, fNac: String, direc: String, cNacimiento: String): Persona (numDNI,nombre,apellido,fNac,direc,cNacimiento) {

    fun datosPaciente(){
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
        println("Ingrese su sexo: ")
        sexo = readln().toString()
        println("Grupo sanguineo: ")
        gSanguineo = readln().toString()
        println("Alergia a medicamentos: ")
        algMedicamentos = readln().toString()
        hClinica = Random.nextInt()
        println("Su historia clinica es: $hClinica")
    }

    fun crearPaciente(){
        var pacienteCreado = datosPaciente()
        println("Paciente registrado con exito!!!")
    }

    override fun toString(): String {
        return "Paciente(hClinica=$hClinica, sexo='$sexo', gSanguineo='$gSanguineo', algMedicamentos='$algMedicamentos')"
    }


}
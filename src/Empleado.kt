class Empleado (var codigo: String, var hExtra: Int, var fIng: String, var area : String, var cargo: String,
                numDNI: String, nombre: String, apellido: String, fNac: String, direc: String, cNacimiento: String): Persona (numDNI,nombre,apellido,fNac,direc,cNacimiento){
    fun datosEmpleado(){
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
        println("Ingrese su codigo de empleado: ")
        codigo = readln().toString()
        println("Ingrese su fecha de ingreso a la empresa: ")
        fIng = readln().toString()
        println("En que area se encuentra laborando: ")
        area = readln().toString()
        println("Que cargo desempeña actualmente: ")
        cargo = readln().toString()
    }

    fun crearEmpleado(){
        var empleadoCreado = datosEmpleado()
        println("Empleado registrado con exito!!!")
    }


    fun horaExtra(){
        var jornadaDia : Int = 8
            println("¿Realizo horas extra:   \n 1. Si" +
                    "\n 2. No")
            var opc : Int = readln().toInt()
            if (opc == 1){
                println("¿Cuantas horas extra realizo?: ")
                hExtra = readln().toInt()
                var horasTotales = jornadaDia*hExtra
                println("Horas totales laboradas: $horasTotales")
            }else{
                println("No registra horas extra laboradas")
            }
    }
    fun empleadoPlanilla(){
        println("Ingrese su salario mensual: ")
        var salMensual: Double = readln().toDouble()
        println("Digite su porcentaje por hora extra: ")
        var porHoraExtra: Double = readln().toDouble()
        horaExtra()
    }

    fun empleadoEventual(){
        println("¿Que valor se le asigana a la hora laborada?: ")
        var honorarioHora: Double = readln().toDouble()
        horaExtra()
        println("Fecha terminacion de contrato dd/mm/aaaa:")
        var fTerContrato: String = readln().toString()
    }



}
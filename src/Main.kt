fun main() {
    //var per = Persona(" ","","","","","")
    var empleados: MutableList<Empleado> = mutableListOf()
    var medicos : MutableList<Medico> = mutableListOf()
    var pacientes: MutableList<Paciente> = mutableListOf()
    var cit : MutableList<CitaMedica> = mutableListOf()
    var opc : Int
    do{
        println("------ HOSPITAL ------")
        println("Elija la opcion que desea:  \n 1. Registrar datos: Empleados, Medicos, Pacientes" +
                                            "\n 2. Registrar cita medica"+
                                            "\n 3. Listar datos medicos por especialidad" +
                                            "\n 4. Listar pacientes por medico" +
                                            "\n 5. Salir")
        opc = readln().toInt()
        when(opc){
            1 -> {
                do {
                    println("---- Registro ----")
                    println("¿Que usuario desea crear?:  \n 1. Empleado" +
                                                        "\n 2. Medico" +
                                                        "\n 3. Paciente" +
                                                        "\n 4. Regresar al menu anterior")
                    var opc1 : Int = readln().toInt()
                    when(opc1){
                        1 -> {
                            println("--- Registro Empleado ---")
                            var emp = Empleado(" ",0,"","","","","","","","","")
                            emp.crearEmpleado()
                            empleados.add(emp)
                            do {

                                println("**** ¿Que tipo de empleado desea registrar?: ****" +
                                        "\n 1. Empleado planilla" +
                                        "\n 2. Empleado eventual" +
                                        "\n 3. Salir")

                                var opc2 : Int = readln().toInt()
                                when(opc2){
                                    1 -> {
                                        println("Empleado Planilla")
                                        emp.empleadoPlanilla()
                                    }
                                    2 -> {
                                        println("Empleado Eventual")
                                        emp.empleadoEventual()
                                    }
                                }
                            }while (opc2 != 3)
                        }
                        2 -> {
                            println("---- Registro Medico ---")
                            var med = Medico("","",0,"","","","","","")
                            med.crearMedico()
                            medicos.add(med)
                        }
                        3 -> {
                            println("---- Registro Paciente ---")
                            var pac = Paciente(0,"","","","","","","","","")
                            pac.crearPaciente()
                            pacientes.add(pac)
                        }
                    }
                }while(opc1 != 4)
            }
            2 -> {
                println("---- Cita Medica ----")
                if (pacientes.isEmpty()) {
                    println("No hay pacientes registrados. Por favor, registrese primero.")
                } else {
                    println("Seleccione el paciente que desea la cita:")
                    pacientes.forEachIndexed { index, paciente ->
                        println("${index + 1}. Paciente ${paciente.nombre}")
                    }
                    val citaIndex = readln().toInt() - 1

                    if (citaIndex in pacientes.indices) {
                        var cita = CitaMedica("", "", "")
                        cita.crearCita()
                        cit.add(cita)
                    }
                }
            }

            3 -> {
                println("---- Datos medicos por especialidad ----")
                if (medicos.isEmpty()) {
                    println("No hay medicos registrados. Por favor, registrese primero.")
                } else {
                    println("Seleccione la especialidad para verificar personal medico disponible:")
                    var especialidades = medicos.map { it.especialidad }.distinct()
                    medicos.forEachIndexed { index, medico ->
                        println("${index + 1}. Especialidad ${medico.especialidad}")
                    }
                    var espIndex = readln().toInt() - 1
                    if (espIndex in especialidades.indices) {
                        var especialidadSeleccionada = especialidades[espIndex]
                        println("---- Datos Medicos para la especialidad: $especialidadSeleccionada ----")
                        var medicosFiltrados = medicos.filter { it.especialidad == especialidadSeleccionada }
                        if (medicosFiltrados.isNotEmpty()) {
                            for (medico in medicosFiltrados) {
                                println("Nombre: ${medico.nombre} ${medico.apellido}")
                                // Puedes agregar más información del médico si es necesario
                            }
                        } else {
                            println("No hay médicos disponibles para la especialidad seleccionada.")
                        }

                    }

                }
            }
        }
    }while (opc != 5)
}



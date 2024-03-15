
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Instancias
        Scanner objScan = new Scanner(System.in);
        Gestion_curso objGestion = new Gestion_curso();


        int option = 0;

        do {
            System.out.println("""
                    MENU DE OPCIONES
                    1. Administrar cursos.
                    2. Administrar estudiantes.
                    3. Salir.
                    """);
            option = objScan.nextInt();


            switch (option){
                case 1:
                    int option2 = 0;
                    do {
                        System.out.println("""
                            MENU DE CURSOS
                            1. Crear curso.
                            2. Buscar curso por código.
                            3. Listar cursos.
                            4. Salir
                            """);
                        option2 = objScan.nextInt();

                        switch (option2){
                            case 1:
                                objGestion.guardarCurso(objScan);
                                break;

                            case 2:
                                System.out.println("Ingrese el código del curso. ");
                                String codigo = objScan.next();
                                System.out.println(objGestion.buscarPorCodigo(codigo).toString());
                                break;

                            case 3:
                                objGestion.getListaCursos()
                                break;
                        }

                case 2:

                    int option3 = 0;

                    do {
                        System.out.println("""
                                1. Agregar estudiante.
                                2. Eliminar estudiante.
                                3. Listar estudiantes.
                                4. Salir.
                                """);

                        option3 = objScan.nextInt();

                        switch (option3){
                            case 1:
                                objGestion.listarCursos();

                                System.out.println("Ingrese el código del curso donde se desea inscribir");
                                String codigo = objScan.next();
                                Curso curso = objGestion.buscarPorCodigo(codigo);

                                if (curso == null){
                                    System.out.println("Curso no encontrado");
                                }else {
                                    curso.guardarEstudiante(objScan);
                                }
                                break;

                            case 2:
                                //1. Listar todos los cursos
                                objGestion.listarCursos();;

                                //2. Preguntar al usuario cuál es el curso del estudiante a eliminar
                                System.out.println("Ingrese el código del curso del estudiante a eliminar: ");

                                //3. Llamar al método que elimina
                                Curso objcurso = objGestion.buscarPorCodigo(codigo);

                                if (objcurso == null){
                                    System.out.println("Código no válido");

                                }else {
                                    //Eliminar
                                    objcurso.eliminarEstudiantes(objScan);
                                }
                                
                                break;

                            case 3:
                                objGestion.listarCursos();

                                System.out.println("Ingrese el código del curso donde desea inscribir el estudiate");
                                codigo = objScan.next();
                                curso = objGestion.buscarPorCodigo(codigo);

                                if (curso == null){
                                    System.out.println("curso no encontrado");
                                }else {
                                    curso.listarEstudiantes();
                                }

                                break;

                        }while (option3 != 4)




                    }while (option2 != 4);

            }

        }while (option != 3);

    }
}
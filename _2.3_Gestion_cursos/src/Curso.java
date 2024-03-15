import java.util.ArrayList;

public class Curso {
    private String code;
    private String name;
    private ArrayList<Estudiante> listaEstudiantes;

    private static int idEstudiante = 1;


    public Curso(String code, String name) {
        this.code = code;
        this.name = name;
        this.listaEstudiantes = new ArrayList<>();
    }

    public void guardarEstudiante(){
        System.out.println("Agregar nuevo estudiante ");
        System.out.println("Ingresa nombre del estudiante: ");
        String nombre = objScan.nextLine();

        System.out.println("Ingresa correo del estudiante:  ");
        String email = objScan.nextLine();

        Estudiante objEstudiante = new Estudiante(1, nombre, email, idEstudiante);
        idEstudiante++;
        if (listaEstudiantes.add(objEstudiante)){
            System.out.println("Agregado correctamente");
        }else {
            System.out.println("No se pudo agregar el estudiante");
        }
    }

    public void listarEstudiantes(){

        if (this.listaEstudiantes.isEmpty()){
            System.out.println("El curso ".concat(this.name).concat("No tiene estudiantes"));
        }else {
            System.out.println("Lista de estudiantes en el curso: " + this.name);
            for( Estudiante estudianteTemp: this.listaEstudiantes){
                System.out.println(estudianteTemp.toString());
            }
        }


    }

    public void eliminarEstudiantes(Scanner objScan){
        //listar
        this.listarEstudiantes();
        //pedir el id
        System.out.println("Ingresa el id: ");
        int idEliminar = objScan.nextInt();
        //Eliminar
        if (this.listaEstudiantes.removeIf(estudiante -> estudiante.getId() == idEliminar)){
            System.out.println("Estudiante eliminado correctamente");
        }else {
            System.out.println("No se eliminó");
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +

                '}';
    }
}

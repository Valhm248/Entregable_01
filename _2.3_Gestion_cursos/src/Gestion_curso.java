import java.util.ArrayList;
import java.util.Scanner;

public class Gestion_curso {
    private ArrayList<Curso> listaCursos;

    public Gestion_curso(ArrayList<Curso> listaCursos) {
        this.listaCursos = new ArrayList<>();
    }

    public guardarCurso(Scanner objScan){
        System.out.println("Agregar Curso");

        System.out.println("Ingresa el nombre del curso: ");
        String nombre = objScan.nextLine();

        System.out.println("Ingresa el código del curso: ");
        String code = objScan.next();

        //Si el método "buscar" no devuelve null quiere decir que ya existe
        if (this.buscarPorCodigo(code) != null){
            System.out.println("El código ya existe ");
        }else {
            Curso objCurso = new Curso(code, nombre);
            this.listaCursos.add(objCurso);
        }
    }



    public Curso buscarPorCodigo(String codeBuscar){
        for (Curso cursoTemp: this.listaCursos){
            if (cursoTemp.getCode().equalsIgnoreCase(codeBuscar)){
                return cursoTemp;
            }
        }
        return null;
    }

    public void listarCursos(){
        if (this.listaCursos.isEmpty()){
            System.out.println("no hay cursos registrados");
        }else{
            System.out.println("lista de cursos");
            for (Curso temp: this.listaCursos){
                System.out.println(temp.toString());
            }
        }

    }
    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ArrayList<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }
}

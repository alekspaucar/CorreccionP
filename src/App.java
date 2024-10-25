
//import javax.naming.spi.DirStateFactory;
import models.Person;
import models.PersonasGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        Person[] personas = new PersonasGenerator().generarPersonas();
        for (Person person : personas) {
            System.out.println(person);

            MetodosOrdenamientoBusqueda mob= new MetodosOrdenamientoBusqueda();
            mob.sortByAgeWithSelection(personas);
            mob.showPeople(personas);
            int result = mob.searchBinaryByAge(personas, 78);
            if (result == - 1){
                System.out.println("no encontro: ");
            }else{
                System.out.println("encontro en la posicion: " + result + "-->" + personas );
            }
/* 
            mob.sortByAgeWithSelection(personas);
            mob.showPeople(personas);
            int result1 = mob.searchBinaryByAge(personas, 78);
            if (result1 == - 1){
                System.out.println("no encontro: ");
            }else{
                System.out.println("encontro en la posicion: " + result1 + "-->" + personas );
            }
*/
        }
    }
}

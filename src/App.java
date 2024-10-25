
import javax.naming.spi.DirStateFactory;
import models.Person;
import models.PersonasGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        Person[] personas = new PersonasGenerator().generarPersonas();
        for (Person person : personas) {
            System.out.println(person);


            MetodosOrdenamientoBusqueda mob= new MetodosOrdenamientoBusqueda();
            mob.sortByAgeWithInsertion(personas);
            mob.showPeople(personas);
            int result = mob.searchBinaryByAge(personas, 78);
            if (result=-1){
                System.out.println("no encontro: ");
            }else{
                System.out.println("encontro en la posicion: "+Result+"-->"+personas);

            }
/* 
        }
        PersonasGenerator personaGenerator = new PersonasGenerator();
        // Obtener el arreglo de 50 personas generadas aleatoriamente
        Person[] personas = personaGenerator.generarPersonas();
        System.out.println("Listado de personas generadas:");
        for (Person persona : personas) {
            System.out.println(persona);

        }
    }
}
        */
        }
    }
}

    

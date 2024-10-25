import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusqueda {

    // Selection sort by age
    public void sortByAgeWithSelection(Person[] people) {
        
    }

    // Selection sort by height
    public void sortByHeightWithSelection(Person[] people) {
        // TODO: Implement selection sort by height
    }

    // Insertion sort by age
    public void sortByAgeWithInsertion(Person[] personas) {
        int tamanio=personas.length;
        for (int i=1 ; i<tamanio; i++) {
            Person personasAux = personas[i];
            int j = i - 1;
            while (j >= 0 && personasAux.getAge() < personas[j].getAge()) {
                personas[j + 1] = personas[j];
                j=j - 1;
            }
            personas[j + 1] = personasAux;
        }

    }


    // Insertion sort by height
    public void sortByHeightWithInsertion(Person[] people) {
        // TODO: Implement insertion sort by height
    }

    // Binary search by age
    public int searchBinaryByAge(Person[] people, int age) {
        int left = 0;
        int right =people.length + 1;
        while (left <= right) {
                int mitad = left+ (right-left);
                if (people[mitad].getAge()==age){
                    return mitad;
                }
                if (people[mitad].getAge() < age) {
                    left = mitad + 1;
                } else {
                    right = mitad - 1;
                }
            return -1; 
            }
        }
        
    
    // Binary search by height
    public int searchBinaryByHeight(Person[] people, int height) {
        // TODO: Implement binary search by height
        return -1; // Placeholder return value
    }

    // Metodo que imprime el listado de personas
    public void showPeople() {
        // TODO: Implement showPeople
    }
}
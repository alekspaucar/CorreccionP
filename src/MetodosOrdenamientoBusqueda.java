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
        int tamanio = people.length;
        int left = tamanio;
        while (left > 0) {
                int minIndex = left;
                for (int j = left + 1; j < tamanio; j++) {
                    if (people[j].getAge() < people[minIndex].getAge()) {
                        minIndex = j;
                    }
                }
                Person temp = people[left];
                people[left] = people[minIndex];
                people[minIndex] = temp;
                left--;
            }
        }
    
    // Selection sort by height
    public void sortByHeightWithSelection(Person[] people) {
        int height = people.length;
        int left = height;
        while (left > 0) {
        while (height > 0) {
            int minIndex = left;
            for (int j = left + 1; j < height; j++) {
                if (people[j].getHeight() < people[minIndex].getHeight()) {
                    minIndex = j;
                }
            }
            Person temp = people[left];
            people[left] = people[minIndex];
            people[minIndex] = temp;
            height--;
        }
    }
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
    public void sortByHeightWithInsertion(Person[] personas) {
        int tamanio=personas.length;
        for (int i=1 ; i<tamanio; i++) {
            Person personasAux = personas[i];
            int j = i - 1;
            while (j >= 0 && personasAux.getHeight() < personas[j].getHeight()) {
                personas[j + 1] = personas[j];
                j=j - 1;
            }
            personas[j + 1] = personasAux;
        }
        
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

            }
            return -1; 
        }
        

    // Binary search by height
    public int searchBinaryByHeight(Person[] people, int height) {
        int left = 0;
        int right =people.length + 1;
        while (left <= right) {
                int mitad = left+ (right-left);
                if (people[mitad].getHeight()==height){
                    return mitad;
                }
                if (people[mitad].getHeight() < height) {
                    left = mitad + 1;
                } else {
                    right = mitad - 1;
                }
            }
        return -1;
    }

    // Metodo que imprime el listado de personas
    public void showPeople(Person[] people) {
        for (Person person : people) {
            System.out.println("Nombre: " + person.getName() + ", Edad: " + person.getAge() + ", Altura: " + person.getHeight());
        }
    }
}
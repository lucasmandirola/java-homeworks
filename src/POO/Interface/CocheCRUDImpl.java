package POO.Interface;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
        System.out.println("Guarda un nuevo coche");
    }

    @Override
    public void findAll() {
        System.out.println("Devuelve todos los coches");
        //return "hola";
    }

    @Override
    public void delete() {
        System.out.println("Elimina un coche");
    }
}

package proyecto.serpiente;

enum Direccion {
    Derecha, Izquierda, Arriba, Abajo
}

public class EjemploEnum {

    public static void main(String[] args) {
        Direccion myVar = Direccion.Arriba;

        switch (myVar) {
            case Arriba:
                System.out.println("Vamos para arriba");
                break;
            case Abajo:
                System.out.println("Vamos para abajo");
                break;
            case Derecha:
                System.out.println("Vamos para la derecha");
                break;
            case Izquierda:
                System.out.println("Vamos para la izquierda");
                break;
        }

    }

}
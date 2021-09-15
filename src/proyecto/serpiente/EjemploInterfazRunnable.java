package proyecto.serpiente;

public class EjemploInterfazRunnable {

    public static void main(String[] args) {
        new Thread(new HiloDeEjemplo(), "Juan").start();
        new Thread(new HiloDeEjemplo(), "Jose").start();
    }
}

class HiloDeEjemplo implements Runnable {
    public void run() {
        for (int i = 0; i < 500; i++)
            System.out.println(i + " " + Thread.currentThread().getName());
        System.out.println("Termina thread " + Thread.currentThread().getName());
    }
}
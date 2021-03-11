package comm.example;

import java.io.Serializable;

public class PersistentAnimation implements Serializable, Runnable {

    transient private Thread animator;
    private int animationSpeed;

    public PersistentAnimation(int animationSpeed) {
        this.animationSpeed = animationSpeed;
        animator = new Thread(this);
        animator.start();
    }

    public void run() {
        System.out.println("PersistentAnimation thread is started");
    }
}

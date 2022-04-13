package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        zofka.setLocation(50, 100);

        for (int i = 0; i < 3; i++) {

            drawHouse(zofka);

            zofka.penUp();
            zofka.turnRight(90);
            zofka.move(20);
            zofka.turnLeft(90);
            zofka.penDown();
        }

    }

    private void drawHouse(Turtle zofka) {
        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(90);
        }
        zofka.turnRight(45);
        zofka.move(63.64);
        zofka.turnRight(90);
        zofka.move(63.64);
        zofka.turnLeft(135);
    }

}

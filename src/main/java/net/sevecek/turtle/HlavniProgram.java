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
        Turtle efka = new Turtle();
        efka.setLocation(350, 100);
        drawHouse(efka);
        
    }

    private void drawHouse(Turtle name) {
        for (int i = 0; i < 4; i++) {
            name.turnRight(90);
            name.move(90);
        }
        name.turnRight(45);
        name.move(63.64);
        name.turnRight(90);
        name.move(63.64);
        name.turnLeft(135);
    }

}

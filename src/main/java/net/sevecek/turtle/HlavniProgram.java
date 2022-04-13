package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        zofka.setLocation(485, 100);

        zofka.turnRight(45);
        zofka.move(90);
        zofka.turnRight(90);
        zofka.move(90);
        zofka.turnRight(135);
        zofka.move(125);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(125);
        zofka.turnLeft(90);
        zofka.move(150);

        zofka.setLocation(50, 100);


        for (int i = 0; i < 3; i++) {


            zofka.turnRight(45);
            zofka.move(90);
            zofka.turnRight(90);
            zofka.move(90);
            zofka.turnRight(135);
            zofka.move(125);
            zofka.turnLeft(90);
            zofka.move(150);
            zofka.turnLeft(90);
            zofka.move(125);
            zofka.turnLeft(90);
            zofka.move(150);

            zofka.penUp();
            zofka.turnRight(90);
            zofka.move(20);
            zofka.turnLeft(90);
            zofka.penDown();
        }




    }

}

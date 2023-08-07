package Java;

class Shape {
    int sides;

    Shape(int sides) {
        this.sides = sides;
    }

    void displaySides() {
        System.out.println("Sides: " + sides);
    }
}

class Triangle extends Shape {
    Triangle() {
        super(3);
    }
}

class Square extends Shape {
    Square() {
        super(4);
    }
}

class Rectangle extends Shape {
    Rectangle() {
        super(4);
    }
}
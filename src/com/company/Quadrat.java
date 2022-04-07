package com.company;

public class Quadrat {

    float side;

    public float getSide(){
        return this.side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public Quadrat(float side) {
        this.setSide(side);
    }
    public float getArea(){
        return this.side*this.side;
    }
    public float getVolum(){
        return this.side*this.side*this.side;
    }

}



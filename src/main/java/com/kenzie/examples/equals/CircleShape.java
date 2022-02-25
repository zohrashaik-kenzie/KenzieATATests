package com.kenzie.examples.equals;

public class CircleShape extends SprayableShape {
    private double radius;

    public CircleShape(Spray spray, double radius) {
        super(spray);
        this.radius = radius;
    }

    @Override
    public double getSprayableArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
       if (o==null){
           return false;
       }

       if (this == o){
           return true;
       }

       if(this.getClass() != o.getClass()){
            return false;
        }

       CircleShape that = (CircleShape)o;
      return(this.getSpray() == that.getSpray() &&
               Double.compare(this.getSprayableArea(),that.getSprayableArea()) == 0);

    }
}

public abstract class GeometryObject implements Comparable<GeometryObject>{

    abstract double getSquare();
    abstract void setScale(double q);
    public int compareTo(GeometryObject o){
        if (this.getSquare()>o.getSquare()){
            return 1;
        }
        else if (this.getSquare()<o.getSquare()){
            return -1;
        }
        return 0;
    }
}

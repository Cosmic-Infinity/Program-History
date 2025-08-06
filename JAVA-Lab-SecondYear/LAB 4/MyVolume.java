/*
Write a program in
Java to create a class MyVolume with required data members and find the
volume of cube, cuboid and sphere using constructor overloading.
 */

class MyVolume{
    MyVolume(int l){
        System.out.println("Volume of Cube: "+(l*l*l));
    }

    MyVolume(float l, float b, float h){
        System.out.println("Volume of Cuboid: "+(l*b*h));
    }

    MyVolume(float r){
        System.out.println("Volume of Sphere: "+((4/3)*3.14*r*r*r));
    }

    public static void main(String[] args){
        MyVolume cube = new MyVolume(5);
        MyVolume cuboid = new MyVolume(2f,3f,4f);
        MyVolume sphere = new MyVolume(5f);
    }
}
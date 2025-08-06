/*
1.
Illustrate the execution of constructors in multi-level inheritance with three Java classes – 
plate(length, width), box(length, width, height), wood box (length, width, height, thick) 
 */

class Mains{
    public static void main(String[] args){
        WoodBox box = new WoodBox(2,3,4,5);
        System.out.println("Wooden box length = "+box.length);
        System.out.println("Wooden box length = "+box.width);
        System.out.println("Wooden box length = "+box.height);
        System.out.println("Wooden box length = "+box.thick);
    }
}

class Plate{
    int length, width;
    Plate(int l, int w){
        length = l;
        width = w;
    }
}

class Box extends Plate{
    int height;
    Box(int l, int w, int h){
        super(l,w);
        height = h;
    }
}

class WoodBox extends Box{
    int thick;
    WoodBox(int l, int w, int h, int t){
        super(l,w,h);
        thick = t;
    }
}
class Rectangle{

    int length;
    int width;

    void insert(int l, int w){
        length = l;
        width = w;

    }

    float calculateArea(){
        return length*width;
    }

    void display(){
        System.out.println("The sum of "+length+" and "+width+" is "+calculateArea());
    }
}
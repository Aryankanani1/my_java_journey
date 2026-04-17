public class VariableScope {
int x = 10; // instance scope (visible to whole class)
    int count = 0;
    public void myMethod(int p){ // local scope (visible to only method level)
        int y = 5;
        System.out.println(y+p);

        if(y>0){
            int z = 100; // block scope (z is visible only inside this IF)
            System.out.println(x+y+z+p);
        }
    }

    public void update(){
        int count = 10;
        System.out.println(count);
        System.out.println(this.count);
    }

    public static void main(String[] args) {
        VariableScope vb = new VariableScope();
        vb.myMethod(5);
        System.out.println("-----");
        vb.update();
    }
}





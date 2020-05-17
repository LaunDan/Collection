package collection;

public class Main<M extends N, N extends F, F>{

    private M variable;

    public Main(M variable) {
        this.variable = variable;
    }

    public static void main(String[] args) {
        Main<Integer, Integer, Integer> instance = new Main<>(10);

        System.out.println(instance.compare("10"));
    }

    public <M2> boolean compare(M2 a){
        return variable.equals(a);
    }
}

public class Main {

    public static void main(String[] args){
        
        // Pair<Integer> p1 = new Pair<Integer>(10, 20);
        // Pair<String, Integer> p1 = new Pair<String, Integer>("Jagdish", 2012083);
        // Pair<Integer, Integer> p2 = new Pair<>(10, 20);
        // Pair<String, String> p3 = new Pair<>("Jagdish", "Kumawat");



        // System.out.println(p3.getX());
        // System.out.println(p3.getY());



        int[] arr = {2, 3, 4, 5, 6};

        for(int i = 0; i < arr.length; i++){

            for(int j = i+1; j < arr.length; j++){

                Pair<Integer, Integer> p = new Pair<> (arr[i], arr[j]);

                System.out.print(p.getX() + " " +p.getY());
                System.out.println();

            }
        }
    }
}

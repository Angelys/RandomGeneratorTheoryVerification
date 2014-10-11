class GeneratorMultiplexer {

    ArrayList<Generator> generators
    int T
    int M
    public int[] line

    public GeneratorMultiplexer(ArrayList<Generator> generators, int M){

        this.generators = generators
        this.M = M

        T = generators.get(0).T

        for(int i = 1; i < generators.size(); i++){
            T = lcm(T, generators.get(i).T)
        }

        line = getLine()

    }

    private int[] getLine(){

        int[] result = new int[T]

        for(int i = 0; i < T; i++){

            result[i] = 0

            for(int j = 0; j < generators.size(); j++){
                result[i] = (result[i] + generators.get(j).getNext()) % M
            }

        }

        for(int j = 0; j < generators.size(); j++){
            generators.get(j).reset()
        }

        return result
    }

    private static int lcm(int a, int b){
        for(int i = 1; true; i++){
            if(i*a % b == 0)
                return i*a;
        }
    }

}

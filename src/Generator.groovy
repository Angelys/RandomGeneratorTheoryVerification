class Generator {
    int T
    int M
    private index = 0

    int[] numbers

    public Generator(int T, int M){
        assert T > 0
        assert M > 0

        this.T = T
        this.M = M

        numbers = shuffleArray(getLine())
    }

    public void reset(){
        index = 0
    }

    public int getNext(){

        int out = numbers[index]

        index++
        if(numbers.size() <= index){
            index = 0
        }

        out
    }

    private int[] getLine(){
        int[] array = new int[T];

        for(int i = 0; i < T; i++){
             array[i] = i % M
        }

        return  array
    }

    private int[] shuffleArray(int[] ar)
    {
        Random rnd = new Random()

        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1)
            // Simple swap
            int a = ar[index]
            ar[index] = ar[i]
            ar[i] = a
        }

        return ar
    }

    public String toString(){
        numbers
    }
}

class GeneratorsTester {

    Integer topM;
    Integer generatorsNumber;

    private configs = []

    public GeneratorsTester(topM, generatorsNumber){
        this.topM = topM
        this.generatorsNumber = generatorsNumber

        init()
    }

    public init(){

        generateConfigs()

    }

    public runTests(callback){
        configs.each {
            runTest(it, callback)
        }
    }

    private runTest(config, callback){

        def generators = []

        def maxM = 0

        config.each {
            generators.add new Generator(it[0], it[1])
            maxM = it[1] > maxM ? it[1] : maxM
        }

        def gm = new GeneratorMultiplexer(generators, 2);
        for ( int i = 2; i <= maxM; i++){
            gm.M = i

            callback generators, gm

        }

    }

    private generateConfigs(){

        (topM**generatorsNumber).times { i ->

            def config = []

            generatorsNumber.times { j ->

                def number = i

                if( j > 0 ){
                    number = (int)Math.floor(i / topM ** j)
                }

                number = number % topM

                config.add( [ number, number ] )
            }

            def add = true

            config.each {
                if(it == [0, 0]){
                    add = false
                    return
                }
            }

            if(add){
                configs.add config
            }

        }

    }

}

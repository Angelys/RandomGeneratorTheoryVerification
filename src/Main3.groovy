
def logs = new File('logsM5.txt')
logs.text = ''

def topM = 50
def genNumber = 2

def tester = new GeneratorsTester(topM, genNumber)

def results = []

boolean[] primes = fillSieve();

Double counter = 0
Double steps = topM ** genNumber * topM * 0.64

def start = new Date().time

tester.runTests({ generators, gm ->

    if(counter % 10000 == 0){
        def percent = counter / steps
        def time =  (new Date().time - start) / 1000
        println "left: " + ( (time / percent)  - time) + " percent:" + percent
    }

    def elems = countElements(gm.line)

    def line = elems.size() == gm.M

    for(int j = 1; j < elems.size(); j++){
        if(elems.get(j) != elems.get(j-1)){
            line = false;
            break;
        }
    }

    if( line ){

        def result = []

        generators.each { it ->
            result.add it.M
        }

        result.add gm.M
        result.add gm.T

        results.add result
    }

    counter++

})

def expected = []
def unexpected = []

results.each { it ->

    if( (it[0] % it[2] == 0 || it[1] % it[2] == 0) ){
        expected.add it
    } else {
        unexpected.add it
    }

}

saveToFile("expected5.txt", expected)
saveToFile("unexpected5.txt", unexpected)

//==========================================================================

//set up the primesieve
public fillSieve() {
    primes = new boolean[100];

    Arrays.fill(primes,true)        // assume all integers are prime.
    primes[0]=primes[1]=false       // we know 0 and 1 are not prime.
    for (int i=2;i<primes.length;i++) {
        //if the number is prime,
        //then go through all its multiples and make their values false.
        if(primes[i]) {
            for (int j=2;i*j<primes.length;j++) {
                primes[i*j]=false
            }
        }
    }
    return primes
}

public static countElements(int[] input){
    def output = new HashMap()

    for(int i = 0; i < input.size(); i++){
        if(!output.containsKey(input[i])){
            output.put(input[i], 1)
        } else {
            output.put(input[i], output.get(input[i])+1)
        }
    }

    return output

}

public static saveToFile(name, data){

    def file = new File(name)

    file.write "  M1  |  M2  |  M   |  T  \n"

    data.each { it ->
        file.append " " + it[0].toString().padLeft(4) + " | " + it[1].toString().padLeft(4) + " | " + it[2].toString().padLeft(4) + " | " + it[3].toString() + "\n"
    }

}
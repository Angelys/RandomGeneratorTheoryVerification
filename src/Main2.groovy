
def logs = new File('logsM5.txt')
logs.text = ''

generatorsConfigs = [
        [[ 3, 3 ], [ 7, 7 ]],
        [[ 3, 3 ], [ 8, 8 ]],
        [[ 3, 3 ], [ 9, 9 ]],
        [[ 3, 3 ], [ 10, 10 ]],
        [[ 3, 3 ], [ 11, 11 ]],
        [[ 3, 3 ], [ 12, 12 ]],
        [[ 3, 3 ], [ 13, 13 ]],
        [[ 3, 3 ], [ 14, 14 ]],
        [[ 3, 3 ], [ 15, 15 ]],
        [[ 3, 3 ], [ 16, 16 ]],
        [[ 3, 3 ], [ 17, 17 ]],
        [[ 3, 3 ], [ 18, 18 ]],
        [[ 3, 3 ], [ 19, 19 ]],
        [[ 3, 3 ], [ 20, 20 ]],

        [[ 4, 4 ], [ 7, 7 ]],
        [[ 4, 4 ], [ 8, 8 ]],
        [[ 4, 4 ], [ 9, 9 ]],
        [[ 4, 4 ], [ 10, 10 ]],
        [[ 4, 4 ], [ 11, 11 ]],
        [[ 4, 4 ], [ 12, 12 ]],
        [[ 4, 4 ], [ 13, 13 ]],
        [[ 4, 4 ], [ 14, 14 ]],
        [[ 4, 4 ], [ 15, 15 ]],
        [[ 4, 4 ], [ 16, 16 ]],
        [[ 4, 4 ], [ 17, 17 ]],
        [[ 4, 4 ], [ 18, 18 ]],
        [[ 4, 4 ], [ 19, 19 ]],
        [[ 4, 4 ], [ 20, 20 ]],

        [[ 5, 5 ], [ 7, 7 ]],
        [[ 5, 5 ], [ 8, 8 ]],
        [[ 5, 5 ], [ 9, 9 ]],
        [[ 5, 5 ], [ 10, 10 ]],
        [[ 5, 5 ], [ 11, 11 ]],
        [[ 5, 5 ], [ 12, 12 ]],
        [[ 5, 5 ], [ 13, 13 ]],
        [[ 5, 5 ], [ 14, 14 ]],
        [[ 5, 5 ], [ 15, 15 ]],
        [[ 5, 5 ], [ 16, 16 ]],
        [[ 5, 5 ], [ 17, 17 ]],
        [[ 5, 5 ], [ 18, 18 ]],
        [[ 5, 5 ], [ 19, 19 ]],
        [[ 5, 5 ], [ 20, 20 ]],

        [[ 6, 6 ], [ 7, 7 ]],
        [[ 6, 6 ], [ 8, 8 ]],
        [[ 6, 6 ], [ 9, 9 ]],
        [[ 6, 6 ], [ 10, 10 ]],
        [[ 6, 6 ], [ 11, 11 ]],
        [[ 6, 6 ], [ 12, 12 ]],
        [[ 6, 6 ], [ 13, 13 ]],
        [[ 6, 6 ], [ 14, 14 ]],
        [[ 6, 6 ], [ 15, 15 ]],
        [[ 6, 6 ], [ 16, 16 ]],
        [[ 6, 6 ], [ 17, 17 ]],
        [[ 6, 6 ], [ 18, 18 ]],
        [[ 6, 6 ], [ 19, 19 ]],
        [[ 6, 6 ], [ 20, 20 ]],

        [[ 7, 7 ], [ 7, 7 ]],
        [[ 7, 7 ], [ 8, 8 ]],
        [[ 7, 7 ], [ 9, 9 ]],
        [[ 7, 7 ], [ 10, 10 ]],
        [[ 7, 7 ], [ 11, 11 ]],
        [[ 7, 7 ], [ 12, 12 ]],
        [[ 7, 7 ], [ 13, 13 ]],
        [[ 7, 7 ], [ 14, 14 ]],
        [[ 7, 7 ], [ 15, 15 ]],
        [[ 7, 7 ], [ 16, 16 ]],
        [[ 7, 7 ], [ 17, 17 ]],
        [[ 7, 7 ], [ 18, 18 ]],
        [[ 7, 7 ], [ 19, 19 ]],
        [[ 7, 7 ], [ 20, 20 ]],

        [[ 8, 8 ], [ 7, 7 ]],
        [[ 8, 8 ], [ 8, 8 ]],
        [[ 8, 8 ], [ 9, 9 ]],
        [[ 8, 8 ], [ 10, 10 ]],
        [[ 8, 8 ], [ 11, 11 ]],
        [[ 8, 8 ], [ 12, 12 ]],
        [[ 8, 8 ], [ 13, 13 ]],
        [[ 8, 8 ], [ 14, 14 ]],
        [[ 8, 8 ], [ 15, 15 ]],
        [[ 8, 8 ], [ 16, 16 ]],
        [[ 8, 8 ], [ 17, 17 ]],
        [[ 8, 8 ], [ 18, 18 ]],
        [[ 8, 8 ], [ 19, 19 ]],
        [[ 8, 8 ], [ 20, 20 ]],
        [[ 9, 9 ], [ 7, 7 ]],
        [[ 9, 9 ], [ 8, 8 ]],
        [[ 9, 9 ], [ 9, 9 ]],
        [[ 9, 9 ], [ 10, 10 ]],
        [[ 9, 9 ], [ 11, 11 ]],
        [[ 9, 9 ], [ 12, 12 ]],
        [[ 9, 9 ], [ 13, 13 ]],
        [[ 9, 9 ], [ 14, 14 ]],
        [[ 9, 9 ], [ 15, 15 ]],
        [[ 9, 9 ], [ 16, 16 ]],
        [[ 9, 9 ], [ 17, 17 ]],
        [[ 9, 9 ], [ 18, 18 ]],
        [[ 9, 9 ], [ 19, 19 ]],
        [[ 9, 9 ], [ 20, 20 ]],
]

logs.append("T1 M1 | T2 M2 | T  M \n")
generatorsConfigs.each { generatorsConfig ->

    ArrayList<Generator> generators = new ArrayList<Generator>();
    def maxM = 0

    generatorsConfig.each { it ->

        def generator = new Generator( it[0], it[1] )
        generators.add( generator )
        maxM = it[1] > maxM ? it[1] : maxM
    }

    def gm = new GeneratorMultiplexer(generators, 2);
    for ( int i = 2; i <= maxM; i++){
        gm.M = i

        def elems = countElements(gm.line)

        def line = elems.size() == gm.M

        for(int j = 1; j < elems.size(); j++){
            if(elems.get(j) != elems.get(j-1)){
                line = false;
                break;
            }
        }

        if(line){
            logs.append( generators.get(0).T.toString().padLeft(2) + " " + generators.get(0).M.toString().padLeft(2) + " | " + generators.get(1).T.toString().padLeft(2) + " " + generators.get(1).M.toString().padLeft(2) + " | " + gm.T.toString().padLeft(2) + " " + gm.M.toString().padLeft(2) + " " + elems + "\n")
        }

    }
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

public static mapToString(HashMap map){

    def output = ""

    map.each {k,v ->
        output += k + "|"
    }

    output += "\n"

    map.each {k,v ->
        output += v.toString().padLeft(k.toString().length(), ' ') + "|"
    }

    return output
}


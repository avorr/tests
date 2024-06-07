def compress(x) {
    result = ""
    letterCounter = 1
    for(int i=0; i<x.length(); i++){
        if ((i + 1 < x.length()) && (x[i] == x[i + 1])) {
            letterCounter += 1
        }else {
            if (letterCounter == 1) {
                result += x[i]
            }else {
                result += x[i] + letterCounter.toString()
            }
            letterCounter = 1
        }
    }
    return result;
}

println(compress("AAAAABBDCAAADDDDBC"))

package basicCoding_Programmers.stringAndIntegerCompare;

class CompareStringWithInteger {
    public int solution(int a, int b) {
        int answer = 0;

        String str1 = String.valueOf(a)+String.valueOf(b);
        String str2 = String.valueOf(b)+String.valueOf(a);

        Integer int1 = Integer.parseInt(str1);
        Integer int2 = Integer.parseInt(str2);
        if(int1>int2){
            answer = int1;
        }else{answer = int2;}

        return answer;
    }
}
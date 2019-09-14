class Solution {
    public int solution(int[] A) {
      
    int[] holdfirst = null;
    int[] holdsecond = null;
    int[] third = null;
    int[] forth =null;
    int[] fifth = null;
    
    //fill first column
    for (int i= 1; i<A.length ; i++){
     
     int n = 12 -i;
     holdfirst[i]= n;
    
    }
    
     for (int i= 1; i<A.length ; i++){
     
     int n = i+2;
     holdsecond[i]= n;
    }
    
    
     for (int i= 1; i<A.length ; i++){
     
     int n = 8-i;
     third[i]= n;
    }
    
     for (int i= 1; i<A.length ; i++){
     
     int n = i+1;
     forth[i]= n;
    }
	return 0;
    }}

package labos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.lang.Math;

class Solution{

    public static Predicate<List<List<Integer>>> allDigitsMatch(double exemplar){
        return  new Predicate<List<List<Integer>>>(){
            @Override
            public boolean test(List<List<Integer>> ls) {
                List<Integer> nmb = new ArrayList<>();
            	int max = -1;
                for(List<Integer> l : ls) {
                	if(max < l.get(0))max = l.get(0);
                }
            	for(int i = 0; i <= max; i++) {
            		nmb.add(-1);
                }
            	for(List<Integer> l : ls) {
                	nmb.add(l.get(0), l.get(1));
                	String s = "dfge";
                	s.charAt(0);
                }
            	double x = 0;
            	for(int i = 0; i < nmb.size(); i++) {
            		x += (double)nmb.get(i)*Math.pow(10 , -i);
            	}
            	return x == exemplar;
            }
        } ;
    }
    
    
    public static Predicate<List<List<Integer>>> allDigitsDefined(){
        return  new Predicate<List<List<Integer>>>(){
            @Override
            public boolean test(List<List<Integer>> ls) {
            	List<Integer> nmb = new ArrayList<>();
            	int max = -1;
                for(List<Integer> l : ls) {
                	if(max < l.get(0))max = l.get(0);
                }
            	return max + 1 == nmb.size();
            }
        } ;
    }

}

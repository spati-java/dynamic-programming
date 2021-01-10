import java.util.*;

class GridTraveler {

    public Map<String , Integer> map = new HashMap<>();

    public static void main(String [] args) {

        GridTraveler gt = new GridTraveler();

        System.out.println("Grid for 2 X 3");

        System.out.println(gt.gridTraveler(2,3 , gt.map));

        System.out.println("Grid for 3 X 3");

        System.out.println(gt.gridTraveler(3,3 , gt.map));


        System.out.println("Grid for 18 X 18");

        System.out.println(gt.gridTraveler(18,18 , gt.map));
    }

    public int gridTraveler(int rows , int cols, Map<String, Integer> map){
        
        String key = rows + "," + cols;

        if(map.containsKey(key))
            return map.get(key);
        
            if(rows == 1 && cols == 1)
                return 1;
            if(rows == 0  || cols == 0)    
                return 0;

           int value = gridTraveler(rows-1, cols , map) + gridTraveler(rows, cols-1, map);

           map.put(key, value);

           return map.get(key);
    }
}


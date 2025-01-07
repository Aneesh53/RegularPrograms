package collections;

import java.util.Map;
import java.util.TreeMap;

class EmployeeInfo {
    int number;
    int rank;

    EmployeeInfo(int number, int rank) {
        this.number = number;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Number: " + number + ", Rank: " + rank;
    }
}

public class MapsExecise4 {

    public static void main(String[] args) {
        Map<String, EmployeeInfo> employees = new TreeMap<>();
        
        employees.put("Aneesh", new EmployeeInfo(50, 98));
        employees.put("Ravi", new EmployeeInfo(55, 97));
        employees.put("Naveen", new EmployeeInfo(65, 94));
        employees.put("Katich", new EmployeeInfo(72, 92));
        employees.put("Krunal", new EmployeeInfo(65, 93));

        // Printing the merged map
        employees.forEach((key, value) -> 
            System.out.println("Name: " + key + ", " + value)
        );
    }
}

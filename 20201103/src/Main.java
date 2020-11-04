import java.util.*;

/**
 * @Version 1.0
 * @Author: Hu
 * @DATE: 2020/11/4 15:34
 * Content:
 */
public class Main {
    Solution sl = new Solution();

}
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee e : employees)
            map.put(e.id, e);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(id);
        int count = 1;
        int sum = 0;
        while (!queue.isEmpty()) {
            while (count-- > 0) {
                int tmpId = queue.remove();
                sum += map.get(tmpId).importance;
                for (int n : map.get(tmpId).subordinates)
                    queue.add(n);
            }
            count = queue.size();
        }
        return sum;
    }
}

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sth1 {

    public static void main(String[] args){
        Random rand = new Random();
        int eightDig = (int) Math.floor(10_000_000 + (rand.nextInt(90_000_000)));
        System.out.println(eightDig);
        int sum = String.valueOf(eightDig).chars().map(Character::getNumericValue).sum();
        System.out.println(Arrays.toString(String.valueOf(eightDig).chars().map(Character::getNumericValue).toArray()));
        System.out.println(sum);

        int array[] = { 1, 2, 3 };
        int length = array.length; //nextPermutation

        //count characters occurances
        String str = "mahamahahihiii";
        Map<Character, Integer> map = new HashMap<>();
        for (char c:str.toCharArray()) {
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            map.put(c, map.get(c)+1);
        }
        for(Object sth : map.entrySet()){
            System.out.println(sth);
        }

        IntStream ints = rand.ints(5, 1, 100).distinct().sorted();

        ints.forEach(System.out::println);

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        System.out.println(stack.peek());

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(str0 -> !str0.isEmpty()).collect(Collectors.toList());
        filtered.forEach(System.out::println);

        Math.max(1,1);

        int[] arr = solution(15324);


    }

    public static int[] solution(int area) {
        // Your code here
        List<Integer> squares = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        for(int i = 1; i <= 1000; i++){
            squares.add(i*i);
        }
        for (int i=squares.size()-1;i>-1;i--) {
            int num = squares.get(i);
            while (area>=num && area>0){
                area-=num;
                sol.add(num);
            }
        }
        sol=sol.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sol.forEach(System.out::println);
        int[] array = sol.stream().mapToInt(i->i).toArray();
        return array;
    }
}

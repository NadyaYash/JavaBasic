import java.util.*;

/**
 * Java Basic HomeTask7
 *
 * @author Nadzeya Yashchuk
 * @todo 26.09.2022
 * @date 30.09.2022
 */

public class HomeTask7 {
    public static void main(String[] args) {

        showArrays();
        showList();
        showMap();
        showCollection();
        lotteryPart();
    }

    static void lotteryPart() {
        List<Integer> lottery = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lottery.add(i + 1);
        }
        Collections.shuffle(lottery);
        System.out.println(lottery.subList(0,10));
    }

    static void showCollection() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(3,9,7,8,9,0));
        System.out.println(arrayList);
        System.out.println(Collections.max(arrayList));
        System.out.println(Collections.min(arrayList));
    }

    static void showMap() {
        Map<Integer, String> daysMap = new HashMap<>();
        daysMap.put(1, "Monday");
        daysMap.put(2, "Tuesday");
        daysMap.put(3, "Wednesday");
        System.out.println(daysMap);
        System.out.println(daysMap.get(2));
    }

    static void showList() {
        List<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.addAll(Arrays.asList(0,5,8,12));
        System.out.println(arrayList);
        arrayList.add(3, 9);
        System.out.println(arrayList);
        arrayList.remove(4);
        System.out.println(arrayList);
        for (Integer a : arrayList) {
            System.out.println(a);
        }
    }

    static int[] generateArray(int length) {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * 20);
        }
        return result;
    }

    static void showArrays() {
        int[] arr = generateArray(25);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int found = Arrays.binarySearch(arr, 10);
        System.out.println(found + ":" + arr[found]);
    }
}


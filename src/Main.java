import queue.LabQueue;
import sort.LabSort;
import stack.LabStack;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------START OF FIRST TEST-------------");

        LabSort sort = new LabSort();
        int[] arr = new int[]{100, 1, 40, 35, 89, 6};
        int[] tmp = sort.sort(arr);
        for (int i = 0; i < 6; i++) {
            System.out.println(tmp[i]);
        }

        System.out.println("-------------END OF FIRST TEST-------------");
        System.out.println("-------------START OF SECOND TEST-------------");


        LabQueue queue = new LabQueue();
        queue.push("A");
        queue.push("B");
        queue.push("C");
        queue.push("D");

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println("-------------END OF SECOND TEST-------------");
        System.out.println("-------------START OF THIRD TEST-------------");

        LabStack stack = new LabStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("-------------END OF THIRD TEST-------------");
    }
}
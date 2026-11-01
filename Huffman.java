import java.util.PriorityQueue;
import java.util.Scanner;
class Node{
    char ch;
    int freq;
    Node left,right;


    Node(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
    Node(int freq, Node left, Node right){
        this.freq = freq;
        this.left = left;
        this.right = right;
    }

}


public class Huffman{
    private static void print(Node root, String code){
        if(root == null){
            return;
        }
        if(root.left == null || root.right == null){
            System.out.println(root.ch + ": " + code);
            return;
        }
        print(root.left, code+"0");
        print(root.right, code+"1");
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        PriorityQueue<Node> minHeap = new PriorityQueue<>((a,b) -> a.freq - b.freq);

        for(int i = 0; i < n; i++){
            System.out.println("Enter node letter " + i+1 + ":");
            char c = s.next().charAt(0);
            System.out.println("Enter frequency: ");
            int freq = s.nextInt();
            Node curr = new Node(c, freq);
            minHeap.offer(curr);
        }

        while(minHeap.size() > 1){
            Node a = minHeap.poll();
            Node b = minHeap.poll();
            Node c = new Node(a.freq+b.freq, a, b);
            minHeap.offer(c);
        }

        print(minHeap.poll(), "");
        s.close();
    }
}
import java.util.Scanner;

class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elemnts in the array : ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Search Element: ");
        int key = sc.nextInt();
        boolean found = false;
        for(int i=0;i<n;i++) {
            if(arr[i] == key) {
                System.out.print("Element "+key+" found at position "+(i+1));
            }
            found = true;
        }
        if(!found) {
            System.out.print("Element not found.");
        }
    }
}

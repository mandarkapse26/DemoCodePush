package vishal;

public class tasking {

	public static void main(String[] args) {

		int[] arr = {10, 30, 40, 50, 50, 20, 40};
        int[] temp = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[count] = arr[i];
                count++;
            }
        }

        System.out.print("Output: {");
        for (int i = 0; i < count; i++) {
            System.out.print(temp[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
   
	}
}
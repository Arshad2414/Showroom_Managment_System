import java.util.Scanner;




public class ArrayUtils {
    public static void deleteElementFromArray(Object[] array,int counter,String objectName,Scanner sc,utility formatter){
        int indexToDelete;
        String confirm;
        if (counter == 0) {
            System.out.println("NO ANY "+objectName+"CREATED YET");
        }else{
            System.out.println("ENTER THE NUMBER OF "+objectName+"YOU WANT TO DELETE (OR 0 TO GO BACK)");
            indexToDelete = sc.nextInt()-1;
            sc.nextLine();
            
            System.out.println("DO YOU WANT TO DELETE "+formatter.getObjectName(array[indexToDelete])+" "+objectName+" ? (Y/N)");
             confirm = sc.nextLine();
            if (confirm.equalsIgnoreCase("Y")) {
                if (indexToDelete >= 0 && indexToDelete < counter) {
                    for (int i = indexToDelete; i < counter-1; i++) {
                        array[i] = array[i+1];
                    }
                    counter--;
                    System.out.println(formatter.getObjectName(array[indexToDelete])+" "+objectName+" SUCCESSFULLY DELETE");
                }else if (indexToDelete == -1) {
                    System.out.println("RETURN TO MAIN MENU");
                }else{
                    System.out.println("INVALID INDEX !");
                }
            }
        }
    }
    private static Object [] trinArray(Object [] array,int newSize ){
        Object [] newArray = new Object[newSize];
        System.arraycopy(array, 0, newArray, 0, newSize);
        return newArray;
    }
}



/*The private static Object[] trimArray() method is a static utility method that takes an array of Object type as input and returns a new array of Object type with a specified size. This type of method 
        is often used to perform operations on arrays or collections of objects.
        In Java, when you declare a method to return an array, you specify the array type followed by empty square brackets []. In this case, Object[] means that the method returns an array of Object instances. 
        Note: read array,array string and collection for this understand
        Arrays
            
        Arrays are used to store multiple values of the same data type in a single variable.
        In Java, arrays have a fixed size, which means that once an array is created, its size cannot be changed.
        You should review how to declare, initialize, and access elements in an array.
            
            
        System.arraycopy Method
            
        The System.arraycopy method is a utility method in the System class that allows you to copy elements from one array to another.
        Its signature is: public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
            
        src: The source array from which elements are copied.
        srcPos: The starting position in the source array.
        dest: The destination array to which elements are copied.
        destPos: The starting position in the destination array.
        length: The number of elements to be copied.
            
            
            
            
            
        In the context of the trimArray method, you should focus on the following aspects:
            
        Creating a New Array
            
        The line Object[] newArray = new Object[newSize]; creates a new array of Object instances with a size specified by newSize.
        This new array will be used to hold the remaining elements after an element has been deleted from the original array.
            
            
        Using System.arraycopy
            
        The line System.arraycopy(array, 0, newArray, 0, newSize); copies the elements from the original array to the newArray.
        The arguments are:
            
        array: The original array from which elements will be copied.
        0: The starting index in the original array from which to copy elements (starting from the first element).
        newArray: The destination array to which elements will be copied.
        0: The starting index in the destination array where elements will be copied (starting from the first position).
        newSize: The number of elements to be copied (equal to the size of the new array).
            
            
            
            
            
        To understand the trimArray method, you should review the following topics in Java:
            
        Arrays (declaring, initializing, accessing elements)
        The System.arraycopy method and its usage
        Creating new arrays with a specified size
            
        By understanding these topics, you will be able to comprehend how the trimArray method creates a new array with a smaller size and copies the remaining elements from the original array to the new array.*/
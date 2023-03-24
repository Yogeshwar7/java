public class revstr{
public static String reverseStringWithoutSpaces(String str) {
    // Convert the string to a character array
    char[] charArray = str.toCharArray();

    // Initialize left and right pointers
    int left = 0, right = charArray.length - 1;

    // Traverse the character array from both ends
    while (left < right) {
        // Skip the spaces
        if (charArray[left] == ' ') {
            left++;
        } else if (charArray[right] == ' ') {
            right--;
        } else {
            // Swap the characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers towards the middle
            left++;
            right--;
        }
    }

    // Convert the character array back to a string
    return new String(charArray);
}
}
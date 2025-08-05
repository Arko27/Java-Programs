//Some String Functions

String s = "COMPUTER APPLICATIONS";
len = s.length(); --> 21
    for (i=0;i<len;i++)
{
    char ch = s.charAt(i);
    
//Return Types of these functions is bool

Character.isLetter(ch) --> checks whether a charcater is Letter or not and returns True or-else False

Character.isDigit(ch) --> checks whether a charcater is Digit or not and returns True or-else False

Character.isLetterOrDigit(ch) --> checks whether a charcater is letter or digit it returns True or-else False

Character.isWhiteSpace(ch) --> checks whether a charcater is whitespace or not and returns True or-else False

Character.isUpperCase(ch) --> checks whether a charcater is capital letter or not and returns True or-else False

Character.isLowerCase(ch) --> checks whether a charcater is small letter or not and returns True or-else False


// Return Type of these functions is char

Character.toUpperCase(ch) --> converts the character to capital letter

Character.toLowerCase(ch) --> converts the character to small letter

//Substring

String s = "COMPUTER"

s.substring(firstIndex, lastIndex) --> firstIndex is Inclusive & lastIndex is Exclusive.

s.substring(1,4) --> "OMP"

s.substring(2) --> "MPUTER"

Integer.valueOf(String)
float n = Float.valueOf("25.2")
n = 25.2

1. WAP to input a String and print the no. of letters, digits, uppercase and lowercase characters.

String s = Integer.toString(12)
s = "12"

Input: "Comp APP 2021"
Output:

No. of letters: 7
No. of Digits: 4
No. of Uppercase: 4
No. of Lowercase: 3

2. WAP to input a String and apply Toggle-case.

ToggleCase: Converts the upper case to lower case and lower case to upper case.

input: "HeLlO WoRld"
output: "hElLo wOrLD"

3. WAP to input two nos. and simply join them.

Input: 12
       34
       
Output: 1234

4. WAP to input a string and print the reversed String.

Input: "COMPUTER"
Output: "RETUPMOC"

5. WAP to input a String and check whethet it is Palindrome or not

Input: "MADAM"
Output: The String is Palindrome.

r = ch + r

if (s.comapreTo(r) == 0)

if (s.equals(r) == true)

6. WAP to input a string and convert into following

Input: " PRAMILA MEMORIAL INSTITUTE"
Output: "P.M.I."
    
7. WAP to input a string and print the words

    Input: "I study in Class 10 "
    Output: 

    I
    study
    in
    Class
    10
    
8. WAP to input a string and convert in the following way:

Input: "We study in school"

Output: "eW yduts ni loohcs"




















/**
     * Returns a new string version of the current string where the alphabetical characters specified in the given arg, are removed.
     *   
     * The alphabetical characters to be removed are case insensitive.  
     * All non-alphabetical characters are unaffected.
     * If the current string is null, empty, or has not been set to a value, this method should return an empty string.
     *
     * Example(s):
     * - For a current string "my lucky numbers are 6, 8, and 19.", calling remove("ra6") would return "my lucky numbes e 6, 8, nd 19."
     * - For a current string "my lucky numbers are 6, 8, and 19.", calling remove("6,.") would return "my lucky numbers are 6, 8, and 19."
     * - For a current string "my lucky numbers are 6, 8, and 19.", calling remove("") would return "my lucky numbers are 6, 8, and 19."
     * 
     * Remember: This method builds and returns a new string, and does not directly modify the myString field.
     * 
     * @param arg the string containing the alphabetical characters to be removed from the current string
     * @return new string in which the alphabetical characters specified in the arg are removed
     */
    public String remove(String arg){
        // TODO Implement method
    if(this.myString == null){
        return "";
        }
        
        if(arg == ""){
            return this.myString;
        }

    char[] str = this.myString.toCharArray();
        char[] copy = str;
        StringBuilder t = new StringBuilder(this.myString);
        char[] check = arg.toCharArray();
        for(int i=0;i<copy.length;i++){
            if(Character.isLetter(copy[i])){
                for(int j=0; j<check.length;j++){
                    if(copy[i] == Character.toLowerCase(check[j]) || copy[i] == Character.toUpperCase(check[j])){
                        t.deleteCharAt(i);
                        continue;
                    }
                }
            }
        }
        return t.toString();
    }
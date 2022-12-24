public class Group {

    // public static int startIndex;
    public static int groupTotal;
    public static int endIndex;
    public static int finalGroupTotal;

    // getters
    public static int getGroupTotal() {
        return groupTotal;
    }

    public static int getEndIndex() {
        return endIndex;
    }

    public static int getFinalGroupTotal() {
        return finalGroupTotal;
    }

    // setters
    public static void setGroupTotal(int setterArg) {
        groupTotal = setterArg;
    }

    public static void setEndIndex(int setterArg) {
        endIndex = setterArg;
    }

    public static void setFinalGroupTotal(int setterArg) {
        finalGroupTotal = setterArg;
    }

    /*
     * public Group(int startIndex) {
     * createGroup(startIndex);
     * }
     */

    public static int createGroup(int startIndex) {
        groupTotal = 0;
        // int startIndex = 0;
        // int groupTotal;

        // adds individual elements of an array, and stops at the first empty string
        for (int j = startIndex; j < App.lines2.length; j++) {
            if (App.lines2[j].isEmpty()) {
                // create new group and start again
                endIndex = j;
                finalGroupTotal = groupTotal;
                return groupTotal;
            } else {
                groupTotal += Integer.parseInt(App.lines2[j]);
            }

        }
        return -1;

    }

}

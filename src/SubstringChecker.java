public class SubstringChecker {
    private String goalText;
    public SubstringChecker (String goalText)
    {
        this.goalText=goalText;
    }

    /**
     *
     * @param test
     * @return whether or not goalText appears in test.
     */
    private boolean accept(String test)
    {
        int length= goalText.length();
        for (int i=0; i< test.length(); i++)
        {
            if (goalText.equals(test.substring(i,length)))
            {
                return true;
            }
        }
        return false;
    }
}

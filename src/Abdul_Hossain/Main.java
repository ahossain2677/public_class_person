package Abdul_Hossain;

public class Person {

    public static void Person(String[] args) {
        /// fields ////////////////
        String theName;
        String theCell;

        /////// constructors ////////////////////
  (String theName, String theCell)


        //////////// methods ///////////////////////
        public String getName()
        {
            return this.name;
        }
        public void setName(String theName)
        {
            this.name = theName;
        }

        public String getCell()
        {
            return this.cell;
        }

        public void setCell(String theCell)
        {
            this.cell = theCell;
        }

        public String toString() { return "name: " + this.name +
                ", cell: " + this.cell; }


        // write your code here
    }
}

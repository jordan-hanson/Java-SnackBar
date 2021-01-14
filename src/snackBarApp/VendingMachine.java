package snackBarApp;

public class VendingMachine {
            private static int maxId = 0;
            private int id;
            private String name;

//            Constructor
            public VendingMachine(String name){
                maxId++;
                id = maxId;
                this.name = name;
            }

//            Getters
            public int getMaxId(){
                return this.maxId;
            }
            public int getId(){
                return this.id;
            }
            public String getName() {
                return this.name;
            }

//            Setters
        public void setName(String name) {
            this.name = name;
            }

            @Override
            public String toString(){
                String rtnStr =
                        "id: " + id + "\n"
                        + "name: " + name;

                return rtnStr;
            }
}
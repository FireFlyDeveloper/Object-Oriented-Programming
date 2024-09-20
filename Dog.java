class Dog {

    String name;
    boolean isMale;
    int num_of_puppies;
    Dog puppies[];

    public void setName(String name1) {
        name = name1;
    }

    public String showName() {
        return name;
    }

    public void bark() {
        System.out.println("woof! woof!");
    }

    public void setNumberOfPuppies(int numPuppies) {
        num_of_puppies = numPuppies;
    }

    public int showNumPuppies() {
        return num_of_puppies;
    }

    public void setPuppies(Dog puppies1[]) {
        puppies = puppies1;
    }

    public void showPuppies() {
        for (int i = 0; i < puppies.length; i++) {
            System.out.println(puppies[i].showName());
        }
    }
}

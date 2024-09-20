class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.setName("Megathrone");
        System.out.println(dog.showName());
        dog.bark();
        dog.setNumberOfPuppies(4);
        System.out.println(dog.showNumPuppies());

        Dog dog1 = new Dog();
        dog1.setName("Rex");

        Dog dog2 = new Dog();
        dog2.setName("Max");

        Dog dog3 = new Dog();
        dog3.setName("Lassie");

        Dog puppies[] = {dog1, dog2, dog3};
      
        dog.setPuppies(puppies);
        dog.showPuppies();
    }

}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + " says Meow");
    }
}
    class Animal{
        String name;
        int age;
        void makesound()
        {
            System.out.println("Animal makes sound");
        }
    }
    class Dog extends Animal{
        String breed;
        void makesound()
        {
            System.out.println("Dog Barks");
        }
        void fetch()
        {
            System.out.println("Dog is fetching");
        }
    }
    class cat extends Animal{
        String color;
        void makesound()
        {
            System.out.println("Meow...");
        }
        void climb()
        {
            System.out.print("Cat is Climbing");
        }
    }
    public class inheritance
    {
        public static void main(String[] args)
        {
            Dog d1 = new Dog();
            d1.name="Mani";
            d1.age=12;
            d1.breed="Pitbull";
            d1.makesound();
            d1.fetch();

            cat c1=new cat();
            c1.name="sim";
            c1.age=5;
            c1.color="White & black";
            c1.makesound();
            c1.climb();
        }
       

    }   
/**
 * Created by Babajko on 04.10.2016.
 */
public class Main {

    private static Dog findMaxAge(Dog d1, Dog d2){

        if (d1.getAge() > d2.getAge())
            return  d1;
        else return  d2;
    }

    public static void main(String[] args) {

        Dog dog1, dog2, dog3;
        dog1 = new Dog("Sparki", 3, Dog.Breeds.Boxer);
        dog2 = new Dog("Sparki", 5, Dog.Breeds.Bulldog);
        dog3 = new Dog("Snupi", 1, Dog.Breeds.Boxer);

        if (dog1.equals(dog2)) System.out.println("Name dog1 = name dog2 \"" + dog1.getName()+ "\"");
        if (dog1.equals(dog3)) System.out.println("Name dog1 = name dog3 \"" + dog1.getName()+ "\"");
        if (dog2.equals(dog3)) System.out.println("Name dog2 = name dog3 \"" + dog2.getName()+ "\"");

        System.out.println( "Most oldest dog "+findMaxAge(findMaxAge(dog1, dog2), dog3));
    }
}

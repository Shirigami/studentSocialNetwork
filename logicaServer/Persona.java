import java.util.ArrayList;


public class Person{

  private String name;
  private int age;
  private String carear;
  private String ageCarear;
  private String numberPhone;
  private String address;
  private String email;

  private ArrayList <Person> friends = new ArrayList();
  private String profilePic;


  public Person (String name, int age, String carear,
   String ageCarear,String numberPhone, String address, String email){

    this.name = name;
    this.age = age;
    this.carear = carear;
    this.ageCarear = ageCarear;
    this.numberPhone = numerPhone;
    this.address = address;
    this.email = email;

  }

  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }

  public String getCarear(){
    return this.carear;
  }

  public String getAgeCarear(){
    return this.ageCarear;
  }

  public String getNumberPhone(){
    return this.numberPhone;
  }

  public String getAddress(){
    return this.address;
  }

  public String getEmail(){
    return this.email;
  }

  public String getProfilePic(){
    return this.profilePic;
  }

  public void setProfilePic(String profilePic){
    this.profilePic = profilePic;
  }

  public void addFriend(Person persona){
    friends.add(persona);
  }


}

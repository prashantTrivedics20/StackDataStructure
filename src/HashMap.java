import java.util.*;
public class HashMap {
    Map<String,String>M1=new java.util.LinkedHashMap<>();// Hashmap is a class here it is implemented  the map interface
    // we know that we can't crete the object of the interface that's why in order to crete the object we have to implement the
    // Hashmap class...
    // 1=> main point by using HashMap class order can vary  so inorder to achieve the sequence you have to implement the
    // class called LinkedHashMap instead of using HashMap class
    public void saveCountryCapital(String CountryName, String capital)
    {
        M1.put(CountryName,capital);
    }
    // returning the map
    public Map<String,String> print()
    {
        return M1;
    }
    //2) Develop  a method getCapital( String CountryName) with returns the capital
    //for the contry passed, from the Map M1 created in step 1
    public String getCapital(String CountryName)
    {
       return M1.get(CountryName);

    }
    //3) Develop a method getCountry (String capitalName) which returns the country for the capital name, passed from the Map
    public String getCountryName(String Capital)
    {
        return M1.get(Capital);

    }
    //4) Develop a method which iterates through the map M1 and creates another map M2 with
    //Capital as the key and value as Country and returns the Map  m2.
    //key    capital      value   country
    //delhi                 India
    //Tokya                 Japan
    Map<String,String>M2=new LinkedHashMap<>();
    public void traversingMap(String capital,String CountryName)
    {
        M2.put(capital,CountryName);
    }
    // here i am returning the map (M2)
    public Map<String,String>secondMap()
    {
        return M2;
    }
    //5) Develop a method which iterates through the map M1 and creates and ArrayList with all
    //the Country names stored as keys. This method should return the ArrayList
    //Node - you can test the methods using a main method.
    ArrayList<String> CountryName=new ArrayList<>();
    public void CountryArrayList(String Countryname)
    {
        CountryName.add(Countryname);
    }
    // now returning the ArrayList
    public ArrayList<String>al()
    {
        return CountryName;
    }
    public static void main(String[] args) {
       Scanner readme=new Scanner(System.in);
       HashMap obj=new HashMap();
        System.out.println("Enter the number of country and capital you want to add in map interface");
        int n= readme.nextInt();
        for (int i = 0; i <n; i++) {
            obj.saveCountryCapital(readme.next(), readme.next());
        }
        Set<String>key=obj.M1.keySet();// keySet method is instance method that return the set of the key
        // now
        for(String CountryName:key)
        {
           String Country=obj.getCapital(CountryName);
           String CapitalName=obj.getCapital(Country);

        }
        // now using the Iterator
        Iterator<String>itr=key.iterator();
        while(itr.hasNext())
        {
            String set=itr.next();
            obj.traversingMap(obj.M1.get(set),set);
            obj.CountryArrayList(set);// calling the countryArrayList
        }

        System.out.println(obj.print());// it will print the first map
        System.out.println(obj.secondMap());// it wull print the second map
        System.out.println(obj.al());// it will print the all the Country in ArrayList


    }
}

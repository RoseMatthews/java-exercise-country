public class CountryBO {

  public CountryBO() {
  }

  /**
   * Parses the string data using split method defined in the String class
   * and constructs a country object.
   */
  Country createCountry(String data) {
    String[] countryInfoItems = data.split(",");
    Country country = new Country(
        countryInfoItems[0],
        countryInfoItems[1],
        countryInfoItems[2]);
    return country;
  }
  /**
   * Displays all the details of a specific country (countryName). If the
   * country being searched is not found in the list, displays the message
   * “Country by name cname not found”. Here, cname refers to the country
   * name.
   */
  void displaySpecificCountryDetails(
      Country[] countryList, String countryName, int countryCount) { 
    /* ROSIE : is countryCount just the to allow for the if statements ?? 
     * ROSIE : countryList is an array based on the Country constructed in the Country class ?? */
    for (int i = 0; i < countryCount; i++) {
      if (countryList[i].getName().equals(countryName)) {
        System.out.println(countryList[i].toString());
   
   /* ROSIE : This is saying: if the entry in countryList (the getName part) is equal to the countryName then print the 
   * entry from the countryList array ?? */
        
        // Return early so we don't keep looping since we've found our match.
        // If we did, we'd end up also printing the "not found" message at
        // the end of the function.
        return;
      }
    }
    String notFound = String.format(
        "Country by name %s not found.", countryName);
    System.out.println(notFound);
  }

  /**
   * Displays the details of all countries.
   */
  void displayAllCountryDetails(Country[] countryList, int countryCount) { 
    for (int i = 0; i < countryCount; i++) {
      System.out.println(countryList[i].toString()); 
  /* ROSIE : Just saying to go through the array and display all the country details contained in countryList 
   * namely : getName, getcountryCode and getIsdCode 
   */
    }
  }

  /**
   * Displays the name and Isdcode of all countries.
   */
  void displayAllCountryNameAndIsdCode(
      Country[] countryList, int countryCount) {
    for (int i = 0; i < countryCount; i++) {
      Country country = countryList[i];
      String isdDisplay = String.format(
          "{name=%s, isdCode=%s", country.getName(), country.getIsdCode()); 
            System.out.println(isdDisplay);
    }
  }

  /**
   * Updates the isdCode of a specific country (countryName).
   */
  void updateIsdCodeOfSpecificCountry(
      Country[] countryList, String countryName, String isdCode,
      int countryCount) {
    for (int i = 0; i < countryCount; i++) {
      Country country = countryList[i];
      if (country.getName().equals(countryName)) {
        country.setIsdCode(isdCode); 
 /* ROSIE : if getName = countryName then set a new isdCode - does the equals just make sure that that you are only updating 
  * the IsdCode for that specific country and not for all ?? 
  */
      }
    }
  }
}

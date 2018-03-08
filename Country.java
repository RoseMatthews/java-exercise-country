public class Country {
  /**
   * The name of the country.
   */
  private String name;

  /**
   * The country code.
   */
  private String countryCode;

  /**
   * The international subscriber dialing (ISD) code of the country.
   */
  private String isdCode;

  /* ROSIE : use this. so that we can use the private class variables in the method ?? */ 
  public Country(String name, String countryCode, String isdCode) { 
    this.name = name;
    this.countryCode = countryCode;
    this.isdCode = isdCode;
  }

  /**
   * The display value of the country.
   */
  
  /* ROSIE : this is just so that it can be formatted in the way we want, and is saying that 
   * displayValue should use paramaters this.name, this.countryCode and this.isdCode
   */ 
  @Override
  public String toString() {
    String displayValue = String.format(
                "Country{name=%s, countryCode=%s, isdCode=%s}",
                this.name, this.countryCode, this.isdCode);
    return displayValue;
  }

  
  /* ROSIE : Not entirely sure why we use set/get - how do you know when to use it ?? */
  
    public void setName(String name) {
    this.name = name;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public void setIsdCode(String isdCode) {
    this.isdCode = isdCode;
  }

  public String getName() {
    return this.name;
  }

  public String getCountryCode() {
    return this.countryCode;
  }

  public String getIsdCode() {
    return this.isdCode;
  }
}

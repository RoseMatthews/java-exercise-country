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

  public Country(String name, String countryCode, String isdCode) {
    this.name = name;
    this.countryCode = countryCode;
    this.isdCode = isdCode;
  }

  /**
   * The display value of the country.
   */
  @Override
  public String toString() {
    String displayValue = String.format(
                "Country{name=%s, countryCode=%s, isdCode=%s}",
                this.name, this.countryCode, this.isdCode);
    return displayValue;
  }

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

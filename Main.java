import java.util.*;

public class Main {

  public Main() {}

  public static void main(String[] args) {
    System.out.println("Menu:");
    System.out.println("Type any number between 1 and 6");
    System.out.println("1)Create a new country");
    System.out.println("2)Display details of a specific country");
    System.out.println("3)Display the details of all countries");
    System.out.println("4)Display the ISD codes of all countries");
    System.out.println("5)Update ISD code of a specific country");
    System.out.println("6)Exit");

    Scanner scanner = new Scanner(System.in);
    CountryBO countryBo = new CountryBO();
    ArrayList<Country> countryList = new ArrayList<Country>();

    while (true) {
      System.out.println("Enter your choice");
      int option = scanner.nextInt();
      switch (option) {
        case 1:
          System.out.println("Enter country details");
          Country newCountry = countryBo.createCountry(scanner.next());
          countryList.add(newCountry);
          break;

        case 2:
          System.out.println("Enter the name of the country to be searched");
          String countryToSearch = scanner.next();
          countryBo.displaySpecificCountryDetails(
              countryList.toArray(new Country[countryList.size()]),
              countryToSearch,
              countryList.size());
          break;

        case 3:
          System.out.println("Details of all countries");
          countryBo.displayAllCountryDetails(
            countryList.toArray(new Country[countryList.size()]),
            countryList.size());
          break;

        case 4:
          System.out.println("ISD codes of all countries");
          countryBo.displayAllCountryNameAndIsdCode(
              countryList.toArray(new Country[countryList.size()]),
              countryList.size());
          break;

        case 5:
          System.out.println(
              "Enter the name of the country for which the isd code " +
              "needs to be updated");
          String countryToUpdate = scanner.next();
          System.out.println("Enter the new ISD code");
          String newIsdCode = scanner.next();
          countryBo.updateIsdCodeOfSpecificCountry(
              countryList.toArray(new Country[countryList.size()]),
              countryToUpdate,
              newIsdCode,
              countryList.size());
          break;

        case 6:
        default:
          return;
      }

      System.out.println("Do you want to continue? Type Yes / No");
      String continueValue = scanner.next().toLowerCase();
      if (continueValue.equals("no")) {
        return;
      } else if (!continueValue.equals("yes")) {
        System.out.println("HELP! I don't know what you want to do!");
        System.out.println("I will just give up and go home.");
        System.out.println("Good day to you, sir!");
        return;
      }
    }
  }
}

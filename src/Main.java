
/*
Hardware store
In this project, we have a hardware store that sells different products.
We represent this product using classes.
Now we can se the classes and some examples of the kind of product that they are going to content:
1-products.ConstructionProduct: nails, screws, cement, sand etc. we sell it by it units, for ex.
10 kg of sand
2-products.ElectricProduct: cables, electric tape, socket outlet,power drills, hole puncher, etc.
3-products.HandTool: hammer, hand saw
4-products.GardenProduct:shovel, plant pot
5-products.HouseholdItem: kettle, broom, brush
6-products.WaterProduct:water filter, water pump
7-products.GasProduct: gas valve,etc

Also, we have:
person.Employee: the employee of the store.
person.Supplier: the one that sells the product.
Client: the one that buys the product.
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import person.BigClient;
import person.Employee;
import person.Supplier;
import products.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class Main {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }
    private static final Logger LOGGER= LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        //Instantiations of the different implemented classes after the implementation of abstract

        LOGGER.info("Hello and welcome to hardware store!! \n");
        //classes
        //humans or companies
        BigClient bigClient=new BigClient("Edward Cullen","Edward@gmail.com","+224586634");
        Supplier rinoMax= new Supplier("Jason Krueger","jason@gmail.com","+12812516","sand");
        Employee carlosRusso = new Employee("carlos Russo", "123@gmail.com", "12345678", "Deposit");
        Employee joseAntonio = new Employee("Jose Antonio", "123@gmail.com", "12345678", "seller");

        //Products
        ConstructionProduct sand = new ConstructionProduct("Sand", "White sand", "Tn");
        //Creating ElectricProducts Objects
        ElectricProduct lightBulb = new ElectricProduct("Light bulb 2", "led light bulb");
        lightBulb.setPower(10);
        ElectricProduct lightBulb2 = new ElectricProduct("Light bulb 1", "led light bulb");
        //Creating products.GardenProduct Objects
        GardenProduct gardenScissors = new GardenProduct("Big scissors", "Big size scissors to cut grass", false);
        GardenProduct gardenScissors1 = new GardenProduct("Medium scissors", "Medium size scissors to cut grass", false);
        GardenProduct gardenScissors2 = new GardenProduct("Small scissors", "Small size scissors to cut grass", false);
        //Creating products.GasProduct Objects
        GasProduct gasBurner = new GasProduct("Gas Burner", "Gas kitchen burner");
        GasProduct gasBurner2 = new GasProduct("Gas Burner", "Gas kitchen burner");
        gasBurner2.setStock(8);
        //Creating a products.HandTool Objects
        HandTool handSaw=new HandTool("Hand saw","Small hand saw");
        //Creating products.HouseholdItem Objects
        HouseholdItem broom =new HouseholdItem("Big broom","Industrial boom");
        HouseholdItem broom1 =new HouseholdItem("Small broom","House boom");
        //Creating a products.WaterProduct Object
        WaterProduct pump1=new WaterProduct("Excelsior pump","20 hp power pump");

        //Collection examples
        //ArrayList<Employees>
        Employee.addEmployeeToArrayList(carlosRusso);
        Employee.addEmployeeToArrayList(joseAntonio);
        ArrayList<Employee> employeeList= Employee.getCopyOfEmployeeArrayList();
        LOGGER.info(employeeList.get(1).toString());
        LOGGER.info("Iterate the ArrayList using enhanced for loop");
        for (Employee employee:employeeList) {
           LOGGER.info(employee.getSpeciality());
            System.out.println();
        }
        //HashSet<GardenProducts>
        GardenProduct.addGardenProductToHashSetList(gardenScissors);
        GardenProduct.addGardenProductToHashSetList(gardenScissors1);
        HashSet<GardenProduct> gardenProductsListCopy=GardenProduct.getCopyOfGardenProductHashSetList();
        LOGGER.info("The product: "+gardenScissors+" exist in the list (true =yes, no=false): "
                +gardenProductsListCopy.contains(gardenScissors));
        //ArrayList<ElectricProducts>
        ElectricProduct.addElectricProductToArrayList(lightBulb);
        ElectricProduct.addElectricProductToArrayList(lightBulb2);
        ArrayList<ElectricProduct>electricProductArrayList=ElectricProduct
                .getCopyOfElectricProductArrayList();
        LOGGER.info("Iterate the ArrayList using for loop");
        for (int i = 0; i < 2; i++) {
            LOGGER.info(electricProductArrayList.get(i).getProductName());
            System.out.println();
        }
        //ArrayList<products.HouseholdItem>
        HouseholdItem.addHouseholdItemToArrayList(broom);
        HouseholdItem.addHouseholdItemToArrayList(broom1);
        ArrayList<HouseholdItem>householdItemsList= HouseholdItem.getCopyOfHouseholdItemArrayList();
        //ArrayList<String> in person.Employee class
        HashSet<String> employeesResumeInformation=Employee.getEmployeeResumeList();
        Iterator<String> iterator=employeesResumeInformation.iterator();
        LOGGER.info("Iterate the HashSet using iterator");
       while (iterator.hasNext()){
           LOGGER.info(iterator.next()+"\n");
           System.out.println();
       }


    }
}

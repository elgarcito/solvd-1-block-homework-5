# hardware store
Progressive exercises of QA automation training, using maven and git.

## Project description:
In this project, we have a hardware store that sells different products.

<p align="center">
<img src="https://t4.ftcdn.net/jpg/03/39/67/57/360_F_339675724_zKIsiEcSss6x2KOXUfHMfBrK9b0qbYCQ.jpg" alt="Image of a hardware store" width="300" height="200">
</p>

We represent this product using classes.
We can see the classes and some examples of products that they are going to content:
1. ConstructionProduct: nails, screws, cement, sand etc. we sell it by it units, for ex.
   10 kg of sand.
2. ElectricProduct: cables, electric tape, socket outlet,power drills, hole puncher, etc.
3. HandTool: hammer, hand saw, etc.
4. GardenProduct:shovel, plant pot, etc.
5. HouseholdItem: kettle, broom, brush, etc.
6. WaterProduct:water filter, water pump, etc.
7. GasProduct: gas valve, etc.

Besides that, we have the persons that interact with the store these are:
1. Employee: these are the employees of the store and could be: seller, deposit or owner
2. Supplier: the one that sells us the products
3. BigClient: at the moment, the store only works with big clients that are an small amount and are registered.

## Exercises and references:

### 09/11/2023

Extend your previous homework with next features:
* Add 5 collections to the hierarchy.
* Create custom LinkedList with generic.

### Solution
* The five collections are:
1. electricProductArrayList in ElectricProduct class.
2. employeeList in Employee class.
3. gardenProductHashSetList in GardenProduct.
4. householdItemArrayList in HouseHoldItem class.
5. resumedEmployeeInformationList in Employee class.

All of these Lists only accept add a product operation.
If you need access to the list, using the static method getCopy... 
in each Class mentioned (Employee, HouseHoldItem, GardenProduct and ElectricProduct) 
you get a copy of this list.
This protects the modification of the original list. 

The console messages from previous exercises were deleted to see
the console message for this exercise only.
The objects created were kept to be used in this exercise.

The linked list activity is going to be in the repository:
 * solvd-1-block-homework-5-part-2

I order to be more clear in the activities response
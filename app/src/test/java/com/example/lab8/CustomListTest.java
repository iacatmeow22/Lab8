package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList() {
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus one
     */
    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * increase the list by adding a new city
     * check if city is in list
     * check if a city not in the list is in the list
     */
    @Test
    void testHasCity() {
        list = MockCityList();
        City city = new City("Charlottetown", "Prince Edward Island");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        City city2 = new City("High River", "Alberta");
        assertFalse(list.hasCity(city2));
    }

    /**
     * increase the list by adding a new city
     * add another city
     * remove the first city
     * check if our current size matches the initial size plus one
     * check if list contains city
     */
    @Test
    void testDelete() {
        list = MockCityList();
        int listSize = list.getCount();
        City city = new City("Cornwall", "Ontario");
        list.addCity(city);
        City city2 = new City("Aldergrove", "British Columbia");
        list.addCity(city2);
        list.delete(city);
        assertEquals(listSize + 1, list.getCount());
        assertFalse(list.hasCity(city));
    }

    /**
     * increase the list by adding a new city
     * add another city
     * check if our current size matches the initial size plus two
     */
    @Test
    void testCountCities() {
        list = MockCityList();
        int listSize = list.getCount();
        City city = new City("Regina", "Saskatchewan");
        list.addCity(city);
        City city2 = new City("Bolbeau", "Quebec");
        list.addCity(city2);
        assertEquals(listSize + 2, list.countCities());
    }
}

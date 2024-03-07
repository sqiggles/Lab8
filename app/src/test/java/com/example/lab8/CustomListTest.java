package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList mockCustomList() {
        CustomList CustomList = new CustomList(null , new ArrayList<City>());
        CustomList.add(mockCity());
        return CustomList;
    }
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }
    @Test
    void testAdd() {
        CustomList CustomList = mockCustomList();
        assertEquals(1, CustomList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        CustomList.add(city);
        assertEquals(2, CustomList.getCities().size());
        assertTrue(CustomList.getCities().contains(city));
    }

    @Test
    void testGetCities() {
        CustomList CustomList = mockCustomList();
        assertEquals(0, mockCity().compareTo(CustomList.getCities().get(0)));
        City city = new City("Charlottetown", "Prince Edward Island");
        CustomList.add(city);
        assertEquals(0, city.compareTo(CustomList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(CustomList.getCities().get(1)));
    }
}

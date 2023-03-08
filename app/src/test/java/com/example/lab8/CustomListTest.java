package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    City city;
    CustomList cityList;

    public CustomListTest(){
        city = new City("Halifax", "NS");
        cityList = new CustomList(null, new ArrayList<>());
    }

    public CustomList mockCityList(){
        CustomList list = new CustomList(null, new ArrayList<>());
        return list;
    }
    @Test
    public void testAddCity(){
        CustomList list = mockCityList();
        list.addCity(this.city);
        assertEquals(list.getCount(), 1);
    }

    @Test
    public void testHasCity(){
        CustomList list = mockCityList();
        assertFalse(list.hasCity(this.city));
        list.addCity(this.city);
        assertTrue(list.hasCity(this.city));
    }

}

package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckConsonantsOrVowelTest {
    CheckConsonantsOrVowel checkconsonantsorvowel;
    @Before
    public void setUp(){
        System.out.println("Before");
        checkconsonantsorvowel=new CheckConsonantsOrVowel();
    }
    @After
    public void tearDown(){

        checkconsonantsorvowel=null;
    }
    @Test
    public void givenStringContainOneCharShouldReturnVowelMessage(){
        //Arrange
        //Act
        String result=checkconsonantsorvowel.isVowel("a");
        //Assert
        assertEquals("Vowel",result);
    }
    @Test
    public void givenStringContainOneCharShouldReturnConsonantMessage(){
        //Arrange
        //Act
        String result=checkconsonantsorvowel.isVowel("p");
        //Assert
        assertEquals("Consonant",result);
    }
    @Test
    public void givenStringContainMoreCharShouldReturnVowelsConsnantsMessage(){
        //Arrange
        //Act
        String result=checkconsonantsorvowel.isVowel("abc");
        //Assert
        assertEquals("Vowel Consonant Consonant",result);
    }
    @Test
    public void givenStringContainMoreCharAndSymbolShouldReturnVowelsConsnantsMessage(){
        //Arrange
        //Act
        String result=checkconsonantsorvowel.isVowel("ab&");
        //Assert
        assertEquals("Vowel Consonant",result);
    }
    @Test
    public void givenStringContainMoreCharAndNumberShouldReturnVowelsConsnantsMessage(){
        //Arrange
        //Act
        String result=checkconsonantsorvowel.isVowel("a23c");
        //Assert
        assertEquals("Vowel Consonant",result);
    }
    @Test
    public void givenNumericStringShouldReturnVowelsConsnantsMessage(){
        //Arrange
        //Act
        String result=checkconsonantsorvowel.isVowel("23");
        //Assert
        assertNotEquals("Vowel Consonant",result);
    }
    @Test
    public void givenNullStringShouldReturnNullMessage(){
        //Arrange
        //Act
        String result=checkconsonantsorvowel.isVowel(null);
        //Assert
        assertNull(null,result);
    }


}
package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    public static Member member;
    public static Member.MemberVariable memberVariable;

    @BeforeClass
    public static void setUp(){
        member=new Member();
        memberVariable=member.new MemberVariable();
    }

    @AfterClass
    public static void tearDown(){
        member=null;
        memberVariable=null;
    }

    @Test
    public void givenStringOneIntOneDoubleShouldReturnResultMessage(){

        Member member1=memberVariable.isMember("poornima",21,360000);
        assertEquals(member1.name,"poornima");
        assertEquals(member1.age,21);
        assertEquals(member1.salary,360000,00);
    }
    @Test
    public void givenStringIntOneDoubleShouldReturnResultMessage(){

        Member member1=memberVariable.isMember("mahesh",23,0);
        assertEquals(member1.name,"mahesh");
        assertEquals(member1.age,23);
        assertEquals(member1.salary,0,00);
    }
    @Test
    public void givenEmptyStringIntNegativeDoubleShouldReturnResultMessage(){

        Member member1=memberVariable.isMember(" ",23,1000);
        assertEquals(member1.name," ");
        assertEquals(member1.age,23);
        assertEquals(member1.salary,1000,00);
    }
    @Test
    public void givenStringNegativeIntOneDoubleShouldReturnResultMessage(){

        Member member1=memberVariable.isMember("mahesh",23,-1000);
        assertEquals(member1.name,"mahesh");
        assertEquals(member1.age,23);
        assertEquals(member1.salary,-1000,00);
    }

}
package com.stackroute.pe2;

public class Member  //this member class containes three object
{
    String name;
    int age;
    double salary;

    public class MemberVariable  //taking another class for calling member class
    {
        Member member=new Member();  //creating object to the class

        public Member isMember(String name,int age,double salary) //this method returns the all member class fileds

        {
            member.name=name;
            member.age=age;
            member.salary=salary;

            return member;
        }
    }
}

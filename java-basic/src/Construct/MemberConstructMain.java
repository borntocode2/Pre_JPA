package Construct;

import java.lang.reflect.Member;

public class MemberConstructMain {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("morty", 27, 90);
        MemberConstruct member2 = new MemberConstruct("jerry", 27, 80);

        MemberConstruct[] members = {member1, member2};

        for(int i =0; i < members.length; i++){
            System.out.println("name: "+ members[i].name +",age: "+ members[i].age+", grade: "+members[i].grade);

        }



    }
}

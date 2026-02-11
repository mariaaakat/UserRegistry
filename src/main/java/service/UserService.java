package service;

import dto.User;

import java.util.ArrayList;
import dto.UserGuest;

public class UserService {
   private ArrayList<User> listUser = new ArrayList<>();
   public User addUser(String name, Integer age, String lastName) {
       User user = new User(name, age, lastName);
       listUser.add(user);
       return user;
   }
   public void test1() {
//     UserGuest u1 = new UserGuest();
//       u1.getName();
//       int [] t1 = {1,2,3};
//       int[] t2 = {};
//       int[] t3 = new int[3];
//       int i1 = t3[2];
//       t2[2] = 3;
//       t3.length;
//       if(t1.length < t2.length){
//           System.out.println("");
//       }
//       for(int i = 0; i < 6; i++){
//
//       }
//       for(int i = 0; i < t1.length; i++){
//
//       }
//       ArrayList<Integer> test = new ArrayList<>(0);
//       test.addFirst(1);
//       test.clear();
//       test.remove(1);
//       test.get(1);
//       test.size();
//       test.contains(2);

   }
   public ArrayList<User> viewUser(){
       return new ArrayList<>(listUser);
    }

    public class testClass {
       public void testMetod(){

       }
       public void testString(String name){

       }
       public int testInt(){
           int i = 1;
           return i;
       }
       public int test2Int(int i){
           return i++;
       }

    }
}


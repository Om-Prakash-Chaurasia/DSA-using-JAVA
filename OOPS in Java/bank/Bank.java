// package bank;

// class Account {
// public String name;
// protected String email;
// private String password;
// }

// public class Bank {
// public static void main(String args[]) {
// Account account1 = new Account();
// account1.name = "KGiSL";
// account1.email = "omchaurasia@gmail.com";
// account1.password = "abcd";
// }
// }
/*---------------------------------------------------------------- */

// To access the private variable we use getter and setter methods.
// package bank;

// class Account {
// public String name;
// protected String email;
// private String password;

// // getters and setters

// // getter
// public String getPassword() {
// return this.password;
// }

// // setter
// public void setPassword(String password) {
// this.password = password;
// }
// }

// public class Bank {
// public static void main(String args[]) {
// Account account1 = new Account();
// account1.name = "KGiSL";
// account1.email = "omchaurasia@gmail.com";
// account1.setPassword("abcd");
// System.out.println(account1.getPassword());
// }
// }
/*---------------------------------------------------------------- */

/*
 * If we don't want to give options to the user to set password and the default
 * password will be set then we can make the setter() method as private or we
 * can remove it. Lets see how to do this.
 */

// package bank;

// class Account {
// public String name;
// protected String email;
// private String password;

// // getters and setters

// // getter
// public String getPassword() {
// // setPassword(randomPassword);
// return this.password;
// }

// // setter
// // private void setPassword(String password) {
// // this.password = password;
// // }
// }

// public class Bank {
// public static void main(String args[]) {
// Account account1 = new Account();
// account1.name = "KGiSL";
// account1.email = "omchaurasia@gmail.com";
// // account1.setPassword("abcd");
// System.out.println(account1.getPassword());
// }
// }

// Now, why to make this setter as private? Because we don't want other classes
// to access this password options outside the Account's class.
/*---------------------------------------------------------------- */
/**
 * Created by shrikant on 8/6/16.
 */
class Det{

    String firstname
    String lastname
    String email
    int age
};
Map m1 = [firstname: "Shrikant",lastname: "Gupta",email: "gupta.shri16@gmail.com",age:19]
Map m2 = [firstname: "Shrikant",lastname: "Gupta",email: "gupta.shri16@gmail.com",age:19]
Map m3 = [firstname: "Shrikant",lastname: "Gupta",email: "gupta.shri16@gmail.com",age:19]
Map m4 = [firstname: "Shrikant",lastname: "Gupta",email: "gupta.shri16@gmail.com",age:19]
Map m5 = [firstname: "Shrikant",lastname: "Gupta",email: "gupta.shri16@gmail.com",age:19]

Det u1 = new Det(m1)
Det u2 = new Det(m2)
Det u3 = new Det(m3)
Det u4 = new Det(m4)
Det u5 = new Det(m5)

List l1=[u1,u2,u3,u4,u5];

l1.each {
    println "${it.firstname} ${it.lastname} ${it.age} ${it.email}"
}
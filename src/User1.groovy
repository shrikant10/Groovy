/**
 * Created by shrikant on 8/6/16.
 */
class Det{

    String firstname
    String lastname
    String email
    int age
};
Map m1 = [firstname: "Shrikant",lastname: "Gupta",email: "gupta.shri16@gmail.com",age:80]
Map m2 = [firstname: "Sidhart",lastname: "Tiu",email: "abc@gmail.com",age:20]
Map m3 = [firstname: "Naman",lastname: "Jain",email: "xyz@gmail.com",age:30]
Map m4 = [firstname: "Shishir",lastname: "Sahu",email: "pqr@gmail.com",age:40]
Map m5 = [firstname: "Akhil",lastname: "Taneja",email: "efg@gmail.com",age:50]
Map m6 = [firstname: "Rahul",lastname: "Singh",email: "mno@gmail.com",age:60]
Map m7 = [firstname: "Alex",lastname: "Ekka",email: "str@gmail.com",age:70]

Det u1 = new Det(m1)
Det u2 = new Det(m2)
Det u3 = new Det(m3)
Det u4 = new Det(m4)
Det u5 = new Det(m5)
Det u6 = new Det(m6)
Det u7 = new Det(m7)

List l1=[u1,u2,u3,u4,u5,u6,u7];
/*l1.each {
    println "${it.firstname} ${it.lastname} ${it.age} ${it.email}"
}*/

List a1=[]
List a2=[]

a1=l1.findAll {
    it.age>50
}

a2=l1.findAll {
    it.age<=50
}

a1.each {
    println "${it.firstname} ${it.lastname} ${it.age} ${it.email}"
}

a2.each {
    println "${it.firstname} ${it.lastname} ${it.age} ${it.email}"
}
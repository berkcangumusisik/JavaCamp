//CLASSLAR
//değerleri atamak için prototip kullanılır ve buna constructor adını veriyoruz.
class Customer{
    constructor(id,customerNumber){
        this.id = id
        this.customerNumber = customerNumber
    }
}
let customer = new Customer(1,"12345")
//prototipyping bir nesneye bambaşka bir özellik kazandırmayı sağlar.
customer.name= "Berkcan Gümüşışık"
console.log(customer.name)
console.log(customer.id) //thisler olmazsa undefined değer döndürür.

Customer.bisey = "Bişey"
console.log(Customer.bisey)


class IndividualCustomer extends Customer{
    constructor(firstName,id,customerNumber){
        super(id,customerNumber)
        this.firstName = firstName
    }
}

//classlar extends edilebilir.Yani classları inherit edebiliriz.
//super extends edilen sınıftan bilgilerin alındığını ifade eder.
class CorporateCustomer extends Customer{
    constructor(companyName,id,customerNumber){
        super(id,customerNumber)
        this.companyName = companyName
    }
}
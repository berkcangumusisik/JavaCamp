//***REST -GERİYE KALANLAR */

//Bir değişkene parametre gönderimi yapılabilir
//typeof tip vermeyi sağlar.
let showProducts = function name(id,...products) {
    console.log(id)
    console.log(products)
    console.log(products[0])//belli bir elemana ulaşmayı sağlar

}
//Ctrl+K+C yorum satırına almayı sağlar.
console.log(typeof showProducts)
showProducts(10,"Elma","Armut","Karpuz")
console.log(Math.max(1,2,3,4,50,4,60,14)) //Math.max en büyük sayıyı bulmayı sağlar

//Restte arrayi virgüllerle gönder.
//rest operasyonunu array olarak göndermemeye çalış çünkü tek bir elemanmış gibi görür.Aslında dizi içinde dizi olarak görür
//spread(Ayrıştırmaktır.) Bir arrayi ayrıştırarak parametreye çevirir.
let points = [1,2,3,4,50,4,60,14]
console.log(...points) 
console.log(Math.max(...points))

console.log(..."ABC","D",..."EFG","H") //üç nokta arrayi ayrıştırmayı sağlıyor diyebiliriz.

//**********************DESTRUCTRING-PARÇALAMAK***********
//React tarafında çok kullanılır. Arrayin elemanlarını değişkenlere atamayı sağlar.
let populations = [10000,20000,30000,[40000,100000]]
let[small,medium,high,[veryHigh,maximum]] = populations
console.log(small)
console.log(medium)
console.log(high)
console.log(veryHigh)
console.log(maximum)

//iç içe array olması parçalamaya kesinlikle engel olmaz. Ama atarkende içindeki diziye ata yoksa undefined döndürür

function someFunction([small1],number){
    console.log(small1)

}
someFunction(populations)
//bu fonksiyonla sadece small değerini okuruz.


let category = {id:1,name:"İçecek"}
console.log(category.id)
console.log(category.name)
console.log(category["name"])

let{id,name} = category
console.log(id)
console.log(name)
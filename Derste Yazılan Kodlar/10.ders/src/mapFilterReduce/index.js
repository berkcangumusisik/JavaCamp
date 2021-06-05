let products = [
    {id:1, name : "Acer Laptop", unitPrice:15000},
    {id:2, name : "Asus Laptop", unitPrice:16000},
    {id:3, name : "Hp Laptop", unitPrice:13000},
    {id:4, name : "Dell Laptop", unitPrice:12000},
    {id:5, name : "Casper Laptop", unitPrice:17000},
]

//Aşağıda <ul> etiketi HTML etiketidir.
//map sayesinde bunu <li> elemanı içine atarız.
//MAP Dizinin her bir elemanı için; parametre olarak verilen (callback) fonksiyonu çağırır ve fonksiyonda belirtilen işlemlere göre yeni bir dizi(array) oluşturur.
console.log("<ul>")
products.map(product=>console.log(product.name))
console.log("<ul>")

products.map(product=>{
    console.log(product)
    console.log(`<li>${product.name}</li>`)
})
//FİLTER yeni bir array oluşturur ve dizideki elemanları parçalamayı sağlar.
let filteredProducts = products.filter(product=>product.unitPrice>12000)
console.log(filteredProducts)


//REDUCE  vaScript Methodu Tek bir değer dizisine azaltmak için kullanılabilir ve (sol-sağ taraftan) dizisinin her bir değeri için sağlanan bir fonksiyonu yerine getirir ve fonksiyonun dönüş değeri bir akümülatör içinde depolanır.
let cartTotal = products.reduce((acc, product)=>acc+ product.unitPrice, 0)

console.log(cartTotal) 


let cartTotal2 = products.filter(p=>p.unitPrice>13000).map(p=>{
                    p.unitPrice *= 1.18
                    return p
                })
                .reduce((acc,p)=>acc+p.unitPrice,0)

console.log(cartTotal2)
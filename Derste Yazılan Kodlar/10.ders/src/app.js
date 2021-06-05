/*
*typescript üst seviye bir dildir.
* Saf javascriptte nesne yönelimli programlama zorlar.
* npm install dosya yüklemek için kullanılır.
* npm run dev projeyi canlıya taşır
* State managment - durum yönetimi
 */

/**** DEĞİŞKEN TANIMLAMA ********/
/*
*let kullan.
*Dosya yukarıdan aşağı doğru okur.
*saf JS'te var kullanılır.
*console.log() ekrana yazdırır
*Satır sonunda noktalı virgül önemli değil
*Javascript tip güvenli değildir.
 */

var sayi1 = 10
var sayi1 = "Berkcan Gümüşışık"
console.log(sayi1)

let sayi2 =10
sayi2 = "Berkcan";
let student = {id:1,name:"Berkcan"}//Obje tanımı 
console.log(student);

//undefined: böyle bir şey yok ben aslında yokum diyor :)
//null: değer var ama referans yok 

/*FONKSİYONLAR */
/*function method(parametre){

} şeklinde gönderilir her zaman paramaetreli olması gerekmez. */
function save(puan = 10,ogrenci) {
    console.log(ogrenci.name +": " + puan)
}
save(undefined,student)

/*DİZİLER
*Dizilerde her türlü veri gönderimi yapılabilir.
*/
let students = ["Engin Demiroğ","Berkcan Gümüşışık","Halit Kalaycı","Büşra"] //dizi oluşturma
console.log(students)
let students2 = [student, {id:2,name:"Halit"},"Ankara",{city:"İstanbul"}]
console.log(students2)


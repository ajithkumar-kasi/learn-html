var array=[1,2,3,4,5,6];
array=[];
console.log(array);
//method 2
var array=[1,2,3,4,5,6];
array.length=0;
console.log(array);

//method 3
var array=[1,2,3,4,5,6];
while(array.length){
array.pop();
}
console.log(array);

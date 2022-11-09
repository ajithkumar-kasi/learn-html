const items=[1,20,30,27,3,5,8];

let evennumbers=items.filter(function(value){
    return value%2==0;
});
let oddnumbers=items.filter(function(value){
    return value%2==1;
});

console.log(evennumbers);
console.log(oddnumbers);
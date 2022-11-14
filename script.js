var array=[1,2,34,5,6];
let obj={id:2};
let other=undefined;
let string="Anbu";
// method 1
//let result=Array.isArray(obj);
// console.log(result);

//method 2
function check(val){
    if (typeof val =="string"){
        console.log("It is an string");
    }
    else if (typeof val == "obj"){
        console.log("It is an object");
    }
    else if (typeof val == "other"){
        console.log("It is an undefined");
    }
    else if (typeof val == "number"){
        console.log("It is an number");
    }
    else {
        console.log("It is an array");
    }
}
check(string);



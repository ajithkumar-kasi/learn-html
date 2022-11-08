const  readprmission=4;
const  writeprmission=5;
const executepermission=3;

mypermission=1;

mypermission=mypermission | executepermission

let message=(mypermission & writeprmission)?'yes' : "no";

console.log(message);


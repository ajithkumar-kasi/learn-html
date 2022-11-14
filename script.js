var items=["milk","bread","sugar"];

function check(){
    if(items.indexOf("milk")==-1){
        console.log("Item doesn't exist");
    }else{
        console.log("item exist");
    }
}
check("milk");

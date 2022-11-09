const persons=[
    {id:1,first_name:"ajith",last_name:"kumar"},
    {id:2,first_name:"gopi",last_name:"nath"},
    {id:3,first_name:"dhila",last_name:"haris"},
];
let final=persons.map(function(value){
    return [value.first_name, value.last_name] .join(" ");
}
   
);

console.log(final);

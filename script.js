const students = [
    {id:5,name:"Ajith"},   
    {id:4,name:"Durai"},
    {id:8,name:"Chella"},
    {id:1,name:"Selvi"}
];

students.sort((a,b)=>{
    if (a.id<b.id) return -1;

    if (a.id>b.id) return 1;

    return 0;
});

console.log(students);
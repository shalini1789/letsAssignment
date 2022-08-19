import { useState } from "react";




function Printdatatabular(){

    let[userdetails,setData]=useState([
        {
        name:"Ravi",
        age:32,
        },
        {
            name:"Rakesh",
            age:32,
        },
        {
            name:"Santosh",
            age:22,
        },
        {
            name:"Reshma",
            age:22,
        },
        {
            name:"Shalini",
            age:25,
        }

])

return(
<div>
<h1>User Details</h1>
<table className="tb2">
<tr>
<th>name</th>
<th>age</th>
</tr>
</table>
{
userdetails.map(function(data){
return(
<div>
<table className="tb">
<tr>
<td>{data.name}</td>
<td>{data.age}</td>
</tr>

</table>


</div>
)

})

}
</div>
    )
        }

export default Printdatatabular;
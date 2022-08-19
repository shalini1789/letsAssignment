import logo from './logo.svg';
import './App.css';
import Banner from './Banner';
import {useState} from 'react';
import Products from './products';
import Assign1 from './Assign1'
//useState are used to create state variables 
//jsx---javascript xml---> the way of writing look like html in xml based js
//babel library takes care of this  converting js to html 
//passing data from parent to child component 
//like in this example --> app component to banner component \\\
function App() {//this function is component
 
 let firstname="shalini";

 //state
 let[data,setData]=useState("Thor");
 
 function changeName(){
 setData("Ironman");
 }

  function dosomething(){

    console.log("i am function");
  }
  return (
    <div className="App">
     {/* { <h1>Welcome to java</h1>
     <button onClick={changeName}>click</button>
     <h1>{data}</h1>
     <Banner firstname="Saurabh" age="32"/>
     <Banner/>  */}
<Assign1/>
     
    </div>
  );
}

export default App;

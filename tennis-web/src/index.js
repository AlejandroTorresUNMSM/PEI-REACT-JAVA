import React from "react"; 
//cuando se importa sin llaves se trae el default , pero tambien puede traer el componente de clase
import  ReactDOM from "react-dom"; //export 
import MyApp from "./components/App";
import About from "./components/About/About";
import './assets/css/app.css';

import 'bootstrap/dist/css/bootstrap.min.css';


//COMPONENTE FUNCIONAL
/*
const myApp = () =>  <p>Componente Funcional </p>

function functionMyApp(){
    return <p>Componente funcional</p>
}
//componente funcional
//ReactDOM.render(myApp(),document.getElementById("app"));

*/

//COMPONENTE CLASE
/*
class App extends React.Component{
    render(){
        return(<p>Componente clase</p>)
    }
}

//componente de clase
ReactDOM.render(<App/>,document.getElementById("app"));

*/

//renderizado de componente 
ReactDOM.render(<MyApp/>,document.getElementById("app"));


//ReactDOM.render(<About/>,document.getElementById("app"));








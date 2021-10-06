import React from "react";
import {Title} from "./style";

const Typography = (props) =>{
    var autor = props.text;
    //return <Title>El autor es {autor}</Title>
    return <Title>{props.children}</Title>
}

export default Typography;
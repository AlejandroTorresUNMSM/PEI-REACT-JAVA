import React from "react";
import Typography from "../../components/Typography/Typography";
const Detalle= (props)=>{
    console.log('props:',props);

    const {
        match: {
            params: {id}
        }
    } = props;


    //const id = props.match.params.id;
    //const {match{params}}  =props;
    const objeto = {valor:2 , id:{valor:2}};
    const {valor} = objeto;

    return(
    <Typography>Jugador: {id}</Typography>
    );

}

export default Detalle;
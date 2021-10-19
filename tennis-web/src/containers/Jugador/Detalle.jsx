import React from "react";
import Typography from "../../components/Typography/Typography";
import Button from 'react-bootstrap/Button';
import Tables from '../../components/Tables/Tables';

const Detalle = (props) => {
  const {match: {params: { id }}} = props;
  const data = props.location.state.data;

  
  const dataForTable = {
    headers:['id', 'Nombre', 'Puntos'],
    body: [{...data}],
  }

  return (
      <>
          <Button onClick={()=> props.history.goBack()} variant="link"> {`<`} Volver</Button>
          <Typography id={"title-id"}>Jugador: {id}</Typography>
          <Tables
              dataForTable={dataForTable}
          />
      </>
  )
}

export default Detalle


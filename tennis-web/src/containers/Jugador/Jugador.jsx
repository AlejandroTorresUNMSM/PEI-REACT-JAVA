import React from 'react';
import Typography from '../../components/Typography/Typography';
import { Button } from 'react-bootstrap';
import { Link } from 'react-router-dom';
const Jugador = () => {
  return (
    <>
      <Typography>Jugador</Typography>
      <Button as={Link} to={'/jugador/detalle/2'} variant={'primary'}>
        Ver detalle
      </Button>
    </>
  );
};

export default Jugador;

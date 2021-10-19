import React, { useEffect, useState } from 'react';
import Typography from '../../components/Typography/Typography';
import Table from 'react-bootstrap/Table';
import Button from 'react-bootstrap/Button';
import httpClient from '../../lib/httpClient';

const JugarPartido = (props) => {
  const [partido, setPartido] = useState(props.location.state.partido);

  useEffect(() => {
    setearPartidoActual();   
    
  },[]);

  const setearPartidoActual = () => {
    let partidoActual = { ...partido };
    partidoActual.puntosGameActualLocal = 0;
    partidoActual.cantidadGamesLocal = 0;
    partidoActual.puntosGameActualVisitante = 0;
    partidoActual.cantidadGamesVisitante = 0;
    setPartido(partidoActual);
    console.log(partido); 
  };

  const sumarPunto = async (idPartido, modoJugador) => {
    try {
      let response = await httpClient.post(`/partidos/${idPartido}/actions/sumar-punto?edad=25`, { params : {modoJugador}});
      //let response = await httpClient.post(`/partidos/${idPartido}/actions/sumar-punto?edad=25`, { params : {modoJugador},data: {nombre: "PEI REACT - JAVA "} });
      
      setPartido(response);
    } catch (error) {
      console.log(error);
    }

  };

  return (
    <>
      <Typography>Jugar Partido</Typography>
      <Table striped bordered hover>
        <thead>
        <tr>
          <th>Jugadores</th>
          <th>Puntos</th>
          <th>Games</th>
          { partido.estado !== 'FINALIZADO' ? <th>Acción</th> : null }
        </tr>
        </thead>
        <tbody>
        <tr>
          <td>{partido.jugadorLocal.nombre}</td>
          <td>{partido.puntosGameActualLocal === null ? 0 : partido.puntosGameActualLocal}</td>
          <td>{partido.cantidadGamesLocal}</td>
          {partido.estado !== 'FINALIZADO' ? 
            <td>
            <Button variant='success' onClick={() => sumarPunto(partido.id, 'LOCAL')}>
              Sumar punto
            </Button>
            </td>: null}
        </tr>
        <tr>
          <td>{partido.jugadorVisitante.nombre}</td>
          <td>{partido.puntosGameActualVisitante === null ? 0 : partido.puntosGameActualVisitante}</td>
          <td>{partido.cantidadGamesVisitante}</td>
          {partido.estado !== 'FINALIZADO' ? 
            <td>
              <Button variant='success' onClick={() => sumarPunto(partido.id, 'VISITANTE')}>
                Sumar punto
              </Button>
            </td> : null}
          
        </tr>
        </tbody>
      </Table>
    </>
  );
};

export default JugarPartido;
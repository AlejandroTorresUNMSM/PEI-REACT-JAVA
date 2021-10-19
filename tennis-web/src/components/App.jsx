import React from "react";
import Wrapper from "./Wrapper/Wrapper";


import Jugador from "../containers/Jugador/Jugador";
import About from "../containers/About/About";
import Home from "../containers/Home/Home";
import Partido from "../containers/Partido/Partido";
import NotFound from "../containers/NotFound/NotFound";
import Detalle from "../containers/Detalle/Detalle";
import JugarPartido from '../containers/JugarPartido/JugarPartido';

import {BrowserRouter,Switch,Route} from "react-router-dom";


export const MyApp = () => {
    return (
      <BrowserRouter>
        <Wrapper>
          <Switch>
            <Route exact path="/" component={Home} />
            <Route exact path="/jugador" component={Jugador} />
            <Route exact path="/jugador/detalle/:id" component={Detalle} />
            <Route exact path="/partido" component={Partido} />
            <Route exact path="/partido/jugar-partido" component={JugarPartido} />
            <Route exact path="/about" component={About} />
            <Route exact path="/nofound" component={NotFound} />
            <Route component={NotFound} />
          </Switch>
        </Wrapper>
      </BrowserRouter>
    );
  };
  
  export default MyApp;
  
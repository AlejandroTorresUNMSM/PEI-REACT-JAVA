import React from "react";
import Typography from "./Typography/Typography";
import Wrapper from "./Wrapper/Wrapper";


import Jugador from "../containers/Jugador/Jugador";
import About from "../containers/About/About";
import Home from "../containers/Home/Home";
import Partido from "../containers/Partido/Partido";
import NotFound from "../containers/NotFound/NotFound";
import Detalle from "../containers/Detalle/Detalle";

import {BrowserRouter,Switch,Route} from "react-router-dom";


export const MyApp = () => {
    return (
      <BrowserRouter>
        <Wrapper>
          <Switch>
            <Route exact path="/" component={Home} />
            <Route exact path="/jugador" component={Jugador} />
            <Route exact path="/partido" component={Partido} />
            <Route exact path="/about" component={About} />
            <Route exact path="/nofound" component={NotFound} />
            <Route exact path="/jugador/detalle/:id" component={Detalle} />
            <Route component={NotFound} />
          </Switch>
        </Wrapper>
      </BrowserRouter>
    );
  };
  
  export default MyApp;
  
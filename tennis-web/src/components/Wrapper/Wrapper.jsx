import React from "react";
import {Col,Container,Row} from 'react-bootstrap';
import Menu from "../Menu/Menu";
const Wrapper = (props)=>{
    return(
    <div>
        <Menu/>
        <Container>
            <Row>
                <Col>{props.children}</Col>
            </Row>
        </Container>
    </div>);
}

export default Wrapper;
import React from 'react';
import { Nav, Navbar, Container, Form, FormControl, Button} from 'react-bootstrap'

function Header() {
    return(
        <Navbar bg="dark" variant="dark">
            <Container>
            <Navbar.Brand href="#home">
                    <img
                      alt=""
                      src="/logo.svg"
                      width="30"
                      height="30"
                      className="d-inline-block align-top"
                    />{' '}
                  Ameritrade
            </Navbar.Brand>
            <Nav className="me-auto">
              <Nav.Link href="#home">Home</Nav.Link>
              <Nav.Link href="#market">Market</Nav.Link>
              <Nav.Link href="#signup">Sign Up</Nav.Link>
            </Nav>
            <Form className="d-flex">
              <FormControl
                      type="search"
                      placeholder="Search"
                      className="me-2"
                      aria-label="Search"
              />
              <Button variant="outline-success">Search</Button>
            </Form>
            </Container>
        </Navbar>
    );
}

export default Header;
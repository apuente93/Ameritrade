import React from 'react';
import './App.css';
import StockComponent from './components/StockComponent';
import Header from './components/Header';

function App() {
  return (
    <div className="App">
        <Header />
        <StockComponent />
    </div>
  );
}

export default App;
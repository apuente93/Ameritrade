import React from 'react';
import StockService from './StockService';

class StockComponent extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            stocks:[]
        }
    }

    componentDidMount(){
        StockService.getStocks().then((response) => {
            this.setState({ stocks: response.data})
        });
    }

    render (){
        return (
            <div>
                <h1 className = "text-center"> Stocks List</h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>

                            <td> Stock Id</td>
                            <td> Stock Name</td>
                            <td> Stock Ticker</td>
                            <td> Stock Description</td>
                        </tr>

                    </thead>
                    <tbody>
                        {
                            this.state.stocks.map(
                                stock => 
                                <tr key = {stock.id}>
                                     <td> {stock.id}</td>   
                                     <td> {stock.name}</td>   
                                     <td> {stock.ticker}</td>   
                                     <td> {stock.description}</td>   
                                </tr>
                            )
                        }

                    </tbody>
                </table>

            </div>

        )
    }
}

export default StockComponent
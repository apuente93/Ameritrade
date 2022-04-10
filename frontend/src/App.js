const React = require('react');
const ReactDOM = require('react-dom'); 
const client = require('./client'); 

class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {stocks: []};
	}

	componentDidMount() { 
		client({method: 'GET', path: '/api/api/v1/stock'}).done(response => {
			this.setState({stocks: response.entity._embedded.stocks});
		});
	}

	render() {
		return (
			<StockList stocks={this.state.stocks}/>
		)
	}
}

class StockList extends React.Component{
	render() {
		const stocks = this.props.stocks.map(stock =>
			<Stock key={stock._links.self.href} stock={stock}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Description</th>
					</tr>
					{stocks}
				</tbody>
			</table>
		)
	}
}

class Stock extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.stock.name}</td>
				<td>{this.props.stock.ticker}</td>
				<td>{this.props.stock.description}</td>
			</tr>
		)
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)
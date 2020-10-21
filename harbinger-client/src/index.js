import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

class Index extends React.Component{

	constructor(props) {
		super(props);
		this.state = {expansions: [],isLoading:true};
	}

	componentDidMount() {
		this.setState({isLoading: true});

		fetch('http://localhost:8080/expansions')
		.then(response => response.json())
		.then(data => this.setState({expansions: data, isLoading: false}));

		console.log(fetch('http://localhost:8080/expansions')
		.then(response => response.json())
		.then(data => this.setState({expansions: data, isLoading: false})));
	}

	render() {
		const {expansions, isLoading} = this.state;

		if (isLoading) {
			return (<p>Loading...</p>);
		}

		return (
			<ExpansionList expansions={expansions}/>
		)
	}
}

class ExpansionList extends React.Component{
	render() {
		const expansions = this.props.expansions.map(expansion =>
			<Expansion key={expansion.id} expansion={expansion}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Flavor</th>
						<th>Mechanics</th>
					</tr>
					{expansions}
				</tbody>
			</table>
		)
	}
}

class Expansion extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.expansion.id}</td>
				<td>{this.props.expansion.name}</td>
				<td>{this.props.expansion.flavor}</td>
				<td>{this.props.expansion.mechanics}</td>
			</tr>
		)
	}
}

// ReactDOM render
ReactDOM.render(
	<Index />,
	document.getElementById('root'));
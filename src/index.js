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

		fetch('http://localhost:8080/sets')
		.then(response => response.json())
		.then(data => this.setState({sets: data, isLoading: false}));

		console.log(fetch('http://localhost:8080/sets')
		.then(response => response.json())
		.then(data => this.setState({sets: data, isLoading: false})));
	}

	render() {
		const {sets, isLoading} = this.state;

		if (isLoading) {
			return (<p>Loading...</p>);
		}

		return (
			<div className="app">
				<header className="titleFont">
					<h1>Harbinger</h1>
				</header>
			<SetList sets={sets}/>
			</div>
		)
	}
}

class SetList extends React.Component{
	render() {
		const sets = this.props.sets.map(set =>
			<Set key={set.id} set={set}/>
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
					{sets}
				</tbody>
			</table>
		)
	}
}

class Set extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.set.id}</td>
				<td>{this.props.set.name}</td>
				<td>{this.props.set.flavor}</td>
				<td>{this.props.set.mechanics}</td>
			</tr>
		)
	}
}

// ReactDOM render
ReactDOM.render(
	<Index />,
	document.getElementById('root'));
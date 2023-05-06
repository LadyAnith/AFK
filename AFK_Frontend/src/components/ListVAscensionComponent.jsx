import React, { Component } from 'react';
import VAscensionService from '../services/VAscensionService';
//import logo from '../asset/heroes/A.Baden.jpg';

class ListVAscensionComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
            vascensions: []
        }

    }

    componentDidMount() {
        VAscensionService.getVAscensions().then((res) => {
            this.setState({ vascensions: res.data });
        });
    }

    render() {
        return (

            <div className="container">
                {/*
                                <img src={logo}></img>
                            */}
                <div className="row offset-md-2 col-7">
                    <h2 className="text-center">VAscension List</h2>
                    <div className="table table-striped tables-bordered">
                        <thead>
                            <tr>
                                <th>Avatar</th>
                                <th>Name</th>
                                <th>Upgrading</th>
                                <th>Type</th>
                                <th>Faction</th>
                                <th>Ascension</th>
                                <th>Ascension ID</th>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.vascensions.map(
                                    vascension =>
                                        <tr key={vascension.id}>
                                            <td><img src={process.env.PUBLIC_URL + '/asset/heroes/' + vascension.avatar}></img></td>
                                            <td>{vascension.name}</td>
                                            <td>{vascension.upgrading}</td>
                                            <td>{vascension.type}</td>
                                            <td>{vascension.faction}</td>
                                            <td>{vascension.ascension}</td>
                                            <td>{vascension.ascensionId}</td>
                                        </tr>
                                )
                            }
                        </tbody>
                    </div>
                </div>
            </div>
        );
    }
}

export default ListVAscensionComponent;
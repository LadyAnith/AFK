import { Component } from 'react';
import VAscensionUpgradingService from '../services/VAscensionUpgradingService';
//import logo from '../asset/heroes/A.Baden.jpg';

class AscensionUpgradingTableComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
            vascensions: []
        }

    }

    componentDidMount() {
        VAscensionUpgradingService.getVAscensions().then((res) => {
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
                    <h2 className="text-center">Ascension List</h2>
                    <div className="table table-striped tables-bordered">
                        <thead>
                            <tr>
                                <th>Avatar</th>
                                <th>Name</th>
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

export default AscensionUpgradingTableComponent;
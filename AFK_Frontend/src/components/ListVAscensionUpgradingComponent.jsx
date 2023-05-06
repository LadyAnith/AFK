import React, { Component } from 'react';
import VAscensionUpgradingService from '../services/VAscensionUpgradingService';

class ListVAscensionUpgradingComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
            vascensionsupgrading: []
        }

    }

    componentDidMount() {
        VAscensionUpgradingService.getVAscensionsUpgrading().then((res) => {
            this.setState({ vascensionsupgrading: res.data });
        });
    }

    render() {
        return (

            <div className="container">
                
                <div className="row offset-md-2 col-7">
                    <h2 className="text-center">VAscension Upgrading List</h2>
                    <div className="table table-striped tables-bordered">
                        <thead>
                            <tr>
                                <th>Name</th>
                                <th>Type</th>
                                <th>Faction</th>
                                <th>Ascension ID</th>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.vascensionsupgrading.map(
                                    vascensionUpgrading =>
                                        <tr key={vascensionUpgrading.id}>
                                            <td>{vascensionUpgrading.name}</td>
                                            <td>{vascensionUpgrading.type}</td>
                                            <td>{vascensionUpgrading.faction}</td>
                                            <td>{vascensionUpgrading.ascensionId}</td>
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

export default ListVAscensionUpgradingComponent;
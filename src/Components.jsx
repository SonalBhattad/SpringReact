import React, { Component } from 'react';
import UserServices from './UserServices'

class Components extends Component {
    constructor(){
        super();
        this.state={
            users :[]
        }
    }

    componentDidMount(){
        UserServices.getUsers().then((response)=>{
            this.setState({users:response.data})
        }
        );
    }

    render() {
        return (
            <div>
                <h2 className="text-center"> IPL 2021 Teams </h2>
                <div className="row">
                    <table className="table table-bordered">
                        <tbody>
                            <tr>
                                <th> Team </th>
                                <th> Captain </th>
                                <th> Owner </th>
                            </tr>
                        </tbody>
                        <tbody>
                            {
                                this.state.users.map( User=> (
                                    <tr key={User.id}>
                                        <td> {User.name} </td>
                                        <td> {User.captain} </td>
                                        <td> {User.owner} </td>
                                    </tr>
                                ))
                            }
                        </tbody>
                    </table>
                </div>
            </div>
        );
    }
}
     
export default Components;


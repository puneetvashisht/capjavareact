import React, { Component } from 'react'
import {
    Link
  } from "react-router-dom";

// const employees = [
//     {id: 3, name: "Ravi", salary: 34343.34},
//     {id: 34, name: "Priya", salary: 44343.34},
//     {id: 6, name: "Rahul", salary: 34343.34}
// ]

// Get employees json from Spring app..


export default class DetailViewEmployee extends Component {

    constructor(){
        super();
        this.state = {employee: {}, addresses: []}
    }

    componentDidMount() {
        console.log('Initialization...')
        console.log('id', this.props.match.params.id);


        fetch('http://localhost:8080/api/employees/' + this.props.match.params.id)
            .then(response => response.json())
            .then(
                data => {
                    console.log(data)

                    this.setState({employee:data, addresses: data.addresses});
                }
            );
    }
    

   

    render() {


        var addressList = this.state.addresses.map((address, i)=>{
            return (
                    <tr key={i}>
                        <th scope="row">{i + 1}</th>
                        <td>{address.houseNumber}</td>
                        <td>{address.location}</td>
                        <td>{address.city}</td>
                    </tr>
            )
        })
       
        return (
            <div>
                <h2>Detail View Of Employee</h2>
                <h4>Name: {this.state.employee.name}</h4>
                <h4>Salary: {this.state.employee.salary}</h4>


                <table className="table">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">House Number</th>
                        <th scope="col">Locality</th>
                        <th scope="col">City</th>
                    </tr>
                </thead>
                <tbody>
                   {addressList}
                </tbody>
                </table>

            </div>
        )
    }
}

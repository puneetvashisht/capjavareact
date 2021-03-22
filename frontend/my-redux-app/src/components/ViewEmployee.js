import React, { Component } from 'react'
import {
    Link
  } from "react-router-dom";
// import AddEmployee from './AddEmployee';
import { connect } from 'react-redux';

import * as actions from '../actions/action'

// const employees = [
//     {id: 3, name: "Ravi", salary: 34343.34},
//     {id: 34, name: "Priya", salary: 44343.34},
//     {id: 6, name: "Rahul", salary: 34343.34}
// ]

// Get employees json from Spring app..


class ViewEmployee extends Component {

    constructor(){
        super();
        this.state = {employees: [], message: ''}
    }

    componentDidMount() {
        console.log('Initialization...')
        this.props.onFetchEmployees();

        // fetch('http://localhost:8080/api/employees/')
        //     .then(response => response.json())
        //     .then(
        //         data => {
        //             console.log(data)
        //             this.setState({employees:data})
        //         }
        //     );
    }
    

    deleteEmployee(id){
        console.log('Deleting employee ...' , id)
        const url = 'http://localhost:8080/api/employees/' + id
        fetch(url, {
            method: "DELETE"
        })
        .then(response => response.json())
        .then(
                data => {
                    console.log(data)
                    this.setState({employees:data.employees, message: data.text})

                }
            );
    }

    render() {

        var employeeList = this.props.employees.map((employee, i)=>{
            return (
                    <tr key={i}>
                        <th scope="row">{i + 1}</th>
                        <td><Link to={"/detailview/" + employee.id}>{employee.name}</Link> </td>
                        <td>{employee.salary}</td>
                        <td><button type="button" className="btn btn-danger" onClick={this.deleteEmployee.bind(this, employee.id)}> X </button>
                        <Link to={"/update/" + employee.id}><button type="button" className="btn btn-warning">Edit</button></Link></td>
                    </tr>
            )
        })


        return (
            <div class="row">


                <div className="alert alert-success" role="alert">
                    {this.props.message}
                </div>
            
            <table className="table">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Name</th>
                        <th scope="col">Salary</th>
                        <th scope="col">Actions</th>
                    </tr>
                </thead>
                <tbody>
                   {employeeList}
                </tbody>
            </table>
            </div>
        )
    }
}


const mapStateToProps = (state) => {
    console.log('State is:: ', state)
    return {
        employees: state.employees
        // this.props.employee = this.state.employees;
    }
}


const mapDispatchToState = (dispatch) => {
    return {
        onFetchEmployees: () => dispatch(actions.fetchEmployees())
    }
}

// export default ViewEmployee;
export default connect(mapStateToProps, mapDispatchToState)(ViewEmployee);


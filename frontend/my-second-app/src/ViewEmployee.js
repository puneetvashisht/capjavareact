import React, { Component } from 'react'


// const employees = [
//     {id: 3, name: "Ravi", salary: 34343.34},
//     {id: 34, name: "Priya", salary: 44343.34},
//     {id: 6, name: "Rahul", salary: 34343.34}
// ]

// Get employees json from Spring app..


export default class ViewEmployee extends Component {

    constructor(){
        super();
        this.state = {employees: [], message: ''}
    }

    componentDidMount() {
        console.log('Initialization...')

        fetch('http://localhost:8080/api/employees/')
            .then(response => response.json())
            .then(
                data => {
                    console.log(data)
                    this.setState({employees:data})
                }
            );
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

        var employeeList = this.state.employees.map((employee, i)=>{
            return (
                    <tr key={i}>
                        <th scope="row">{i + 1}</th>
                        <td>{employee.name}</td>
                        <td>{employee.salary}</td>
                        <td><button type="button" className="btn btn-danger" onClick={this.deleteEmployee.bind(this, employee.id)}> X </button></td>
                    </tr>
            )
        })


        return (
            <div>
                <div className="alert alert-success" role="alert">
                    {this.state.message}
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

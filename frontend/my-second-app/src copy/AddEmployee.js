import React, { Component } from 'react'

export default class AddEmployee extends Component {

    constructor(){
        super();
        this.name = React.createRef();
        this.salary = React.createRef();
        this.state = {message: ''}
    }

    addEmployee(event){
        console.log('method for adding employee', this.name.current.value)
        console.log('method for adding employee', this.salary.current.value)
        // console.log('method for adding employee', salary)
        event.preventDefault();

        const url = 'http://localhost:8080/api/employees/';
        fetch(url, {
            method: "POST",
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({name: this.name.current.value, salary: this.salary.current.value})
        })
        .then(response => {
            console.log(response.status);
            if(response.status === 201){
                this.setState({message: 'Employee inserted sucessfully!!'})
            }
        })
        
    }

    render() {
        return (
            <div>
                
                <div className="alert alert-success" role="alert">
                    {this.state.message}
                </div>

                <div className="input-group mb-3">
                <div className="input-group-prepend">
                    <span className="input-group-text" id="basic-addon1">Employee Name</span>
                </div>
                <input type="text" ref={this.name} className="form-control" placeholder="Enter Name" aria-label="Username" aria-describedby="basic-addon1"/>
                </div>

                <div className="input-group mb-3">
                <div className="input-group-prepend">
                    <span className="input-group-text" id="basic-addon1">Employee Salary</span>
                </div>
                <input type="number" ref={this.salary} className="form-control" placeholder="Enter Salary" aria-label="Username" aria-describedby="basic-addon1"/>
                </div>


                <button type="button" className="btn btn-primary" onClick={this.addEmployee.bind(this)}>Add Employee</button>

            </div>
        )
    }
}

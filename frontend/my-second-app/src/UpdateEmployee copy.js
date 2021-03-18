
import {
    useParams
  } from "react-router-dom";

function UpdateEmployee() {
    // We can use the `useParams` hook here to access
    // the dynamic pieces of the URL.
    let { id } = useParams();
  
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


        <button type="button" className="btn btn-primary" onClick={this.updateEmployee.bind(this)}>Add Employee</button>

    </div>
    );
  }


  export default  UpdateEmployee;

import AddEmployee from './AddEmployee';
import './App.css';
import ViewEmployee from './ViewEmployee';
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";


function App() {



  return (

    <Router>
      <div>
        <ul>
          <li>
            
            <Link to="/">View Employees</Link>
          </li>
          <li>
         
            <Link to="/add">Add Employee</Link>
          </li>
    
        </ul>

        <hr />

        <Switch>
          <Route exact path="/">
            <ViewEmployee />
          </Route>
          <Route path="/add">
            <AddEmployee />
          </Route>
        </Switch>
      </div>
    </Router>

  );
}

export default App;

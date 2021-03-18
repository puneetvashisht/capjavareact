
import './App.css';
import {Link, BrowserRouter as Router, Switch,  Route} from 'react-router-dom'

function App() {
  return (

    <Router>

      <ul className="nav">
        <li className="nav-item">
          <Link className="nav-link" to="/">View</Link>
        </li>
        <li className="nav-item">
        <Link className="nav-link" to="/add">Add</Link>
        </li>
        <li className="nav-item">
        <Link className="nav-link" to="/update">Udpate</Link>
        </li>
      </ul>


      <Switch>
         
          <Route path="/add">
            <Add />
          </Route>
          <Route path="/update">
            <Update />
          </Route>
          <Route path="/">
            <View />
          </Route>
        </Switch>
     
    </Router>
  );
}

export default App;


function View(){
  return(
    <h2>View Component</h2>
  );
}

function Add(){
  return(
    <h2>Add Component</h2>
  );
}

function Update(){
  return(
    <h2>Update Component</h2>
  );
}

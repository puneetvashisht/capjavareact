// 0. Imported redux library
const redux = require('redux');


const initialState = {
    employees: [
        {id: 23, name: "Ravi", salary:33434},
        {id: 2, name: "Priya", salary:43434}
    ]
}
//1. Create a store
// 2. // Create  reducer
const store = redux.createStore((state = initialState, { type, payload }) => {

    console.log(type);
    switch (type) {
        
    case "ADD_EMPLOYEE":
        let newEmployees = [...state.employees, payload]
        return {employees: newEmployees}
    case "DELETE_EMPLOYEE":
        var filteredList = state.employees.filter((employee)=>{
            if(employee.id != payload.id){
                return employee;
            }
        })
        console.log(filteredList)
        return { employees: filteredList }
    default:
        return state
    }
})

store.subscribe(()=> console.log(store.getState()));

// 3. dispatch an action on store
store.dispatch({type: "ADD_EMPLOYEE", payload: {id: 3, name: "Test", salary:33333}});
store.dispatch({type: "FETCH_EMPLOYEE"});
store.dispatch({type: "DELETE_EMPLOYEE", payload: {id:2}});


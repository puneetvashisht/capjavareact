// make changes in store's state

const initialState = {
    message: '',
    employees: [
        // { id: 11, name: 'Abhinav', salary: 12345 },
        // { id: 102, name: 'Abhishek', salary: 23456 },
        // { id: 103, name: 'Ajay', salary: 34567 }
    ]
}

const reducer = (state = initialState, { type, payload }) => {

    console.log(type);
    switch (type) {
        
    case "ADD_EMPLOYEE":
        // let newEmployees = [...state.employees, payload]
        return {message: payload.message, employees: state.employees};
    case "DELETE_EMPLOYEE":
        var filteredList = state.employees.filter((employee)=>{
            if(employee.id != payload.id){
                return employee;
            }
        })
        console.log(filteredList)
        return { employees: filteredList }
    case "FIND_EMPLOYEES":

        console.log(payload)
        // newEmployees = [...payload]
        return {employees: payload} 
    default:
        return state
    }
}

export default reducer;



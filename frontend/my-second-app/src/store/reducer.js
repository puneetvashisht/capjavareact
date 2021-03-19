const initialState = {
    message: '',
    employees: [
        { id: 11, name: 'Abhinav', salary: 12345 },
        { id: 102, name: 'Abhishek', salary: 23456 },
        { id: 103, name: 'Ajay', salary: 34567 }
    ]
}

const reducer = (state = initialState, { type, payload }) => {

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
}

export default reducer;



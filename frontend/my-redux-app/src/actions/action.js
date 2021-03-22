export const saveEmployee = (payload) => {

    // http call using fetch.POST method

    return {type: "ADD_EMPLOYEE", payload: {message: "Successfully added employee!!"}}
}


export const addEmployee = (payload) => {

    const requestOptions = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(payload)
    };
    return dispatch => {
        fetch('http://localhost:8080/api/employees/', requestOptions)
            .then(res => {
                console.log(res)
                // console.log(res.json())
                if(res.status === 201){
                    console.log("success");
                    dispatch(saveEmployee())
                }
            })
        
    }

}


export const findEmployees = (payload) => {
    return {type: "FIND_EMPLOYEES", payload: payload}
}

export const fetchEmployees = () => {

    const requestOptions = {
        method: 'GET',
        headers: { 'Content-Type': 'application/json' }
    };
    return dispatch => {
        fetch('http://localhost:8080/api/employees/', requestOptions)
            .then(res => {
                console.log(res);
                return res.json();
            })
            .then(data => {
                console.log(data);
                dispatch(findEmployees(data));
            })
        
    }

}


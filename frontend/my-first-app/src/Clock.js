import React, { Component } from 'react'

export default class Clock extends Component {


    render() {

        var today = new Date();

        return (
            <div>
               <h1 > Time Now {today.getHours()} : {today.getMinutes()} : {today.getSeconds()}</h1>
            </div>
        )
    }
}

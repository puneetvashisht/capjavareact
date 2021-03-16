import React, { Component } from 'react'
import Badge from './Badge'

export default class Course extends Component {
    render() {
        return (
            <div className="card">
                <img src="https://via.placeholder.com/150" className="card-img-top" alt="..."/>
                <div className="card-body">
                    <h5 className="card-title">{this.props.title}</h5>
                    <p className="card-text">{this.props.summary}</p>
                    {/* <a href="#" className="btn btn-primary">Go somewhere</a> */}
                    <Badge caption="Votes"></Badge>
                </div>
            </div>
        )
    }
}

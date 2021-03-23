import React, { Component } from 'react'

export default class DropdownItem extends Component {
    handleItemClick(){
        console.log('child component clicked')
        this.props.itemChange(this.props.title);
       
    }

    render() {
        return (
            <a className="dropdown-item" href="#" onClick={this.handleItemClick.bind(this)}>{this.props.title}</a>
        )
    }
}

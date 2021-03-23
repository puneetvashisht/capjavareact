import React, { Component } from 'react'
import DropdownItem from './DropdownItem';
import SimpleAccordion from './SimpleAccordion';

export default class Dropdown extends Component {
    constructor(){
        super();
        this.state = {show: false, courses: ["Angular", "Java", "React", "JS"], caption: "Select Courses"}
    }

    handleClick(){
        console.log('click event')
        this.setState({show: !this.state.show})
        console.log(this.state.show)
    }

    handleItemChange(item){
        console.log('handle item change in parent', item)
        this.setState({caption: item, show: false})
    }


    render() {

        var courseList = this.state.courses.map((course, i)=>{
            return  <DropdownItem key={i} title={course} itemChange={this.handleItemChange.bind(this)} ></DropdownItem>
        })

        return (
            <div>

                <SimpleAccordion title={this.state.caption}></SimpleAccordion>

                <div className="dropdown">
                <button onClick= {this.handleClick.bind(this)} className="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {this.state.caption}
                </button>
                <div className={this.state.show?'dropdown-menu show': 'dropdown-menu'} aria-labelledby="dropdownMenuButton">
                    {courseList}
                </div>
                </div>



            </div>
        )
    }
}

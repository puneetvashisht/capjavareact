// import logo from './logo.svg';
import './App.css';
// import Badge from './Badge'
import Course from './Course'

const courses = [
  {title: "React", summary:"library from facebook..."},
  {title: "Angular", summary: "framework from google..."},
  {title: "EmberJS", summary: "framework another open source..."}
]

function App() {

  // for multiple course tag creation...
  var courseList = courses.map((course, i)=>{
    return (
      <Course title={course.title} summary={course.summary}></Course>
    )
  })

  console.log(courseList)

  return (

   

    <div className="container">
      {/* <Badge caption="Inbox"></Badge>
        <Badge caption="Sent"></Badge> */}
      <div className="row">
        {courseList}
        {/* <Course title="React" summary=""></Course>
        <Course title="Angular" summary="framework from google..."></Course> */}
      </div>


    </div>
  );
}

export default App;

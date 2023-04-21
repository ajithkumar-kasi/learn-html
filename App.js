import { BrowserRouter,Routes,Route } from 'react-router-dom';
import Page1 from './components/page1';



function App() {

  return (
    <div>
      
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Page1/>}></Route>
          <Route path='/home' element={<Page1/>}></Route>
        </Routes>
      </BrowserRouter>
    

    </div>
)}

export default App;

import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import Menu from './components/navegacion/navbar';
import Home from './components/pages/Home';
import Ascension from './components/pages/Ascension';
import AscensionUpgrading from './components/pages/AscensionUpgrading';

function App() {
  return (
    <div className="container">
      <Router>
        <Menu />
        <Routes>
          <Route path='/' element={<Home/>}/>
          <Route path='/ascension' element={<Ascension/>}/>
          <Route path='/ascensionUpgrading' element={<AscensionUpgrading/>}/>
{/*
*/}
        </Routes>
      </Router>

    </div>
  );
}

export default App;

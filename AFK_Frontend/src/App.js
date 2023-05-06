import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import Menu from './components/navegacion/navbar';
import ListVAscensionComponent from './components/ListVAscensionComponent';
import ListVAscensionUpgradingComponent from './components/ListVAscensionUpgradingComponent';


function App() {
  return (
    <div className="container">
      <Router>
        <Menu />
        <Routes>
          <Route path='/ListVAscension' exact component={<ListVAscensionComponent/>}/>
        </Routes>
      </Router>

    </div>
  );
}

export default App;

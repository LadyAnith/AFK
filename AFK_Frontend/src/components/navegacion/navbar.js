import React from 'react'
import { Link } from 'react-router-dom'

const Menu = () => {
  return (
    <>
      <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
        <img src='./afk.jpg' width='200'/>
        <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
          <span className="navbar-toggler-icon"></span>
        </button>
        <div className="collapse navbar-collapse" id="navbarNavDropdown">
          <ul className="navbar-nav mx-auto">
            <li className="nav-item dropdown">
              <a className="nav-link dropdown-toggle" href="#" id="navAscension" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Ascension
              </a>
              <div className="dropdown-menu" aria-labelledby="navAscension">
                <Link className="dropdown-item" to='/ListVAscension' >VAscension</Link>
                <Link className="dropdown-item" to='/ListVAscensionUpgrading' >VAscension Upgrading</Link>
              </div>
            </li>
            <li className="nav-item dropdown">
              <a className="nav-link dropdown-toggle" href="#" id="navCrystal" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Crystal
              </a>
              <div className="dropdown-menu" aria-labelledby="navCrystal">
                <Link className="dropdown-item" to='/ListVCrystal' >VCrystal</Link>
                <Link className="dropdown-item" to='/ListVCrystalUpgrading' >VCrystal Upgrading</Link>
              </div>
            </li>
            <li className="nav-item dropdown">
              <a className="nav-link dropdown-toggle" href="#" id="navEngraving" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Engraving
              </a>
              <div className="dropdown-menu" aria-labelledby="navEngraving">
                <Link className="dropdown-item" to='/ListVEngraving' >VEngraving</Link>
                <Link className="dropdown-item" to='/ListVEngravingUpgrading' >VEngraving Upgrading</Link>
              </div>
            </li>
            <li className="nav-item dropdown">
              <a className="nav-link dropdown-toggle" href="#" id="navFurniture" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Furniture
              </a>
              <div className="dropdown-menu" aria-labelledby="navFurniture">
                <Link className="dropdown-item" to='/ListVFurniture' >VFurniture</Link>
                <Link className="dropdown-item" to='/ListVFurnitureUpgrading' >VFurniture Upgrading</Link>
              </div>
            </li>
            <li className="nav-item dropdown">
              <a className="nav-link dropdown-toggle" href="#" id="navGears" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Gears
              </a>
              <div className="dropdown-menu" aria-labelledby="navGears">
                <Link className="dropdown-item" to='/ListVGears' >VGears</Link>
                <Link className="dropdown-item" to='/ListVGearsUpgrading' >VGears Upgrading</Link>
              </div>
            </li>
            <li className="nav-item dropdown">
              <a className="nav-link dropdown-toggle" href="#" id="navSignature" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Signature
              </a>
              <div className="dropdown-menu" aria-labelledby="navSignature">
                <Link className="dropdown-item" to='/ListVSignature' >VSignature</Link>
                <Link className="dropdown-item" to='/ListVSignatureUpgrading' >VSignature Upgrading</Link>
              </div>
            </li>
          </ul>
        </div>
      </nav>
    </>
  )
}

export default Menu
import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css';
function Navbar() {

    return (
        <header>
          <nav className="container">
            <div className="drmovie-nav-content">
              <h1>DRmovie</h1>
              <a href="https://github.com/rampazio">
              <div className="drmovie-contact-conteiner">
              <GithubIcon />
              <p className="drmovie-contact-link">/rampazio</p>
              </div>
              </a>     
            </div>
          </nav>
        </header>
 );
}

export default Navbar;
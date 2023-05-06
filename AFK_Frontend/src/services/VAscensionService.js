import axios from 'axios';

const VASCENSION_API_BASE_URL = "http://localhost:8080/afk/VAscension";

class VAscensionService{

    getVAscensions(){
        return axios.get(VASCENSION_API_BASE_URL);
    }

}

export default new VAscensionService()
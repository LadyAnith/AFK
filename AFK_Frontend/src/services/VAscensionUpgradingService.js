import axios from 'axios';

const VASCENSIONUPGRADING_API_BASE_URL = "http://localhost:8080/afk/VAscensionUpgrading";

class VAscensionUpgradingService{

    getVAscensions(){
        return axios.get(VASCENSIONUPGRADING_API_BASE_URL);
    }

}

export default new VAscensionUpgradingService()
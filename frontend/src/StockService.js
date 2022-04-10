import axios from 'axios'

const STOCKS_REST_API_URL = 'http://localhost:8080/api/v1/stock';

class StockService {

    getStocks(){
        return axios.get(STOCKS_REST_API_URL);
    }
}

export default new StockService();
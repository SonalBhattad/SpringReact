import axios from 'axios'

const USER_API_BASE_URL = "http://localhost:8085/home/users";

class UserServices{
    getUsers(){
        return axios.get(USER_API_BASE_URL);
    }
}

export default new UserServices();
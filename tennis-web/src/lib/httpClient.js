import axios from 'axios';

let headers = {
    "Content-Type": "application/json",
    Accept: `application/vnd.iman.v1+json, application/json, text/plain, */*`,
    "Access-Control-Allow-Origin": "*",
    "Cache-Control": "no-store, no-cache, must-revalidate",
    Pragma: "no-cache"
}

//acepta tipo json, acepta cualquier contenido  , acees * acepta todas las urls, 
//cache si desea guardar por cache


const filterOptions = ({method, ...rest}) =>rest;

const fetch = async (url,options = {}) =>{
    try{
       //
       const instance = axios.create({
           baseURL: `http://localhost:8080/springtennis/api/v1`
       });


       // Interceptor Request
       instance.interceptors.request.use(
        (config) => {
            //console.log("Interceptor Request: ", config);
            return config;
        }, (error) => {
            return Promise.reject(error)
        }
    )

        // Interceptor Response
        instance.interceptors.response.use(
        (response) => {
            //console.log("Interceptor Response: ", response);
            return response;
        }, (error) => {
            return Promise.reject(error)
        }
        );




       //request  permite meter parametro de configuracion
       const {data} =  await instance.request({
           url,
           method: options['method'],
           data: options['data'],
           params: options['params'],
           headers: {...headers,...options['headers']},
           cancelToken: options['cancelFn'] ? new axios.CancelToken(options['cancelFn']) : null
       });

       //devuelve la peticion
       return data;
       
    }catch(error){
        if(axios.isCancel(error)){
            throw new Error('Request cancelled');
        }else{
            throw error;
        }
        
    }
}

const get = async (url,options ={}) =>{
    return  await fetch(url,{
        method: "GET",
        ...filterOptions(options)
    });
}


const post = async (url,options ={}) =>{
    return  await fetch(url,{
        method: "POST",
        ...filterOptions(options)
    });
}

const put = async (url,options ={}) =>{
    return  await fetch(url,{
        method: "PUT",
        ...filterOptions(options)
    });
}

const del = async (url,options ={}) =>{
    return  await fetch(url,{
        method: "DELETE",
        ...filterOptions(options)
    });
}

export default {
    get,
    post,
    put,
    delete: del
};
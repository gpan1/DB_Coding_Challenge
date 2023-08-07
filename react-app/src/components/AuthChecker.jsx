import { Navigate } from "react-router-dom";
import Cookies from 'js-cookie';

export const AuthChecker = (props) => { 
    
   let cookie = Cookies.get("token");
   let token = false;

   console.log(cookie);
   if(cookie != null){
      token = true;
   }
    
    const { auth=token, children, redirect = '/login' } = props; 

    if (!auth) {
       return <Navigate to={redirect} replace />;
    }

    return children;
 };

 export default AuthChecker;
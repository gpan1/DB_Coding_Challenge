import { Navigate } from "react-router-dom"

export const AuthChecker = (props) => { 
    
    const token = true;
    
    const { auth=token, children, redirect = '/login' } = props; 

    if (!auth) {
       return <Navigate to={redirect} replace />;
    }

    return children;
 };

 export default AuthChecker;
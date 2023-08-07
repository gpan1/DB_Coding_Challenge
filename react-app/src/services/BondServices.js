import { hostNameUrl } from "../config/api";
import axios from "axios";

export const findBonds = () => {
  const bonds = axios.get(`${hostNameUrl}/all`);
  return bonds;
};

export const findMatureBonds = () => {
  const bonds = axios.get(`${hostNameUrl}/matured`);
  return bonds;
};

export const findMaturingBonds = () => {
  const bonds = axios.get(`${hostNameUrl}/maturing`);
  return bonds;
};

export const login = (email) => {
  const bonds = axios.get(`${hostNameUrl}/get_a_user/${email}`);
  return bonds;
};

export const signup = (email, password) => {
  const bonds = axios.post(`${hostNameUrl}/add_a_user/${email}/${password}`);
  return bonds;
};
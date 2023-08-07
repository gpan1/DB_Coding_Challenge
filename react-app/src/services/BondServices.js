import { hostNameUrl } from "../config/api";
import axios from "axios";

export const findBonds = () => {
  const bonds = axios.get(`${hostNameUrl}/all`);
  return bonds;
};

export const findMatureBonds = (date) => {
  const bonds = axios.get(`${hostNameUrl}/view_matured${date}`);
  return bonds;
};

export const findMaturingBonds = (date) => {
  const bonds = axios.get(`${hostNameUrl}/view_maturing${date}`);
  return bonds;
};

export const login = (email) => {
  const bonds = axios.get(`${hostNameUrl}/get_a_user/${email}`);
  return bonds;
};

export const signup = (name, email, password) => {
  const bonds = axios.post(`${hostNameUrl}/add_a_user/${name}/${email}/${password}`);
  return bonds;
};

export const bondById = (id) => {
  const bonds = axios.get(`${hostNameUrl}/${id}`);
  return bonds;
};

export const clientByBondId = (id) => {
  const bonds = axios.get(`${hostNameUrl}/view_issuer_and_client/${id}`);
  return bonds;
};

export const settlingBonds = (date) => {
  const bonds = axios.get(`${hostNameUrl}/to_be_settled/${date}`);
  return bonds;
};

export const bondsAndBooks = (id) => {
  const bonds = axios.get(`${hostNameUrl}/bonds_in_book/${id}`);
  return bonds;
};
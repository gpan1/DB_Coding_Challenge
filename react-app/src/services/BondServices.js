import { hostNameUrl } from "../config/api";
import axios from "axios";

export const findBonds = () => {
  const bonds = axios.get(`${hostNameUrl}`);
  return bonds;
};

export const findMatureBonds = () => {
  const bonds = axios.get(`${hostNameUrl}`);
  return bonds;
};
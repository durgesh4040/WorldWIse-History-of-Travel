//import PropTypes from "prop-types"; // Import PropTypes

import styles from "./CityList.module.css";
import CityItem from "./CityItem";
import Spinner from "./Spinner";
import Message from "./Message";
import { useCities } from "../Contexts/ContextCities";

export default function CityList() {
  const { cities, isLoading } = useCities();
  console.log(cities);
  if (isLoading) return <Spinner />;

  if (!cities.length)
    return <Message message="Add the city when no city is there " />;
  return (
    <div>
      <ul className={styles.CityList}>
        {cities.map((city) => (
          <CityItem city={city} key={city.id} />
        ))}
      </ul>
    </div>
  );
}

// Add prop validation using PropTypes
CityList.propTypes = {
  //cities: PropTypes.array.isRequired, // An array is required
  // isLoading: PropTypes.bool.isRequired, // A boolean is required
};

import { BrowserRouter, Routes, Route, Navigate } from "react-router-dom"; // Note the corrected import statement
import Product from "./Pages/Product";
import Pricing from "./Pages/Pricing";
import AppLayout from "./Pages/AppLayout";
import Login from "./Pages/Login";
import PageNotFound from "./Pages/PageNotFound";
import CityList from "./Components/CityList";
import CountryList from "./Components/CountryList";
import Homepage from "./Pages/Homepage";
import City from "./Components/City";
import Form from "./Components/Form";
import { CitiesProvider } from "./Contexts/ContextCities";
import { AuthProvider } from "./Contexts/fakeAuthContext";
import ProtectedRoute from "./Pages/ProtectedRoute";

export default function App() {
  return (
    <AuthProvider>
      <CitiesProvider>
        <BrowserRouter>
          <Routes>
            {/* <Route path="/" element={<HomePage />} /> */}
            <Route index element={<Homepage />} />
            <Route path="product" element={<Product />} />
            <Route path="pricing" element={<Pricing />} />
            <Route path="/login" element={<Login />} />
            <Route
              path="app"
              element={
                <ProtectedRoute>
                  <AppLayout />
                </ProtectedRoute>
              }
            >
              <Route index element={<Navigate replace to="cities" />} />

              <Route path="cities" element={<CityList />} />
              <Route path="cities/:id" element={<City />} />
              <Route path="countries" element={<CountryList />} />
              <Route path="form" element={<Form />} />
            </Route>
            <Route path="*" element={<PageNotFound />} />
          </Routes>
        </BrowserRouter>
      </CitiesProvider>
    </AuthProvider>
  );
}

// export default App;

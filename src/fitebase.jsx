// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyBCzQJFuXJYavcUL_bYuOvW3uOtrIiprDs",
  authDomain: "ftravel-c7065.firebaseapp.com",
  projectId: "ftravel-c7065",
  storageBucket: "ftravel-c7065.appspot.com",
  messagingSenderId: "406263139568",
  appId: "1:406263139568:web:3eb9e9418ba266186bc635",
  measurementId: "G-YT0MH00WWZ",
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);
console.log(analytics);

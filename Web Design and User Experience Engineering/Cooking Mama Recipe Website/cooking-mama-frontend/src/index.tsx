import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { Provider } from "react-redux";
import { store } from "./store";
import i18n from 'i18next';
import { initReactI18next } from 'react-i18next';
import HttpApi from "i18next-http-backend";
import translationEN from './i18n/en/common.json';
import translationCN from './i18n/cn/common.json';

const resources = {
  en: {
    translation: translationEN
  },
  cn: {
    translation: translationCN
  }
};

// i18next init
i18n.use(HttpApi)
  .use(initReactI18next)
  .init({
    debug: true,
    fallbackLng: 'en',
    resources,
    interpolation: {
      escapeValue: false
    }
  });
const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <React.StrictMode>
    <Provider store={store}>
      <App />
    </Provider>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

export default i18n;

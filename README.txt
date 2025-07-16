# Razorpay Payment Gateway Automation (Spring Boot + HTML + JavaScript)

This project demonstrates how to integrate and test **Razorpay payment gateway** using **Spring Boot (Backend)** and **HTML/JavaScript (Frontend)**, designed for educational and testing purposes using **Razorpay Sandbox Test Keys**.

---

## 🚀 Features

- ✅ Payment Gateway Integration with **Razorpay Test Mode**
- ✅ Simple Frontend using HTML, CSS, JS
- ✅ Backend API using **Spring Boot**
- ✅ Successful and Failed Payment Handling
- ✅ Redirect to Success or Failure Page after Payment
- ✅ Suitable for learning **Payment Flow Automation**

---

## 🛠️ Tech Stack

- **Java (Spring Boot)** – Backend API
- **HTML + JavaScript** – Frontend UI
- **Razorpay Java SDK**
- **Maven** – Dependency Management
- **Selenium / API Testing** *(Optional if you have automation test cases)*

---

## 💻 How to Run

### 📥 Clone the Repository
```bash
git clone https://github.com/abhay-1994/Razorpay-payment-test
```

### 📂 Import in Eclipse
- File → Import → Maven → Existing Maven Projects → Browse project folder.

### ⚙️ Setup API Keys
- Open: `src/main/resources/application.properties`
```properties
razorpay.key_id=YOUR_TEST_KEY_ID
razorpay.key_secret=YOUR_TEST_KEY_SECRET
```
- Open: `index.html` and update with your Razorpay test key.

### ▶️ Run Application
- Right-click project → Run As → Spring Boot App.

### 🌐 Access Application
Visit: [http://localhost:8080/index.html](http://localhost:8080/index.html)

✅ Test payment success/failure using Razorpay test credentials.

---

## 📌 Test Credentials (from Razorpay Docs)
- **Card Number:** 4111 1111 1111 1111
- **CVV:** 123
- **Expiry:** Any future date
- **OTP:** 123456

---

## 📝 Screenshots
*(Optional: You can add images of UI, success/failure pages here)*

---

## 🤝 Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

---

## 📜 License

This project is for **educational purposes** only and follows the MIT license.

---

## 🙋‍♂️ Author

- Abhay Kumar
- [LinkedIn Profile](https://www.linkedin.com/in/abhay-kumar-qa/)
- [GitHub](https://github.com/abhay-1994)

Project Structure
razorpay-payment-test/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/payment/     # Your Spring Boot Java files (controllers, services)
│   │   ├── resources/
│   │   │   ├── application.properties
│   │   │   └── static/
│   │   │       ├── index.html
│   │   │       ├── success.html
│   │   │       └── failure.html
│   │   └── templates/ (if using Thymeleaf)
│   └── test/
│       └── java/
│           └── com/example/payment/     # Optional: Automation test cases
│
├── .gitignore
├── pom.xml
├── README.md
└── LICENSE

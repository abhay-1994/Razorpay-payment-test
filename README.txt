
# Razorpay Payment Test (Spring Boot + HTML/JS)

## Steps to Run:

1. Open Eclipse, go to File -> Import -> Maven -> Existing Maven Projects -> Select this folder.
2. Update the file: src/main/resources/application.properties with your Razorpay API keys:

razorpay.key_id=YOUR_TEST_KEY_ID
razorpay.key_secret=YOUR_TEST_KEY_SECRET

Also, replace YOUR_KEY_ID in index.html JS with your key.

3. Run the application as Spring Boot App.

4. Open: http://localhost:8080/index.html in browser.

5. Click "Pay Now" to test Razorpay payment flow (using Razorpay Sandbox Test keys).

After successful payment → will redirect to /success.html
If payment fails → will redirect to /failure.html


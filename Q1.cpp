#include <iostream>
using namespace std;
float add(float a, float b);
float subtract(float a, float b);
float multiply(float a, float b);
float divide(float a, float b);

int main() {
float num1, num2;
char op;

cout << "Enter first number: ";
cin >> num1;

cout << "Enter an operator (+, -, *, /): ";
cin >> op;

cout << "Enter second number: ";
cin >> num2;

float result;

switch (op) {
case '+':
result = add(num1, num2);
break;
case '-':

result = subtract(num1, num2);
break;
case '*':
result = multiply(num1, num2);
break;
case '/':
result = divide(num1, num2);
break;
default:
cout << "Invalid operator";
return 1; // Exit with an error code
}

cout << "Result: " << result << endl;

return 0;
}

float add(float a, float b) {
return a + b;
}

float subtract(float a, float b) {
return a - b;
}

float multiply(float a, float b) {
return a * b;
}

float divide(float a, float b) {
if (b != 0) {
return a / b;
} else {
cout << "Division by zero is not allowed";
return 0;
}
}
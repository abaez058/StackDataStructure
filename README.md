# 🧮 Parenthesis Balance Checker (Java)

## 📘 Overview
This Java program checks whether a given expression has **balanced parentheses**, including `()`, `{}`, and `[]`.  
It uses a **stack-based approach** to ensure that every opening bracket has a corresponding closing bracket in the correct order.

---

## ⚙️ Features
- Handles all types of brackets: `()`, `{}`, and `[]`
- Uses a **Stack** to track open brackets
- Detects incorrect nesting and missing pairs
- Simple command-line input/output

---

## 💡 How It Works
1. Iterate through each character in the expression.
2. **Push** opening brackets onto the stack.
3. When a **closing bracket** is found:
   - Check if the stack is empty (unmatched closing bracket).
   - Pop from the stack and verify that the popped bracket matches.
4. After processing, if the stack is empty → expression is **Balanced**, otherwise **Not Balanced**.

---



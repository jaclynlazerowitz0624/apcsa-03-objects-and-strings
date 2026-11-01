# Exercise 9 — The Scanner Newline Trap

## Part A — Break it on purpose

Run `src/ScannerTrap.java` exactly as written. Enter `16` for the age, then try to type a name.

**1. What actually happened?**

It doesn't let you type a name it just resumes the program, printing only an age and doesn't print a name.

**2. What did you expect to happen?**

It would ask for and print the inputted name and age.

**3. Did the program crash, or did it just behave strangely?**

It didn't crash because something was printed, so it just acted strangely.

---

## Part B — Explain it

`nextInt()` reads the number `16` and stops. But you also pressed Enter, and that newline character is still sitting in the input buffer.

**1. So what does the next `nextLine()` read?**

It reads whatver was inputted last. Since then you are trying to convert the inputted int into a line, it doesn't work.

**2. Why doesn't this happen if you use `nextInt()` twice in a row?**

Because it's the same type of varibale so it doesn't need the differentiation.

---

## Part C — Fix it

**1. Add the fix to `ScannerTrap.java`. Paste your corrected lines here:**

```java
public class ScannerTrap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.print("Enter your full name: ");
        String name = input.nextLine();

        System.out.println();
        System.out.println("Age recorded:  " + age);
        System.out.println("Name recorded: [" + name + "]");
        System.out.println();
        System.out.println("Is the name empty? If so, you found the trap.");

        input.close();
    }
}

```

**2. Why does a bare `input.nextLine();` with nothing assigned to it solve the problem?**

It kind of empites past inputs so the types of variables are cleared abd the porgram can run accordingly.

---

## Part D — Input is not safe

Run any program that uses `nextInt()` and type `hello` instead of a number.

**1. What error did you get?**

It crashes.

**2. Is that a syntax error, a runtime error, or a logic error?**

A runtime becayse the program ran smoothly at the start and only crashed into the program when it started running the error.

**3. Real applications never trust input. Name two things a user could type into your project's input that would break it.**

1. An already stored value
2. Something that exceeds the type's limit

**4. We can't fix this properly until we have conditionals in Unit 3. But what *would* you want the program to do when someone types the wrong thing?**

Ask them if they want to eitehr try again, edit their repsonse, or start the program over.


[#javascript](https://dev.to/t/javascript)[#beginners](https://dev.to/t/beginners)[#programming](https://dev.to/t/programming)[#react](https://dev.to/t/react)

In JavaScript, a Promise is an object that represents a value that may not be available yet, but will be resolved in the future. Promises are used to handle asynchronous operations, such as making network requests or accessing databases, where the result is not immediately available.

I'd like to kick off our adventure, if you're ready..

---

## [](https://dev.to/codeofrelevancy/all-about-promises-in-javascript-39lj#how-promises-work)**How Promises Work?**

A `Promise` is a proxy for a value not necessarily known when the promise is created. It allows you to associate handlers with an asynchronous action's eventual success value or failure reason. This lets asynchronous methods return values like synchronous methods: instead of immediately returning the final value, the asynchronous method returns a promise to supply the value at some point in the future.

[![How Promises Work](https://res.cloudinary.com/practicaldev/image/fetch/s--9xpOBp4k--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/4y3g6761911sybrp62x6.jpg)](https://res.cloudinary.com/practicaldev/image/fetch/s--9xpOBp4k--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/4y3g6761911sybrp62x6.jpg)

---

## [](https://dev.to/codeofrelevancy/all-about-promises-in-javascript-39lj#a-promise-has-three-possible-states)**A Promise has three possible states:**

GIF

![A Promise has three possible states](https://res.cloudinary.com/practicaldev/image/fetch/s--xQEcd4mm--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_66%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/egeadd2zaf8igo461qee.gif)

1.  **Pending:** The initial state of a Promise. The Promise is neither fulfilled nor rejected.
2.  **Fulfilled:** The Promise has been resolved and the resulting value is available.
3.  **Rejected:** The Promise has been rejected and an error occurred.

---

Once a Promise is settled, it cannot be resettled. The `resolve()` or `reject()` function can only be called once, and any subsequent calls to these functions will have no effect. The immutability of a settled Promise is an important feature because it ensures that the Promise's value remains consistent and predictable. Once a Promise is settled, its value cannot be changed, which helps prevent unexpected behavior and makes it easier to reason about the code.

---

## [](https://dev.to/codeofrelevancy/all-about-promises-in-javascript-39lj#how-to-create-promises)**How to Create Promises?**

A Promise is created using the `Promise` constructor, which takes a single argument, a function called **the executor**. The executor function takes two arguments: `resolve` and `reject`. These are functions that are called when the Promise is either **fulfilled** or **rejected**.

_To show you what I mean.._

[![Example of creating a Promise that resolves after a delay](https://res.cloudinary.com/practicaldev/image/fetch/s--8iBSrBe4--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/tiwualz6s9upsjcjzn5e.png)](https://res.cloudinary.com/practicaldev/image/fetch/s--8iBSrBe4--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/tiwualz6s9upsjcjzn5e.png)

The Promise in above example will resolve after one second, and the value of the resolved Promise will be the array of users.

Once a Promise is created, you can use the `then` method to attach a callback function that will be called when the Promise is fulfilled. The `then` method takes two arguments: a callback function for the resolved value and a callback function for the rejected value.

_To show you what I mean.._

[![Promise example](https://res.cloudinary.com/practicaldev/image/fetch/s--zm-CvRUv--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/abuecv85np1swg86ho45.png)](https://res.cloudinary.com/practicaldev/image/fetch/s--zm-CvRUv--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/abuecv85np1swg86ho45.png)

[![Output of promise example](https://res.cloudinary.com/practicaldev/image/fetch/s--ObYfFU6n--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/17iolnrhtzz72iirqmam.png)](https://res.cloudinary.com/practicaldev/image/fetch/s--ObYfFU6n--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/17iolnrhtzz72iirqmam.png)

---

Moving forward on our adventure, let's take a look at an example of a Promise that has been rejected.

_To show you what I mean.._

[![Promise that has been rejected](https://res.cloudinary.com/practicaldev/image/fetch/s--KC1XhE3b--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/fduem5fu69wyimxlg8zr.png)](https://res.cloudinary.com/practicaldev/image/fetch/s--KC1XhE3b--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/fduem5fu69wyimxlg8zr.png)

[![Output of promise that has been rejected](https://res.cloudinary.com/practicaldev/image/fetch/s--_phXVlp5--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/0osmpd19l11f61javcg7.png)](https://res.cloudinary.com/practicaldev/image/fetch/s--_phXVlp5--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/0osmpd19l11f61javcg7.png)

---

## [](https://dev.to/codeofrelevancy/all-about-promises-in-javascript-39lj#chained-promises)**Chained Promises**

Below methods are used to associate further action with a promise that becomes settled. As these methods return promises, they can be chained  

```
Promise.prototype.then()
Promise.prototype.catch()
Promise.prototype.finally()
```

GIF

![Chaining promises in JavaScript](https://res.cloudinary.com/practicaldev/image/fetch/s--fJ30MSsp--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_66%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/pkkf8onnr3v4jrb7cxfh.gif)

Chaining promises in JavaScript involves creating a sequence of promises that are executed one after the other. Each promise in the chain depends on the successful completion of the previous promise, so if any promise in the chain fails, the entire chain fails.

Let's see how we can chain promises in JavaScript:

[![Example of chain promises in JavaScript](https://res.cloudinary.com/practicaldev/image/fetch/s--5DFOrh5u--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/fthxcuakfywd0aul9fui.png)](https://res.cloudinary.com/practicaldev/image/fetch/s--5DFOrh5u--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/fthxcuakfywd0aul9fui.png)

[![Output: Example of chain promises in JavaScript](https://res.cloudinary.com/practicaldev/image/fetch/s--eg-rI0KG--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/okunuf645cvt2onvhw97.png)](https://res.cloudinary.com/practicaldev/image/fetch/s--eg-rI0KG--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/okunuf645cvt2onvhw97.png)

Here, the `fetchData()` function is used to fetch data from a remote API and perform some operation on it. The `fetchData()` function returns a Promise that resolves with the result of the operation.

The Promise chain begins by fetching user data from the API, then using the first user's ID to fetch their posts, and finally using the ID of the first post to fetch the comments for that post. Each `then()` method in the chain handles the resolved value of the previous Promise and the final `catch()` method handles any errors that occur during the chain.

We can create many chains with `then()` method as per the requirements. Like synchronous code, chaining will result in a sequence that runs in serial. Let's see a simple instance..

[![many chains](https://res.cloudinary.com/practicaldev/image/fetch/s--tL1Q6Dy8--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/do9kt4tlinqwnep3fx7j.png)](https://res.cloudinary.com/practicaldev/image/fetch/s--tL1Q6Dy8--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/do9kt4tlinqwnep3fx7j.png)

---

## [](https://dev.to/codeofrelevancy/all-about-promises-in-javascript-39lj#benefits-of-promises)**Benefits of Promises**

Promises provide several benefits over traditional callback based approaches to handling asynchronous operations in JavaScript. Some of the key benefits include:

1.  **Better readability:** Promises allow you to write code that is more readable and easier to understand than traditional callback-based approaches. With Promises, you can chain together asynchronous operations in a sequence, which makes it clear what order the operations are executed in.
    
2.  **Improved error handling:** Promises make it easier to handle errors that occur during asynchronous operations. With Promises, you can use the catch method to handle errors that occur during any step in the chain, rather than having to handle errors separately for each step.
    
3.  **Avoiding callback hell:** Promises can help you avoid "callback hell," a situation where you have a chain of nested callbacks that can become difficult to manage and debug. With Promises, you can chain together asynchronous operations without having to nest multiple levels of callbacks.
    
4.  **Ability to return a value:** Promises allow you to return a value from an asynchronous operation, which makes it easier to pass the result of one operation to another operation in a sequence. This is particularly useful when you need to perform multiple asynchronous operations in a sequence and need to use the result of each operation in the next operation.
    
5.  **Better compatibility:** Promises are a standardized feature in modern JavaScript, and are supported by all modern browsers and Node.js. This means that Promises can be used across different environments without requiring different code for each environment.
    

---

## [](https://dev.to/codeofrelevancy/all-about-promises-in-javascript-39lj#how-do-i-cancel-a-promise)**How Do I Cancel a Promise?**

In modern JavaScript - No, you cannot cancel a Promise once it has been created. It will execute its code and either resolve or reject, and there is no built in way to cancel the operation.

There are some techniques you can use to simulate cancellation:

1.  **Timeout:** You can use a timeout to reject the Promise if it takes too long to resolve. This technique is useful if you are making a network request and want to limit the amount of time it takes.
    
2.  **Aborting a network request:** You can use an abort controller to abort a network request. The Fetch API provides an AbortController API that allows you to cancel a network request before it completes.
    
3.  **Using a flag:** You can use a flag in your code to simulate cancellation. You can set the flag to true to indicate that the operation should be canceled, and then check the flag in your Promise code to determine whether to continue or reject the Promise.
    

It's worth noting that none of these techniques truly cancel a Promise; they simply reject it early. If you need true cancellation, you may need to use a library that provides cancellation support, such as [rxjs](https://rxjs.dev/) or [bluebird](http://bluebirdjs.com/docs/getting-started.html).

---

## [](https://dev.to/codeofrelevancy/all-about-promises-in-javascript-39lj#bluebird-promise-cancellation)**Bluebird Promise Cancellation**

[Bluebird](http://bluebirdjs.com/docs/getting-started.html) is a popular Promise library for JavaScript that provides advanced features, including Promise cancellation. Promise cancellation is the ability to cancel a Promise, which is useful for canceling ongoing or long running asynchronous operations.

With the help of Bluebird, Promise cancellation is achieved using the `Promise.cancel()` method. This method is not part of the standard Promise API and is specific to Bluebird.

To use Promise cancellation in Bluebird, you need to create a cancellable Promise using the `new Promise()` constructor and passing a cancel function as an argument. The cancel function will be called when the Promise is canceled.

[![Example of Bluebard](https://res.cloudinary.com/practicaldev/image/fetch/s--1OScPEEo--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/9rg5nsngvukv2ws5mu3o.png)](https://res.cloudinary.com/practicaldev/image/fetch/s--1OScPEEo--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/9rg5nsngvukv2ws5mu3o.png)

---

## [](https://dev.to/codeofrelevancy/all-about-promises-in-javascript-39lj#multiple-promises-in-parallel)**Multiple Promises in Parallel**

With the help of **Promises**, it's easier to manage and execute multiple asynchronous operations in parallel and wait for all of them to complete before continuing.

_To show you what I mean.._

Four promises are created using the `new Promise()` syntax. Each promise is **resolved** or **rejected** after a certain timeout period using `setTimeout()` method. The `error` function is defined to log any error to the console.

[![promises](https://res.cloudinary.com/practicaldev/image/fetch/s--5pnhAPgk--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/fakehvgquqencbnvhkjm.png)](https://res.cloudinary.com/practicaldev/image/fetch/s--5pnhAPgk--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/fakehvgquqencbnvhkjm.png)

After creating above promises, now we will see instances of using different Promise methods.

> Promise.all() method

Below instance uses `Promise.all()` method which takes an array of promises and **waits for all promises to be fulfilled**. Once all the promises are resolved, `then()` method is executed which returns an array of values in the order they were passed in the promise array. In this case, all three promises are resolved and their values are logged to the console.

This is great way to, e.g. fetch data using two different requests, and then combine them once both requests complete.

[![Promise.all() method](https://res.cloudinary.com/practicaldev/image/fetch/s--RRGxNKFs--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/vcq9gqdnvkzq41nmb8p0.png)](https://res.cloudinary.com/practicaldev/image/fetch/s--RRGxNKFs--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/vcq9gqdnvkzq41nmb8p0.png)

> Promise.any() method

Below instance uses `Promise.any()` method which takes an array of promises and **waits for any one of them to be fulfilled**. Once the first promise is resolved, `then()` method is executed which returns the resolved value of the first promise. In this case, the third promise is resolved before the other two and its value is logged to the console.

[![Below instance uses](https://res.cloudinary.com/practicaldev/image/fetch/s--lB3twUav--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/ankut5q687ju2g1swc7p.png)](https://res.cloudinary.com/practicaldev/image/fetch/s--lB3twUav--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/ankut5q687ju2g1swc7p.png)

> Promise.race() method

Below instance uses `Promise.race()` method which takes an array of promises and **waits for the first promise to be either resolved or rejected**. Once the first promise is settled, `then()` method is executed which returns the resolved or rejected value of the first settled promise. In this case, the third promise is resolved before the other two, so its value is logged to the console.

[![Promise.race() method](https://res.cloudinary.com/practicaldev/image/fetch/s--AvmIoefY--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/6yhm50ihfeejn4r4jey2.png)](https://res.cloudinary.com/practicaldev/image/fetch/s--AvmIoefY--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/6yhm50ihfeejn4r4jey2.png)

> Promise.allSettled() method

Below instance uses `Promise.allSettled()` method which takes an array of promises and **waits for all promises to be settled, i.e., either resolved or rejected**. Once all promises are settled, `then()` method is executed which returns an array of objects, each object containing the **status** and **value** or **reason** of each promise. In this case, all promises are settled, so the status and values or reasons of all promises are logged to the console.

[![Promise.allSettled() method](https://res.cloudinary.com/practicaldev/image/fetch/s--suMcvKgl--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/v3ui93rr5cgv6nef4rx8.png)](https://res.cloudinary.com/practicaldev/image/fetch/s--suMcvKgl--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_800/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/v3ui93rr5cgv6nef4rx8.png)

---

## [](https://dev.to/codeofrelevancy/all-about-promises-in-javascript-39lj#conclusion)**Conclusion**

The Fetch API is a modern replacement for the older XMLHttpRequest object, and it is based on Promises. When you make a request with the Fetch API, you get back a Promise that resolves to the response object. This allows you to use the `then()` method to handle the response in a clean and readable way.

Async Functions are a newer addition to JavaScript, and they are built on top of Promises. Async Functions allow you to write asynchronous code that looks like synchronous code, making it easier to read and write. Async Functions use the await keyword to wait for Promises to resolve before continuing, making it possible to write asynchronous code that looks like a sequence of synchronous statements.

In both of these idioms, Promises are used to handle asynchronous operations in a clean and readable way. By using Promises, you can avoid callback hell and write asynchronous code that is easy to reason about..
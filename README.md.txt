# Sequential Execution of Threads

In scenarios where sequential execution across multiple threads is critical, the `join()` method in Java comes to the rescue. Here we have three threads T1, T2, and T3. T2 needs to run only after T1 completes, and T3 after T2.

## How it Works

The `join()` method blocks the current thread until the targeted thread completes. 

By calling `T1.join()`, `T2` will only start after `T1` has finished. Similarly, `T3` will only start once `T2` completes.

The result is a clean execution order: `T1 ➔ T2 ➔ T3`. This ensures tasks are executed in the correct sequence.

## Use Case: Order Processing in E-Commerce Systems

### Scenario

In an e-commerce system, when a customer places an order, multiple services (inventory, payment, shipping) need to process the order. However, these steps must occur in a specific sequential order to avoid issues such as:

- Charging the customer without verifying inventory.
- Shipping items before payment.

By utilizing the `join()` method to enforce the order of execution, we can ensure these operations occur in the correct sequence, providing a reliable and efficient processing flow for customer orders.

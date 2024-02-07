package com.kenzie.examples.week26.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CartCheckout {
    private final PaymentService paymentService;
    private final DistroService distroService;
    private final AmazonUser user;
    public CartCheckout(AmazonUser user, PaymentService paymentService, DistroService distroService) {
        this.user = user;
        this.paymentService = paymentService;
        this.distroService = distroService;
    }
    /**
     * Called when user goes to complete checkout for an order.
     * @return Boolean whether all checkout tasks completed successfully
     * @throws ExecutionException if calling get() throws an exception.
     * @throws InterruptedException if this thread was interrupted while waiting.
     */
    public Boolean checkout() throws ExecutionException, InterruptedException {
        ExecutorService cartExecutor = Executors.newCachedThreadPool();
        List<Future<Boolean>> networkCallResults = new ArrayList<>();
        networkCallResults.add(
                cartExecutor.submit(() -> paymentService.cardApproved(user.cardNum)));
        networkCallResults.add(
                cartExecutor.submit(() -> distroService.newOrderSubmitted(user.address)));

        cartExecutor.shutdown();
        boolean checkoutSuccessful = true;
        for (Future<Boolean> result : networkCallResults) {
            if (!result.get()) {
                checkoutSuccessful = false;
            }
        }
        return checkoutSuccessful;
    }
    public static void main(String[] args){
        CartCheckout cart = new CartCheckout(null,null,null);
        try {
            boolean success  = cart.checkout();
            if(success){
                System.out.println("Cart Checked out successfully");
            } else {
                System.out.println("Not Checked out");

            }
        } catch (ExecutionException e) {
            e.printStackTrace();
            System.out.println("Not Checked out");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Not Checked out");
        }
    }
}
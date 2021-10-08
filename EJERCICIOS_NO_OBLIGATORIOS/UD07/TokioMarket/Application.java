package com.tokioschool.tokiomarket;

import com.tokioschool.tokiomarket.domain.Customer;
import com.tokioschool.tokiomarket.domain.GoldCustomer;
import com.tokioschool.tokiomarket.domain.SuperCustomer;
import com.tokioschool.tokiomarket.domain.Worker;

public class Application {
    public static void main(String args[]) {
        Customer customer = new SuperCustomer();
        ((SuperCustomer) customer).send();
    }
}

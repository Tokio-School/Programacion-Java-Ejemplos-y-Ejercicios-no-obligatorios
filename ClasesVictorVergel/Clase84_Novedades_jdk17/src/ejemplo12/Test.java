package ejemplo12;

import java.util.concurrent.atomic.AtomicInteger;

class Test {
	volatile int x = 1;
	AtomicInteger xObj = new AtomicInteger(1);
}



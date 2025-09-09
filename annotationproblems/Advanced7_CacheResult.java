package annotationproblems;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult {}

class ExpensiveService {
    private Map<Integer, Integer> cache = new HashMap<>();
    @CacheResult
    public int compute(int x) {
        if (cache.containsKey(x)) {
            return cache.get(x);
        }
        int result = x * x;
        cache.put(x, result);
        return result;
    }
}

public class Advanced7_CacheResult {
    public static void main(String[] args) throws Exception {
        ExpensiveService service = new ExpensiveService();
        Method m = ExpensiveService.class.getMethod("compute", int.class);
        System.out.println(m.invoke(service, 5));
        System.out.println(m.invoke(service, 5)); // Cached
    }
}
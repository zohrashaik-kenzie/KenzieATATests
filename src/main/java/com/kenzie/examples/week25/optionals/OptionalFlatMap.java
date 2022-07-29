package com.kenzie.examples.week25.optionals;

import com.google.common.base.Function;

import java.util.Optional;

public class OptionalFlatMap {
    public static void main(String[] args) {
        /*
         * flatMap() - This method is similar to map(Function),
         * but the provided mapper is one whose result is already an Optional, and if invoked,
         * flatMap does not wrap it with an additional Optional.
         * */
        /*----------------------------------------------------------*/
        Optional<Optional> optionalContainer = Optional.of(Optional.of("SEBD Advanced ATA Term 4"));
        Optional<Optional> emptyOptionalContainer = Optional.of(Optional.empty());

        Function<String, String> function = s -> s.substring(0, 0).length() == 0 ? null : s;
        Function<String, String> function2 = s -> s.substring(0, 4);

        System.out.println(optionalContainer.map(optional -> optional.map(function2)));
        System.out.println(optionalContainer.flatMap(optional -> optional.map(function2))); // SEBD

        System.out.println(emptyOptionalContainer.flatMap(optional -> optional.map(function)));
        System.out.println(emptyOptionalContainer.map(optional -> optional.map(function)));

    }
}

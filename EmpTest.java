package com.stream.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpTest {

	public static void main(String[] args) {
		List<Emp> list = Arrays.asList(new Emp(22, "ravi", 27, "male", 94000), new Emp(12, "kavi", 27, "male", 50000),
				new Emp(2, "manu", 24, "male", 44000), new Emp(1, "kula", 27, "male", 145000));
		// list.stream().sorted((e1,e2) ->
		// e1.getId()-e2.getId()).forEach(System.out::println);
		
		long startt = System.currentTimeMillis();

		list.stream().sorted((e1, e2) -> -e1.name.compareTo(e1.name)).forEach(System.out::println);
		long endd = System.currentTimeMillis();
		System.out.println(endd-startt);
		// paraller stream

		long start = System.currentTimeMillis();

		List<Emp> pps = list.parallelStream().sorted((e1, e2) -> -e1.name.compareTo(e1.name))
				.collect(Collectors.toList());
		System.out.println(pps);
		long end = System.currentTimeMillis();

		System.out.println(end-start);

	}

}

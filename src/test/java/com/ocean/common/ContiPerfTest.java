package com.ocean.common;
import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;

import com.ocean.common.uid.Sequence;

/**

 * 性能测试

 * 

 * @author ocean

 */
public class ContiPerfTest {
	
	@Rule
	public ContiPerfRule i = new ContiPerfRule();

	Sequence sequence = new Sequence(0, 0);
	
	@Test
	@PerfTest(invocations = 200000000, threads = 16)
	public void test1() throws Exception {
		sequence.nextId();
	}

}
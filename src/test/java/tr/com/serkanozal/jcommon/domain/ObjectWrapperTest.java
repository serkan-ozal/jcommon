/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tr.com.serkanozal.jcommon.domain;

import junit.framework.Assert;

import org.junit.Test;

import tr.com.serkanozal.jcommon.domain.model.ObjectWrapper;

/**
 * @author Serkan ÖZAL
 */
public class ObjectWrapperTest {

	@Test
	public void objectGotAndSetSuccessfully() {
		Integer i = new Integer(1);
		ObjectWrapper<Integer> iWrapper = new ObjectWrapper<Integer>();
		iWrapper.set(i);
		Assert.assertEquals(i, iWrapper.get());
	}
	
	@Test
	public void toStringReturnedSuccessfullyForNotNullObject() {
		ObjectWrapper<Object> oWrapper = 
				new ObjectWrapper<Object>(
						new Object() {
							@Override
							public String toString() {
								return "I am an integer";
							}	
						});
		Assert.assertEquals("I am an integer", oWrapper.toString());
	}
	
	@Test
	public void toStringReturnedSuccessfullyForNullObject() {
		ObjectWrapper<Object> oWrapper = new ObjectWrapper<Object>(null);
		Assert.assertEquals("null", oWrapper.toString());
	}
	
}

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

package tr.com.serkanozal.jcommon.util;

import java.io.FileNotFoundException;

import junit.framework.Assert;

import org.junit.Test;

/**
 * @author Serkan ÖZAL
 */
public class IoUtilTest {

	private static final String TEST_RESOURCE_FILE_PATH = "testResource.txt";
	
	@Test
	public void resourceAsStreamGotSuccessfully() {
		Assert.assertNotNull(IoUtil.getResourceAsStream(TEST_RESOURCE_FILE_PATH));
	}
	
	@Test
	public void resourceAsFileGotSuccessfully() {
		Assert.assertTrue(IoUtil.getResourceAsFile(TEST_RESOURCE_FILE_PATH).exists());
	}
	
	@Test
	public void contentOfInputStreamGotSuccessfully() throws FileNotFoundException {
		Assert.assertEquals(
				"This is test resource", 
				IoUtil.getContentOfInputStream(getClass().getClassLoader().getResourceAsStream(TEST_RESOURCE_FILE_PATH)));
	}
	
}

/*
 * Copyright (c) 2010 Jeff Schnitzer.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.googlecode.batchfb.test.util;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.googlecode.batchfb.Batcher;
import com.googlecode.batchfb.FacebookBatcher;


/**
 * Some simple tools common to all tests
 * 
 * @author Jeff Schnitzer
 */
public class TestBase {
	
	/** This should be set on the command line with a -DaccessToken=BLAH argument */
	protected static final String ACCESS_TOKEN = System.getProperty("accessToken");
	
	/** */
	protected Batcher authBatcher;

	@BeforeMethod
	public void setUp() throws Exception {
		this.authBatcher = new FacebookBatcher(ACCESS_TOKEN);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		this.authBatcher = null;
	}
}
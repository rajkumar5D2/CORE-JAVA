Duke!
log
graph
tags
branches
changeset
browse
file
latest
diff
comparison
annotate
file log
raw
help
OpenJDK / jdk7 / jdk7 / jdk
view src/share/classes/java/lang/Object.java @ 4338:9b8c96f96a0f

Added tag jdk7-b147 for changeset f097ca2434b1
author	schien
date	Mon, 27 Jun 2011 13:21:34 -0700 (2011-06-27)
parents	a06412e13bf7
children	
line wrap: on
 line source
/*
 * Copyright (c) 1994, 2010, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.lang;

/**
 * Class {@code Object} is the root of the class hierarchy.
 * Every class has {@code Object} as a superclass. All objects,
 * including arrays, implement the methods of this class.
 *
 * @author  unascribed
 * @see     java.lang.Class
 * @since   JDK1.0
 */
public class Object {

	//1-------------
    private static native void registerNatives();
    static {
        registerNatives();
    }

	//2------------
    public final native Class<?> getClass();

	//3------------
    public native int hashCode();

	//4------------
    public boolean equals(Object obj) {
        return (this == obj);
    }

	//5------------
    protected native Object clone() throws CloneNotSupportedException;

	//6------------
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

	//7------------
    public final native void notify();

	//8------------
    public final native void notifyAll();

	//9------------
    public final native void wait(long timeout) throws InterruptedException;

	//10-----------
    public final void wait(long timeout, int nanos) throws InterruptedException {
        if (timeout < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }

        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                                "nanosecond timeout value out of range");
        }

        if (nanos >= 500000 || (nanos != 0 && timeout == 0)) {
            timeout++;
        }

        wait(timeout);
    }

	//11-----------
    public final void wait() throws InterruptedException {
        wait(0);
    }

	//12----------
    protected void finalize() throws Throwable { }
}

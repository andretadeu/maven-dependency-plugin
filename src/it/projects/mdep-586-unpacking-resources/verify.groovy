/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

File file = new File( basedir, "build.log" );
assert file.exists();

try
{
    File file1 = new File( basedir, "resources1/resource1.txt" )
    if ( !file1.exists() || !file1.isFile() )
    {
        println( "Error: cannot open file resources1/resource1.txt" )
        return false
    }
    File file2 = new File( basedir, "resources2/resource2.txt" )
    if ( !file2.exists() || !file2.isFile() )
    {
        println( "Error: cannot open file resources2/resource2.txt" )
        return false
    }
}
catch ( Throwable e )
{
    e.printStackTrace()
    return false;
}


return true
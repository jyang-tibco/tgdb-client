/**
 * Copyright 2019 TIBCO Software Inc. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not use this file except 
 * in compliance with the License.
 * A copy of the License is included in the distribution package with this file.
 * You also may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p/>
 * File name : DecryptBufferRequest.${EXT}
 * Created on: 3/26/19
 * Created by: suresh 
 * <p/>
 * SVN Id: $Id: DecryptBufferRequest.java 3134 2019-04-25 23:44:21Z nimish $
 */

package com.tibco.tgdb.pdu.impl;

import com.tibco.tgdb.exception.TGException;
import com.tibco.tgdb.pdu.TGInputStream;
import com.tibco.tgdb.pdu.TGOutputStream;
import com.tibco.tgdb.pdu.VerbId;

import java.io.IOException;

public class DecryptBufferRequest extends AbstractProtocolMessage {

    private byte[] encryptedBuffer;

    public void setBuffer(byte[] buf)
    {
        this.encryptedBuffer = buf;
    }

    @Override
    protected void writePayload(TGOutputStream os) throws TGException, IOException {
        if (encryptedBuffer == null) throw new TGException("Encrypted Buffer is Null");
        os.writeBytes(encryptedBuffer);
    }

    @Override
    protected void readPayload(TGInputStream is) throws TGException, IOException {

    }

    @Override
    public boolean isUpdateable() {
        return false;
    }

    @Override
    public VerbId getVerbId() {
        return VerbId.DecryptBufferRequest;
    }

}

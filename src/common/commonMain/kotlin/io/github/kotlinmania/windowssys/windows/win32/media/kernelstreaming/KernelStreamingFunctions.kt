package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun ksCreateAllocator(connectionhandle: Handle, allocatorframing: COpaquePointer?, allocatorhandle: COpaquePointer?): UInt

public expect fun ksCreateAllocator2(connectionhandle: Handle, allocatorframing: COpaquePointer?, allocatorhandle: COpaquePointer?): Hresult

public expect fun ksCreateClock(connectionhandle: Handle, clockcreate: COpaquePointer?, clockhandle: COpaquePointer?): UInt

public expect fun ksCreateClock2(connectionhandle: Handle, clockcreate: COpaquePointer?, clockhandle: COpaquePointer?): Hresult

public expect fun ksCreatePin(filterhandle: Handle, connect: COpaquePointer?, desiredaccess: UInt, connectionhandle: COpaquePointer?): UInt

public expect fun ksCreatePin2(filterhandle: Handle, connect: COpaquePointer?, desiredaccess: UInt, connectionhandle: COpaquePointer?): Hresult

public expect fun ksCreateTopologyNode(parenthandle: Handle, nodecreate: COpaquePointer?, desiredaccess: UInt, nodehandle: COpaquePointer?): UInt

public expect fun ksCreateTopologyNode2(parenthandle: Handle, nodecreate: COpaquePointer?, desiredaccess: UInt, nodehandle: COpaquePointer?): Hresult

public expect fun ksGetMediaTypeCount(filterhandle: Handle, pinfactoryid: UInt, mediatypecount: COpaquePointer?): Hresult

public expect fun ksGetMultiplePinFactoryItems(filterhandle: Handle, pinfactoryid: UInt, propertyid: UInt, items: COpaquePointer?): Hresult

public expect fun ksOpenDefaultDevice(category: COpaquePointer?, access: UInt, devicehandle: COpaquePointer?): Hresult

public expect fun ksResolveRequiredAttributes(datarange: COpaquePointer?, attributes: COpaquePointer?): Hresult

public expect fun ksSynchronousDeviceControl(handle: Handle, iocontrol: UInt, inbuffer: COpaquePointer?, inlength: UInt, outbuffer: COpaquePointer?, outlength: UInt, bytesreturned: COpaquePointer?): Hresult

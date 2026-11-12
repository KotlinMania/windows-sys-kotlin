package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun ksCreateAllocator(connectionhandle: Handle, allocatorframing: ConstPtr, allocatorhandle: MutPtr): UInt

public expect fun ksCreateAllocator2(connectionhandle: Handle, allocatorframing: ConstPtr, allocatorhandle: MutPtr): Hresult

public expect fun ksCreateClock(connectionhandle: Handle, clockcreate: ConstPtr, clockhandle: MutPtr): UInt

public expect fun ksCreateClock2(connectionhandle: Handle, clockcreate: ConstPtr, clockhandle: MutPtr): Hresult

public expect fun ksCreatePin(filterhandle: Handle, connect: ConstPtr, desiredaccess: UInt, connectionhandle: MutPtr): UInt

public expect fun ksCreatePin2(filterhandle: Handle, connect: ConstPtr, desiredaccess: UInt, connectionhandle: MutPtr): Hresult

public expect fun ksCreateTopologyNode(parenthandle: Handle, nodecreate: ConstPtr, desiredaccess: UInt, nodehandle: MutPtr): UInt

public expect fun ksCreateTopologyNode2(parenthandle: Handle, nodecreate: ConstPtr, desiredaccess: UInt, nodehandle: MutPtr): Hresult

public expect fun ksGetMediaTypeCount(filterhandle: Handle, pinfactoryid: UInt, mediatypecount: MutPtr): Hresult

public expect fun ksGetMultiplePinFactoryItems(filterhandle: Handle, pinfactoryid: UInt, propertyid: UInt, items: MutPtr): Hresult

public expect fun ksOpenDefaultDevice(category: ConstPtr, access: UInt, devicehandle: MutPtr): Hresult

public expect fun ksResolveRequiredAttributes(datarange: ConstPtr, attributes: ConstPtr): Hresult

public expect fun ksSynchronousDeviceControl(handle: Handle, iocontrol: UInt, inbuffer: ConstPtr, inlength: UInt, outbuffer: MutPtr, outlength: UInt, bytesreturned: MutPtr): Hresult

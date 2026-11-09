package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun KsCreateAllocator(connectionhandle: HANDLE, allocatorframing: Long, allocatorhandle: Long): UInt

public expect fun KsCreateAllocator2(connectionhandle: HANDLE, allocatorframing: Long, allocatorhandle: Long): HRESULT

public expect fun KsCreateClock(connectionhandle: HANDLE, clockcreate: Long, clockhandle: Long): UInt

public expect fun KsCreateClock2(connectionhandle: HANDLE, clockcreate: Long, clockhandle: Long): HRESULT

public expect fun KsCreatePin(filterhandle: HANDLE, connect: Long, desiredaccess: UInt, connectionhandle: Long): UInt

public expect fun KsCreatePin2(filterhandle: HANDLE, connect: Long, desiredaccess: UInt, connectionhandle: Long): HRESULT

public expect fun KsCreateTopologyNode(parenthandle: HANDLE, nodecreate: Long, desiredaccess: UInt, nodehandle: Long): UInt

public expect fun KsCreateTopologyNode2(parenthandle: HANDLE, nodecreate: Long, desiredaccess: UInt, nodehandle: Long): HRESULT

public expect fun KsGetMediaTypeCount(filterhandle: HANDLE, pinfactoryid: UInt, mediatypecount: Long): HRESULT

public expect fun KsGetMultiplePinFactoryItems(filterhandle: HANDLE, pinfactoryid: UInt, propertyid: UInt, items: Long): HRESULT

public expect fun KsOpenDefaultDevice(category: Long, access: UInt, devicehandle: Long): HRESULT

public expect fun KsResolveRequiredAttributes(datarange: Long, attributes: Long): HRESULT

public expect fun KsSynchronousDeviceControl(handle: HANDLE, iocontrol: UInt, inbuffer: Long, inlength: UInt, outbuffer: Long, outlength: UInt, bytesreturned: Long): HRESULT

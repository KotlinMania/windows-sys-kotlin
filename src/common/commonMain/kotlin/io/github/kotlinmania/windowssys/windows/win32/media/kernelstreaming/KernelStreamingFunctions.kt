package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT

public fun KsCreateAllocator(connectionhandle: Foundation.HANDLE, allocatorframing: Long, allocatorhandle: Long): UInt {
    return Win32DynamicFfi.invoke("ksuser.dll", "KsCreateAllocator", longArrayOf(Win32DynamicFfi.objectSlot(connectionhandle), allocatorframing, allocatorhandle)).toUInt()
}

public fun KsCreateAllocator2(connectionhandle: Foundation.HANDLE, allocatorframing: Long, allocatorhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksuser.dll", "KsCreateAllocator2", longArrayOf(Win32DynamicFfi.objectSlot(connectionhandle), allocatorframing, allocatorhandle)).toInt()
}

public fun KsCreateClock(connectionhandle: Foundation.HANDLE, clockcreate: Long, clockhandle: Long): UInt {
    return Win32DynamicFfi.invoke("ksuser.dll", "KsCreateClock", longArrayOf(Win32DynamicFfi.objectSlot(connectionhandle), clockcreate, clockhandle)).toUInt()
}

public fun KsCreateClock2(connectionhandle: Foundation.HANDLE, clockcreate: Long, clockhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksuser.dll", "KsCreateClock2", longArrayOf(Win32DynamicFfi.objectSlot(connectionhandle), clockcreate, clockhandle)).toInt()
}

public fun KsCreatePin(filterhandle: Foundation.HANDLE, connect: Long, desiredaccess: UInt, connectionhandle: Long): UInt {
    return Win32DynamicFfi.invoke("ksuser.dll", "KsCreatePin", longArrayOf(Win32DynamicFfi.objectSlot(filterhandle), connect, desiredaccess.toLong(), connectionhandle)).toUInt()
}

public fun KsCreatePin2(filterhandle: Foundation.HANDLE, connect: Long, desiredaccess: UInt, connectionhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksuser.dll", "KsCreatePin2", longArrayOf(Win32DynamicFfi.objectSlot(filterhandle), connect, desiredaccess.toLong(), connectionhandle)).toInt()
}

public fun KsCreateTopologyNode(parenthandle: Foundation.HANDLE, nodecreate: Long, desiredaccess: UInt, nodehandle: Long): UInt {
    return Win32DynamicFfi.invoke("ksuser.dll", "KsCreateTopologyNode", longArrayOf(Win32DynamicFfi.objectSlot(parenthandle), nodecreate, desiredaccess.toLong(), nodehandle)).toUInt()
}

public fun KsCreateTopologyNode2(parenthandle: Foundation.HANDLE, nodecreate: Long, desiredaccess: UInt, nodehandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksuser.dll", "KsCreateTopologyNode2", longArrayOf(Win32DynamicFfi.objectSlot(parenthandle), nodecreate, desiredaccess.toLong(), nodehandle)).toInt()
}

public fun KsGetMediaTypeCount(filterhandle: Foundation.HANDLE, pinfactoryid: UInt, mediatypecount: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksproxy.ax", "KsGetMediaTypeCount", longArrayOf(Win32DynamicFfi.objectSlot(filterhandle), pinfactoryid.toLong(), mediatypecount)).toInt()
}

public fun KsGetMultiplePinFactoryItems(filterhandle: Foundation.HANDLE, pinfactoryid: UInt, propertyid: UInt, items: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksproxy.ax", "KsGetMultiplePinFactoryItems", longArrayOf(Win32DynamicFfi.objectSlot(filterhandle), pinfactoryid.toLong(), propertyid.toLong(), items)).toInt()
}

public fun KsOpenDefaultDevice(category: Long, access: UInt, devicehandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksproxy.ax", "KsOpenDefaultDevice", longArrayOf(category, access.toLong(), devicehandle)).toInt()
}

public fun KsResolveRequiredAttributes(datarange: Long, attributes: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksproxy.ax", "KsResolveRequiredAttributes", longArrayOf(datarange, attributes)).toInt()
}

public fun KsSynchronousDeviceControl(handle: Foundation.HANDLE, iocontrol: UInt, inbuffer: Long, inlength: UInt, outbuffer: Long, outlength: UInt, bytesreturned: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksproxy.ax", "KsSynchronousDeviceControl", longArrayOf(Win32DynamicFfi.objectSlot(handle), iocontrol.toLong(), inbuffer, inlength.toLong(), outbuffer, outlength.toLong(), bytesreturned)).toInt()
}

package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun KsCreateAllocator(connectionhandle: HANDLE, allocatorframing: Long, allocatorhandle: Long): UInt {
    return Win32DynamicFfi.invoke("ksuser.dll", "KsCreateAllocator", longArrayOf(connectionhandle, allocatorframing, allocatorhandle)).toUInt()
}

public fun KsCreateAllocator2(connectionhandle: HANDLE, allocatorframing: Long, allocatorhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksuser.dll", "KsCreateAllocator2", longArrayOf(connectionhandle, allocatorframing, allocatorhandle)).toInt()
}

public fun KsCreateClock(connectionhandle: HANDLE, clockcreate: Long, clockhandle: Long): UInt {
    return Win32DynamicFfi.invoke("ksuser.dll", "KsCreateClock", longArrayOf(connectionhandle, clockcreate, clockhandle)).toUInt()
}

public fun KsCreateClock2(connectionhandle: HANDLE, clockcreate: Long, clockhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksuser.dll", "KsCreateClock2", longArrayOf(connectionhandle, clockcreate, clockhandle)).toInt()
}

public fun KsCreatePin(filterhandle: HANDLE, connect: Long, desiredaccess: UInt, connectionhandle: Long): UInt {
    return Win32DynamicFfi.invoke("ksuser.dll", "KsCreatePin", longArrayOf(filterhandle, connect, desiredaccess.toLong(), connectionhandle)).toUInt()
}

public fun KsCreatePin2(filterhandle: HANDLE, connect: Long, desiredaccess: UInt, connectionhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksuser.dll", "KsCreatePin2", longArrayOf(filterhandle, connect, desiredaccess.toLong(), connectionhandle)).toInt()
}

public fun KsCreateTopologyNode(parenthandle: HANDLE, nodecreate: Long, desiredaccess: UInt, nodehandle: Long): UInt {
    return Win32DynamicFfi.invoke("ksuser.dll", "KsCreateTopologyNode", longArrayOf(parenthandle, nodecreate, desiredaccess.toLong(), nodehandle)).toUInt()
}

public fun KsCreateTopologyNode2(parenthandle: HANDLE, nodecreate: Long, desiredaccess: UInt, nodehandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksuser.dll", "KsCreateTopologyNode2", longArrayOf(parenthandle, nodecreate, desiredaccess.toLong(), nodehandle)).toInt()
}

public fun KsGetMediaTypeCount(filterhandle: HANDLE, pinfactoryid: UInt, mediatypecount: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksproxy.ax", "KsGetMediaTypeCount", longArrayOf(filterhandle, pinfactoryid.toLong(), mediatypecount)).toInt()
}

public fun KsGetMultiplePinFactoryItems(filterhandle: HANDLE, pinfactoryid: UInt, propertyid: UInt, items: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksproxy.ax", "KsGetMultiplePinFactoryItems", longArrayOf(filterhandle, pinfactoryid.toLong(), propertyid.toLong(), items)).toInt()
}

public fun KsOpenDefaultDevice(category: Long, access: UInt, devicehandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksproxy.ax", "KsOpenDefaultDevice", longArrayOf(category, access.toLong(), devicehandle)).toInt()
}

public fun KsResolveRequiredAttributes(datarange: Long, attributes: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksproxy.ax", "KsResolveRequiredAttributes", longArrayOf(datarange, attributes)).toInt()
}

public fun KsSynchronousDeviceControl(handle: HANDLE, iocontrol: UInt, inbuffer: Long, inlength: UInt, outbuffer: Long, outlength: UInt, bytesreturned: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksproxy.ax", "KsSynchronousDeviceControl", longArrayOf(handle, iocontrol.toLong(), inbuffer, inlength.toLong(), outbuffer, outlength.toLong(), bytesreturned)).toInt()
}

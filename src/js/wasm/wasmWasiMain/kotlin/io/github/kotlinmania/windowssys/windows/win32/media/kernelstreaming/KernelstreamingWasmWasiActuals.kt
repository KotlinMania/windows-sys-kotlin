@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun KsCreateAllocator(connectionhandle: HANDLE, allocatorframing: Long, allocatorhandle: Long): UInt =
    0u

public actual fun KsCreateAllocator2(connectionhandle: HANDLE, allocatorframing: Long, allocatorhandle: Long): HRESULT =
    0

public actual fun KsCreateClock(connectionhandle: HANDLE, clockcreate: Long, clockhandle: Long): UInt =
    0u

public actual fun KsCreateClock2(connectionhandle: HANDLE, clockcreate: Long, clockhandle: Long): HRESULT =
    0

public actual fun KsCreatePin(filterhandle: HANDLE, connect: Long, desiredaccess: UInt, connectionhandle: Long): UInt =
    0u

public actual fun KsCreatePin2(filterhandle: HANDLE, connect: Long, desiredaccess: UInt, connectionhandle: Long): HRESULT =
    0

public actual fun KsCreateTopologyNode(parenthandle: HANDLE, nodecreate: Long, desiredaccess: UInt, nodehandle: Long): UInt =
    0u

public actual fun KsCreateTopologyNode2(parenthandle: HANDLE, nodecreate: Long, desiredaccess: UInt, nodehandle: Long): HRESULT =
    0

public actual fun KsGetMediaTypeCount(filterhandle: HANDLE, pinfactoryid: UInt, mediatypecount: Long): HRESULT =
    0

public actual fun KsGetMultiplePinFactoryItems(filterhandle: HANDLE, pinfactoryid: UInt, propertyid: UInt, items: Long): HRESULT =
    0

public actual fun KsOpenDefaultDevice(category: Long, access: UInt, devicehandle: Long): HRESULT =
    0

public actual fun KsResolveRequiredAttributes(datarange: Long, attributes: Long): HRESULT =
    0

public actual fun KsSynchronousDeviceControl(handle: HANDLE, iocontrol: UInt, inbuffer: Long, inlength: UInt, outbuffer: Long, outlength: UInt, bytesreturned: Long): HRESULT =
    0

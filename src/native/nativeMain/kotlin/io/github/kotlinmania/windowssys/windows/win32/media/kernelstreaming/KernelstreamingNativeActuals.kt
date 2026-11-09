@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun KsCreateAllocator(connectionhandle: HANDLE, allocatorframing: Long, allocatorhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_KsCreateAllocator(connectionhandle.toCPointer<ByteVar>(), allocatorframing.toCPointer<ByteVar>(), allocatorhandle.toCPointer<ByteVar>())

public actual fun KsCreateAllocator2(connectionhandle: HANDLE, allocatorframing: Long, allocatorhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_KsCreateAllocator2(connectionhandle.toCPointer<ByteVar>(), allocatorframing.toCPointer<ByteVar>(), allocatorhandle.toCPointer<ByteVar>())

public actual fun KsCreateClock(connectionhandle: HANDLE, clockcreate: Long, clockhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_KsCreateClock(connectionhandle.toCPointer<ByteVar>(), clockcreate.toCPointer<ByteVar>(), clockhandle.toCPointer<ByteVar>())

public actual fun KsCreateClock2(connectionhandle: HANDLE, clockcreate: Long, clockhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_KsCreateClock2(connectionhandle.toCPointer<ByteVar>(), clockcreate.toCPointer<ByteVar>(), clockhandle.toCPointer<ByteVar>())

public actual fun KsCreatePin(filterhandle: HANDLE, connect: Long, desiredaccess: UInt, connectionhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_KsCreatePin(filterhandle.toCPointer<ByteVar>(), connect.toCPointer<ByteVar>(), desiredaccess, connectionhandle.toCPointer<ByteVar>())

public actual fun KsCreatePin2(filterhandle: HANDLE, connect: Long, desiredaccess: UInt, connectionhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_KsCreatePin2(filterhandle.toCPointer<ByteVar>(), connect.toCPointer<ByteVar>(), desiredaccess, connectionhandle.toCPointer<ByteVar>())

public actual fun KsCreateTopologyNode(parenthandle: HANDLE, nodecreate: Long, desiredaccess: UInt, nodehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_KsCreateTopologyNode(parenthandle.toCPointer<ByteVar>(), nodecreate.toCPointer<ByteVar>(), desiredaccess, nodehandle.toCPointer<ByteVar>())

public actual fun KsCreateTopologyNode2(parenthandle: HANDLE, nodecreate: Long, desiredaccess: UInt, nodehandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_KsCreateTopologyNode2(parenthandle.toCPointer<ByteVar>(), nodecreate.toCPointer<ByteVar>(), desiredaccess, nodehandle.toCPointer<ByteVar>())

public actual fun KsGetMediaTypeCount(filterhandle: HANDLE, pinfactoryid: UInt, mediatypecount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_KsGetMediaTypeCount(filterhandle.toCPointer<ByteVar>(), pinfactoryid, mediatypecount.toCPointer<ByteVar>())

public actual fun KsGetMultiplePinFactoryItems(filterhandle: HANDLE, pinfactoryid: UInt, propertyid: UInt, items: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_KsGetMultiplePinFactoryItems(filterhandle.toCPointer<ByteVar>(), pinfactoryid, propertyid, items.toCPointer<ByteVar>())

public actual fun KsOpenDefaultDevice(category: Long, access: UInt, devicehandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_KsOpenDefaultDevice(category.toCPointer<ByteVar>(), access, devicehandle.toCPointer<ByteVar>())

public actual fun KsResolveRequiredAttributes(datarange: Long, attributes: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_KsResolveRequiredAttributes(datarange.toCPointer<ByteVar>(), attributes.toCPointer<ByteVar>())

public actual fun KsSynchronousDeviceControl(handle: HANDLE, iocontrol: UInt, inbuffer: Long, inlength: UInt, outbuffer: Long, outlength: UInt, bytesreturned: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_KsSynchronousDeviceControl(handle.toCPointer<ByteVar>(), iocontrol, inbuffer.toCPointer<ByteVar>(), inlength, outbuffer.toCPointer<ByteVar>(), outlength, bytesreturned.toCPointer<ByteVar>())

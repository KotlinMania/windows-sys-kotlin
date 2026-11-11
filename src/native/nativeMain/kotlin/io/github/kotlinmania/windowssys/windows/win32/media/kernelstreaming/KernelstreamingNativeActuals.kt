@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_ksCreateAllocator
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_ksCreateAllocator2
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_ksCreateClock
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_ksCreateClock2
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_ksCreatePin
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_ksCreatePin2
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_ksCreateTopologyNode
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_ksCreateTopologyNode2
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_ksGetMediaTypeCount
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_ksGetMultiplePinFactoryItems
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_ksOpenDefaultDevice
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_ksResolveRequiredAttributes
import io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming.cinterop.windowssys_windows_win32_media_kernelstreaming_ksSynchronousDeviceControl
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ksCreateAllocator(connectionhandle: Handle, allocatorframing: COpaquePointer?, allocatorhandle: COpaquePointer?): UInt =
    windowssys_windows_win32_media_kernelstreaming_ksCreateAllocator(connectionhandle?.value?.toCPointer<ByteVar>(), allocatorframing?.value?.toCPointer<ByteVar>(), allocatorhandle?.value?.toCPointer<ByteVar>())

public actual fun ksCreateAllocator2(connectionhandle: Handle, allocatorframing: COpaquePointer?, allocatorhandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_kernelstreaming_ksCreateAllocator2(connectionhandle?.value?.toCPointer<ByteVar>(), allocatorframing?.value?.toCPointer<ByteVar>(), allocatorhandle?.value?.toCPointer<ByteVar>())

public actual fun ksCreateClock(connectionhandle: Handle, clockcreate: COpaquePointer?, clockhandle: COpaquePointer?): UInt =
    windowssys_windows_win32_media_kernelstreaming_ksCreateClock(connectionhandle?.value?.toCPointer<ByteVar>(), clockcreate?.value?.toCPointer<ByteVar>(), clockhandle?.value?.toCPointer<ByteVar>())

public actual fun ksCreateClock2(connectionhandle: Handle, clockcreate: COpaquePointer?, clockhandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_kernelstreaming_ksCreateClock2(connectionhandle?.value?.toCPointer<ByteVar>(), clockcreate?.value?.toCPointer<ByteVar>(), clockhandle?.value?.toCPointer<ByteVar>())

public actual fun ksCreatePin(filterhandle: Handle, connect: COpaquePointer?, desiredaccess: UInt, connectionhandle: COpaquePointer?): UInt =
    windowssys_windows_win32_media_kernelstreaming_ksCreatePin(filterhandle?.value?.toCPointer<ByteVar>(), connect?.value?.toCPointer<ByteVar>(), desiredaccess, connectionhandle?.value?.toCPointer<ByteVar>())

public actual fun ksCreatePin2(filterhandle: Handle, connect: COpaquePointer?, desiredaccess: UInt, connectionhandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_kernelstreaming_ksCreatePin2(filterhandle?.value?.toCPointer<ByteVar>(), connect?.value?.toCPointer<ByteVar>(), desiredaccess, connectionhandle?.value?.toCPointer<ByteVar>())

public actual fun ksCreateTopologyNode(parenthandle: Handle, nodecreate: COpaquePointer?, desiredaccess: UInt, nodehandle: COpaquePointer?): UInt =
    windowssys_windows_win32_media_kernelstreaming_ksCreateTopologyNode(parenthandle?.value?.toCPointer<ByteVar>(), nodecreate?.value?.toCPointer<ByteVar>(), desiredaccess, nodehandle?.value?.toCPointer<ByteVar>())

public actual fun ksCreateTopologyNode2(parenthandle: Handle, nodecreate: COpaquePointer?, desiredaccess: UInt, nodehandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_kernelstreaming_ksCreateTopologyNode2(parenthandle?.value?.toCPointer<ByteVar>(), nodecreate?.value?.toCPointer<ByteVar>(), desiredaccess, nodehandle?.value?.toCPointer<ByteVar>())

public actual fun ksGetMediaTypeCount(filterhandle: Handle, pinfactoryid: UInt, mediatypecount: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_kernelstreaming_ksGetMediaTypeCount(filterhandle?.value?.toCPointer<ByteVar>(), pinfactoryid, mediatypecount?.value?.toCPointer<ByteVar>())

public actual fun ksGetMultiplePinFactoryItems(filterhandle: Handle, pinfactoryid: UInt, propertyid: UInt, items: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_kernelstreaming_ksGetMultiplePinFactoryItems(filterhandle?.value?.toCPointer<ByteVar>(), pinfactoryid, propertyid, items?.value?.toCPointer<ByteVar>())

public actual fun ksOpenDefaultDevice(category: COpaquePointer?, access: UInt, devicehandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_kernelstreaming_ksOpenDefaultDevice(category?.value?.toCPointer<ByteVar>(), access, devicehandle?.value?.toCPointer<ByteVar>())

public actual fun ksResolveRequiredAttributes(datarange: COpaquePointer?, attributes: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_kernelstreaming_ksResolveRequiredAttributes(datarange?.value?.toCPointer<ByteVar>(), attributes?.value?.toCPointer<ByteVar>())

public actual fun ksSynchronousDeviceControl(handle: Handle, iocontrol: UInt, inbuffer: COpaquePointer?, inlength: UInt, outbuffer: COpaquePointer?, outlength: UInt, bytesreturned: COpaquePointer?): Hresult =
    windowssys_windows_win32_media_kernelstreaming_ksSynchronousDeviceControl(handle?.value?.toCPointer<ByteVar>(), iocontrol, inbuffer?.value?.toCPointer<ByteVar>(), inlength, outbuffer?.value?.toCPointer<ByteVar>(), outlength, bytesreturned?.value?.toCPointer<ByteVar>())

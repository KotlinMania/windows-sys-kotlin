@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32MediaKernelstreamingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_ksCreateAllocator(connectionhandle: Long, allocatorframing: Long, allocatorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_ksCreateAllocator2(connectionhandle: Long, allocatorframing: Long, allocatorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_ksCreateClock(connectionhandle: Long, clockcreate: Long, clockhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_ksCreateClock2(connectionhandle: Long, clockcreate: Long, clockhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_ksCreatePin(filterhandle: Long, connect: Long, desiredaccess: Int, connectionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_ksCreatePin2(filterhandle: Long, connect: Long, desiredaccess: Int, connectionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_ksCreateTopologyNode(parenthandle: Long, nodecreate: Long, desiredaccess: Int, nodehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_ksCreateTopologyNode2(parenthandle: Long, nodecreate: Long, desiredaccess: Int, nodehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_ksGetMediaTypeCount(filterhandle: Long, pinfactoryid: Int, mediatypecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_ksGetMultiplePinFactoryItems(filterhandle: Long, pinfactoryid: Int, propertyid: Int, items: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_ksOpenDefaultDevice(category: Long, access: Int, devicehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_ksResolveRequiredAttributes(datarange: Long, attributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_ksSynchronousDeviceControl(handle: Long, iocontrol: Int, inbuffer: Long, inlength: Int, outbuffer: Long, outlength: Int, bytesreturned: Long): Int
}

public actual fun ksCreateAllocator(connectionhandle: Handle, allocatorframing: COpaquePointer?, allocatorhandle: COpaquePointer?): UInt =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_ksCreateAllocator((connectionhandle?.value ?: 0L), (allocatorframing?.value ?: 0L), (allocatorhandle?.value ?: 0L)).toUInt()

public actual fun ksCreateAllocator2(connectionhandle: Handle, allocatorframing: COpaquePointer?, allocatorhandle: COpaquePointer?): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_ksCreateAllocator2((connectionhandle?.value ?: 0L), (allocatorframing?.value ?: 0L), (allocatorhandle?.value ?: 0L))

public actual fun ksCreateClock(connectionhandle: Handle, clockcreate: COpaquePointer?, clockhandle: COpaquePointer?): UInt =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_ksCreateClock((connectionhandle?.value ?: 0L), (clockcreate?.value ?: 0L), (clockhandle?.value ?: 0L)).toUInt()

public actual fun ksCreateClock2(connectionhandle: Handle, clockcreate: COpaquePointer?, clockhandle: COpaquePointer?): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_ksCreateClock2((connectionhandle?.value ?: 0L), (clockcreate?.value ?: 0L), (clockhandle?.value ?: 0L))

public actual fun ksCreatePin(filterhandle: Handle, connect: COpaquePointer?, desiredaccess: UInt, connectionhandle: COpaquePointer?): UInt =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_ksCreatePin((filterhandle?.value ?: 0L), (connect?.value ?: 0L), desiredaccess.toInt(), (connectionhandle?.value ?: 0L)).toUInt()

public actual fun ksCreatePin2(filterhandle: Handle, connect: COpaquePointer?, desiredaccess: UInt, connectionhandle: COpaquePointer?): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_ksCreatePin2((filterhandle?.value ?: 0L), (connect?.value ?: 0L), desiredaccess.toInt(), (connectionhandle?.value ?: 0L))

public actual fun ksCreateTopologyNode(parenthandle: Handle, nodecreate: COpaquePointer?, desiredaccess: UInt, nodehandle: COpaquePointer?): UInt =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_ksCreateTopologyNode((parenthandle?.value ?: 0L), (nodecreate?.value ?: 0L), desiredaccess.toInt(), (nodehandle?.value ?: 0L)).toUInt()

public actual fun ksCreateTopologyNode2(parenthandle: Handle, nodecreate: COpaquePointer?, desiredaccess: UInt, nodehandle: COpaquePointer?): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_ksCreateTopologyNode2((parenthandle?.value ?: 0L), (nodecreate?.value ?: 0L), desiredaccess.toInt(), (nodehandle?.value ?: 0L))

public actual fun ksGetMediaTypeCount(filterhandle: Handle, pinfactoryid: UInt, mediatypecount: COpaquePointer?): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_ksGetMediaTypeCount((filterhandle?.value ?: 0L), pinfactoryid.toInt(), (mediatypecount?.value ?: 0L))

public actual fun ksGetMultiplePinFactoryItems(filterhandle: Handle, pinfactoryid: UInt, propertyid: UInt, items: COpaquePointer?): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_ksGetMultiplePinFactoryItems((filterhandle?.value ?: 0L), pinfactoryid.toInt(), propertyid.toInt(), (items?.value ?: 0L))

public actual fun ksOpenDefaultDevice(category: COpaquePointer?, access: UInt, devicehandle: COpaquePointer?): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_ksOpenDefaultDevice((category?.value ?: 0L), access.toInt(), (devicehandle?.value ?: 0L))

public actual fun ksResolveRequiredAttributes(datarange: COpaquePointer?, attributes: COpaquePointer?): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_ksResolveRequiredAttributes((datarange?.value ?: 0L), (attributes?.value ?: 0L))

public actual fun ksSynchronousDeviceControl(handle: Handle, iocontrol: UInt, inbuffer: COpaquePointer?, inlength: UInt, outbuffer: COpaquePointer?, outlength: UInt, bytesreturned: COpaquePointer?): Hresult =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_ksSynchronousDeviceControl((handle?.value ?: 0L), iocontrol.toInt(), (inbuffer?.value ?: 0L), inlength.toInt(), (outbuffer?.value ?: 0L), outlength.toInt(), (bytesreturned?.value ?: 0L))

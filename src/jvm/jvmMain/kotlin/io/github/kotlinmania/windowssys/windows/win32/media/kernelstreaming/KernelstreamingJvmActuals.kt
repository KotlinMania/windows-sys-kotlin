@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32MediaKernelstreamingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_KsCreateAllocator(connectionhandle: Long, allocatorframing: Long, allocatorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_KsCreateAllocator2(connectionhandle: Long, allocatorframing: Long, allocatorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_KsCreateClock(connectionhandle: Long, clockcreate: Long, clockhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_KsCreateClock2(connectionhandle: Long, clockcreate: Long, clockhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_KsCreatePin(filterhandle: Long, connect: Long, desiredaccess: Int, connectionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_KsCreatePin2(filterhandle: Long, connect: Long, desiredaccess: Int, connectionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_KsCreateTopologyNode(parenthandle: Long, nodecreate: Long, desiredaccess: Int, nodehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_KsCreateTopologyNode2(parenthandle: Long, nodecreate: Long, desiredaccess: Int, nodehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_KsGetMediaTypeCount(filterhandle: Long, pinfactoryid: Int, mediatypecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_KsGetMultiplePinFactoryItems(filterhandle: Long, pinfactoryid: Int, propertyid: Int, items: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_KsOpenDefaultDevice(category: Long, access: Int, devicehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_KsResolveRequiredAttributes(datarange: Long, attributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_media_kernelstreaming_KsSynchronousDeviceControl(handle: Long, iocontrol: Int, inbuffer: Long, inlength: Int, outbuffer: Long, outlength: Int, bytesreturned: Long): Int
}

public actual fun KsCreateAllocator(connectionhandle: HANDLE, allocatorframing: Long, allocatorhandle: Long): UInt =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_KsCreateAllocator(connectionhandle, allocatorframing, allocatorhandle).toUInt()

public actual fun KsCreateAllocator2(connectionhandle: HANDLE, allocatorframing: Long, allocatorhandle: Long): HRESULT =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_KsCreateAllocator2(connectionhandle, allocatorframing, allocatorhandle)

public actual fun KsCreateClock(connectionhandle: HANDLE, clockcreate: Long, clockhandle: Long): UInt =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_KsCreateClock(connectionhandle, clockcreate, clockhandle).toUInt()

public actual fun KsCreateClock2(connectionhandle: HANDLE, clockcreate: Long, clockhandle: Long): HRESULT =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_KsCreateClock2(connectionhandle, clockcreate, clockhandle)

public actual fun KsCreatePin(filterhandle: HANDLE, connect: Long, desiredaccess: UInt, connectionhandle: Long): UInt =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_KsCreatePin(filterhandle, connect, desiredaccess.toInt(), connectionhandle).toUInt()

public actual fun KsCreatePin2(filterhandle: HANDLE, connect: Long, desiredaccess: UInt, connectionhandle: Long): HRESULT =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_KsCreatePin2(filterhandle, connect, desiredaccess.toInt(), connectionhandle)

public actual fun KsCreateTopologyNode(parenthandle: HANDLE, nodecreate: Long, desiredaccess: UInt, nodehandle: Long): UInt =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_KsCreateTopologyNode(parenthandle, nodecreate, desiredaccess.toInt(), nodehandle).toUInt()

public actual fun KsCreateTopologyNode2(parenthandle: HANDLE, nodecreate: Long, desiredaccess: UInt, nodehandle: Long): HRESULT =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_KsCreateTopologyNode2(parenthandle, nodecreate, desiredaccess.toInt(), nodehandle)

public actual fun KsGetMediaTypeCount(filterhandle: HANDLE, pinfactoryid: UInt, mediatypecount: Long): HRESULT =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_KsGetMediaTypeCount(filterhandle, pinfactoryid.toInt(), mediatypecount)

public actual fun KsGetMultiplePinFactoryItems(filterhandle: HANDLE, pinfactoryid: UInt, propertyid: UInt, items: Long): HRESULT =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_KsGetMultiplePinFactoryItems(filterhandle, pinfactoryid.toInt(), propertyid.toInt(), items)

public actual fun KsOpenDefaultDevice(category: Long, access: UInt, devicehandle: Long): HRESULT =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_KsOpenDefaultDevice(category, access.toInt(), devicehandle)

public actual fun KsResolveRequiredAttributes(datarange: Long, attributes: Long): HRESULT =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_KsResolveRequiredAttributes(datarange, attributes)

public actual fun KsSynchronousDeviceControl(handle: HANDLE, iocontrol: UInt, inbuffer: Long, inlength: UInt, outbuffer: Long, outlength: UInt, bytesreturned: Long): HRESULT =
    WindowsWin32MediaKernelstreamingJniBridge.windowssys_windows_win32_media_kernelstreaming_KsSynchronousDeviceControl(handle, iocontrol.toInt(), inbuffer, inlength.toInt(), outbuffer, outlength.toInt(), bytesreturned)

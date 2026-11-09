@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32MediaKernelstreamingNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun KsCreateAllocator(connectionhandle: HANDLE, allocatorframing: Long, allocatorhandle: Long): UInt =
    if (_windowsWin32MediaKernelstreamingNapiAddon != null) (_windowsWin32MediaKernelstreamingNapiAddon.windowssys_windows_win32_media_kernelstreaming_KsCreateAllocator(connectionhandle.toString(), allocatorframing.toString(), allocatorhandle.toString()) as Int).toUInt() else 0u

public actual fun KsCreateAllocator2(connectionhandle: HANDLE, allocatorframing: Long, allocatorhandle: Long): HRESULT =
    if (_windowsWin32MediaKernelstreamingNapiAddon != null) (_windowsWin32MediaKernelstreamingNapiAddon.windowssys_windows_win32_media_kernelstreaming_KsCreateAllocator2(connectionhandle.toString(), allocatorframing.toString(), allocatorhandle.toString()) as Int) else 0

public actual fun KsCreateClock(connectionhandle: HANDLE, clockcreate: Long, clockhandle: Long): UInt =
    if (_windowsWin32MediaKernelstreamingNapiAddon != null) (_windowsWin32MediaKernelstreamingNapiAddon.windowssys_windows_win32_media_kernelstreaming_KsCreateClock(connectionhandle.toString(), clockcreate.toString(), clockhandle.toString()) as Int).toUInt() else 0u

public actual fun KsCreateClock2(connectionhandle: HANDLE, clockcreate: Long, clockhandle: Long): HRESULT =
    if (_windowsWin32MediaKernelstreamingNapiAddon != null) (_windowsWin32MediaKernelstreamingNapiAddon.windowssys_windows_win32_media_kernelstreaming_KsCreateClock2(connectionhandle.toString(), clockcreate.toString(), clockhandle.toString()) as Int) else 0

public actual fun KsCreatePin(filterhandle: HANDLE, connect: Long, desiredaccess: UInt, connectionhandle: Long): UInt =
    if (_windowsWin32MediaKernelstreamingNapiAddon != null) (_windowsWin32MediaKernelstreamingNapiAddon.windowssys_windows_win32_media_kernelstreaming_KsCreatePin(filterhandle.toString(), connect.toString(), desiredaccess.toInt(), connectionhandle.toString()) as Int).toUInt() else 0u

public actual fun KsCreatePin2(filterhandle: HANDLE, connect: Long, desiredaccess: UInt, connectionhandle: Long): HRESULT =
    if (_windowsWin32MediaKernelstreamingNapiAddon != null) (_windowsWin32MediaKernelstreamingNapiAddon.windowssys_windows_win32_media_kernelstreaming_KsCreatePin2(filterhandle.toString(), connect.toString(), desiredaccess.toInt(), connectionhandle.toString()) as Int) else 0

public actual fun KsCreateTopologyNode(parenthandle: HANDLE, nodecreate: Long, desiredaccess: UInt, nodehandle: Long): UInt =
    if (_windowsWin32MediaKernelstreamingNapiAddon != null) (_windowsWin32MediaKernelstreamingNapiAddon.windowssys_windows_win32_media_kernelstreaming_KsCreateTopologyNode(parenthandle.toString(), nodecreate.toString(), desiredaccess.toInt(), nodehandle.toString()) as Int).toUInt() else 0u

public actual fun KsCreateTopologyNode2(parenthandle: HANDLE, nodecreate: Long, desiredaccess: UInt, nodehandle: Long): HRESULT =
    if (_windowsWin32MediaKernelstreamingNapiAddon != null) (_windowsWin32MediaKernelstreamingNapiAddon.windowssys_windows_win32_media_kernelstreaming_KsCreateTopologyNode2(parenthandle.toString(), nodecreate.toString(), desiredaccess.toInt(), nodehandle.toString()) as Int) else 0

public actual fun KsGetMediaTypeCount(filterhandle: HANDLE, pinfactoryid: UInt, mediatypecount: Long): HRESULT =
    if (_windowsWin32MediaKernelstreamingNapiAddon != null) (_windowsWin32MediaKernelstreamingNapiAddon.windowssys_windows_win32_media_kernelstreaming_KsGetMediaTypeCount(filterhandle.toString(), pinfactoryid.toInt(), mediatypecount.toString()) as Int) else 0

public actual fun KsGetMultiplePinFactoryItems(filterhandle: HANDLE, pinfactoryid: UInt, propertyid: UInt, items: Long): HRESULT =
    if (_windowsWin32MediaKernelstreamingNapiAddon != null) (_windowsWin32MediaKernelstreamingNapiAddon.windowssys_windows_win32_media_kernelstreaming_KsGetMultiplePinFactoryItems(filterhandle.toString(), pinfactoryid.toInt(), propertyid.toInt(), items.toString()) as Int) else 0

public actual fun KsOpenDefaultDevice(category: Long, access: UInt, devicehandle: Long): HRESULT =
    if (_windowsWin32MediaKernelstreamingNapiAddon != null) (_windowsWin32MediaKernelstreamingNapiAddon.windowssys_windows_win32_media_kernelstreaming_KsOpenDefaultDevice(category.toString(), access.toInt(), devicehandle.toString()) as Int) else 0

public actual fun KsResolveRequiredAttributes(datarange: Long, attributes: Long): HRESULT =
    if (_windowsWin32MediaKernelstreamingNapiAddon != null) (_windowsWin32MediaKernelstreamingNapiAddon.windowssys_windows_win32_media_kernelstreaming_KsResolveRequiredAttributes(datarange.toString(), attributes.toString()) as Int) else 0

public actual fun KsSynchronousDeviceControl(handle: HANDLE, iocontrol: UInt, inbuffer: Long, inlength: UInt, outbuffer: Long, outlength: UInt, bytesreturned: Long): HRESULT =
    if (_windowsWin32MediaKernelstreamingNapiAddon != null) (_windowsWin32MediaKernelstreamingNapiAddon.windowssys_windows_win32_media_kernelstreaming_KsSynchronousDeviceControl(handle.toString(), iocontrol.toInt(), inbuffer.toString(), inlength.toInt(), outbuffer.toString(), outlength.toInt(), bytesreturned.toString()) as Int) else 0

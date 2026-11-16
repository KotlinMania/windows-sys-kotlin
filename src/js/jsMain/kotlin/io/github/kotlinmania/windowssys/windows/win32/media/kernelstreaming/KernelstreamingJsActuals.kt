@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32MediaKernelstreamingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ksCreateAllocator(connectionhandle: Handle, allocatorframing: ConstPtr, allocatorhandle: MutPtr): UInt =
    if (windowsWin32MediaKernelstreamingNapiAddon != null) (windowsWin32MediaKernelstreamingNapiAddon.windowssysWindowsWin32MediaKernelstreamingKsCreateAllocator(connectionhandle.rawAddress.toString(), allocatorframing.rawAddress.toString(), allocatorhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksCreateAllocator2(connectionhandle: Handle, allocatorframing: ConstPtr, allocatorhandle: MutPtr): Hresult =
    if (windowsWin32MediaKernelstreamingNapiAddon != null) (windowsWin32MediaKernelstreamingNapiAddon.windowssysWindowsWin32MediaKernelstreamingKsCreateAllocator2(connectionhandle.rawAddress.toString(), allocatorframing.rawAddress.toString(), allocatorhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksCreateClock(connectionhandle: Handle, clockcreate: ConstPtr, clockhandle: MutPtr): UInt =
    if (windowsWin32MediaKernelstreamingNapiAddon != null) (windowsWin32MediaKernelstreamingNapiAddon.windowssysWindowsWin32MediaKernelstreamingKsCreateClock(connectionhandle.rawAddress.toString(), clockcreate.rawAddress.toString(), clockhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksCreateClock2(connectionhandle: Handle, clockcreate: ConstPtr, clockhandle: MutPtr): Hresult =
    if (windowsWin32MediaKernelstreamingNapiAddon != null) (windowsWin32MediaKernelstreamingNapiAddon.windowssysWindowsWin32MediaKernelstreamingKsCreateClock2(connectionhandle.rawAddress.toString(), clockcreate.rawAddress.toString(), clockhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksCreatePin(filterhandle: Handle, connect: ConstPtr, desiredaccess: UInt, connectionhandle: MutPtr): UInt =
    if (windowsWin32MediaKernelstreamingNapiAddon != null) (windowsWin32MediaKernelstreamingNapiAddon.windowssysWindowsWin32MediaKernelstreamingKsCreatePin(filterhandle.rawAddress.toString(), connect.rawAddress.toString(), desiredaccess.toInt(), connectionhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksCreatePin2(filterhandle: Handle, connect: ConstPtr, desiredaccess: UInt, connectionhandle: MutPtr): Hresult =
    if (windowsWin32MediaKernelstreamingNapiAddon != null) (windowsWin32MediaKernelstreamingNapiAddon.windowssysWindowsWin32MediaKernelstreamingKsCreatePin2(filterhandle.rawAddress.toString(), connect.rawAddress.toString(), desiredaccess.toInt(), connectionhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksCreateTopologyNode(parenthandle: Handle, nodecreate: ConstPtr, desiredaccess: UInt, nodehandle: MutPtr): UInt =
    if (windowsWin32MediaKernelstreamingNapiAddon != null) (windowsWin32MediaKernelstreamingNapiAddon.windowssysWindowsWin32MediaKernelstreamingKsCreateTopologyNode(parenthandle.rawAddress.toString(), nodecreate.rawAddress.toString(), desiredaccess.toInt(), nodehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksCreateTopologyNode2(parenthandle: Handle, nodecreate: ConstPtr, desiredaccess: UInt, nodehandle: MutPtr): Hresult =
    if (windowsWin32MediaKernelstreamingNapiAddon != null) (windowsWin32MediaKernelstreamingNapiAddon.windowssysWindowsWin32MediaKernelstreamingKsCreateTopologyNode2(parenthandle.rawAddress.toString(), nodecreate.rawAddress.toString(), desiredaccess.toInt(), nodehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksGetMediaTypeCount(filterhandle: Handle, pinfactoryid: UInt, mediatypecount: MutPtr): Hresult =
    if (windowsWin32MediaKernelstreamingNapiAddon != null) (windowsWin32MediaKernelstreamingNapiAddon.windowssysWindowsWin32MediaKernelstreamingKsGetMediaTypeCount(filterhandle.rawAddress.toString(), pinfactoryid.toInt(), mediatypecount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksGetMultiplePinFactoryItems(filterhandle: Handle, pinfactoryid: UInt, propertyid: UInt, items: MutPtr): Hresult =
    if (windowsWin32MediaKernelstreamingNapiAddon != null) (windowsWin32MediaKernelstreamingNapiAddon.windowssysWindowsWin32MediaKernelstreamingKsGetMultiplePinFactoryItems(filterhandle.rawAddress.toString(), pinfactoryid.toInt(), propertyid.toInt(), items.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksOpenDefaultDevice(category: ConstPtr, access: UInt, devicehandle: MutPtr): Hresult =
    if (windowsWin32MediaKernelstreamingNapiAddon != null) (windowsWin32MediaKernelstreamingNapiAddon.windowssysWindowsWin32MediaKernelstreamingKsOpenDefaultDevice(category.rawAddress.toString(), access.toInt(), devicehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksResolveRequiredAttributes(datarange: ConstPtr, attributes: ConstPtr): Hresult =
    if (windowsWin32MediaKernelstreamingNapiAddon != null) (windowsWin32MediaKernelstreamingNapiAddon.windowssysWindowsWin32MediaKernelstreamingKsResolveRequiredAttributes(datarange.rawAddress.toString(), attributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksSynchronousDeviceControl(handle: Handle, iocontrol: UInt, inbuffer: ConstPtr, inlength: UInt, outbuffer: MutPtr, outlength: UInt, bytesreturned: MutPtr): Hresult =
    if (windowsWin32MediaKernelstreamingNapiAddon != null) (windowsWin32MediaKernelstreamingNapiAddon.windowssysWindowsWin32MediaKernelstreamingKsSynchronousDeviceControl(handle.rawAddress.toString(), iocontrol.toInt(), inbuffer.rawAddress.toString(), inlength.toInt(), outbuffer.rawAddress.toString(), outlength.toInt(), bytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

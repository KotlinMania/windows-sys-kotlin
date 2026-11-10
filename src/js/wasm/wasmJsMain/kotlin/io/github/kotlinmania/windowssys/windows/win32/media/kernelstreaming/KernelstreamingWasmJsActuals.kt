@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32MediaKernelstreamingNapiAddon(): Boolean

private val _windowsWin32MediaKernelstreamingNapiAvailable: Boolean = _initWindowsWin32MediaKernelstreamingNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_kernelstreaming_ksCreateAllocator(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_kernelstreaming_ksCreateAllocator(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_kernelstreaming_ksCreateAllocator2(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_kernelstreaming_ksCreateAllocator2(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_kernelstreaming_ksCreateClock(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_kernelstreaming_ksCreateClock(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_kernelstreaming_ksCreateClock2(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_kernelstreaming_ksCreateClock2(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_kernelstreaming_ksCreatePin(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_kernelstreaming_ksCreatePin(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_kernelstreaming_ksCreatePin2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_kernelstreaming_ksCreatePin2(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_kernelstreaming_ksCreateTopologyNode(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_kernelstreaming_ksCreateTopologyNode(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_kernelstreaming_ksCreateTopologyNode2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_kernelstreaming_ksCreateTopologyNode2(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_kernelstreaming_ksGetMediaTypeCount(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_kernelstreaming_ksGetMediaTypeCount(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_kernelstreaming_ksGetMultiplePinFactoryItems(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_kernelstreaming_ksGetMultiplePinFactoryItems(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_kernelstreaming_ksOpenDefaultDevice(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_kernelstreaming_ksOpenDefaultDevice(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_kernelstreaming_ksResolveRequiredAttributes(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_kernelstreaming_ksResolveRequiredAttributes(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_kernelstreaming_ksSynchronousDeviceControl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_media_kernelstreaming_ksSynchronousDeviceControl(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

public actual fun ksCreateAllocator(connectionhandle: Handle, allocatorframing: COpaquePointer?, allocatorhandle: COpaquePointer?): UInt =
    if (_windowsWin32MediaKernelstreamingNapiAvailable) _wasm_windowssys_windows_win32_media_kernelstreaming_ksCreateAllocator((connectionhandle?.value ?: 0L).toString(), (allocatorframing?.value ?: 0L).toString(), (allocatorhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksCreateAllocator2(connectionhandle: Handle, allocatorframing: COpaquePointer?, allocatorhandle: COpaquePointer?): Hresult =
    if (_windowsWin32MediaKernelstreamingNapiAvailable) _wasm_windowssys_windows_win32_media_kernelstreaming_ksCreateAllocator2((connectionhandle?.value ?: 0L).toString(), (allocatorframing?.value ?: 0L).toString(), (allocatorhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksCreateClock(connectionhandle: Handle, clockcreate: COpaquePointer?, clockhandle: COpaquePointer?): UInt =
    if (_windowsWin32MediaKernelstreamingNapiAvailable) _wasm_windowssys_windows_win32_media_kernelstreaming_ksCreateClock((connectionhandle?.value ?: 0L).toString(), (clockcreate?.value ?: 0L).toString(), (clockhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksCreateClock2(connectionhandle: Handle, clockcreate: COpaquePointer?, clockhandle: COpaquePointer?): Hresult =
    if (_windowsWin32MediaKernelstreamingNapiAvailable) _wasm_windowssys_windows_win32_media_kernelstreaming_ksCreateClock2((connectionhandle?.value ?: 0L).toString(), (clockcreate?.value ?: 0L).toString(), (clockhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksCreatePin(filterhandle: Handle, connect: COpaquePointer?, desiredaccess: UInt, connectionhandle: COpaquePointer?): UInt =
    if (_windowsWin32MediaKernelstreamingNapiAvailable) _wasm_windowssys_windows_win32_media_kernelstreaming_ksCreatePin((filterhandle?.value ?: 0L).toString(), (connect?.value ?: 0L).toString(), desiredaccess.toInt(), (connectionhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksCreatePin2(filterhandle: Handle, connect: COpaquePointer?, desiredaccess: UInt, connectionhandle: COpaquePointer?): Hresult =
    if (_windowsWin32MediaKernelstreamingNapiAvailable) _wasm_windowssys_windows_win32_media_kernelstreaming_ksCreatePin2((filterhandle?.value ?: 0L).toString(), (connect?.value ?: 0L).toString(), desiredaccess.toInt(), (connectionhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksCreateTopologyNode(parenthandle: Handle, nodecreate: COpaquePointer?, desiredaccess: UInt, nodehandle: COpaquePointer?): UInt =
    if (_windowsWin32MediaKernelstreamingNapiAvailable) _wasm_windowssys_windows_win32_media_kernelstreaming_ksCreateTopologyNode((parenthandle?.value ?: 0L).toString(), (nodecreate?.value ?: 0L).toString(), desiredaccess.toInt(), (nodehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksCreateTopologyNode2(parenthandle: Handle, nodecreate: COpaquePointer?, desiredaccess: UInt, nodehandle: COpaquePointer?): Hresult =
    if (_windowsWin32MediaKernelstreamingNapiAvailable) _wasm_windowssys_windows_win32_media_kernelstreaming_ksCreateTopologyNode2((parenthandle?.value ?: 0L).toString(), (nodecreate?.value ?: 0L).toString(), desiredaccess.toInt(), (nodehandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksGetMediaTypeCount(filterhandle: Handle, pinfactoryid: UInt, mediatypecount: COpaquePointer?): Hresult =
    if (_windowsWin32MediaKernelstreamingNapiAvailable) _wasm_windowssys_windows_win32_media_kernelstreaming_ksGetMediaTypeCount((filterhandle?.value ?: 0L).toString(), pinfactoryid.toInt(), (mediatypecount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksGetMultiplePinFactoryItems(filterhandle: Handle, pinfactoryid: UInt, propertyid: UInt, items: COpaquePointer?): Hresult =
    if (_windowsWin32MediaKernelstreamingNapiAvailable) _wasm_windowssys_windows_win32_media_kernelstreaming_ksGetMultiplePinFactoryItems((filterhandle?.value ?: 0L).toString(), pinfactoryid.toInt(), propertyid.toInt(), (items?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksOpenDefaultDevice(category: COpaquePointer?, access: UInt, devicehandle: COpaquePointer?): Hresult =
    if (_windowsWin32MediaKernelstreamingNapiAvailable) _wasm_windowssys_windows_win32_media_kernelstreaming_ksOpenDefaultDevice((category?.value ?: 0L).toString(), access.toInt(), (devicehandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksResolveRequiredAttributes(datarange: COpaquePointer?, attributes: COpaquePointer?): Hresult =
    if (_windowsWin32MediaKernelstreamingNapiAvailable) _wasm_windowssys_windows_win32_media_kernelstreaming_ksResolveRequiredAttributes((datarange?.value ?: 0L).toString(), (attributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ksSynchronousDeviceControl(handle: Handle, iocontrol: UInt, inbuffer: COpaquePointer?, inlength: UInt, outbuffer: COpaquePointer?, outlength: UInt, bytesreturned: COpaquePointer?): Hresult =
    if (_windowsWin32MediaKernelstreamingNapiAvailable) _wasm_windowssys_windows_win32_media_kernelstreaming_ksSynchronousDeviceControl((handle?.value ?: 0L).toString(), iocontrol.toInt(), (inbuffer?.value ?: 0L).toString(), inlength.toInt(), (outbuffer?.value ?: 0L).toString(), outlength.toInt(), (bytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

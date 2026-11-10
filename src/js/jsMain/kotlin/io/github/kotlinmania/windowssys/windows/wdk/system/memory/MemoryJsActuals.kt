@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.memory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private val _windowsWdkSystemMemoryNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ntMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, commitsize: ULong, sectionoffset: COpaquePointer?, viewsize: COpaquePointer?, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    if (_windowsWdkSystemMemoryNapiAddon != null) (_windowsWdkSystemMemoryNapiAddon.windowssys_windows_wdk_system_memory_ntMapViewOfSection((sectionhandle?.value ?: 0L).toString(), (processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString(), zerobits.toString(), commitsize.toString(), (sectionoffset?.value ?: 0L).toString(), (viewsize?.value ?: 0L).toString(), inheritdisposition, allocationtype.toInt(), win32protect.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemMemoryNapiAddon != null) (_windowsWdkSystemMemoryNapiAddon.windowssys_windows_wdk_system_memory_ntOpenSection((sectionhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntUnmapViewOfSection(processhandle: Handle, baseaddress: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemMemoryNapiAddon != null) (_windowsWdkSystemMemoryNapiAddon.windowssys_windows_wdk_system_memory_ntUnmapViewOfSection((processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, commitsize: ULong, sectionoffset: COpaquePointer?, viewsize: COpaquePointer?, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    if (_windowsWdkSystemMemoryNapiAddon != null) (_windowsWdkSystemMemoryNapiAddon.windowssys_windows_wdk_system_memory_zwMapViewOfSection((sectionhandle?.value ?: 0L).toString(), (processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString(), zerobits.toString(), commitsize.toString(), (sectionoffset?.value ?: 0L).toString(), (viewsize?.value ?: 0L).toString(), inheritdisposition, allocationtype.toInt(), win32protect.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemMemoryNapiAddon != null) (_windowsWdkSystemMemoryNapiAddon.windowssys_windows_wdk_system_memory_zwOpenSection((sectionhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwUnmapViewOfSection(processhandle: Handle, baseaddress: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemMemoryNapiAddon != null) (_windowsWdkSystemMemoryNapiAddon.windowssys_windows_wdk_system_memory_zwUnmapViewOfSection((processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

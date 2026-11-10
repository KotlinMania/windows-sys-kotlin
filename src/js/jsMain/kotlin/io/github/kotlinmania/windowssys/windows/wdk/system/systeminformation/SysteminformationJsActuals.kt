@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private val _windowsWdkSystemSysteminformationNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ntQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: COpaquePointer?, systeminformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSysteminformationNapiAddon != null) (_windowsWdkSystemSysteminformationNapiAddon.windowssys_windows_wdk_system_systeminformation_ntQuerySystemInformation(systeminformationclass, (systeminformation?.value ?: 0L).toString(), systeminformationlength.toInt(), (returnlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQuerySystemTime(systemtime: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSysteminformationNapiAddon != null) (_windowsWdkSystemSysteminformationNapiAddon.windowssys_windows_wdk_system_systeminformation_ntQuerySystemTime((systemtime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryTimerResolution(maximumtime: COpaquePointer?, minimumtime: COpaquePointer?, currenttime: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSysteminformationNapiAddon != null) (_windowsWdkSystemSysteminformationNapiAddon.windowssys_windows_wdk_system_systeminformation_ntQueryTimerResolution((maximumtime?.value ?: 0L).toString(), (minimumtime?.value ?: 0L).toString(), (currenttime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: COpaquePointer?, systeminformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSysteminformationNapiAddon != null) (_windowsWdkSystemSysteminformationNapiAddon.windowssys_windows_wdk_system_systeminformation_zwQuerySystemInformation(systeminformationclass, (systeminformation?.value ?: 0L).toString(), systeminformationlength.toInt(), (returnlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQuerySystemTime(systemtime: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSysteminformationNapiAddon != null) (_windowsWdkSystemSysteminformationNapiAddon.windowssys_windows_wdk_system_systeminformation_zwQuerySystemTime((systemtime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryTimerResolution(maximumtime: COpaquePointer?, minimumtime: COpaquePointer?, currenttime: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSysteminformationNapiAddon != null) (_windowsWdkSystemSysteminformationNapiAddon.windowssys_windows_wdk_system_systeminformation_zwQueryTimerResolution((maximumtime?.value ?: 0L).toString(), (minimumtime?.value ?: 0L).toString(), (currenttime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

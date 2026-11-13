@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiShellPropertiessystemNapiAddon(): Boolean

private val windowsWin32UiShellPropertiessystemNapiAvailable: Boolean = initWindowsWin32UiShellPropertiessystemNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSCoerceToCanonicalValue(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSCoerceToCanonicalValue(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSCreateAdapterFromPropertyStore(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSCreateAdapterFromPropertyStore(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSCreateDelayedMultiplexPropertyStore(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSCreateDelayedMultiplexPropertyStore(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSCreateMemoryPropertyStore(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSCreateMemoryPropertyStore(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSCreateMultiplexPropertyStore(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSCreateMultiplexPropertyStore(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyChangeArray(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyChangeArray(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromObject(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromObject(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromPropertySetStorage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromPropertySetStorage(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSCreateSimplePropertyChange(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSCreateSimplePropertyChange(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSEnumeratePropertyDescriptions(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSEnumeratePropertyDescriptions(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplay(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplay(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplayAlloc(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplayAlloc(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSFormatPropertyValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSFormatPropertyValue(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSGetImageReferenceForValue(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetImageReferenceForValue(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandler(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandler(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandlerWithCreateObject(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandlerWithCreateObject(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSGetNameFromPropertyKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetNameFromPropertyKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSGetNamedPropertyFromPropertyStorage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetNamedPropertyFromPropertyStorage(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescription(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescription(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionByName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionByName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionListFromString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionListFromString(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyFromPropertyStorage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetPropertyFromPropertyStorage(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyKeyFromName(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetPropertyKeyFromName(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertySystem(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetPropertySystem(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSGetPropertyValue(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetPropertyValue(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSLookupPropertyHandlerCLSID(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSLookupPropertyHandlerCLSID(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagDelete(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagDelete(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBool(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBool(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBstr(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBstr(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadDword(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadDword(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadGuid(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadGuid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadInt(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadInt(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadLong(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadLong(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPointl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPointl(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPoints(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPoints(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPropertyKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPropertyKey(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadRectl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadRectl(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadShort(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadShort(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStr(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStr(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStrAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStrAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStream(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStream(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadType(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadType(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUlonglong(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUlonglong(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUnknown(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUnknown(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBool(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBool(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBstr(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBstr(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteDword(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteDword(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteGuid(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteGuid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteInt(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteInt(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteLong(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteLong(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePointl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePointl(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePoints(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePoints(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePropertyKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePropertyKey(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteRectl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteRectl(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteShort(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteShort(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStr(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStr(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStream(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStream(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUlonglong(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUlonglong(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUnknown(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUnknown(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSPropertyKeyFromString(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSPropertyKeyFromString(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSRefreshPropertySchema()")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSRefreshPropertySchema(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSRegisterPropertySchema(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSRegisterPropertySchema(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSSetPropertyValue(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSSetPropertyValue(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSStringFromPropertyKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSStringFromPropertyKey(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPSUnregisterPropertySchema(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPSUnregisterPropertySchema(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPifMgrCloseProperties(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPifMgrCloseProperties(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPifMgrGetProperties(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPifMgrGetProperties(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPifMgrOpenProperties(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPifMgrOpenProperties(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemPifMgrSetProperties(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemPifMgrSetProperties(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemSHAddDefaultPropertiesByExt(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemSHAddDefaultPropertiesByExt(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreForWindow(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreForWindow(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromIDList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromIDList(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromParsingName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromParsingName(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemSHPropStgCreate(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemSHPropStgCreate(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemSHPropStgReadMultiple(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemSHPropStgReadMultiple(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropertiessystemSHPropStgWriteMultiple(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellPropertiessystemSHPropStgWriteMultiple(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

public actual fun pSCoerceToCanonicalValue(key: ConstPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSCoerceToCanonicalValue(key.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateAdapterFromPropertyStore(pps: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSCreateAdapterFromPropertyStore(pps.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateDelayedMultiplexPropertyStore(flags: Getpropertystoreflags, pdpsf: MutPtr, rgstoreids: ConstPtr, cstores: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSCreateDelayedMultiplexPropertyStore(flags, pdpsf.rawAddress.toString(), rgstoreids.rawAddress.toString(), cstores.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateMemoryPropertyStore(riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSCreateMemoryPropertyStore(riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateMultiplexPropertyStore(prgpunkstores: ConstPtr, cstores: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSCreateMultiplexPropertyStore(prgpunkstores.rawAddress.toString(), cstores.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreatePropertyChangeArray(rgpropkey: ConstPtr, rgflags: ConstPtr, rgpropvar: ConstPtr, cchanges: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyChangeArray(rgpropkey.rawAddress.toString(), rgflags.rawAddress.toString(), rgpropvar.rawAddress.toString(), cchanges.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreatePropertyStoreFromObject(punk: MutPtr, grfmode: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromObject(punk.rawAddress.toString(), grfmode.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreatePropertyStoreFromPropertySetStorage(ppss: MutPtr, grfmode: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSCreatePropertyStoreFromPropertySetStorage(ppss.rawAddress.toString(), grfmode.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSCreateSimplePropertyChange(flags: PkaFlags, key: ConstPtr, propvar: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSCreateSimplePropertyChange(flags, key.rawAddress.toString(), propvar.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSEnumeratePropertyDescriptions(filteron: PropdescEnumfilter, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSEnumeratePropertyDescriptions(filteron, riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSFormatForDisplay(propkey: ConstPtr, propvar: ConstPtr, pdfflags: PropdescFormatFlags, pwsztext: Pwstr, cchtext: UInt): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplay(propkey.rawAddress.toString(), propvar.rawAddress.toString(), pdfflags, pwsztext.rawAddress.toString(), cchtext.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSFormatForDisplayAlloc(key: ConstPtr, propvar: ConstPtr, pdff: PropdescFormatFlags, ppszdisplay: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSFormatForDisplayAlloc(key.rawAddress.toString(), propvar.rawAddress.toString(), pdff, ppszdisplay.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSFormatPropertyValue(pps: MutPtr, ppd: MutPtr, pdff: PropdescFormatFlags, ppszdisplay: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSFormatPropertyValue(pps.rawAddress.toString(), ppd.rawAddress.toString(), pdff, ppszdisplay.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetImageReferenceForValue(propkey: ConstPtr, propvar: ConstPtr, ppszimageres: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetImageReferenceForValue(propkey.rawAddress.toString(), propvar.rawAddress.toString(), ppszimageres.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetItemPropertyHandler(punkitem: MutPtr, freadwrite: Bool, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandler(punkitem.rawAddress.toString(), freadwrite, riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetItemPropertyHandlerWithCreateObject(punkitem: MutPtr, freadwrite: Bool, punkcreateobject: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetItemPropertyHandlerWithCreateObject(punkitem.rawAddress.toString(), freadwrite, punkcreateobject.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetNameFromPropertyKey(propkey: ConstPtr, ppszcanonicalname: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetNameFromPropertyKey(propkey.rawAddress.toString(), ppszcanonicalname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetNamedPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, pszname: Pcwstr, ppropvar: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetNamedPropertyFromPropertyStorage(psps.toString(), cb.toInt(), pszname.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyDescription(propkey: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescription(propkey.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyDescriptionByName(pszcanonicalname: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionByName(pszcanonicalname.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyDescriptionListFromString(pszproplist: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetPropertyDescriptionListFromString(pszproplist.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyFromPropertyStorage(psps: Pcuserializedpropstorage, cb: UInt, rpkey: ConstPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetPropertyFromPropertyStorage(psps.toString(), cb.toInt(), rpkey.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyKeyFromName(pszname: Pcwstr, ppropkey: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetPropertyKeyFromName(pszname.rawAddress.toString(), ppropkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertySystem(riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetPropertySystem(riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSGetPropertyValue(pps: MutPtr, ppd: MutPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSGetPropertyValue(pps.rawAddress.toString(), ppd.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSLookupPropertyHandlerCLSID(pszfilepath: Pcwstr, pclsid: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSLookupPropertyHandlerCLSID(pszfilepath.rawAddress.toString(), pclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagDelete(propbag: MutPtr, propname: Pcwstr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagDelete(propbag.rawAddress.toString(), propname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadBool(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBool(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadBstr(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadBstr(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadDword(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadDword(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadGuid(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadGuid(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadInt(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadInt(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadLong(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadLong(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadPointl(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPointl(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadPoints(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPoints(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadPropertyKey(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadPropertyKey(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadRectl(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadRectl(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadShort(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadShort(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadStr(propbag: MutPtr, propname: Pcwstr, value: Pwstr, charactercount: Int): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStr(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString(), charactercount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadStrAlloc(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStrAlloc(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadStream(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadStream(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadType(propbag: MutPtr, propname: Pcwstr, variable: MutPtr, type: Varenum): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadType(propbag.rawAddress.toString(), propname.rawAddress.toString(), variable.rawAddress.toString(), type.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadUlonglong(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUlonglong(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagReadUnknown(propbag: MutPtr, propname: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagReadUnknown(propbag.rawAddress.toString(), propname.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteBool(propbag: MutPtr, propname: Pcwstr, value: Bool): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBool(propbag.rawAddress.toString(), propname.rawAddress.toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteBstr(propbag: MutPtr, propname: Pcwstr, value: Bstr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteBstr(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteDword(propbag: MutPtr, propname: Pcwstr, value: UInt): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteDword(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteGuid(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteGuid(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteInt(propbag: MutPtr, propname: Pcwstr, value: Int): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteInt(propbag.rawAddress.toString(), propname.rawAddress.toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteLong(propbag: MutPtr, propname: Pcwstr, value: Int): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteLong(propbag.rawAddress.toString(), propname.rawAddress.toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWritePointl(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePointl(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWritePoints(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePoints(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWritePropertyKey(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWritePropertyKey(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteRectl(propbag: MutPtr, propname: Pcwstr, value: ConstPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteRectl(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteShort(propbag: MutPtr, propname: Pcwstr, value: Short): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteShort(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteStr(propbag: MutPtr, propname: Pcwstr, value: Pcwstr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStr(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteStream(propbag: MutPtr, propname: Pcwstr, value: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteStream(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteUlonglong(propbag: MutPtr, propname: Pcwstr, value: ULong): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUlonglong(propbag.rawAddress.toString(), propname.rawAddress.toString(), value.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pspropertyBagWriteUnknown(propbag: MutPtr, propname: Pcwstr, punk: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPspropertyBagWriteUnknown(propbag.rawAddress.toString(), propname.rawAddress.toString(), punk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSPropertyKeyFromString(pszstring: Pcwstr, pkey: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSPropertyKeyFromString(pszstring.rawAddress.toString(), pkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSRefreshPropertySchema(): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSRefreshPropertySchema() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSRegisterPropertySchema(pszpath: Pcwstr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSRegisterPropertySchema(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSSetPropertyValue(pps: MutPtr, ppd: MutPtr, propvar: ConstPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSSetPropertyValue(pps.rawAddress.toString(), ppd.rawAddress.toString(), propvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSStringFromPropertyKey(pkey: ConstPtr, psz: Pwstr, cch: UInt): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSStringFromPropertyKey(pkey.rawAddress.toString(), psz.rawAddress.toString(), cch.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pSUnregisterPropertySchema(pszpath: Pcwstr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPSUnregisterPropertySchema(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pifMgrCloseProperties(hprops: Handle, flopt: UInt): Handle =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPropertiessystemPifMgrCloseProperties(hprops.rawAddress.toString(), flopt.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pifMgrGetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: MutPtr, cbprops: Int, flopt: UInt): Int =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPifMgrGetProperties(hprops.rawAddress.toString(), pszgroup.rawAddress.toString(), lpprops.rawAddress.toString(), cbprops, flopt.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pifMgrOpenProperties(pszapp: Pcwstr, pszpif: Pcwstr, hinf: UInt, flopt: UInt): Handle =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPropertiessystemPifMgrOpenProperties(pszapp.rawAddress.toString(), pszpif.rawAddress.toString(), hinf.toInt(), flopt.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pifMgrSetProperties(hprops: Handle, pszgroup: Pcstr, lpprops: ConstPtr, cbprops: Int, flopt: UInt): Int =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemPifMgrSetProperties(hprops.rawAddress.toString(), pszgroup.rawAddress.toString(), lpprops.rawAddress.toString(), cbprops, flopt.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAddDefaultPropertiesByExt(pszext: Pcwstr, ppropstore: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemSHAddDefaultPropertiesByExt(pszext.rawAddress.toString(), ppropstore.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPropertyStoreForWindow(hwnd: Hwnd, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreForWindow(hwnd.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPropertyStoreFromIDList(pidl: ConstPtr, flags: Getpropertystoreflags, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromIDList(pidl.rawAddress.toString(), flags, riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPropertyStoreFromParsingName(pszpath: Pcwstr, pbc: MutPtr, flags: Getpropertystoreflags, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemSHGetPropertyStoreFromParsingName(pszpath.rawAddress.toString(), pbc.rawAddress.toString(), flags, riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPropStgCreate(psstg: MutPtr, fmtid: ConstPtr, pclsid: ConstPtr, grfflags: UInt, grfmode: UInt, dwdisposition: UInt, ppstg: MutPtr, pucodepage: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemSHPropStgCreate(psstg.rawAddress.toString(), fmtid.rawAddress.toString(), pclsid.rawAddress.toString(), grfflags.toInt(), grfmode.toInt(), dwdisposition.toInt(), ppstg.rawAddress.toString(), pucodepage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPropStgReadMultiple(pps: MutPtr, ucodepage: UInt, cpspec: UInt, rgpspec: ConstPtr, rgvar: MutPtr): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemSHPropStgReadMultiple(pps.rawAddress.toString(), ucodepage.toInt(), cpspec.toInt(), rgpspec.rawAddress.toString(), rgvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPropStgWriteMultiple(pps: MutPtr, pucodepage: MutPtr, cpspec: UInt, rgpspec: ConstPtr, rgvar: MutPtr, propidnamefirst: UInt): Hresult =
    if (windowsWin32UiShellPropertiessystemNapiAvailable) wasmWindowssysWindowsWin32UiShellPropertiessystemSHPropStgWriteMultiple(pps.rawAddress.toString(), pucodepage.rawAddress.toString(), cpspec.toInt(), rgpspec.rawAddress.toString(), rgvar.rawAddress.toString(), propidnamefirst.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

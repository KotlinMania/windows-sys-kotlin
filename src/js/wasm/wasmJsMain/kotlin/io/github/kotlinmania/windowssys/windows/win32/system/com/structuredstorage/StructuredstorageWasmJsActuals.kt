@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.com.Clsctx
import io.github.kotlinmania.windowssys.windows.win32.system.com.Coserverinfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.Dvtargetdevice
import io.github.kotlinmania.windowssys.windows.win32.system.com.MultiQi
import io.github.kotlinmania.windowssys.windows.win32.system.com.Stgm
import io.github.kotlinmania.windowssys.windows.win32.system.com.Stgmedium
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemComStructuredstorageNapiAddon(): Boolean

private val windowsWin32SystemComStructuredstorageNapiAvailable: Boolean = initWindowsWin32SystemComStructuredstorageNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageClearPropVariantArray(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageClearPropVariantArray(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromFile(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromFile(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromIStorage(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromIStorage(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageCoGetInterfaceAndReleaseStream(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageCoGetInterfaceAndReleaseStream(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageCreateILockBytesOnHGlobal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageCreateILockBytesOnHGlobal(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageCreateStreamOnHGlobal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageCreateStreamOnHGlobal(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageFmtIdToPropStgName(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageFmtIdToPropStgName(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageFreePropVariantArray(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageFreePropVariantArray(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageGetConvertStg(p0)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageGetConvertStg(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromILockBytes(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromILockBytes(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromStream(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromStream(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBooleanVector(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBooleanVector(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBuffer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBuffer(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromCLSID(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromCLSID(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromDoubleVector(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromDoubleVector(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTimeVector(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTimeVector(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromGUIDAsString(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromGUIDAsString(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt16Vector(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt16Vector(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt32Vector(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt32Vector(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt64Vector(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt64Vector(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromPropVariantVectorElem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromPropVariantVectorElem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromResource(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromResource(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringAsVector(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringAsVector(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringVector(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringVector(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt16Vector(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt16Vector(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt32Vector(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt32Vector(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt64Vector(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt64Vector(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantVectorFromPropVariant(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantVectorFromPropVariant(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAM(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAM(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAMEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAMEx(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorage(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorageEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorageEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropStgNameToFmtId(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropStgNameToFmtId(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantChangeType(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantChangeType(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantClear(p0)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantClear(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantCompareEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantCompareEx(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantCopy(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantCopy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetBooleanElem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetBooleanElem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetDoubleElem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetDoubleElem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetElementCount(p0)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetElementCount(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetFileTimeElem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetFileTimeElem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt16Elem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt16Elem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt32Elem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt32Elem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt64Elem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt64Elem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetStringElem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetStringElem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt16Elem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt16Elem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt32Elem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt32Elem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt64Elem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt64Elem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBSTR(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBSTR(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBoolean(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBoolean(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVector(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVector(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVectorAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVectorAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanWithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanWithDefault(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBuffer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBuffer(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDouble(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToDouble(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVector(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVector(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVectorAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVectorAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleWithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleWithDefault(p0: String, p1: Double): Double

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTime(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVector(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVector(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVectorAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVectorAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToGUID(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToGUID(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16Vector(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16Vector(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16VectorAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16VectorAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16WithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16WithDefault(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32Vector(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32Vector(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32VectorAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32VectorAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32WithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32WithDefault(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64Vector(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64Vector(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64VectorAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64VectorAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64WithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64WithDefault(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToString(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringAlloc(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToStringAlloc(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVector(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVector(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVectorAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVectorAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringWithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToStringWithDefault(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16Vector(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16Vector(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16VectorAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16VectorAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16WithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16WithDefault(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32Vector(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32Vector(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32VectorAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32VectorAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32WithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32WithDefault(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64Vector(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64Vector(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64VectorAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64VectorAlloc(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64WithDefault(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64WithDefault(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToVariant(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToVariant(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstoragePropVariantToWinRTPropertyValue(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToWinRTPropertyValue(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageReadClassStg(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageReadClassStg(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageReadClassStm(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageReadClassStm(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageReadFmtUserTypeStg(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageReadFmtUserTypeStg(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageSetConvertStg(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageSetConvertStg(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgConvertPropertyToVariant(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgConvertPropertyToVariant(p0: String, p1: Int, p2: String, p3: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgConvertVariantToProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgConvertVariantToProperty(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Boolean, p6: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgCreateDocfile(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfileOnILockBytes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgCreateDocfileOnILockBytes(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgCreatePropSetStg(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgCreatePropSetStg(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgCreatePropStg(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgCreatePropStg(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgCreateStorageEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgCreateStorageEx(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgDeserializePropVariant(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgDeserializePropVariant(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnFile(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnILockBytes(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnILockBytes(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgIsStorageFile(p0)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgIsStorageFile(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgIsStorageILockBytes(p0)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgIsStorageILockBytes(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgOpenAsyncDocfileOnIFillLockBytes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenAsyncDocfileOnIFillLockBytes(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgOpenLayoutDocfile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenLayoutDocfile(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgOpenPropStg(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenPropStg(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgOpenStorage(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenStorage(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenStorageEx(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageOnILockBytes(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenStorageOnILockBytes(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgPropertyLengthAsVariant(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgPropertyLengthAsVariant(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgSerializePropVariant(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgSerializePropVariant(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageStgSetTimes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageStgSetTimes(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageVariantToPropVariant(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageVariantToPropVariant(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageWinRTPropertyValueToPropVariant(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageWinRTPropertyValueToPropVariant(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageWriteClassStg(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageWriteClassStg(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageWriteClassStm(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageWriteClassStm(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStructuredstorageWriteFmtUserTypeStg(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStructuredstorageWriteFmtUserTypeStg(p0: String, p1: Int, p2: String): Int

public actual fun clearPropVariantArray(rgpropvar: MutPtr<Propvariant>, cvars: UInt) {
    if (windowsWin32SystemComStructuredstorageNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComStructuredstorageClearPropVariantArray(rgpropvar.rawAddress.toString(), cvars.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coGetInstanceFromFile(pserverinfo: ConstPtr<Coserverinfo>, pclsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, dwclsctx: Clsctx, grfmode: UInt, pwszname: Pcwstr, dwcount: UInt, presults: MutPtr<MultiQi>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromFile(pserverinfo.rawAddress.toString(), pclsid.rawAddress.toString(), punkouter.rawAddress.toString(), dwclsctx.toInt(), grfmode.toInt(), pwszname.rawAddress.toString(), dwcount.toInt(), presults.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetInstanceFromIStorage(pserverinfo: ConstPtr<Coserverinfo>, pclsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, dwclsctx: Clsctx, pstg: MutPtr<CVoid>, dwcount: UInt, presults: MutPtr<MultiQi>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromIStorage(pserverinfo.rawAddress.toString(), pclsid.rawAddress.toString(), punkouter.rawAddress.toString(), dwclsctx.toInt(), pstg.rawAddress.toString(), dwcount.toInt(), presults.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetInterfaceAndReleaseStream(pstm: MutPtr<CVoid>, iid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageCoGetInterfaceAndReleaseStream(pstm.rawAddress.toString(), iid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createILockBytesOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, pplkbyt: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageCreateILockBytesOnHGlobal(hglobal.rawAddress.toString(), fdeleteonrelease, pplkbyt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStreamOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, ppstm: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageCreateStreamOnHGlobal(hglobal.rawAddress.toString(), fdeleteonrelease, ppstm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fmtIdToPropStgName(pfmtid: ConstPtr<Guid>, oszname: Pwstr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageFmtIdToPropStgName(pfmtid.rawAddress.toString(), oszname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freePropVariantArray(cvariants: UInt, rgvars: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageFreePropVariantArray(cvariants.toInt(), rgvars.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConvertStg(pstg: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageGetConvertStg(pstg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHGlobalFromILockBytes(plkbyt: MutPtr<CVoid>, phglobal: MutPtr<Hglobal>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromILockBytes(plkbyt.rawAddress.toString(), phglobal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHGlobalFromStream(pstm: MutPtr<CVoid>, phglobal: MutPtr<Hglobal>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromStream(pstm.rawAddress.toString(), phglobal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromBooleanVector(prgf: ConstPtr<Bool>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBooleanVector(prgf.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromBuffer(pv: ConstPtr<CVoid>, cb: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBuffer(pv.rawAddress.toString(), cb.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromCLSID(clsid: ConstPtr<Guid>, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromCLSID(clsid.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromDoubleVector(prgn: ConstPtr<Double>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromDoubleVector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromFileTime(pftin: ConstPtr<Filetime>, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTime(pftin.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromFileTimeVector(prgft: ConstPtr<Filetime>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTimeVector(prgft.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromGUIDAsString(guid: ConstPtr<Guid>, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromGUIDAsString(guid.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromInt16Vector(prgn: ConstPtr<Short>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt16Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromInt32Vector(prgn: ConstPtr<Int>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt32Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromInt64Vector(prgn: ConstPtr<Long>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt64Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromPropVariantVectorElem(propvarin: ConstPtr<Propvariant>, ielem: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromPropVariantVectorElem(propvarin.rawAddress.toString(), ielem.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromResource(hinst: Hinstance, id: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromResource(hinst.rawAddress.toString(), id.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromStringAsVector(psz: Pcwstr, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringAsVector(psz.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromStringVector(prgsz: ConstPtr<Pcwstr>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringVector(prgsz.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromUInt16Vector(prgn: ConstPtr<UShort>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt16Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromUInt32Vector(prgn: ConstPtr<UInt>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt32Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromUInt64Vector(prgn: ConstPtr<ULong>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt64Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantVectorFromPropVariant(propvarsingle: ConstPtr<Propvariant>, ppropvarvector: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantVectorFromPropVariant(propvarsingle.rawAddress.toString(), ppropvarvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertIStorageToOLESTREAM(pstg: MutPtr<CVoid>, lpolestream: MutPtr<Olestream>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAM(pstg.rawAddress.toString(), lpolestream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertIStorageToOLESTREAMEx(pstg: MutPtr<CVoid>, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: ConstPtr<Stgmedium>, polestm: MutPtr<Olestream>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAMEx(pstg.rawAddress.toString(), cfformat.toInt(), lwidth, lheight, dwsize.toInt(), pmedium.rawAddress.toString(), polestm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertOLESTREAMToIStorage(lpolestream: ConstPtr<Olestream>, pstg: MutPtr<CVoid>, ptd: ConstPtr<Dvtargetdevice>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorage(lpolestream.rawAddress.toString(), pstg.rawAddress.toString(), ptd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertOLESTREAMToIStorageEx(polestm: ConstPtr<Olestream>, pstg: MutPtr<CVoid>, pcfformat: MutPtr<UShort>, plwwidth: MutPtr<Int>, plheight: MutPtr<Int>, pdwsize: MutPtr<UInt>, pmedium: MutPtr<Stgmedium>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorageEx(polestm.rawAddress.toString(), pstg.rawAddress.toString(), pcfformat.rawAddress.toString(), plwwidth.rawAddress.toString(), plheight.rawAddress.toString(), pdwsize.rawAddress.toString(), pmedium.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propStgNameToFmtId(oszname: Pcwstr, pfmtid: MutPtr<Guid>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropStgNameToFmtId(oszname.rawAddress.toString(), pfmtid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantChangeType(ppropvardest: MutPtr<Propvariant>, propvarsrc: ConstPtr<Propvariant>, flags: PropvarChangeFlags, vt: Variant.Varenum): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantChangeType(ppropvardest.rawAddress.toString(), propvarsrc.rawAddress.toString(), flags, vt.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantClear(pvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantClear(pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantCompareEx(propvar1: ConstPtr<Propvariant>, propvar2: ConstPtr<Propvariant>, unit: PropvarCompareUnit, flags: PropvarCompareFlags): Int =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantCompareEx(propvar1.rawAddress.toString(), propvar2.rawAddress.toString(), unit, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantCopy(pvardest: MutPtr<Propvariant>, pvarsrc: ConstPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantCopy(pvardest.rawAddress.toString(), pvarsrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetBooleanElem(propvar: ConstPtr<Propvariant>, ielem: UInt, pfval: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetBooleanElem(propvar.rawAddress.toString(), ielem.toInt(), pfval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetDoubleElem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<Double>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetDoubleElem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetElementCount(propvar: ConstPtr<Propvariant>): UInt =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetElementCount(propvar.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetFileTimeElem(propvar: ConstPtr<Propvariant>, ielem: UInt, pftval: MutPtr<Filetime>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetFileTimeElem(propvar.rawAddress.toString(), ielem.toInt(), pftval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInt16Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<Short>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt16Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInt32Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<Int>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt32Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInt64Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<Long>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt64Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetStringElem(propvar: ConstPtr<Propvariant>, ielem: UInt, ppszval: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetStringElem(propvar.rawAddress.toString(), ielem.toInt(), ppszval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetUInt16Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<UShort>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt16Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetUInt32Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt32Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetUInt64Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt64Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBSTR(propvar: ConstPtr<Propvariant>, pbstrout: MutPtr<Bstr>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBSTR(propvar.rawAddress.toString(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBoolean(propvarin: ConstPtr<Propvariant>, pfret: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBoolean(propvarin.rawAddress.toString(), pfret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBooleanVector(propvar: ConstPtr<Propvariant>, prgf: MutPtr<Bool>, crgf: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVector(propvar.rawAddress.toString(), prgf.rawAddress.toString(), crgf.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBooleanVectorAlloc(propvar: ConstPtr<Propvariant>, pprgf: MutPtr<MutPtr<Bool>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVectorAlloc(propvar.rawAddress.toString(), pprgf.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBooleanWithDefault(propvarin: ConstPtr<Propvariant>, fdefault: Bool): Bool =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanWithDefault(propvarin.rawAddress.toString(), fdefault) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBuffer(propvar: ConstPtr<Propvariant>, pv: MutPtr<CVoid>, cb: UInt): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBuffer(propvar.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDouble(propvarin: ConstPtr<Propvariant>, pdblret: MutPtr<Double>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToDouble(propvarin.rawAddress.toString(), pdblret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDoubleVector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<Double>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDoubleVectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<Double>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDoubleWithDefault(propvarin: ConstPtr<Propvariant>, dbldefault: Double): Double =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleWithDefault(propvarin.rawAddress.toString(), dbldefault) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToFileTime(propvar: ConstPtr<Propvariant>, pstfout: Variant.PstimeFlags, pftout: MutPtr<Filetime>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTime(propvar.rawAddress.toString(), pstfout, pftout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToFileTimeVector(propvar: ConstPtr<Propvariant>, prgft: MutPtr<Filetime>, crgft: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVector(propvar.rawAddress.toString(), prgft.rawAddress.toString(), crgft.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToFileTimeVectorAlloc(propvar: ConstPtr<Propvariant>, pprgft: MutPtr<MutPtr<Filetime>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVectorAlloc(propvar.rawAddress.toString(), pprgft.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToGUID(propvar: ConstPtr<Propvariant>, pguid: MutPtr<Guid>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToGUID(propvar.rawAddress.toString(), pguid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16(propvarin: ConstPtr<Propvariant>, piret: MutPtr<Short>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16(propvarin.rawAddress.toString(), piret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<Short>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<Short>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16WithDefault(propvarin: ConstPtr<Propvariant>, idefault: Short): Short =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16WithDefault(propvarin.rawAddress.toString(), idefault.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32(propvarin: ConstPtr<Propvariant>, plret: MutPtr<Int>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32(propvarin.rawAddress.toString(), plret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<Int>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<Int>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32WithDefault(propvarin: ConstPtr<Propvariant>, ldefault: Int): Int =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32WithDefault(propvarin.rawAddress.toString(), ldefault) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64(propvarin: ConstPtr<Propvariant>, pllret: MutPtr<Long>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64(propvarin.rawAddress.toString(), pllret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<Long>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<Long>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64WithDefault(propvarin: ConstPtr<Propvariant>, lldefault: Long): Long =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64WithDefault(propvarin.rawAddress.toString(), lldefault.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToString(propvar: ConstPtr<Propvariant>, psz: Pwstr, cch: UInt): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToString(propvar.rawAddress.toString(), psz.rawAddress.toString(), cch.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringAlloc(propvar: ConstPtr<Propvariant>, ppszout: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToStringAlloc(propvar.rawAddress.toString(), ppszout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringVector(propvar: ConstPtr<Propvariant>, prgsz: MutPtr<Pwstr>, crgsz: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVector(propvar.rawAddress.toString(), prgsz.rawAddress.toString(), crgsz.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringVectorAlloc(propvar: ConstPtr<Propvariant>, pprgsz: MutPtr<MutPtr<Pwstr>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVectorAlloc(propvar.rawAddress.toString(), pprgsz.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringWithDefault(propvarin: ConstPtr<Propvariant>, pszdefault: Pcwstr): Pcwstr =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToStringWithDefault(propvarin.rawAddress.toString(), pszdefault.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16(propvarin: ConstPtr<Propvariant>, puiret: MutPtr<UShort>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16(propvarin.rawAddress.toString(), puiret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<UShort>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<UShort>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16WithDefault(propvarin: ConstPtr<Propvariant>, uidefault: UShort): UShort =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16WithDefault(propvarin.rawAddress.toString(), uidefault.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32(propvarin: ConstPtr<Propvariant>, pulret: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32(propvarin.rawAddress.toString(), pulret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<UInt>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<UInt>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32WithDefault(propvarin: ConstPtr<Propvariant>, uldefault: UInt): UInt =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32WithDefault(propvarin.rawAddress.toString(), uldefault.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64(propvarin: ConstPtr<Propvariant>, pullret: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64(propvarin.rawAddress.toString(), pullret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<ULong>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<ULong>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64WithDefault(propvarin: ConstPtr<Propvariant>, ulldefault: ULong): ULong =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64WithDefault(propvarin.rawAddress.toString(), ulldefault.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToVariant(ppropvar: ConstPtr<Propvariant>, pvar: MutPtr<Variant.Variant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToVariant(ppropvar.rawAddress.toString(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToWinRTPropertyValue(propvar: ConstPtr<Propvariant>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToWinRTPropertyValue(propvar.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readClassStg(pstg: MutPtr<CVoid>, pclsid: MutPtr<Guid>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageReadClassStg(pstg.rawAddress.toString(), pclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readClassStm(pstm: MutPtr<CVoid>, pclsid: MutPtr<Guid>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageReadClassStm(pstm.rawAddress.toString(), pclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readFmtUserTypeStg(pstg: MutPtr<CVoid>, pcf: MutPtr<UShort>, lplpszusertype: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageReadFmtUserTypeStg(pstg.rawAddress.toString(), pcf.rawAddress.toString(), lplpszusertype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConvertStg(pstg: MutPtr<CVoid>, fconvert: Bool): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageSetConvertStg(pstg.rawAddress.toString(), fconvert) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgConvertPropertyToVariant(pprop: ConstPtr<Serializedpropertyvalue>, codepage: UShort, pvar: MutPtr<Propvariant>, pma: MutPtr<CVoid>): Boolean =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgConvertPropertyToVariant(pprop.rawAddress.toString(), codepage.toInt(), pvar.rawAddress.toString(), pma.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgConvertVariantToProperty(pvar: ConstPtr<Propvariant>, codepage: UShort, pprop: MutPtr<Serializedpropertyvalue>, pcb: MutPtr<UInt>, pid: UInt, freserved: Boolean, pcindirect: MutPtr<UInt>): MutPtr<Serializedpropertyvalue> =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComStructuredstorageStgConvertVariantToProperty(pvar.rawAddress.toString(), codepage.toInt(), pprop.rawAddress.toString(), pcb.rawAddress.toString(), pid.toInt(), freserved, pcindirect.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreateDocfile(pwcsname: Pcwstr, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgCreateDocfile(pwcsname.rawAddress.toString(), grfmode.toInt(), reserved.toInt(), ppstgopen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreateDocfileOnILockBytes(plkbyt: MutPtr<CVoid>, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgCreateDocfileOnILockBytes(plkbyt.rawAddress.toString(), grfmode.toInt(), reserved.toInt(), ppstgopen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreatePropSetStg(pstorage: MutPtr<CVoid>, dwreserved: UInt, pppropsetstg: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgCreatePropSetStg(pstorage.rawAddress.toString(), dwreserved.toInt(), pppropsetstg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreatePropStg(punk: MutPtr<CVoid>, fmtid: ConstPtr<Guid>, pclsid: ConstPtr<Guid>, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgCreatePropStg(punk.rawAddress.toString(), fmtid.rawAddress.toString(), pclsid.rawAddress.toString(), grfflags.toInt(), dwreserved.toInt(), pppropstg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreateStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr<Stgoptions>, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr<Guid>, ppobjectopen: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgCreateStorageEx(pwcsname.rawAddress.toString(), grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), pstgoptions.rawAddress.toString(), psecuritydescriptor.rawAddress.toString(), riid.rawAddress.toString(), ppobjectopen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgDeserializePropVariant(pprop: ConstPtr<Serializedpropertyvalue>, cbmax: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgDeserializePropVariant(pprop.rawAddress.toString(), cbmax.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgGetIFillLockBytesOnFile(pwcsname: Pcwstr, ppflb: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnFile(pwcsname.rawAddress.toString(), ppflb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgGetIFillLockBytesOnILockBytes(pilb: MutPtr<CVoid>, ppflb: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnILockBytes(pilb.rawAddress.toString(), ppflb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgIsStorageFile(pwcsname: Pcwstr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgIsStorageFile(pwcsname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgIsStorageILockBytes(plkbyt: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgIsStorageILockBytes(plkbyt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenAsyncDocfileOnIFillLockBytes(pflb: MutPtr<CVoid>, grfmode: UInt, asyncflags: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenAsyncDocfileOnIFillLockBytes(pflb.rawAddress.toString(), grfmode.toInt(), asyncflags.toInt(), ppstgopen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenLayoutDocfile(pwcsdfname: Pcwstr, grfmode: UInt, reserved: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenLayoutDocfile(pwcsdfname.rawAddress.toString(), grfmode.toInt(), reserved.toInt(), ppstgopen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenPropStg(punk: MutPtr<CVoid>, fmtid: ConstPtr<Guid>, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenPropStg(punk.rawAddress.toString(), fmtid.rawAddress.toString(), grfflags.toInt(), dwreserved.toInt(), pppropstg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenStorage(pwcsname: Pcwstr, pstgpriority: MutPtr<CVoid>, grfmode: Stgm, snbexclude: ConstPtr<ConstPtr<UShort>>, reserved: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenStorage(pwcsname.rawAddress.toString(), pstgpriority.rawAddress.toString(), grfmode.toInt(), snbexclude.rawAddress.toString(), reserved.toInt(), ppstgopen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr<Stgoptions>, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr<Guid>, ppobjectopen: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenStorageEx(pwcsname.rawAddress.toString(), grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), pstgoptions.rawAddress.toString(), psecuritydescriptor.rawAddress.toString(), riid.rawAddress.toString(), ppobjectopen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenStorageOnILockBytes(plkbyt: MutPtr<CVoid>, pstgpriority: MutPtr<CVoid>, grfmode: Stgm, snbexclude: ConstPtr<ConstPtr<UShort>>, reserved: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenStorageOnILockBytes(plkbyt.rawAddress.toString(), pstgpriority.rawAddress.toString(), grfmode.toInt(), snbexclude.rawAddress.toString(), reserved.toInt(), ppstgopen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgPropertyLengthAsVariant(pprop: ConstPtr<Serializedpropertyvalue>, cbprop: UInt, codepage: UShort, breserved: UByte): UInt =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgPropertyLengthAsVariant(pprop.rawAddress.toString(), cbprop.toInt(), codepage.toInt(), breserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgSerializePropVariant(ppropvar: ConstPtr<Propvariant>, ppprop: MutPtr<MutPtr<Serializedpropertyvalue>>, pcb: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgSerializePropVariant(ppropvar.rawAddress.toString(), ppprop.rawAddress.toString(), pcb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgSetTimes(lpszname: Pcwstr, pctime: ConstPtr<Filetime>, patime: ConstPtr<Filetime>, pmtime: ConstPtr<Filetime>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgSetTimes(lpszname.rawAddress.toString(), pctime.rawAddress.toString(), patime.rawAddress.toString(), pmtime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToPropVariant(pvar: ConstPtr<Variant.Variant>, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageVariantToPropVariant(pvar.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winRTPropertyValueToPropVariant(punkpropertyvalue: MutPtr<CVoid>, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageWinRTPropertyValueToPropVariant(punkpropertyvalue.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeClassStg(pstg: MutPtr<CVoid>, rclsid: ConstPtr<Guid>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageWriteClassStg(pstg.rawAddress.toString(), rclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeClassStm(pstm: MutPtr<CVoid>, rclsid: ConstPtr<Guid>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageWriteClassStm(pstm.rawAddress.toString(), rclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeFmtUserTypeStg(pstg: MutPtr<CVoid>, cf: UShort, lpszusertype: Pcwstr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageWriteFmtUserTypeStg(pstg.rawAddress.toString(), cf.toInt(), lpszusertype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.com.Clsctx
import io.github.kotlinmania.windowssys.windows.win32.system.com.Stgm
import io.github.kotlinmania.windowssys.windows.win32.system.variant.PstimeFlags
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum

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

public actual fun clearPropVariantArray(rgpropvar: MutPtr, cvars: UInt) {
    if (windowsWin32SystemComStructuredstorageNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComStructuredstorageClearPropVariantArray(rgpropvar.rawAddress.toString(), cvars.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coGetInstanceFromFile(pserverinfo: ConstPtr, pclsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, grfmode: UInt, pwszname: Pcwstr, dwcount: UInt, presults: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromFile(pserverinfo.rawAddress.toString(), pclsid.rawAddress.toString(), punkouter.rawAddress.toString(), dwclsctx.toInt(), grfmode.toInt(), pwszname.rawAddress.toString(), dwcount.toInt(), presults.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetInstanceFromIStorage(pserverinfo: ConstPtr, pclsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, pstg: MutPtr, dwcount: UInt, presults: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromIStorage(pserverinfo.rawAddress.toString(), pclsid.rawAddress.toString(), punkouter.rawAddress.toString(), dwclsctx.toInt(), pstg.rawAddress.toString(), dwcount.toInt(), presults.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetInterfaceAndReleaseStream(pstm: MutPtr, iid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageCoGetInterfaceAndReleaseStream(pstm.rawAddress.toString(), iid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createILockBytesOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, pplkbyt: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageCreateILockBytesOnHGlobal(hglobal.rawAddress.toString(), fdeleteonrelease, pplkbyt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStreamOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, ppstm: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageCreateStreamOnHGlobal(hglobal.rawAddress.toString(), fdeleteonrelease, ppstm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fmtIdToPropStgName(pfmtid: ConstPtr, oszname: Pwstr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageFmtIdToPropStgName(pfmtid.rawAddress.toString(), oszname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freePropVariantArray(cvariants: UInt, rgvars: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageFreePropVariantArray(cvariants.toInt(), rgvars.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConvertStg(pstg: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageGetConvertStg(pstg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHGlobalFromILockBytes(plkbyt: MutPtr, phglobal: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromILockBytes(plkbyt.rawAddress.toString(), phglobal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHGlobalFromStream(pstm: MutPtr, phglobal: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromStream(pstm.rawAddress.toString(), phglobal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromBooleanVector(prgf: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBooleanVector(prgf.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromBuffer(pv: ConstPtr, cb: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBuffer(pv.rawAddress.toString(), cb.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromCLSID(clsid: ConstPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromCLSID(clsid.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromDoubleVector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromDoubleVector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromFileTime(pftin: ConstPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTime(pftin.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromFileTimeVector(prgft: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTimeVector(prgft.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromGUIDAsString(guid: ConstPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromGUIDAsString(guid.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromInt16Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt16Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromInt32Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt32Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromInt64Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt64Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromPropVariantVectorElem(propvarin: ConstPtr, ielem: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromPropVariantVectorElem(propvarin.rawAddress.toString(), ielem.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromResource(hinst: Hinstance, id: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromResource(hinst.rawAddress.toString(), id.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromStringAsVector(psz: Pcwstr, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringAsVector(psz.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromStringVector(prgsz: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringVector(prgsz.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromUInt16Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt16Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromUInt32Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt32Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromUInt64Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt64Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantVectorFromPropVariant(propvarsingle: ConstPtr, ppropvarvector: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageInitPropVariantVectorFromPropVariant(propvarsingle.rawAddress.toString(), ppropvarvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertIStorageToOLESTREAM(pstg: MutPtr, lpolestream: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAM(pstg.rawAddress.toString(), lpolestream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertIStorageToOLESTREAMEx(pstg: MutPtr, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: ConstPtr, polestm: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAMEx(pstg.rawAddress.toString(), cfformat.toInt(), lwidth, lheight, dwsize.toInt(), pmedium.rawAddress.toString(), polestm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertOLESTREAMToIStorage(lpolestream: ConstPtr, pstg: MutPtr, ptd: ConstPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorage(lpolestream.rawAddress.toString(), pstg.rawAddress.toString(), ptd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertOLESTREAMToIStorageEx(polestm: ConstPtr, pstg: MutPtr, pcfformat: MutPtr, plwwidth: MutPtr, plheight: MutPtr, pdwsize: MutPtr, pmedium: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorageEx(polestm.rawAddress.toString(), pstg.rawAddress.toString(), pcfformat.rawAddress.toString(), plwwidth.rawAddress.toString(), plheight.rawAddress.toString(), pdwsize.rawAddress.toString(), pmedium.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propStgNameToFmtId(oszname: Pcwstr, pfmtid: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropStgNameToFmtId(oszname.rawAddress.toString(), pfmtid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantChangeType(ppropvardest: MutPtr, propvarsrc: ConstPtr, flags: PropvarChangeFlags, vt: Varenum): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantChangeType(ppropvardest.rawAddress.toString(), propvarsrc.rawAddress.toString(), flags, vt.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantClear(pvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantClear(pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantCompareEx(propvar1: ConstPtr, propvar2: ConstPtr, unit: PropvarCompareUnit, flags: PropvarCompareFlags): Int =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantCompareEx(propvar1.rawAddress.toString(), propvar2.rawAddress.toString(), unit, flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantCopy(pvardest: MutPtr, pvarsrc: ConstPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantCopy(pvardest.rawAddress.toString(), pvarsrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetBooleanElem(propvar: ConstPtr, ielem: UInt, pfval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetBooleanElem(propvar.rawAddress.toString(), ielem.toInt(), pfval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetDoubleElem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetDoubleElem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetElementCount(propvar: ConstPtr): UInt =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetElementCount(propvar.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetFileTimeElem(propvar: ConstPtr, ielem: UInt, pftval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetFileTimeElem(propvar.rawAddress.toString(), ielem.toInt(), pftval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInt16Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt16Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInt32Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt32Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInt64Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt64Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetStringElem(propvar: ConstPtr, ielem: UInt, ppszval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetStringElem(propvar.rawAddress.toString(), ielem.toInt(), ppszval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetUInt16Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt16Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetUInt32Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt32Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetUInt64Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt64Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBSTR(propvar: ConstPtr, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBSTR(propvar.rawAddress.toString(), pbstrout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBoolean(propvarin: ConstPtr, pfret: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBoolean(propvarin.rawAddress.toString(), pfret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBooleanVector(propvar: ConstPtr, prgf: MutPtr, crgf: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVector(propvar.rawAddress.toString(), prgf.rawAddress.toString(), crgf.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBooleanVectorAlloc(propvar: ConstPtr, pprgf: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVectorAlloc(propvar.rawAddress.toString(), pprgf.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBooleanWithDefault(propvarin: ConstPtr, fdefault: Bool): Bool =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanWithDefault(propvarin.rawAddress.toString(), fdefault) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBuffer(propvar: ConstPtr, pv: MutPtr, cb: UInt): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToBuffer(propvar.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDouble(propvarin: ConstPtr, pdblret: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToDouble(propvarin.rawAddress.toString(), pdblret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDoubleVector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDoubleVectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDoubleWithDefault(propvarin: ConstPtr, dbldefault: Double): Double =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleWithDefault(propvarin.rawAddress.toString(), dbldefault) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToFileTime(propvar: ConstPtr, pstfout: PstimeFlags, pftout: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTime(propvar.rawAddress.toString(), pstfout, pftout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToFileTimeVector(propvar: ConstPtr, prgft: MutPtr, crgft: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVector(propvar.rawAddress.toString(), prgft.rawAddress.toString(), crgft.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToFileTimeVectorAlloc(propvar: ConstPtr, pprgft: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVectorAlloc(propvar.rawAddress.toString(), pprgft.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToGUID(propvar: ConstPtr, pguid: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToGUID(propvar.rawAddress.toString(), pguid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16(propvarin: ConstPtr, piret: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16(propvarin.rawAddress.toString(), piret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16WithDefault(propvarin: ConstPtr, idefault: Short): Short =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16WithDefault(propvarin.rawAddress.toString(), idefault.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32(propvarin: ConstPtr, plret: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32(propvarin.rawAddress.toString(), plret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32WithDefault(propvarin: ConstPtr, ldefault: Int): Int =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32WithDefault(propvarin.rawAddress.toString(), ldefault) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64(propvarin: ConstPtr, pllret: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64(propvarin.rawAddress.toString(), pllret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64WithDefault(propvarin: ConstPtr, lldefault: Long): Long =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64WithDefault(propvarin.rawAddress.toString(), lldefault.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToString(propvar: ConstPtr, psz: Pwstr, cch: UInt): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToString(propvar.rawAddress.toString(), psz.rawAddress.toString(), cch.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringAlloc(propvar: ConstPtr, ppszout: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToStringAlloc(propvar.rawAddress.toString(), ppszout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringVector(propvar: ConstPtr, prgsz: MutPtr, crgsz: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVector(propvar.rawAddress.toString(), prgsz.rawAddress.toString(), crgsz.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringVectorAlloc(propvar: ConstPtr, pprgsz: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVectorAlloc(propvar.rawAddress.toString(), pprgsz.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringWithDefault(propvarin: ConstPtr, pszdefault: Pcwstr): Pcwstr =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToStringWithDefault(propvarin.rawAddress.toString(), pszdefault.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16(propvarin: ConstPtr, puiret: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16(propvarin.rawAddress.toString(), puiret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16WithDefault(propvarin: ConstPtr, uidefault: UShort): UShort =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16WithDefault(propvarin.rawAddress.toString(), uidefault.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32(propvarin: ConstPtr, pulret: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32(propvarin.rawAddress.toString(), pulret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32WithDefault(propvarin: ConstPtr, uldefault: UInt): UInt =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32WithDefault(propvarin.rawAddress.toString(), uldefault.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64(propvarin: ConstPtr, pullret: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64(propvarin.rawAddress.toString(), pullret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64WithDefault(propvarin: ConstPtr, ulldefault: ULong): ULong =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64WithDefault(propvarin.rawAddress.toString(), ulldefault.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToVariant(ppropvar: ConstPtr, pvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToVariant(ppropvar.rawAddress.toString(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToWinRTPropertyValue(propvar: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstoragePropVariantToWinRTPropertyValue(propvar.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readClassStg(pstg: MutPtr, pclsid: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageReadClassStg(pstg.rawAddress.toString(), pclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readClassStm(pstm: MutPtr, pclsid: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageReadClassStm(pstm.rawAddress.toString(), pclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readFmtUserTypeStg(pstg: MutPtr, pcf: MutPtr, lplpszusertype: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageReadFmtUserTypeStg(pstg.rawAddress.toString(), pcf.rawAddress.toString(), lplpszusertype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConvertStg(pstg: MutPtr, fconvert: Bool): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageSetConvertStg(pstg.rawAddress.toString(), fconvert) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgConvertPropertyToVariant(pprop: ConstPtr, codepage: UShort, pvar: MutPtr, pma: MutPtr): Boolean =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgConvertPropertyToVariant(pprop.rawAddress.toString(), codepage.toInt(), pvar.rawAddress.toString(), pma.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgConvertVariantToProperty(pvar: ConstPtr, codepage: UShort, pprop: MutPtr, pcb: MutPtr, pid: UInt, freserved: Boolean, pcindirect: MutPtr): MutPtr =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComStructuredstorageStgConvertVariantToProperty(pvar.rawAddress.toString(), codepage.toInt(), pprop.rawAddress.toString(), pcb.rawAddress.toString(), pid.toInt(), freserved, pcindirect.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreateDocfile(pwcsname: Pcwstr, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgCreateDocfile(pwcsname.rawAddress.toString(), grfmode.toInt(), reserved.toInt(), ppstgopen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreateDocfileOnILockBytes(plkbyt: MutPtr, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgCreateDocfileOnILockBytes(plkbyt.rawAddress.toString(), grfmode.toInt(), reserved.toInt(), ppstgopen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreatePropSetStg(pstorage: MutPtr, dwreserved: UInt, pppropsetstg: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgCreatePropSetStg(pstorage.rawAddress.toString(), dwreserved.toInt(), pppropsetstg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreatePropStg(punk: MutPtr, fmtid: ConstPtr, pclsid: ConstPtr, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgCreatePropStg(punk.rawAddress.toString(), fmtid.rawAddress.toString(), pclsid.rawAddress.toString(), grfflags.toInt(), dwreserved.toInt(), pppropstg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreateStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr, ppobjectopen: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgCreateStorageEx(pwcsname.rawAddress.toString(), grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), pstgoptions.rawAddress.toString(), psecuritydescriptor.rawAddress.toString(), riid.rawAddress.toString(), ppobjectopen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgDeserializePropVariant(pprop: ConstPtr, cbmax: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgDeserializePropVariant(pprop.rawAddress.toString(), cbmax.toInt(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgGetIFillLockBytesOnFile(pwcsname: Pcwstr, ppflb: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnFile(pwcsname.rawAddress.toString(), ppflb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgGetIFillLockBytesOnILockBytes(pilb: MutPtr, ppflb: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnILockBytes(pilb.rawAddress.toString(), ppflb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgIsStorageFile(pwcsname: Pcwstr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgIsStorageFile(pwcsname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgIsStorageILockBytes(plkbyt: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgIsStorageILockBytes(plkbyt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenAsyncDocfileOnIFillLockBytes(pflb: MutPtr, grfmode: UInt, asyncflags: UInt, ppstgopen: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenAsyncDocfileOnIFillLockBytes(pflb.rawAddress.toString(), grfmode.toInt(), asyncflags.toInt(), ppstgopen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenLayoutDocfile(pwcsdfname: Pcwstr, grfmode: UInt, reserved: UInt, ppstgopen: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenLayoutDocfile(pwcsdfname.rawAddress.toString(), grfmode.toInt(), reserved.toInt(), ppstgopen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenPropStg(punk: MutPtr, fmtid: ConstPtr, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenPropStg(punk.rawAddress.toString(), fmtid.rawAddress.toString(), grfflags.toInt(), dwreserved.toInt(), pppropstg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenStorage(pwcsname: Pcwstr, pstgpriority: MutPtr, grfmode: Stgm, snbexclude: ConstPtr, reserved: UInt, ppstgopen: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenStorage(pwcsname.rawAddress.toString(), pstgpriority.rawAddress.toString(), grfmode.toInt(), snbexclude.rawAddress.toString(), reserved.toInt(), ppstgopen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr, ppobjectopen: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenStorageEx(pwcsname.rawAddress.toString(), grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), pstgoptions.rawAddress.toString(), psecuritydescriptor.rawAddress.toString(), riid.rawAddress.toString(), ppobjectopen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenStorageOnILockBytes(plkbyt: MutPtr, pstgpriority: MutPtr, grfmode: Stgm, snbexclude: ConstPtr, reserved: UInt, ppstgopen: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgOpenStorageOnILockBytes(plkbyt.rawAddress.toString(), pstgpriority.rawAddress.toString(), grfmode.toInt(), snbexclude.rawAddress.toString(), reserved.toInt(), ppstgopen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgPropertyLengthAsVariant(pprop: ConstPtr, cbprop: UInt, codepage: UShort, breserved: UByte): UInt =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgPropertyLengthAsVariant(pprop.rawAddress.toString(), cbprop.toInt(), codepage.toInt(), breserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgSerializePropVariant(ppropvar: ConstPtr, ppprop: MutPtr, pcb: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgSerializePropVariant(ppropvar.rawAddress.toString(), ppprop.rawAddress.toString(), pcb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgSetTimes(lpszname: Pcwstr, pctime: ConstPtr, patime: ConstPtr, pmtime: ConstPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageStgSetTimes(lpszname.rawAddress.toString(), pctime.rawAddress.toString(), patime.rawAddress.toString(), pmtime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToPropVariant(pvar: ConstPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageVariantToPropVariant(pvar.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winRTPropertyValueToPropVariant(punkpropertyvalue: MutPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageWinRTPropertyValueToPropVariant(punkpropertyvalue.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeClassStg(pstg: MutPtr, rclsid: ConstPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageWriteClassStg(pstg.rawAddress.toString(), rclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeClassStm(pstm: MutPtr, rclsid: ConstPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageWriteClassStm(pstm.rawAddress.toString(), rclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeFmtUserTypeStg(pstg: MutPtr, cf: UShort, lpszusertype: Pcwstr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAvailable) wasmWindowssysWindowsWin32SystemComStructuredstorageWriteFmtUserTypeStg(pstg.rawAddress.toString(), cf.toInt(), lpszusertype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

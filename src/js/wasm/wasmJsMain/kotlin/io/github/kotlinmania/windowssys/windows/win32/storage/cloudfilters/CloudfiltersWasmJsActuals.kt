@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileInfoByHandleClass

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32StorageCloudfiltersNapiAddon(): Boolean

private val windowsWin32StorageCloudfiltersNapiAvailable: Boolean = initWindowsWin32StorageCloudfiltersNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfCloseHandle(p0)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfCloseHandle(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfConnectSyncRoot(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfConnectSyncRoot(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfConvertToPlaceholder(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfConvertToPlaceholder(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfCreatePlaceholders(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfCreatePlaceholders(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfDehydratePlaceholder(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfDehydratePlaceholder(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfDisconnectSyncRoot(p0)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfDisconnectSyncRoot(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfExecute(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfExecute(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfGetCorrelationVector(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfGetCorrelationVector(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderInfo(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfo(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfoForHydration(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfoForHydration(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromAttributeTag(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromAttributeTag(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFileInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFileInfo(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFindData(p0)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFindData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfGetPlatformInfo(p0)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfGetPlatformInfo(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByHandle(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByHandle(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByPath(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByPath(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfGetTransferKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfGetTransferKey(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfGetWin32HandleFromProtectedHandle(p0)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfGetWin32HandleFromProtectedHandle(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfHydratePlaceholder(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfHydratePlaceholder(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfOpenFileWithOplock(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfOpenFileWithOplock(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfQuerySyncProviderStatus(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfQuerySyncProviderStatus(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfReferenceProtectedHandle(p0)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfReferenceProtectedHandle(p0: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfRegisterSyncRoot(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfRegisterSyncRoot(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfReleaseProtectedHandle(p0)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfReleaseProtectedHandle(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfReleaseTransferKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfReleaseTransferKey(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress2(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress2(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfReportSyncStatus(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfReportSyncStatus(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfRevertPlaceholder(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfRevertPlaceholder(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfSetCorrelationVector(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfSetCorrelationVector(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfSetInSyncState(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfSetInSyncState(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfSetPinState(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfSetPinState(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfUnregisterSyncRoot(p0)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfUnregisterSyncRoot(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfUpdatePlaceholder(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfUpdatePlaceholder(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageCloudfiltersCfUpdateSyncProviderStatus(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageCloudfiltersCfUpdateSyncProviderStatus(p0: String, p1: Int): Int

public actual fun cfCloseHandle(filehandle: Handle) {
    if (windowsWin32StorageCloudfiltersNapiAvailable) {
        wasmWindowssysWindowsWin32StorageCloudfiltersCfCloseHandle(filehandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cfConnectSyncRoot(syncrootpath: Pcwstr, callbacktable: ConstPtr, callbackcontext: ConstPtr, connectflags: CfConnectFlags, connectionkey: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfConnectSyncRoot(syncrootpath.rawAddress.toString(), callbacktable.rawAddress.toString(), callbackcontext.rawAddress.toString(), connectflags, connectionkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfConvertToPlaceholder(filehandle: Handle, fileidentity: ConstPtr, fileidentitylength: UInt, convertflags: CfConvertFlags, convertusn: MutPtr, overlapped: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfConvertToPlaceholder(filehandle.rawAddress.toString(), fileidentity.rawAddress.toString(), fileidentitylength.toInt(), convertflags, convertusn.rawAddress.toString(), overlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfCreatePlaceholders(basedirectorypath: Pcwstr, placeholderarray: MutPtr, placeholdercount: UInt, createflags: CfCreateFlags, entriesprocessed: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfCreatePlaceholders(basedirectorypath.rawAddress.toString(), placeholderarray.rawAddress.toString(), placeholdercount.toInt(), createflags, entriesprocessed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfDehydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, dehydrateflags: CfDehydrateFlags, overlapped: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfDehydratePlaceholder(filehandle.rawAddress.toString(), startingoffset.toString(), length.toString(), dehydrateflags, overlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfDisconnectSyncRoot(connectionkey: CfConnectionKey): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfDisconnectSyncRoot(connectionkey.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfExecute(opinfo: ConstPtr, opparams: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfExecute(opinfo.rawAddress.toString(), opparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetCorrelationVector(filehandle: Handle, correlationvector: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfGetCorrelationVector(filehandle.rawAddress.toString(), correlationvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderInfo(filehandle: Handle, infoclass: CfPlaceholderInfoClass, infobuffer: MutPtr, infobufferlength: UInt, returnedlength: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderInfo(filehandle.rawAddress.toString(), infoclass, infobuffer.rawAddress.toString(), infobufferlength.toInt(), returnedlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderRangeInfo(filehandle: Handle, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, length: Long, infobuffer: MutPtr, infobufferlength: UInt, returnedlength: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfo(filehandle.rawAddress.toString(), infoclass, startingoffset.toString(), length.toString(), infobuffer.rawAddress.toString(), infobufferlength.toInt(), returnedlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderRangeInfoForHydration(connectionkey: CfConnectionKey, transferkey: Long, fileid: Long, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, rangelength: Long, infobuffer: MutPtr, infobuffersize: UInt, infobufferwritten: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfoForHydration(connectionkey.toString(), transferkey.toString(), fileid.toString(), infoclass, startingoffset.toString(), rangelength.toString(), infobuffer.rawAddress.toString(), infobuffersize.toInt(), infobufferwritten.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CfPlaceholderState =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromAttributeTag(fileattributes.toInt(), reparsetag.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderStateFromFileInfo(infobuffer: ConstPtr, infoclass: FileInfoByHandleClass): CfPlaceholderState =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFileInfo(infobuffer.rawAddress.toString(), infoclass).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderStateFromFindData(finddata: ConstPtr): CfPlaceholderState =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFindData(finddata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlatformInfo(platformversion: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfGetPlatformInfo(platformversion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetSyncRootInfoByHandle(filehandle: Handle, infoclass: CfSyncRootInfoClass, infobuffer: MutPtr, infobufferlength: UInt, returnedlength: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByHandle(filehandle.rawAddress.toString(), infoclass, infobuffer.rawAddress.toString(), infobufferlength.toInt(), returnedlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetSyncRootInfoByPath(filepath: Pcwstr, infoclass: CfSyncRootInfoClass, infobuffer: MutPtr, infobufferlength: UInt, returnedlength: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByPath(filepath.rawAddress.toString(), infoclass, infobuffer.rawAddress.toString(), infobufferlength.toInt(), returnedlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetTransferKey(filehandle: Handle, transferkey: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfGetTransferKey(filehandle.rawAddress.toString(), transferkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetWin32HandleFromProtectedHandle(protectedhandle: Handle): Handle =
    if (windowsWin32StorageCloudfiltersNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StorageCloudfiltersCfGetWin32HandleFromProtectedHandle(protectedhandle.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfHydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, hydrateflags: CfHydrateFlags, overlapped: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfHydratePlaceholder(filehandle.rawAddress.toString(), startingoffset.toString(), length.toString(), hydrateflags, overlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfOpenFileWithOplock(filepath: Pcwstr, flags: CfOpenFileFlags, protectedhandle: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfOpenFileWithOplock(filepath.rawAddress.toString(), flags, protectedhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfQuerySyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfQuerySyncProviderStatus(connectionkey.toString(), providerstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfReferenceProtectedHandle(protectedhandle: Handle): Boolean =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfReferenceProtectedHandle(protectedhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfRegisterSyncRoot(syncrootpath: Pcwstr, registration: ConstPtr, policies: ConstPtr, registerflags: CfRegisterFlags): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfRegisterSyncRoot(syncrootpath.rawAddress.toString(), registration.rawAddress.toString(), policies.rawAddress.toString(), registerflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfReleaseProtectedHandle(protectedhandle: Handle) {
    if (windowsWin32StorageCloudfiltersNapiAvailable) {
        wasmWindowssysWindowsWin32StorageCloudfiltersCfReleaseProtectedHandle(protectedhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cfReleaseTransferKey(filehandle: Handle, transferkey: ConstPtr) {
    if (windowsWin32StorageCloudfiltersNapiAvailable) {
        wasmWindowssysWindowsWin32StorageCloudfiltersCfReleaseTransferKey(filehandle.rawAddress.toString(), transferkey.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cfReportProviderProgress(connectionkey: CfConnectionKey, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress(connectionkey.toString(), transferkey.toString(), providerprogresstotal.toString(), providerprogresscompleted.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfReportProviderProgress2(connectionkey: CfConnectionKey, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress2(connectionkey.toString(), transferkey.toString(), requestkey.toString(), providerprogresstotal.toString(), providerprogresscompleted.toString(), targetsessionid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfReportSyncStatus(syncrootpath: Pcwstr, syncstatus: ConstPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfReportSyncStatus(syncrootpath.rawAddress.toString(), syncstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfRevertPlaceholder(filehandle: Handle, revertflags: CfRevertFlags, overlapped: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfRevertPlaceholder(filehandle.rawAddress.toString(), revertflags, overlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfSetCorrelationVector(filehandle: Handle, correlationvector: ConstPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfSetCorrelationVector(filehandle.rawAddress.toString(), correlationvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfSetInSyncState(filehandle: Handle, insyncstate: CfInSyncState, insyncflags: CfSetInSyncFlags, insyncusn: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfSetInSyncState(filehandle.rawAddress.toString(), insyncstate, insyncflags, insyncusn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfSetPinState(filehandle: Handle, pinstate: CfPinState, pinflags: CfSetPinFlags, overlapped: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfSetPinState(filehandle.rawAddress.toString(), pinstate, pinflags, overlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfUnregisterSyncRoot(syncrootpath: Pcwstr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfUnregisterSyncRoot(syncrootpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfUpdatePlaceholder(filehandle: Handle, fsmetadata: ConstPtr, fileidentity: ConstPtr, fileidentitylength: UInt, dehydraterangearray: ConstPtr, dehydraterangecount: UInt, updateflags: CfUpdateFlags, updateusn: MutPtr, overlapped: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfUpdatePlaceholder(filehandle.rawAddress.toString(), fsmetadata.rawAddress.toString(), fileidentity.rawAddress.toString(), fileidentitylength.toInt(), dehydraterangearray.rawAddress.toString(), dehydraterangecount.toInt(), updateflags, updateusn.rawAddress.toString(), overlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfUpdateSyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: CfSyncProviderStatus): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAvailable) wasmWindowssysWindowsWin32StorageCloudfiltersCfUpdateSyncProviderStatus(connectionkey.toString(), providerstatus.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

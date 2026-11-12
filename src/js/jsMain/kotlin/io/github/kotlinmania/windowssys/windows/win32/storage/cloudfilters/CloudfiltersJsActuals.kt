@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileInfoByHandleClass

private val windowsWin32StorageCloudfiltersNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun cfCloseHandle(filehandle: Handle) {
    if (windowsWin32StorageCloudfiltersNapiAddon != null) {
        windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfCloseHandle(filehandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cfConnectSyncRoot(syncrootpath: Pcwstr, callbacktable: ConstPtr, callbackcontext: ConstPtr, connectflags: CfConnectFlags, connectionkey: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfConnectSyncRoot(syncrootpath.rawAddress.toString(), callbacktable.rawAddress.toString(), callbackcontext.rawAddress.toString(), connectflags, connectionkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfConvertToPlaceholder(filehandle: Handle, fileidentity: ConstPtr, fileidentitylength: UInt, convertflags: CfConvertFlags, convertusn: MutPtr, overlapped: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfConvertToPlaceholder(filehandle.rawAddress.toString(), fileidentity.rawAddress.toString(), fileidentitylength.toInt(), convertflags, convertusn.rawAddress.toString(), overlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfCreatePlaceholders(basedirectorypath: Pcwstr, placeholderarray: MutPtr, placeholdercount: UInt, createflags: CfCreateFlags, entriesprocessed: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfCreatePlaceholders(basedirectorypath.rawAddress.toString(), placeholderarray.rawAddress.toString(), placeholdercount.toInt(), createflags, entriesprocessed.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfDehydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, dehydrateflags: CfDehydrateFlags, overlapped: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfDehydratePlaceholder(filehandle.rawAddress.toString(), startingoffset.toString(), length.toString(), dehydrateflags, overlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfDisconnectSyncRoot(connectionkey: CfConnectionKey): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfDisconnectSyncRoot(connectionkey.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfExecute(opinfo: ConstPtr, opparams: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfExecute(opinfo.rawAddress.toString(), opparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetCorrelationVector(filehandle: Handle, correlationvector: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfGetCorrelationVector(filehandle.rawAddress.toString(), correlationvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderInfo(filehandle: Handle, infoclass: CfPlaceholderInfoClass, infobuffer: MutPtr, infobufferlength: UInt, returnedlength: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderInfo(filehandle.rawAddress.toString(), infoclass, infobuffer.rawAddress.toString(), infobufferlength.toInt(), returnedlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderRangeInfo(filehandle: Handle, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, length: Long, infobuffer: MutPtr, infobufferlength: UInt, returnedlength: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfo(filehandle.rawAddress.toString(), infoclass, startingoffset.toString(), length.toString(), infobuffer.rawAddress.toString(), infobufferlength.toInt(), returnedlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderRangeInfoForHydration(connectionkey: CfConnectionKey, transferkey: Long, fileid: Long, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, rangelength: Long, infobuffer: MutPtr, infobuffersize: UInt, infobufferwritten: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfoForHydration(connectionkey.toString(), transferkey.toString(), fileid.toString(), infoclass, startingoffset.toString(), rangelength.toString(), infobuffer.rawAddress.toString(), infobuffersize.toInt(), infobufferwritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CfPlaceholderState =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromAttributeTag(fileattributes.toInt(), reparsetag.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderStateFromFileInfo(infobuffer: ConstPtr, infoclass: FileInfoByHandleClass): CfPlaceholderState =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFileInfo(infobuffer.rawAddress.toString(), infoclass) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlaceholderStateFromFindData(finddata: ConstPtr): CfPlaceholderState =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFindData(finddata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetPlatformInfo(platformversion: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfGetPlatformInfo(platformversion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetSyncRootInfoByHandle(filehandle: Handle, infoclass: CfSyncRootInfoClass, infobuffer: MutPtr, infobufferlength: UInt, returnedlength: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByHandle(filehandle.rawAddress.toString(), infoclass, infobuffer.rawAddress.toString(), infobufferlength.toInt(), returnedlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetSyncRootInfoByPath(filepath: Pcwstr, infoclass: CfSyncRootInfoClass, infobuffer: MutPtr, infobufferlength: UInt, returnedlength: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByPath(filepath.rawAddress.toString(), infoclass, infobuffer.rawAddress.toString(), infobufferlength.toInt(), returnedlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetTransferKey(filehandle: Handle, transferkey: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfGetTransferKey(filehandle.rawAddress.toString(), transferkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfGetWin32HandleFromProtectedHandle(protectedhandle: Handle): Handle =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) MutPtr((windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfGetWin32HandleFromProtectedHandle(protectedhandle.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfHydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, hydrateflags: CfHydrateFlags, overlapped: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfHydratePlaceholder(filehandle.rawAddress.toString(), startingoffset.toString(), length.toString(), hydrateflags, overlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfOpenFileWithOplock(filepath: Pcwstr, flags: CfOpenFileFlags, protectedhandle: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfOpenFileWithOplock(filepath.rawAddress.toString(), flags, protectedhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfQuerySyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfQuerySyncProviderStatus(connectionkey.toString(), providerstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfReferenceProtectedHandle(protectedhandle: Handle): Boolean =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfReferenceProtectedHandle(protectedhandle.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfRegisterSyncRoot(syncrootpath: Pcwstr, registration: ConstPtr, policies: ConstPtr, registerflags: CfRegisterFlags): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfRegisterSyncRoot(syncrootpath.rawAddress.toString(), registration.rawAddress.toString(), policies.rawAddress.toString(), registerflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfReleaseProtectedHandle(protectedhandle: Handle) {
    if (windowsWin32StorageCloudfiltersNapiAddon != null) {
        windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfReleaseProtectedHandle(protectedhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cfReleaseTransferKey(filehandle: Handle, transferkey: ConstPtr) {
    if (windowsWin32StorageCloudfiltersNapiAddon != null) {
        windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfReleaseTransferKey(filehandle.rawAddress.toString(), transferkey.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cfReportProviderProgress(connectionkey: CfConnectionKey, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress(connectionkey.toString(), transferkey.toString(), providerprogresstotal.toString(), providerprogresscompleted.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfReportProviderProgress2(connectionkey: CfConnectionKey, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress2(connectionkey.toString(), transferkey.toString(), requestkey.toString(), providerprogresstotal.toString(), providerprogresscompleted.toString(), targetsessionid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfReportSyncStatus(syncrootpath: Pcwstr, syncstatus: ConstPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfReportSyncStatus(syncrootpath.rawAddress.toString(), syncstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfRevertPlaceholder(filehandle: Handle, revertflags: CfRevertFlags, overlapped: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfRevertPlaceholder(filehandle.rawAddress.toString(), revertflags, overlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfSetCorrelationVector(filehandle: Handle, correlationvector: ConstPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfSetCorrelationVector(filehandle.rawAddress.toString(), correlationvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfSetInSyncState(filehandle: Handle, insyncstate: CfInSyncState, insyncflags: CfSetInSyncFlags, insyncusn: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfSetInSyncState(filehandle.rawAddress.toString(), insyncstate, insyncflags, insyncusn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfSetPinState(filehandle: Handle, pinstate: CfPinState, pinflags: CfSetPinFlags, overlapped: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfSetPinState(filehandle.rawAddress.toString(), pinstate, pinflags, overlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfUnregisterSyncRoot(syncrootpath: Pcwstr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfUnregisterSyncRoot(syncrootpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfUpdatePlaceholder(filehandle: Handle, fsmetadata: ConstPtr, fileidentity: ConstPtr, fileidentitylength: UInt, dehydraterangearray: ConstPtr, dehydraterangecount: UInt, updateflags: CfUpdateFlags, updateusn: MutPtr, overlapped: MutPtr): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfUpdatePlaceholder(filehandle.rawAddress.toString(), fsmetadata.rawAddress.toString(), fileidentity.rawAddress.toString(), fileidentitylength.toInt(), dehydraterangearray.rawAddress.toString(), dehydraterangecount.toInt(), updateflags, updateusn.rawAddress.toString(), overlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfUpdateSyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: CfSyncProviderStatus): Hresult =
    if (windowsWin32StorageCloudfiltersNapiAddon != null) (windowsWin32StorageCloudfiltersNapiAddon.windowssysWindowsWin32StorageCloudfiltersCfUpdateSyncProviderStatus(connectionkey.toString(), providerstatus.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

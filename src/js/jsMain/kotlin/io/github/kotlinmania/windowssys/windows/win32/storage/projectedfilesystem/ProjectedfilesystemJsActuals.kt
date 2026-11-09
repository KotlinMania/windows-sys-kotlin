@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private val _windowsWin32StorageProjectedfilesystemNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun PrjAllocateAlignedBuffer(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, size: ULong): Long =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjAllocateAlignedBuffer(namespacevirtualizationcontext.toString(), size.toString()) as String).toLong() else 0L

public actual fun PrjClearNegativePathCache(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, totalentrynumber: Long): HRESULT =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjClearNegativePathCache(namespacevirtualizationcontext.toString(), totalentrynumber.toString()) as Int) else 0

public actual fun PrjCompleteCommand(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, commandid: Int, completionresult: HRESULT, extendedparameters: Long): HRESULT =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjCompleteCommand(namespacevirtualizationcontext.toString(), commandid, completionresult, extendedparameters.toString()) as Int) else 0

public actual fun PrjDeleteFile(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, updateflags: PRJ_UPDATE_TYPES, failurereason: Long): HRESULT =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjDeleteFile(namespacevirtualizationcontext.toString(), destinationfilename.toString(), updateflags, failurereason.toString()) as Int) else 0

public actual fun PrjDoesNameContainWildCards(filename: PCWSTR): Boolean =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjDoesNameContainWildCards(filename.toString()) as Boolean) else false

public actual fun PrjFileNameCompare(filename1: PCWSTR, filename2: PCWSTR): Int =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjFileNameCompare(filename1.toString(), filename2.toString()) as Int) else 0

public actual fun PrjFileNameMatch(filenametocheck: PCWSTR, pattern: PCWSTR): Boolean =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjFileNameMatch(filenametocheck.toString(), pattern.toString()) as Boolean) else false

public actual fun PrjFillDirEntryBuffer(filename: PCWSTR, filebasicinfo: Long, direntrybufferhandle: PRJ_DIR_ENTRY_BUFFER_HANDLE): HRESULT =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjFillDirEntryBuffer(filename.toString(), filebasicinfo.toString(), direntrybufferhandle.toString()) as Int) else 0

public actual fun PrjFillDirEntryBuffer2(direntrybufferhandle: PRJ_DIR_ENTRY_BUFFER_HANDLE, filename: PCWSTR, filebasicinfo: Long, extendedinfo: Long): HRESULT =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjFillDirEntryBuffer2(direntrybufferhandle.toString(), filename.toString(), filebasicinfo.toString(), extendedinfo.toString()) as Int) else 0

public actual fun PrjFreeAlignedBuffer(buffer: Long) {
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) {
        _windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjFreeAlignedBuffer(buffer.toString())
    }
}

public actual fun PrjGetOnDiskFileState(destinationfilename: PCWSTR, filestate: Long): HRESULT =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjGetOnDiskFileState(destinationfilename.toString(), filestate.toString()) as Int) else 0

public actual fun PrjGetVirtualizationInstanceInfo(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, virtualizationinstanceinfo: Long): HRESULT =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjGetVirtualizationInstanceInfo(namespacevirtualizationcontext.toString(), virtualizationinstanceinfo.toString()) as Int) else 0

public actual fun PrjMarkDirectoryAsPlaceholder(rootpathname: PCWSTR, targetpathname: PCWSTR, versioninfo: Long, virtualizationinstanceid: Long): HRESULT =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjMarkDirectoryAsPlaceholder(rootpathname.toString(), targetpathname.toString(), versioninfo.toString(), virtualizationinstanceid.toString()) as Int) else 0

public actual fun PrjStartVirtualizing(virtualizationrootpath: PCWSTR, callbacks: Long, instancecontext: Long, options: Long, namespacevirtualizationcontext: Long): HRESULT =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjStartVirtualizing(virtualizationrootpath.toString(), callbacks.toString(), instancecontext.toString(), options.toString(), namespacevirtualizationcontext.toString()) as Int) else 0

public actual fun PrjStopVirtualizing(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT) {
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) {
        _windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjStopVirtualizing(namespacevirtualizationcontext.toString())
    }
}

public actual fun PrjUpdateFileIfNeeded(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt, updateflags: PRJ_UPDATE_TYPES, failurereason: Long): HRESULT =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjUpdateFileIfNeeded(namespacevirtualizationcontext.toString(), destinationfilename.toString(), placeholderinfo.toString(), placeholderinfosize.toInt(), updateflags, failurereason.toString()) as Int) else 0

public actual fun PrjWriteFileData(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, datastreamid: Long, buffer: Long, byteoffset: ULong, length: UInt): HRESULT =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjWriteFileData(namespacevirtualizationcontext.toString(), datastreamid.toString(), buffer.toString(), byteoffset.toString(), length.toInt()) as Int) else 0

public actual fun PrjWritePlaceholderInfo(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt): HRESULT =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjWritePlaceholderInfo(namespacevirtualizationcontext.toString(), destinationfilename.toString(), placeholderinfo.toString(), placeholderinfosize.toInt()) as Int) else 0

public actual fun PrjWritePlaceholderInfo2(namespacevirtualizationcontext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT, destinationfilename: PCWSTR, placeholderinfo: Long, placeholderinfosize: UInt, extendedinfo: Long): HRESULT =
    if (_windowsWin32StorageProjectedfilesystemNapiAddon != null) (_windowsWin32StorageProjectedfilesystemNapiAddon.windowssys_windows_win32_storage_projectedfilesystem_PrjWritePlaceholderInfo2(namespacevirtualizationcontext.toString(), destinationfilename.toString(), placeholderinfo.toString(), placeholderinfosize.toInt(), extendedinfo.toString()) as Int) else 0

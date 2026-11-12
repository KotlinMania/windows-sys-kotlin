@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileInfoByHandleClass
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.Win32FindDataa
import io.github.kotlinmania.windowssys.windows.win32.system.CorrelationVector
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

private object WindowsWin32StorageCloudfiltersJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32StorageCloudfiltersJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfCloseHandle(filehandle: Long)

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfConnectSyncRoot(syncrootpath: Long, callbacktable: Long, callbackcontext: Long, connectflags: Int, connectionkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfConvertToPlaceholder(filehandle: Long, fileidentity: Long, fileidentitylength: Int, convertflags: Int, convertusn: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfCreatePlaceholders(basedirectorypath: Long, placeholderarray: Long, placeholdercount: Int, createflags: Int, entriesprocessed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfDehydratePlaceholder(filehandle: Long, startingoffset: Long, length: Long, dehydrateflags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfDisconnectSyncRoot(connectionkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfExecute(opinfo: Long, opparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfGetCorrelationVector(filehandle: Long, correlationvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderInfo(filehandle: Long, infoclass: Int, infobuffer: Long, infobufferlength: Int, returnedlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfo(filehandle: Long, infoclass: Int, startingoffset: Long, length: Long, infobuffer: Long, infobufferlength: Int, returnedlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfoForHydration(connectionkey: Long, transferkey: Long, fileid: Long, infoclass: Int, startingoffset: Long, rangelength: Long, infobuffer: Long, infobuffersize: Int, infobufferwritten: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromAttributeTag(fileattributes: Int, reparsetag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFileInfo(infobuffer: Long, infoclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFindData(finddata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfGetPlatformInfo(platformversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByHandle(filehandle: Long, infoclass: Int, infobuffer: Long, infobufferlength: Int, returnedlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByPath(filepath: Long, infoclass: Int, infobuffer: Long, infobufferlength: Int, returnedlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfGetTransferKey(filehandle: Long, transferkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfGetWin32HandleFromProtectedHandle(protectedhandle: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfHydratePlaceholder(filehandle: Long, startingoffset: Long, length: Long, hydrateflags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfOpenFileWithOplock(filepath: Long, flags: Int, protectedhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfQuerySyncProviderStatus(connectionkey: Long, providerstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfReferenceProtectedHandle(protectedhandle: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfRegisterSyncRoot(syncrootpath: Long, registration: Long, policies: Long, registerflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfReleaseProtectedHandle(protectedhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfReleaseTransferKey(filehandle: Long, transferkey: Long)

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress(connectionkey: Long, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress2(connectionkey: Long, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfReportSyncStatus(syncrootpath: Long, syncstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfRevertPlaceholder(filehandle: Long, revertflags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfSetCorrelationVector(filehandle: Long, correlationvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfSetInSyncState(filehandle: Long, insyncstate: Int, insyncflags: Int, insyncusn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfSetPinState(filehandle: Long, pinstate: Int, pinflags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfUnregisterSyncRoot(syncrootpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfUpdatePlaceholder(filehandle: Long, fsmetadata: Long, fileidentity: Long, fileidentitylength: Int, dehydraterangearray: Long, dehydraterangecount: Int, updateflags: Int, updateusn: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageCloudfiltersCfUpdateSyncProviderStatus(connectionkey: Long, providerstatus: Int): Int
}

public actual fun cfCloseHandle(filehandle: Handle) {
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfCloseHandle(filehandle.rawAddress)
}

public actual fun cfConnectSyncRoot(syncrootpath: Pcwstr, callbacktable: ConstPtr<CfCallbackRegistration>, callbackcontext: ConstPtr<CVoid>, connectflags: CfConnectFlags, connectionkey: MutPtr<CfConnectionKey>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfConnectSyncRoot(syncrootpath.rawAddress, callbacktable.rawAddress, callbackcontext.rawAddress, connectflags, connectionkey.rawAddress)

public actual fun cfConvertToPlaceholder(filehandle: Handle, fileidentity: ConstPtr<CVoid>, fileidentitylength: UInt, convertflags: CfConvertFlags, convertusn: MutPtr<Long>, overlapped: MutPtr<Overlapped>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfConvertToPlaceholder(filehandle.rawAddress, fileidentity.rawAddress, fileidentitylength.toInt(), convertflags, convertusn.rawAddress, overlapped.rawAddress)

public actual fun cfCreatePlaceholders(basedirectorypath: Pcwstr, placeholderarray: MutPtr<CfPlaceholderCreateInfo>, placeholdercount: UInt, createflags: CfCreateFlags, entriesprocessed: MutPtr<UInt>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfCreatePlaceholders(basedirectorypath.rawAddress, placeholderarray.rawAddress, placeholdercount.toInt(), createflags, entriesprocessed.rawAddress)

public actual fun cfDehydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, dehydrateflags: CfDehydrateFlags, overlapped: MutPtr<Overlapped>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfDehydratePlaceholder(filehandle.rawAddress, startingoffset, length, dehydrateflags, overlapped.rawAddress)

public actual fun cfDisconnectSyncRoot(connectionkey: CfConnectionKey): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfDisconnectSyncRoot(connectionkey)

public actual fun cfExecute(opinfo: ConstPtr<CfOperationInfo>, opparams: MutPtr<CfOperationParameters>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfExecute(opinfo.rawAddress, opparams.rawAddress)

public actual fun cfGetCorrelationVector(filehandle: Handle, correlationvector: MutPtr<CorrelationVector.CorrelationVector>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfGetCorrelationVector(filehandle.rawAddress, correlationvector.rawAddress)

public actual fun cfGetPlaceholderInfo(filehandle: Handle, infoclass: CfPlaceholderInfoClass, infobuffer: MutPtr<CVoid>, infobufferlength: UInt, returnedlength: MutPtr<UInt>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderInfo(filehandle.rawAddress, infoclass, infobuffer.rawAddress, infobufferlength.toInt(), returnedlength.rawAddress)

public actual fun cfGetPlaceholderRangeInfo(filehandle: Handle, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, length: Long, infobuffer: MutPtr<CVoid>, infobufferlength: UInt, returnedlength: MutPtr<UInt>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfo(filehandle.rawAddress, infoclass, startingoffset, length, infobuffer.rawAddress, infobufferlength.toInt(), returnedlength.rawAddress)

public actual fun cfGetPlaceholderRangeInfoForHydration(connectionkey: CfConnectionKey, transferkey: Long, fileid: Long, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, rangelength: Long, infobuffer: MutPtr<CVoid>, infobuffersize: UInt, infobufferwritten: MutPtr<UInt>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfoForHydration(connectionkey, transferkey, fileid, infoclass, startingoffset, rangelength, infobuffer.rawAddress, infobuffersize.toInt(), infobufferwritten.rawAddress)

public actual fun cfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CfPlaceholderState =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromAttributeTag(fileattributes.toInt(), reparsetag.toInt()).toUInt()

public actual fun cfGetPlaceholderStateFromFileInfo(infobuffer: ConstPtr<CVoid>, infoclass: FileInfoByHandleClass): CfPlaceholderState =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFileInfo(infobuffer.rawAddress, infoclass).toUInt()

public actual fun cfGetPlaceholderStateFromFindData(finddata: ConstPtr<Win32FindDataa>): CfPlaceholderState =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFindData(finddata.rawAddress).toUInt()

public actual fun cfGetPlatformInfo(platformversion: MutPtr<CfPlatformInfo>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfGetPlatformInfo(platformversion.rawAddress)

public actual fun cfGetSyncRootInfoByHandle(filehandle: Handle, infoclass: CfSyncRootInfoClass, infobuffer: MutPtr<CVoid>, infobufferlength: UInt, returnedlength: MutPtr<UInt>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByHandle(filehandle.rawAddress, infoclass, infobuffer.rawAddress, infobufferlength.toInt(), returnedlength.rawAddress)

public actual fun cfGetSyncRootInfoByPath(filepath: Pcwstr, infoclass: CfSyncRootInfoClass, infobuffer: MutPtr<CVoid>, infobufferlength: UInt, returnedlength: MutPtr<UInt>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByPath(filepath.rawAddress, infoclass, infobuffer.rawAddress, infobufferlength.toInt(), returnedlength.rawAddress)

public actual fun cfGetTransferKey(filehandle: Handle, transferkey: MutPtr<Long>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfGetTransferKey(filehandle.rawAddress, transferkey.rawAddress)

public actual fun cfGetWin32HandleFromProtectedHandle(protectedhandle: Handle): Handle =
    MutPtr(WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfGetWin32HandleFromProtectedHandle(protectedhandle.rawAddress))

public actual fun cfHydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, hydrateflags: CfHydrateFlags, overlapped: MutPtr<Overlapped>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfHydratePlaceholder(filehandle.rawAddress, startingoffset, length, hydrateflags, overlapped.rawAddress)

public actual fun cfOpenFileWithOplock(filepath: Pcwstr, flags: CfOpenFileFlags, protectedhandle: MutPtr<Handle>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfOpenFileWithOplock(filepath.rawAddress, flags, protectedhandle.rawAddress)

public actual fun cfQuerySyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: MutPtr<CfSyncProviderStatus>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfQuerySyncProviderStatus(connectionkey, providerstatus.rawAddress)

public actual fun cfReferenceProtectedHandle(protectedhandle: Handle): Boolean =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfReferenceProtectedHandle(protectedhandle.rawAddress)

public actual fun cfRegisterSyncRoot(syncrootpath: Pcwstr, registration: ConstPtr<CfSyncRegistration>, policies: ConstPtr<CfSyncPolicies>, registerflags: CfRegisterFlags): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfRegisterSyncRoot(syncrootpath.rawAddress, registration.rawAddress, policies.rawAddress, registerflags)

public actual fun cfReleaseProtectedHandle(protectedhandle: Handle) {
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfReleaseProtectedHandle(protectedhandle.rawAddress)
}

public actual fun cfReleaseTransferKey(filehandle: Handle, transferkey: ConstPtr<Long>) {
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfReleaseTransferKey(filehandle.rawAddress, transferkey.rawAddress)
}

public actual fun cfReportProviderProgress(connectionkey: CfConnectionKey, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress(connectionkey, transferkey, providerprogresstotal, providerprogresscompleted)

public actual fun cfReportProviderProgress2(connectionkey: CfConnectionKey, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress2(connectionkey, transferkey, requestkey, providerprogresstotal, providerprogresscompleted, targetsessionid.toInt())

public actual fun cfReportSyncStatus(syncrootpath: Pcwstr, syncstatus: ConstPtr<CfSyncStatus>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfReportSyncStatus(syncrootpath.rawAddress, syncstatus.rawAddress)

public actual fun cfRevertPlaceholder(filehandle: Handle, revertflags: CfRevertFlags, overlapped: MutPtr<Overlapped>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfRevertPlaceholder(filehandle.rawAddress, revertflags, overlapped.rawAddress)

public actual fun cfSetCorrelationVector(filehandle: Handle, correlationvector: ConstPtr<CorrelationVector.CorrelationVector>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfSetCorrelationVector(filehandle.rawAddress, correlationvector.rawAddress)

public actual fun cfSetInSyncState(filehandle: Handle, insyncstate: CfInSyncState, insyncflags: CfSetInSyncFlags, insyncusn: MutPtr<Long>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfSetInSyncState(filehandle.rawAddress, insyncstate, insyncflags, insyncusn.rawAddress)

public actual fun cfSetPinState(filehandle: Handle, pinstate: CfPinState, pinflags: CfSetPinFlags, overlapped: MutPtr<Overlapped>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfSetPinState(filehandle.rawAddress, pinstate, pinflags, overlapped.rawAddress)

public actual fun cfUnregisterSyncRoot(syncrootpath: Pcwstr): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfUnregisterSyncRoot(syncrootpath.rawAddress)

public actual fun cfUpdatePlaceholder(filehandle: Handle, fsmetadata: ConstPtr<CfFsMetadata>, fileidentity: ConstPtr<CVoid>, fileidentitylength: UInt, dehydraterangearray: ConstPtr<CfFileRange>, dehydraterangecount: UInt, updateflags: CfUpdateFlags, updateusn: MutPtr<Long>, overlapped: MutPtr<Overlapped>): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfUpdatePlaceholder(filehandle.rawAddress, fsmetadata.rawAddress, fileidentity.rawAddress, fileidentitylength.toInt(), dehydraterangearray.rawAddress, dehydraterangecount.toInt(), updateflags, updateusn.rawAddress, overlapped.rawAddress)

public actual fun cfUpdateSyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: CfSyncProviderStatus): Hresult =
    WindowsWin32StorageCloudfiltersJniBridge.windowssysWindowsWin32StorageCloudfiltersCfUpdateSyncProviderStatus(connectionkey, providerstatus.toInt())

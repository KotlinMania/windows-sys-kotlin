@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.ExceptionPointers

private object WindowsWin32SystemErrorreportingJniBridge {
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
        val stream = WindowsWin32SystemErrorreportingJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationA(szapplication: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationW(wszapplication: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingReportFault(pep: Long, dwopt: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerAddExcludedApplication(pwzexename: Long, ballusers: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerFreeString(pwszstr: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerGetFlags(hprocess: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerRegisterAdditionalProcess(processid: Int, captureextrainfoforthreadid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerRegisterAppLocalDump(localappdatarelativepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerRegisterCustomMetadata(key: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerRegisterExcludedMemoryBlock(address: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerRegisterFile(pwzfile: Long, regfiletype: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerRegisterMemoryBlock(pvaddress: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerRemoveExcludedApplication(pwzexename: Long, ballusers: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerReportAddDump(hreporthandle: Long, hprocess: Long, hthread: Long, dumptype: Int, pexceptionparam: Long, pdumpcustomoptions: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerReportAddFile(hreporthandle: Long, pwzpath: Long, repfiletype: Int, dwfileflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerReportCloseHandle(hreporthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerReportCreate(pwzeventtype: Long, reptype: Int, preportinformation: Long, phreporthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerReportHang(hwndhungapp: Long, pwzhungapplicationname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerReportSetParameter(hreporthandle: Long, dwparamid: Int, pwzname: Long, pwzvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerReportSetUIOption(hreporthandle: Long, repuitypeid: Int, pwzvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerReportSubmit(hreporthandle: Long, consent: Int, dwflags: Int, psubmitresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerSetFlags(dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerStoreClose(hreportstore: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerStoreGetFirstReportKey(hreportstore: Long, ppszreportkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerStoreGetNextReportKey(hreportstore: Long, ppszreportkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerStoreGetReportCount(hreportstore: Long, pdwreportcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerStoreGetSizeOnDisk(hreportstore: Long, pqwsizeinbytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerStoreOpen(repstoretype: Int, phreportstore: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerStorePurge(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV1(hreportstore: Long, pszreportkey: Long, preportmetadata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV2(hreportstore: Long, pszreportkey: Long, preportmetadata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV3(hreportstore: Long, pszreportkey: Long, preportmetadata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerStoreUploadReport(hreportstore: Long, pszreportkey: Long, dwflags: Int, psubmitresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerUnregisterAdditionalProcess(processid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerUnregisterAppLocalDump(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerUnregisterCustomMetadata(key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerUnregisterExcludedMemoryBlock(address: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerUnregisterFile(pwzfilepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerUnregisterMemoryBlock(pvaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemErrorreportingWerUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Long, pcontext: Long): Int
}

public actual fun addERExcludedApplicationA(szapplication: Pcstr): Bool =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationA(szapplication.rawAddress)

public actual fun addERExcludedApplicationW(wszapplication: Pcwstr): Bool =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationW(wszapplication.rawAddress)

public actual fun reportFault(pep: ConstPtr<ExceptionPointers>, dwopt: UInt): EFaultRepRetVal =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingReportFault(pep.rawAddress, dwopt.toInt())

public actual fun werAddExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerAddExcludedApplication(pwzexename.rawAddress, ballusers)

public actual fun werFreeString(pwszstr: Pcwstr) {
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerFreeString(pwszstr.rawAddress)
}

public actual fun werGetFlags(hprocess: Handle, pdwflags: MutPtr<WerFaultReporting>): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerGetFlags(hprocess.rawAddress, pdwflags.rawAddress)

public actual fun werRegisterAdditionalProcess(processid: UInt, captureextrainfoforthreadid: UInt): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerRegisterAdditionalProcess(processid.toInt(), captureextrainfoforthreadid.toInt())

public actual fun werRegisterAppLocalDump(localappdatarelativepath: Pcwstr): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerRegisterAppLocalDump(localappdatarelativepath.rawAddress)

public actual fun werRegisterCustomMetadata(key: Pcwstr, value: Pcwstr): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerRegisterCustomMetadata(key.rawAddress, value.rawAddress)

public actual fun werRegisterExcludedMemoryBlock(address: ConstPtr<CVoid>, size: UInt): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerRegisterExcludedMemoryBlock(address.rawAddress, size.toInt())

public actual fun werRegisterFile(pwzfile: Pcwstr, regfiletype: WerRegisterFileType, dwflags: WerFile): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerRegisterFile(pwzfile.rawAddress, regfiletype, dwflags.toInt())

public actual fun werRegisterMemoryBlock(pvaddress: ConstPtr<CVoid>, dwsize: UInt): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerRegisterMemoryBlock(pvaddress.rawAddress, dwsize.toInt())

public actual fun werRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerRegisterRuntimeExceptionModule(pwszoutofprocesscallbackdll.rawAddress, pcontext.rawAddress)

public actual fun werRemoveExcludedApplication(pwzexename: Pcwstr, ballusers: Bool): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerRemoveExcludedApplication(pwzexename.rawAddress, ballusers)

public actual fun werReportAddDump(hreporthandle: Hreport, hprocess: Handle, hthread: Handle, dumptype: WerDumpType, pexceptionparam: ConstPtr<WerExceptionInformation>, pdumpcustomoptions: ConstPtr<WerDumpCustomOptions>, dwflags: UInt): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerReportAddDump(hreporthandle.rawAddress, hprocess.rawAddress, hthread.rawAddress, dumptype, pexceptionparam.rawAddress, pdumpcustomoptions.rawAddress, dwflags.toInt())

public actual fun werReportAddFile(hreporthandle: Hreport, pwzpath: Pcwstr, repfiletype: WerFileType, dwfileflags: WerFile): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerReportAddFile(hreporthandle.rawAddress, pwzpath.rawAddress, repfiletype, dwfileflags.toInt())

public actual fun werReportCloseHandle(hreporthandle: Hreport): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerReportCloseHandle(hreporthandle.rawAddress)

public actual fun werReportCreate(pwzeventtype: Pcwstr, reptype: WerReportType, preportinformation: ConstPtr<WerReportInformation>, phreporthandle: MutPtr<Hreport>): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerReportCreate(pwzeventtype.rawAddress, reptype, preportinformation.rawAddress, phreporthandle.rawAddress)

public actual fun werReportHang(hwndhungapp: Hwnd, pwzhungapplicationname: Pcwstr): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerReportHang(hwndhungapp.rawAddress, pwzhungapplicationname.rawAddress)

public actual fun werReportSetParameter(hreporthandle: Hreport, dwparamid: UInt, pwzname: Pcwstr, pwzvalue: Pcwstr): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerReportSetParameter(hreporthandle.rawAddress, dwparamid.toInt(), pwzname.rawAddress, pwzvalue.rawAddress)

public actual fun werReportSetUIOption(hreporthandle: Hreport, repuitypeid: WerReportUi, pwzvalue: Pcwstr): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerReportSetUIOption(hreporthandle.rawAddress, repuitypeid, pwzvalue.rawAddress)

public actual fun werReportSubmit(hreporthandle: Hreport, consent: WerConsent, dwflags: WerSubmitFlags, psubmitresult: MutPtr<WerSubmitResult>): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerReportSubmit(hreporthandle.rawAddress, consent, dwflags.toInt(), psubmitresult.rawAddress)

public actual fun werSetFlags(dwflags: WerFaultReporting): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerSetFlags(dwflags.toInt())

public actual fun werStoreClose(hreportstore: Hreportstore) {
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerStoreClose(hreportstore.rawAddress)
}

public actual fun werStoreGetFirstReportKey(hreportstore: Hreportstore, ppszreportkey: MutPtr<Pcwstr>): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerStoreGetFirstReportKey(hreportstore.rawAddress, ppszreportkey.rawAddress)

public actual fun werStoreGetNextReportKey(hreportstore: Hreportstore, ppszreportkey: MutPtr<Pcwstr>): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerStoreGetNextReportKey(hreportstore.rawAddress, ppszreportkey.rawAddress)

public actual fun werStoreGetReportCount(hreportstore: Hreportstore, pdwreportcount: MutPtr<UInt>): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerStoreGetReportCount(hreportstore.rawAddress, pdwreportcount.rawAddress)

public actual fun werStoreGetSizeOnDisk(hreportstore: Hreportstore, pqwsizeinbytes: MutPtr<ULong>): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerStoreGetSizeOnDisk(hreportstore.rawAddress, pqwsizeinbytes.rawAddress)

public actual fun werStoreOpen(repstoretype: ReportStoreTypes, phreportstore: MutPtr<Hreportstore>): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerStoreOpen(repstoretype, phreportstore.rawAddress)

public actual fun werStorePurge(): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerStorePurge()

public actual fun werStoreQueryReportMetadataV1(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr<WerReportMetadataV1>): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV1(hreportstore.rawAddress, pszreportkey.rawAddress, preportmetadata.rawAddress)

public actual fun werStoreQueryReportMetadataV2(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr<WerReportMetadataV2>): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV2(hreportstore.rawAddress, pszreportkey.rawAddress, preportmetadata.rawAddress)

public actual fun werStoreQueryReportMetadataV3(hreportstore: Hreportstore, pszreportkey: Pcwstr, preportmetadata: MutPtr<WerReportMetadataV3>): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV3(hreportstore.rawAddress, pszreportkey.rawAddress, preportmetadata.rawAddress)

public actual fun werStoreUploadReport(hreportstore: Hreportstore, pszreportkey: Pcwstr, dwflags: UInt, psubmitresult: MutPtr<WerSubmitResult>): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerStoreUploadReport(hreportstore.rawAddress, pszreportkey.rawAddress, dwflags.toInt(), psubmitresult.rawAddress)

public actual fun werUnregisterAdditionalProcess(processid: UInt): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerUnregisterAdditionalProcess(processid.toInt())

public actual fun werUnregisterAppLocalDump(): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerUnregisterAppLocalDump()

public actual fun werUnregisterCustomMetadata(key: Pcwstr): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerUnregisterCustomMetadata(key.rawAddress)

public actual fun werUnregisterExcludedMemoryBlock(address: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerUnregisterExcludedMemoryBlock(address.rawAddress)

public actual fun werUnregisterFile(pwzfilepath: Pcwstr): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerUnregisterFile(pwzfilepath.rawAddress)

public actual fun werUnregisterMemoryBlock(pvaddress: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerUnregisterMemoryBlock(pvaddress.rawAddress)

public actual fun werUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll: Pcwstr, pcontext: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemErrorreportingJniBridge.windowssysWindowsWin32SystemErrorreportingWerUnregisterRuntimeExceptionModule(pwszoutofprocesscallbackdll.rawAddress, pcontext.rawAddress)

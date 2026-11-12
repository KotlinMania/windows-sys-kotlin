@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.threading.ProcessInformation

private object WindowsWin32SystemClrhostingJniBridge {
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
        val stream = WindowsWin32SystemClrhostingJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemClrhostingCLRCreateInstance(clsid: Long, riid: Long, ppinterface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingCallFunctionShim(szdllname: Long, szfunctionname: Long, lpvargument1: Long, lpvargument2: Long, szversion: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingClrCreateManagedInstance(ptypename: Long, riid: Long, ppobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingCorBindToCurrentRuntime(pwszfilename: Long, rclsid: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingCorBindToRuntime(pwszversion: Long, pwszbuildflavor: Long, rclsid: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingCorBindToRuntimeByCfg(pcfgstream: Long, reserved: Int, startupflags: Int, rclsid: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingCorBindToRuntimeEx(pwszversion: Long, pwszbuildflavor: Long, startupflags: Int, rclsid: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingCorBindToRuntimeHost(pwszversion: Long, pwszbuildflavor: Long, pwszhostconfigfile: Long, preserved: Long, startupflags: Int, rclsid: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingCorExitProcess(exitcode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingCorLaunchApplication(dwclickoncehost: Int, pwzappfullname: Long, dwmanifestpaths: Int, ppwzmanifestpaths: Long, dwactivationdata: Int, ppwzactivationdata: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingCorMarkThreadInThreadPool()

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingCreateDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: Long, ppcordb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingGetCLRIdentityManager(riid: Long, ppmanager: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingGetCORRequiredVersion(pbuffer: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingGetCORSystemDirectory(pbuffer: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingGetCORVersion(pbbuffer: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingGetFileVersion(szfilename: Long, szbuffer: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingGetRealProcAddress(pwszprocname: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeInfo(pexe: Long, pwszversion: Long, pconfigurationfile: Long, startupflags: Int, runtimeinfoflags: Int, pdirectory: Long, dwdirectory: Int, dwdirectorylength: Long, pversion: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersion(pexe: Long, pversion: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersionForCLSID(rclsid: Long, pversion: Long, cchbuffer: Int, dwlength: Long, dwresolutionflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingGetVersionFromProcess(hprocess: Long, pversion: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingLoadLibraryShim(szdllname: Long, szversion: Long, pvreserved: Long, phmoddll: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingLoadStringRC(iresouceid: Int, szbuffer: Long, imax: Int, bquiet: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingLoadStringRCEx(lcid: Int, iresouceid: Int, szbuffer: Long, imax: Int, bquiet: Int, pcwchused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingLockClrVersion(hostcallback: Long, pbeginhostsetup: Long, pendhostsetup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemClrhostingRunDll32ShimW(hwnd: Long, hinst: Long, lpszcmdline: Long, ncmdshow: Int): Int
}

public actual fun cLRCreateInstance(clsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppinterface: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingCLRCreateInstance(clsid.rawAddress, riid.rawAddress, ppinterface.rawAddress)

public actual fun callFunctionShim(szdllname: Pcwstr, szfunctionname: Pcstr, lpvargument1: MutPtr<CVoid>, lpvargument2: MutPtr<CVoid>, szversion: Pcwstr, pvreserved: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingCallFunctionShim(szdllname.rawAddress, szfunctionname.rawAddress, lpvargument1.rawAddress, lpvargument2.rawAddress, szversion.rawAddress, pvreserved.rawAddress)

public actual fun clrCreateManagedInstance(ptypename: Pcwstr, riid: ConstPtr<Guid>, ppobject: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingClrCreateManagedInstance(ptypename.rawAddress, riid.rawAddress, ppobject.rawAddress)

public actual fun corBindToCurrentRuntime(pwszfilename: Pcwstr, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingCorBindToCurrentRuntime(pwszfilename.rawAddress, rclsid.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun corBindToRuntime(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingCorBindToRuntime(pwszversion.rawAddress, pwszbuildflavor.rawAddress, rclsid.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun corBindToRuntimeByCfg(pcfgstream: MutPtr<CVoid>, reserved: UInt, startupflags: UInt, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingCorBindToRuntimeByCfg(pcfgstream.rawAddress, reserved.toInt(), startupflags.toInt(), rclsid.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun corBindToRuntimeEx(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, startupflags: UInt, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingCorBindToRuntimeEx(pwszversion.rawAddress, pwszbuildflavor.rawAddress, startupflags.toInt(), rclsid.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun corBindToRuntimeHost(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, pwszhostconfigfile: Pcwstr, preserved: MutPtr<CVoid>, startupflags: UInt, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingCorBindToRuntimeHost(pwszversion.rawAddress, pwszbuildflavor.rawAddress, pwszhostconfigfile.rawAddress, preserved.rawAddress, startupflags.toInt(), rclsid.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun corExitProcess(exitcode: Int) {
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingCorExitProcess(exitcode)
}

public actual fun corLaunchApplication(dwclickoncehost: HostType, pwzappfullname: Pcwstr, dwmanifestpaths: UInt, ppwzmanifestpaths: ConstPtr<Pcwstr>, dwactivationdata: UInt, ppwzactivationdata: ConstPtr<Pcwstr>, lpprocessinformation: MutPtr<ProcessInformation>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingCorLaunchApplication(dwclickoncehost, pwzappfullname.rawAddress, dwmanifestpaths.toInt(), ppwzmanifestpaths.rawAddress, dwactivationdata.toInt(), ppwzactivationdata.rawAddress, lpprocessinformation.rawAddress)

public actual fun corMarkThreadInThreadPool() {
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingCorMarkThreadInThreadPool()
}

public actual fun createDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: Pcwstr, ppcordb: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingCreateDebuggingInterfaceFromVersion(idebuggerversion, szdebuggeeversion.rawAddress, ppcordb.rawAddress)

public actual fun getCLRIdentityManager(riid: ConstPtr<Guid>, ppmanager: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingGetCLRIdentityManager(riid.rawAddress, ppmanager.rawAddress)

public actual fun getCORRequiredVersion(pbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingGetCORRequiredVersion(pbuffer.rawAddress, cchbuffer.toInt(), dwlength.rawAddress)

public actual fun getCORSystemDirectory(pbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingGetCORSystemDirectory(pbuffer.rawAddress, cchbuffer.toInt(), dwlength.rawAddress)

public actual fun getCORVersion(pbbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingGetCORVersion(pbbuffer.rawAddress, cchbuffer.toInt(), dwlength.rawAddress)

public actual fun getFileVersion(szfilename: Pcwstr, szbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingGetFileVersion(szfilename.rawAddress, szbuffer.rawAddress, cchbuffer.toInt(), dwlength.rawAddress)

public actual fun getRealProcAddress(pwszprocname: Pcstr, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingGetRealProcAddress(pwszprocname.rawAddress, ppv.rawAddress)

public actual fun getRequestedRuntimeInfo(pexe: Pcwstr, pwszversion: Pcwstr, pconfigurationfile: Pcwstr, startupflags: UInt, runtimeinfoflags: UInt, pdirectory: Pwstr, dwdirectory: UInt, dwdirectorylength: MutPtr<UInt>, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeInfo(pexe.rawAddress, pwszversion.rawAddress, pconfigurationfile.rawAddress, startupflags.toInt(), runtimeinfoflags.toInt(), pdirectory.rawAddress, dwdirectory.toInt(), dwdirectorylength.rawAddress, pversion.rawAddress, cchbuffer.toInt(), dwlength.rawAddress)

public actual fun getRequestedRuntimeVersion(pexe: Pcwstr, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersion(pexe.rawAddress, pversion.rawAddress, cchbuffer.toInt(), dwlength.rawAddress)

public actual fun getRequestedRuntimeVersionForCLSID(rclsid: ConstPtr<Guid>, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>, dwresolutionflags: ClsidResolutionFlags): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersionForCLSID(rclsid.rawAddress, pversion.rawAddress, cchbuffer.toInt(), dwlength.rawAddress, dwresolutionflags)

public actual fun getVersionFromProcess(hprocess: Handle, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingGetVersionFromProcess(hprocess.rawAddress, pversion.rawAddress, cchbuffer.toInt(), dwlength.rawAddress)

public actual fun loadLibraryShim(szdllname: Pcwstr, szversion: Pcwstr, pvreserved: MutPtr<CVoid>, phmoddll: MutPtr<Hmodule>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingLoadLibraryShim(szdllname.rawAddress, szversion.rawAddress, pvreserved.rawAddress, phmoddll.rawAddress)

public actual fun loadStringRC(iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingLoadStringRC(iresouceid.toInt(), szbuffer.rawAddress, imax, bquiet)

public actual fun loadStringRCEx(lcid: UInt, iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int, pcwchused: MutPtr<Int>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingLoadStringRCEx(lcid.toInt(), iresouceid.toInt(), szbuffer.rawAddress, imax, bquiet, pcwchused.rawAddress)

public actual fun lockClrVersion(hostcallback: FLockClrVersionCallback, pbeginhostsetup: MutPtr<FLockClrVersionCallback>, pendhostsetup: MutPtr<FLockClrVersionCallback>): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingLockClrVersion(0L, pbeginhostsetup.rawAddress, pendhostsetup.rawAddress)

public actual fun runDll32ShimW(hwnd: Hwnd, hinst: Hinstance, lpszcmdline: Pcwstr, ncmdshow: Int): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssysWindowsWin32SystemClrhostingRunDll32ShimW(hwnd.rawAddress, hinst.rawAddress, lpszcmdline.rawAddress, ncmdshow)
